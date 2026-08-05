package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest2 {

    private final List<WorkerService> servicesToCleanup = new ArrayList<>();

    private WorkerService createService(String name, int threads, boolean assignable) {
        WorkerService service = new WorkerService(name, threads, assignable);
        servicesToCleanup.add(service);
        return service;
    }

    @AfterEach
    void tearDown() {
        for (WorkerService service : servicesToCleanup) {
            try {
                service.stop();
                service.join(500);
            } catch (Exception ignored) {
            }
        }
    }

    private static class TrackingWorkRequest extends WorkerService.WorkRequest {
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

    @Test
    void scheduleExecutesWorkImmediatelyWhenNoWorkerThreadsConfigured() {
        WorkerService service = createService("direct", 0, false);

        TrackingWorkRequest request = new TrackingWorkRequest();

        service.schedule(request);

        assertEquals(1, request.doWorkCalls.get());
        assertEquals(0, request.cleanupCalls.get());
    }

    @Test
    @Timeout(5)
    void scheduleExecutesWorkUsingThreadPool() throws Exception {
        WorkerService service = createService("pooled", 1, false);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicInteger executions = new AtomicInteger();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                executions.incrementAndGet();
                latch.countDown();
            }
        });

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertEquals(1, executions.get());
    }

    @Test
    void scheduleAfterStopInvokesCleanupWithoutExecutingWork() {
        WorkerService service = createService("stopped", 1, false);

        service.stop();

        TrackingWorkRequest request = new TrackingWorkRequest();

        service.schedule(request);

        assertEquals(0, request.doWorkCalls.get());
        assertEquals(1, request.cleanupCalls.get());
    }

    @Test
    @Timeout(5)
    void exceptionInDoWorkTriggersCleanup() throws Exception {
        WorkerService service = createService("exception", 1, false);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicInteger cleanupCount = new AtomicInteger();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                throw new Exception("expected");
            }

            @Override
            public void cleanup() {
                cleanupCount.incrementAndGet();
                latch.countDown();
            }
        });

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertEquals(1, cleanupCount.get());
    }

    @Test
    @Timeout(10)
    void assignableThreadsRouteSameIdToSameWorkerThread() throws Exception {
        WorkerService service = createService("assignable", 3, true);

        CountDownLatch latch = new CountDownLatch(2);
        AtomicReference<String> thread1 = new AtomicReference<>();
        AtomicReference<String> thread2 = new AtomicReference<>();

        long routingId = 7L;

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                thread1.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, routingId);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                thread2.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, routingId);

        assertTrue(latch.await(3, TimeUnit.SECONDS));

        assertNotNull(thread1.get());
        assertNotNull(thread2.get());
        assertEquals(thread1.get(), thread2.get(),
                "Same routing id should resolve to the same single-thread executor");
    }

    @Test
    @Timeout(10)
    void negativeIdsAreHandledCorrectly() throws Exception {
        WorkerService service = createService("negative", 2, true);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicInteger executions = new AtomicInteger();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                executions.incrementAndGet();
                latch.countDown();
            }
        }, -12345L);

        assertTrue(latch.await(3, TimeUnit.SECONDS));
        assertEquals(1, executions.get());
    }

    @Test
    @Timeout(10)
    void nonAssignableConfigurationUsesSharedPool() throws Exception {
        WorkerService service = createService("shared", 2, false);

        CountDownLatch started = new CountDownLatch(2);
        CountDownLatch release = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                started.countDown();
                release.await();
            }
        });

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                started.countDown();
                release.await();
            }
        });

        assertTrue(started.await(3, TimeUnit.SECONDS),
                "Both workers should be able to start concurrently in shared pool");

        release.countDown();
    }

    @Test
    void startCreatesExpectedNumberOfExecutorsForAssignableThreads() throws Exception {
        WorkerService service = createService("assignableCount", 4, true);

        Field workersField = WorkerService.class.getDeclaredField("workers");
        workersField.setAccessible(true);

        @SuppressWarnings("unchecked")
        List<ExecutorService> workers =
                (List<ExecutorService>) workersField.get(service);

        assertEquals(4, workers.size());
    }

    @Test
    void startCreatesSingleExecutorForSharedPoolConfiguration() throws Exception {
        WorkerService service = createService("sharedCount", 4, false);

        Field workersField = WorkerService.class.getDeclaredField("workers");
        workersField.setAccessible(true);

        @SuppressWarnings("unchecked")
        List<ExecutorService> workers =
                (List<ExecutorService>) workersField.get(service);

        assertEquals(1, workers.size());
    }

    @Test
    void stopTransitionsServiceToStoppedState() throws Exception {
        WorkerService service = createService("lifecycle", 1, false);

        service.stop();

        Field stoppedField = WorkerService.class.getDeclaredField("stopped");
        stoppedField.setAccessible(true);

        assertTrue((Boolean) stoppedField.get(service));
    }

    @Test
    @Timeout(10)
    void joinWaitsForTaskCompletionAndServiceCanShutdownCleanly() throws Exception {
        WorkerService service = createService("join", 1, false);

        CountDownLatch taskStarted = new CountDownLatch(1);
        CountDownLatch allowFinish = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                taskStarted.countDown();
                allowFinish.await();
            }
        });

        assertTrue(taskStarted.await(2, TimeUnit.SECONDS));

        service.stop();

        Thread joinThread = new Thread(() -> service.join(2000));
        joinThread.start();

        Thread.sleep(100);
        assertTrue(joinThread.isAlive(),
                "join should still be waiting while task is running");

        allowFinish.countDown();

        joinThread.join(3000);

        assertFalse(joinThread.isAlive(),
                "join should complete once worker terminates");
    }

    @Test
    @Timeout(10)
    void workScheduledBeforeStopMayCleanupIfStoppedBeforeExecution() throws Exception {
        WorkerService service = createService("race", 1, false);

        CountDownLatch blockerStarted = new CountDownLatch(1);
        CountDownLatch releaseBlocker = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                blockerStarted.countDown();
                releaseBlocker.await();
            }
        });

        assertTrue(blockerStarted.await(2, TimeUnit.SECONDS));

        AtomicInteger workCalls = new AtomicInteger();
        AtomicInteger cleanupCalls = new AtomicInteger();
        CountDownLatch cleanupObserved = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                workCalls.incrementAndGet();
            }

            @Override
            public void cleanup() {
                cleanupCalls.incrementAndGet();
                cleanupObserved.countDown();
            }
        });

        service.stop();
        releaseBlocker.countDown();

        assertTrue(cleanupObserved.await(3, TimeUnit.SECONDS));

        assertEquals(0, workCalls.get());
        assertEquals(1, cleanupCalls.get());
    }
}