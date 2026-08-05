package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest6 {

    private final List<WorkerService> servicesToCleanup = new ArrayList<>();

    @AfterEach
    void tearDown() {
        for (WorkerService service : servicesToCleanup) {
            try {
                service.stop();
                service.join(1000);
            } catch (Exception ignored) {
            }
        }
    }

    @Test
    void shouldRunImmediatelyOnCallingThreadWhenNoWorkersConfigured() {
        WorkerService service = new WorkerService(null, 0, false);

        AtomicBoolean doWorkCalled = new AtomicBoolean(false);
        AtomicBoolean cleanupCalled = new AtomicBoolean(false);
        Thread callingThread = Thread.currentThread();
        AtomicBoolean sameThread = new AtomicBoolean(false);

        WorkerService.WorkRequest wr = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                doWorkCalled.set(true);
                sameThread.set(Thread.currentThread() == callingThread);
            }

            @Override
            public void cleanup() {
                cleanupCalled.set(true);
            }
        };

        service.schedule(wr);

        assertTrue(doWorkCalled.get(), "Work should execute immediately");
        assertTrue(sameThread.get(), "Work should execute on the caller thread");
        assertFalse(cleanupCalled.get(), "Cleanup should not be invoked");
    }

    @Test
    void shouldUseSingleSharedExecutorWhenThreadsAreNotAssignable() throws Exception {
        WorkerService service = new WorkerService("Test", 3, false);
        servicesToCleanup.add(service);

        assertEquals(1, getWorkerExecutorCount(service));

        CountDownLatch latch = new CountDownLatch(6);
        List<String> threadNames = Collections.synchronizedList(new ArrayList<>());

        for (int i = 0; i < 6; i++) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadNames.add(Thread.currentThread().getName());
                    latch.countDown();
                }
            }, i);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        assertFalse(threadNames.isEmpty());
        for (String name : threadNames) {
            assertTrue(name.startsWith("TestThread-"),
                    "Expected pooled thread name to use configured prefix");
        }
    }

    @Test
    void shouldCreateDistinctExecutorsForAssignableThreads() throws Exception {
        WorkerService service = new WorkerService("Test", 3, true);
        servicesToCleanup.add(service);

        assertEquals(3, getWorkerExecutorCount(service));

        CountDownLatch latch = new CountDownLatch(3);
        List<String> threadNames = Collections.synchronizedList(new ArrayList<>());

        for (long id = 0; id < 3; id++) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadNames.add(Thread.currentThread().getName());
                    latch.countDown();
                }
            }, id);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        assertTrue(threadNames.stream().anyMatch(n -> n.contains("TestThread-1")));
        assertTrue(threadNames.stream().anyMatch(n -> n.contains("TestThread-2")));
        assertTrue(threadNames.stream().anyMatch(n -> n.contains("TestThread-3")));
    }

    @Test
    void shouldRouteSameIdToSameWorkerThreadWhenAssignable() throws Exception {
        WorkerService service = new WorkerService("Route", 3, true);
        servicesToCleanup.add(service);

        CountDownLatch latch = new CountDownLatch(3);
        List<String> threads = Collections.synchronizedList(new ArrayList<>());

        for (int i = 0; i < 3; i++) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threads.add(Thread.currentThread().getName());
                    latch.countDown();
                }
            }, 1L);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        assertEquals(3, threads.size());
        String first = threads.get(0);
        assertTrue(threads.stream().allMatch(first::equals),
                "Same id should always map to the same single-thread executor");
    }

    @Test
    void shouldInvokeCleanupAndNotDoWorkAfterStop() {
        WorkerService service = new WorkerService("Test", 1, false);
        service.stop();

        AtomicBoolean doWorkCalled = new AtomicBoolean(false);
        AtomicBoolean cleanupCalled = new AtomicBoolean(false);

        WorkerService.WorkRequest wr = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                doWorkCalled.set(true);
            }

            @Override
            public void cleanup() {
                cleanupCalled.set(true);
            }
        };

        service.schedule(wr);

        assertFalse(doWorkCalled.get(), "Work should not execute after stop");
        assertTrue(cleanupCalled.get(), "Cleanup should execute after stop");
    }

    @Test
    void shouldInvokeCleanupWhenDoWorkThrowsException() throws Exception {
        WorkerService service = new WorkerService("Test", 1, false);
        servicesToCleanup.add(service);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicBoolean cleanupCalled = new AtomicBoolean(false);

        WorkerService.WorkRequest wr = new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                throw new RuntimeException("boom");
            }

            @Override
            public void cleanup() {
                cleanupCalled.set(true);
                latch.countDown();
            }
        };

        service.schedule(wr);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(cleanupCalled.get());
    }

    @Test
    void joinShouldTerminateWorkersAfterStop() throws Exception {
        WorkerService service = new WorkerService("Join", 1, false);
        servicesToCleanup.add(service);

        CountDownLatch started = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                started.countDown();
                release.await(2, TimeUnit.SECONDS);
            }
        });

        assertTrue(started.await(5, TimeUnit.SECONDS));

        service.stop();
        release.countDown();
        service.join(5000);

        for (ExecutorService executor : getWorkers(service)) {
            assertTrue(executor.isShutdown());
        }
    }

    @SuppressWarnings("unchecked")
    private List<ExecutorService> getWorkers(WorkerService service) throws Exception {
        Field field = WorkerService.class.getDeclaredField("workers");
        field.setAccessible(true);
        return (List<ExecutorService>) field.get(service);
    }

    private int getWorkerExecutorCount(WorkerService service) throws Exception {
        return getWorkers(service).size();
    }
}