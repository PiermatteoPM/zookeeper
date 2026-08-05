package org.apache.zookeeper.server.llmgenWorker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

public class WorkerServiceTest1 {

    private static class TrackingWorkRequest extends WorkerService.WorkRequest {
        private final AtomicInteger doWorkCalls = new AtomicInteger();
        private final AtomicInteger cleanupCalls = new AtomicInteger();
        private final CountDownLatch latch;

        TrackingWorkRequest() {
            this(null);
        }

        TrackingWorkRequest(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void doWork() {
            doWorkCalls.incrementAndGet();
            if (latch != null) {
                latch.countDown();
            }
        }

        @Override
        public void cleanup() {
            cleanupCalls.incrementAndGet();
        }

        int getDoWorkCalls() {
            return doWorkCalls.get();
        }

        int getCleanupCalls() {
            return cleanupCalls.get();
        }
    }

    @Test
    void shouldRunWorkSynchronouslyWhenNoWorkerThreadsConfigured() {
        WorkerService service = new WorkerService("sync", 0, false);

        TrackingWorkRequest request = new TrackingWorkRequest();

        service.schedule(request);

        assertEquals(1, request.getDoWorkCalls());
        assertEquals(0, request.getCleanupCalls());

        service.stop();
    }

    @Test
    void shouldExecuteWorkOnWorkerThread() throws Exception {
        WorkerService service = new WorkerService("async", 1, false);

        CountDownLatch latch = new CountDownLatch(1);
        TrackingWorkRequest request = new TrackingWorkRequest(latch);

        service.schedule(request);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertEquals(1, request.getDoWorkCalls());
        assertEquals(0, request.getCleanupCalls());

        service.stop();
        service.join(1000);
    }

    @Test
    void shouldCleanupImmediatelyWhenServiceAlreadyStopped() {
        WorkerService service = new WorkerService("stopped", 0, false);
        service.stop();

        TrackingWorkRequest request = new TrackingWorkRequest();

        service.schedule(request);

        assertEquals(0, request.getDoWorkCalls());
        assertEquals(1, request.getCleanupCalls());
    }

    @Test
    void shouldCleanupWhenWorkThrowsException() {
        WorkerService service = new WorkerService("exception", 0, false);

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

        service.stop();
    }

    @Test
    void shouldCleanupQueuedWorkIfStoppedBeforeExecution() throws Exception {
        WorkerService service = new WorkerService("queued", 1, false);

        CountDownLatch blockerStarted = new CountDownLatch(1);
        CountDownLatch releaseBlocker = new CountDownLatch(1);

        WorkerService.WorkRequest blockingRequest = new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                blockerStarted.countDown();
                releaseBlocker.await(5, TimeUnit.SECONDS);
            }
        };

        AtomicInteger doWorkCalls = new AtomicInteger();
        AtomicInteger cleanupCalls = new AtomicInteger();

        WorkerService.WorkRequest queuedRequest = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                doWorkCalls.incrementAndGet();
            }

            @Override
            public void cleanup() {
                cleanupCalls.incrementAndGet();
            }
        };

        service.schedule(blockingRequest);
        assertTrue(blockerStarted.await(5, TimeUnit.SECONDS));

        service.schedule(queuedRequest);

        service.stop();
        releaseBlocker.countDown();

        service.join(3000);

        assertEquals(0, doWorkCalls.get());
        assertEquals(1, cleanupCalls.get());
    }

    @Test
    void shouldProcessMultipleIdsWithAssignableThreads() throws Exception {
        WorkerService service = new WorkerService("assignable", 2, true);

        CountDownLatch latch = new CountDownLatch(2);
        TrackingWorkRequest request1 = new TrackingWorkRequest(latch);
        TrackingWorkRequest request2 = new TrackingWorkRequest(latch);

        service.schedule(request1, 1);
        service.schedule(request2, -1);

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        assertEquals(1, request1.getDoWorkCalls());
        assertEquals(1, request2.getDoWorkCalls());
        assertEquals(0, request1.getCleanupCalls());
        assertEquals(0, request2.getCleanupCalls());

        service.stop();
        service.join(1000);
    }

    @Test
    void stopAndJoinShouldCompleteWithoutPendingWork() {
        WorkerService service = new WorkerService("lifecycle", 1, false);

        service.stop();
        service.join(1000);

        TrackingWorkRequest request = new TrackingWorkRequest();
        service.schedule(request);

        assertEquals(0, request.getDoWorkCalls());
        assertEquals(1, request.getCleanupCalls());
    }
}