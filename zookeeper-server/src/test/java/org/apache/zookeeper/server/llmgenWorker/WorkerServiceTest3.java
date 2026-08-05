package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest3 {

    private WorkerService service;

    @AfterEach
    void tearDown() {
        if (service != null) {
            service.stop();
        }
    }

    @Test
    void testDirectExecutionWhenThreadCountIsZero() {
        service = new WorkerService("direct", 0, false);

        Thread caller = Thread.currentThread();
        AtomicReference<Thread> executedBy = new AtomicReference<>();

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                executedBy.set(Thread.currentThread());
            }
        };

        service.schedule(request, 1L);

        assertSame(caller, executedBy.get(),
                "Work should execute synchronously on the calling thread when no workers are configured");
    }

    @Test
    void testDirectExecutionWhenThreadCountIsNegative() {
        service = new WorkerService("direct", -1, false);

        Thread caller = Thread.currentThread();
        AtomicReference<Thread> executedBy = new AtomicReference<>();

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                executedBy.set(Thread.currentThread());
            }
        };

        service.schedule(request, 10L);

        assertSame(caller, executedBy.get());
    }

    @Test
    void testAsynchronousExecutionWithWorkerThreads() throws Exception {
        service = new WorkerService("pool", 2, false);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<Thread> executedBy = new AtomicReference<>();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                executedBy.set(Thread.currentThread());
                latch.countDown();
            }
        }, 1L);

        assertTrue(latch.await(5, TimeUnit.SECONDS), "Work should be executed");
        assertNotNull(executedBy.get());
        assertNotEquals(Thread.currentThread(), executedBy.get(),
                "Work should run on a worker thread");
    }

    @Test
    void testStoppedServiceInvokesCleanupInsteadOfDoWork() throws Exception {
        service = new WorkerService("pool", 1, false);
        service.stop();

        AtomicBoolean worked = new AtomicBoolean(false);
        AtomicBoolean cleaned = new AtomicBoolean(false);

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
            }

            @Override
            public void cleanup() {
                cleaned.set(true);
            }
        };

        service.schedule(request, 0L);

        Thread.sleep(200);

        assertFalse(worked.get(), "Work must not execute after stop()");
        assertTrue(cleaned.get(), "cleanup() should be called for rejected work");
    }

    @Test
    void testServiceCanBeStartedAgainAfterStop() throws Exception {
        service = new WorkerService("pool", 1, false);

        service.stop();
        service.start();

        CountDownLatch latch = new CountDownLatch(1);
        AtomicBoolean worked = new AtomicBoolean(false);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
                latch.countDown();
            }
        }, 1L);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(worked.get(), "Work should execute after restart");
    }

    @Test
    void testAssignableWorkersRouteSameIdToSameThread() throws Exception {
        service = new WorkerService("assignable", 4, true);

        CountDownLatch latch = new CountDownLatch(2);
        AtomicReference<String> thread1 = new AtomicReference<>();
        AtomicReference<String> thread2 = new AtomicReference<>();

        long id = 12345L;

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                thread1.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, id);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                thread2.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, id);

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        assertNotNull(thread1.get());
        assertEquals(thread1.get(), thread2.get(),
                "Requests with the same id should be assigned to the same worker");
    }

    @Test
    void testAssignableWorkersCanUseMultipleThreadsForDifferentIds() throws Exception {
        service = new WorkerService("assignable", 4, true);

        CountDownLatch latch = new CountDownLatch(8);
        Set<String> threadsUsed = ConcurrentHashMap.newKeySet();

        for (long i = 0; i < 8; i++) {
            final long id = i;
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadsUsed.add(Thread.currentThread().getName());
                    latch.countDown();
                }
            }, id);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        assertTrue(threadsUsed.size() > 1,
                "Different ids should be distributable across multiple worker executors");
    }

    @Test
    void testCleanupIsOptional() {
        service = new WorkerService("pool", 1, false);
        service.stop();

        assertDoesNotThrow(() ->
                service.schedule(new WorkerService.WorkRequest() {
                    @Override
                    public void doWork() {
                        fail("Should not execute while stopped");
                    }
                }, 1L)
        );
    }
}