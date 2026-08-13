package org.apache.zookeeper.server.llmgenWorker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

class WorkerServiceTestDelta {

    private static final long TIMEOUT_SECONDS = 5;

    private static class RecordingWorkRequest extends WorkerService.WorkRequest {
        private final CountDownLatch doneLatch = new CountDownLatch(1);
        private final AtomicInteger doWorkCount = new AtomicInteger();
        private final AtomicInteger cleanupCount = new AtomicInteger();
        private volatile String threadName;

        @Override
        public void doWork() {
            threadName = Thread.currentThread().getName();
            doWorkCount.incrementAndGet();
            doneLatch.countDown();
        }

        @Override
        public void cleanup() {
            cleanupCount.incrementAndGet();
            doneLatch.countDown();
        }

        boolean awaitDone() throws InterruptedException {
            return doneLatch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS);
        }
    }

    // Equivalence class: no worker thread pool, numThreads == 0, work executes synchronously on the caller thread.
    @Test
    void scheduleWithoutThreadPoolRunsImmediatelyOnCallingThread() throws Exception {
        WorkerService service = new WorkerService("NoPool", 0, false);
        try {
            RecordingWorkRequest request = new RecordingWorkRequest();
            String callerThreadName = Thread.currentThread().getName();

            service.schedule(request, 0L);

            assertTrue(request.awaitDone(), "Work should complete immediately without a pool");
            assertEquals(1, request.doWorkCount.get());
            assertEquals(0, request.cleanupCount.get());
            assertEquals(callerThreadName, request.threadName);
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    // Equivalence class: shared non-assignable pool, numThreads > 0 and useAssignableThreads == false.
    @Test
    void scheduleWithSharedPoolUsesSharedExecutorThreads() throws Exception {
        WorkerService service = new WorkerService("Shared", 2, false);
        CountDownLatch bothStarted = new CountDownLatch(2);
        CountDownLatch release = new CountDownLatch(1);
        Set<String> threadNames = ConcurrentHashMap.newKeySet();

        try {
            WorkerService.WorkRequest first = new WorkerService.WorkRequest() {
                @Override
                public void doWork() throws Exception {
                    threadNames.add(Thread.currentThread().getName());
                    bothStarted.countDown();
                    assertTrue(release.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
                }
            };

            WorkerService.WorkRequest second = new WorkerService.WorkRequest() {
                @Override
                public void doWork() throws Exception {
                    threadNames.add(Thread.currentThread().getName());
                    bothStarted.countDown();
                    assertTrue(release.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
                }
            };

            service.schedule(first, 0L);
            service.schedule(second, 1L);

            assertTrue(bothStarted.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertFalse(threadNames.isEmpty());
            assertTrue(threadNames.stream().allMatch(name -> name.startsWith("SharedThread-")));
        } finally {
            release.countDown();
            service.stop();
            service.join(1000);
        }
    }

    // Equivalence class: assignable workers, one single-thread executor per worker thread.
    @Test
    void scheduleWithAssignablePoolUsesOneExecutorPerWorkerId() throws Exception {
        WorkerService service = new WorkerService("Assignable", 2, true);
        CountDownLatch done = new CountDownLatch(2);
        ConcurrentMap<Long, String> threadsById = new ConcurrentHashMap<>();

        try {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadsById.put(0L, Thread.currentThread().getName());
                    done.countDown();
                }
            }, 0L);

            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadsById.put(1L, Thread.currentThread().getName());
                    done.countDown();
                }
            }, 1L);

            assertTrue(done.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertEquals("AssignableThread-1", threadsById.get(0L));
            assertEquals("AssignableThread-2", threadsById.get(1L));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    // Boundary values for id with 3 assignable workers: -1 maps to last worker, 0 maps to first,
    // numThreads - 1 maps to last, and numThreads maps back to first.
    @Test
    void scheduleAssignablePoolMapsBoundaryIdsByModuloWorkerCount() throws Exception {
        WorkerService service = new WorkerService("Boundary", 3, true);
        CountDownLatch done = new CountDownLatch(4);
        ConcurrentMap<Long, String> threadsById = new ConcurrentHashMap<>();

        try {
            long negativeOne = -1L;
            long zero = 0L;
            long lastInRange = 2L;
            long firstOutOfRange = 3L;

            service.schedule(recordingRequestForId(negativeOne, threadsById, done), negativeOne);
            service.schedule(recordingRequestForId(zero, threadsById, done), zero);
            service.schedule(recordingRequestForId(lastInRange, threadsById, done), lastInRange);
            service.schedule(recordingRequestForId(firstOutOfRange, threadsById, done), firstOutOfRange);

            assertTrue(done.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
            assertEquals("BoundaryThread-3", threadsById.get(negativeOne));
            assertEquals("BoundaryThread-1", threadsById.get(zero));
            assertEquals("BoundaryThread-3", threadsById.get(lastInRange));
            assertEquals("BoundaryThread-1", threadsById.get(firstOutOfRange));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    // Lifecycle equivalence class: stopped service rejects scheduled work and calls cleanup instead of doWork.
    @Test
    void scheduleAfterStopCallsCleanup() throws Exception {
        WorkerService service = new WorkerService("Stopped", 0, false);
        service.stop();

        RecordingWorkRequest request = new RecordingWorkRequest();

        service.schedule(request, 0L);

        assertTrue(request.awaitDone());
        assertEquals(0, request.doWorkCount.get());
        assertEquals(1, request.cleanupCount.get());

        service.join(1000);
    }

    // Lifecycle boundary: service transitions from stopped back to started, and newly scheduled work executes again.
    @Test
    void scheduleAfterStopAndRestartExecutesWorkAgain() throws Exception {
        WorkerService service = new WorkerService("Restarted", 0, false);

        try {
            service.stop();

            RecordingWorkRequest stoppedRequest = new RecordingWorkRequest();
            service.schedule(stoppedRequest, 0L);

            assertTrue(stoppedRequest.awaitDone());
            assertEquals(0, stoppedRequest.doWorkCount.get());
            assertEquals(1, stoppedRequest.cleanupCount.get());

            service.start();

            RecordingWorkRequest restartedRequest = new RecordingWorkRequest();
            service.schedule(restartedRequest, 0L);

            assertTrue(restartedRequest.awaitDone());
            assertEquals(1, restartedRequest.doWorkCount.get());
            assertEquals(0, restartedRequest.cleanupCount.get());
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    private static WorkerService.WorkRequest recordingRequestForId(
            long id,
            ConcurrentMap<Long, String> threadsById,
            CountDownLatch done) {
        return new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadsById.put(id, Thread.currentThread().getName());
                done.countDown();
            }
        };
    }
}