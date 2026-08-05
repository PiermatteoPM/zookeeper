package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest5 {

    private static class RecordingWorkRequest extends WorkerService.WorkRequest {
        final AtomicInteger doWorkCalls = new AtomicInteger();
        final AtomicInteger cleanupCalls = new AtomicInteger();

        @Override
        public void doWork() {
            doWorkCalls.incrementAndGet();
        }

        @Override
        public void cleanup() {
            cleanupCalls.incrementAndGet();
        }
    }

    @SuppressWarnings("unchecked")
    private ArrayList<ExecutorService> getWorkers(WorkerService service) throws Exception {
        Field workersField = WorkerService.class.getDeclaredField("workers");
        workersField.setAccessible(true);
        return (ArrayList<ExecutorService>) workersField.get(service);
    }

    @Test
    void scheduleRunsImmediatelyOnCallingThreadWhenNoWorkersConfigured() {
        WorkerService service = new WorkerService(null, 0, false);

        Thread callerThread = Thread.currentThread();
        AtomicReference<Thread> executionThread = new AtomicReference<>();

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                executionThread.set(Thread.currentThread());
            }
        };

        service.schedule(request);

        assertSame(callerThread, executionThread.get());
    }

    @Test
    void noExecutorsCreatedWhenNumThreadsIsZero() throws Exception {
        WorkerService service = new WorkerService("Test", 0, false);

        assertEquals(0, getWorkers(service).size());
    }

    @Test
    void nonAssignableThreadsCreateSingleSharedExecutor() throws Exception {
        WorkerService service = new WorkerService("Test", 3, false);

        assertEquals(1, getWorkers(service).size());

        service.stop();
        service.join(1000);
    }

    @Test
    void assignableThreadsCreateOneExecutorPerWorkerThread() throws Exception {
        WorkerService service = new WorkerService("Test", 3, true);

        assertEquals(3, getWorkers(service).size());

        service.stop();
        service.join(1000);
    }

    @Test
    void stoppedServiceInvokesCleanupInsteadOfDoWork() {
        WorkerService service = new WorkerService("Test", 0, false);
        service.stop();

        RecordingWorkRequest request = new RecordingWorkRequest();

        service.schedule(request);

        assertEquals(0, request.doWorkCalls.get());
        assertEquals(1, request.cleanupCalls.get());
    }

    @Test
    void exceptionFromDoWorkTriggersCleanup() {
        WorkerService service = new WorkerService(null, 0, false);

        AtomicInteger cleanupCalls = new AtomicInteger();

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                throw new Exception("expected");
            }

            @Override
            public void cleanup() {
                cleanupCalls.incrementAndGet();
            }
        };

        service.schedule(request);

        assertEquals(1, cleanupCalls.get());
    }

    @Test
    void assignableThreadsRouteIdsToDifferentExecutors() throws Exception {
        WorkerService service = new WorkerService("Test", 3, true);

        CountDownLatch latch = new CountDownLatch(3);
        AtomicReference<String> t0 = new AtomicReference<>();
        AtomicReference<String> t1 = new AtomicReference<>();
        AtomicReference<String> t2 = new AtomicReference<>();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                t0.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, 0);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                t1.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, 1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                t2.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, 2);

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        assertNotNull(t0.get());
        assertNotNull(t1.get());
        assertNotNull(t2.get());

        assertNotEquals(t0.get(), t1.get());
        assertNotEquals(t0.get(), t2.get());
        assertNotEquals(t1.get(), t2.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void nonAssignableThreadsUseSharedExecutorForDifferentIds() throws Exception {
        WorkerService service = new WorkerService("Test", 1, false);

        CountDownLatch latch = new CountDownLatch(3);
        AtomicReference<String> firstThread = new AtomicReference<>();
        AtomicBoolean sameThread = new AtomicBoolean(true);

        for (long id : new long[] {0L, 1L, 999L}) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    String current = Thread.currentThread().getName();
                    if (firstThread.compareAndSet(null, current)) {
                        // first assignment
                    } else {
                        sameThread.compareAndSet(true, firstThread.get().equals(current));
                    }
                    latch.countDown();
                }
            }, id);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(sameThread.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void negativeIdsAreHandledCorrectly() throws Exception {
        WorkerService service = new WorkerService("Test", 3, true);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicInteger executions = new AtomicInteger();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                executions.incrementAndGet();
                latch.countDown();
            }
        }, -1L);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertEquals(1, executions.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void scheduleWithoutIdDelegatesToIdZeroBehavior() {
        WorkerService service = new WorkerService(null, 0, false);

        AtomicInteger count = new AtomicInteger();

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                count.incrementAndGet();
            }
        };

        service.schedule(request);

        assertEquals(1, count.get());
    }
}