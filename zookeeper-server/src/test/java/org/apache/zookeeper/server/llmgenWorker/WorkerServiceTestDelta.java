package org.apache.zookeeper.server.llmgenWorker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

class WorkerServiceTestDelta {

    private static final long TIMEOUT_SECONDS = 5L;

    @Test
    void noPoolRunsWorkImmediatelyOnCallingThread() throws Exception {
        // Equivalence class: numThreads == 0, no thread pool, work executes synchronously in the caller thread.
        WorkerService service = new WorkerService("NoPool", 0, false);
        String callerThreadName = Thread.currentThread().getName();
        AtomicBoolean didWork = new AtomicBoolean(false);
        AtomicInteger cleanupCount = new AtomicInteger(0);
        String[] executionThreadName = new String[1];

        try {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    didWork.set(true);
                    executionThreadName[0] = Thread.currentThread().getName();
                }

                @Override
                public void cleanup() {
                    cleanupCount.incrementAndGet();
                }
            }, 123L);

            assertTrue(didWork.get());
            assertEquals(callerThreadName, executionThreadName[0]);
            assertEquals(0, cleanupCount.get());
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    void sharedPoolExecutesWorkOnNamedWorkerThread() throws Exception {
        // Equivalence class: numThreads > 0 and useAssignableThreads == false, a shared fixed-size pool is used.
        WorkerService service = new WorkerService("Shared", 3, false);
        CountDownLatch latch = new CountDownLatch(1);
        AtomicInteger cleanupCount = new AtomicInteger(0);
        String[] executionThreadName = new String[1];

        try {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    executionThreadName[0] = Thread.currentThread().getName();
                    latch.countDown();
                }

                @Override
                public void cleanup() {
                    cleanupCount.incrementAndGet();
                }
            }, 2L);

            assertTrue(latch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertTrue(executionThreadName[0].startsWith("SharedThread-"));
            assertEquals(0, cleanupCount.get());
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    void assignablePoolRoutesDifferentIdsToExpectedSingleThreadExecutors() throws Exception {
        // Equivalence class: numThreads > 0 and useAssignableThreads == true, one single-thread executor per worker.
        WorkerService service = new WorkerService("Assignable", 3, true);
        CountDownLatch latch = new CountDownLatch(3);
        Map<Long, String> threadNamesById = new ConcurrentHashMap<>();

        try {
            scheduleRecordingThread(service, 0L, threadNamesById, latch);
            scheduleRecordingThread(service, 1L, threadNamesById, latch);
            scheduleRecordingThread(service, 2L, threadNamesById, latch);

            assertTrue(latch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertTrue(threadNamesById.get(0L).endsWith("AssignableThread-1"));
            assertTrue(threadNamesById.get(1L).endsWith("AssignableThread-2"));
            assertTrue(threadNamesById.get(2L).endsWith("AssignableThread-3"));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    void assignablePoolRoutesIdZeroToFirstWorker() throws Exception {
        // Boundary value: id == 0 maps to the first worker when numWorkerThreads == 3.
        WorkerService service = new WorkerService("BoundaryZero", 3, true);
        CountDownLatch latch = new CountDownLatch(1);
        Map<Long, String> threadNamesById = new ConcurrentHashMap<>();

        try {
            scheduleRecordingThread(service, 0L, threadNamesById, latch);

            assertTrue(latch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertTrue(threadNamesById.get(0L).endsWith("BoundaryZeroThread-1"));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    void assignablePoolRoutesLastInRangeIdToLastWorker() throws Exception {
        // Boundary value: id == numWorkerThreads - 1 maps to the last worker when numWorkerThreads == 3.
        WorkerService service = new WorkerService("BoundaryLast", 3, true);
        CountDownLatch latch = new CountDownLatch(1);
        Map<Long, String> threadNamesById = new ConcurrentHashMap<>();

        try {
            scheduleRecordingThread(service, 2L, threadNamesById, latch);

            assertTrue(latch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertTrue(threadNamesById.get(2L).endsWith("BoundaryLastThread-3"));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    void assignablePoolRoutesIdEqualToWorkerCountBackToFirstWorker() throws Exception {
        // Boundary value: id == numWorkerThreads wraps around to the first worker when numWorkerThreads == 3.
        WorkerService service = new WorkerService("BoundaryWrap", 3, true);
        CountDownLatch latch = new CountDownLatch(1);
        Map<Long, String> threadNamesById = new ConcurrentHashMap<>();

        try {
            scheduleRecordingThread(service, 3L, threadNamesById, latch);

            assertTrue(latch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertTrue(threadNamesById.get(3L).endsWith("BoundaryWrapThread-1"));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    void assignablePoolRoutesNegativeIdToPositiveModuloWorker() throws Exception {
        // Boundary value: id == -1 maps into the valid worker range and reaches the last worker when numWorkerThreads == 3.
        WorkerService service = new WorkerService("BoundaryNegative", 3, true);
        CountDownLatch latch = new CountDownLatch(1);
        Map<Long, String> threadNamesById = new ConcurrentHashMap<>();

        try {
            scheduleRecordingThread(service, -1L, threadNamesById, latch);

            assertTrue(latch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertTrue(threadNamesById.get(-1L).endsWith("BoundaryNegativeThread-3"));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    void stoppedServiceCleansUpInsteadOfDoingWork() throws Exception {
        // Lifecycle equivalence class: stopped service rejects scheduled work and invokes cleanup.
        WorkerService service = new WorkerService("Stopped", 2, true);
        AtomicInteger doWorkCount = new AtomicInteger(0);
        AtomicInteger cleanupCount = new AtomicInteger(0);

        service.stop();
        service.join(1000);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                doWorkCount.incrementAndGet();
            }

            @Override
            public void cleanup() {
                cleanupCount.incrementAndGet();
            }
        }, 0L);

        assertEquals(0, doWorkCount.get());
        assertEquals(1, cleanupCount.get());
    }

    @Test
    void restartedServiceAcceptsWorkAgain() throws Exception {
        // Lifecycle equivalence class: service stopped and then restarted can execute newly scheduled work.
        WorkerService service = new WorkerService("Restarted", 1, true);
        AtomicInteger cleanupCount = new AtomicInteger(0);
        CountDownLatch latch = new CountDownLatch(1);
        String[] executionThreadName = new String[1];

        try {
            service.stop();
            service.join(1000);
            service.start();

            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    executionThreadName[0] = Thread.currentThread().getName();
                    latch.countDown();
                }

                @Override
                public void cleanup() {
                    cleanupCount.incrementAndGet();
                }
            }, 1L);

            assertTrue(latch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertTrue(executionThreadName[0].startsWith("RestartedThread-"));
            assertEquals(0, cleanupCount.get());
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    void exceptionDuringWorkTriggersCleanup() throws Exception {
        // Equivalence class: scheduled work throws an exception, so cleanup is invoked by the service.
        WorkerService service = new WorkerService("Exception", 0, false);
        AtomicInteger cleanupCount = new AtomicInteger(0);

        try {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() throws Exception {
                    throw new Exception("boom");
                }

                @Override
                public void cleanup() {
                    cleanupCount.incrementAndGet();
                }
            });

            assertEquals(1, cleanupCount.get());
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    private static void scheduleRecordingThread(
            WorkerService service,
            long id,
            Map<Long, String> threadNamesById,
            CountDownLatch latch) {
        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadNamesById.put(id, Thread.currentThread().getName());
                latch.countDown();
            }
        }, id);
    }
}