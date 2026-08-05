package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest8 {

    private static class RecordingWorkRequest extends WorkerService.WorkRequest {
        final AtomicInteger doWorkCalls = new AtomicInteger();
        final AtomicInteger cleanupCalls = new AtomicInteger();
        final CountDownLatch latch;

        RecordingWorkRequest() {
            this(null);
        }

        RecordingWorkRequest(CountDownLatch latch) {
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
            if (latch != null) {
                latch.countDown();
            }
        }
    }

    @Test
        // Equivalence Class: name=null, numThreads=0 => synchronous execution, no executor path
    void scheduleRunsSynchronouslyWhenNumThreadsIsZero() {
        WorkerService service = new WorkerService(null, 0, false);

        Thread callingThread = Thread.currentThread();
        AtomicBoolean sameThread = new AtomicBoolean(false);

        WorkerService.WorkRequest wr = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                sameThread.set(Thread.currentThread() == callingThread);
            }
        };

        service.schedule(wr);

        assertTrue(sameThread.get());
    }

    @Test
        // Boundary Value: numThreads=-1 behaves like numThreads=0
    void negativeNumThreadsBehavesLikeZeroThreads() {
        WorkerService service = new WorkerService("Test", -1, false);

        Thread callingThread = Thread.currentThread();
        AtomicBoolean sameThread = new AtomicBoolean(false);

        WorkerService.WorkRequest wr = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                sameThread.set(Thread.currentThread() == callingThread);
            }
        };

        service.schedule(wr);

        assertTrue(sameThread.get());
    }

    @Test
        // Equivalence Class: shared executor mode (threadsAreAssignable=false) => all ids share one executor
    void allIdsUseSingleSharedExecutorWhenAssignableDisabled() throws Exception {
        WorkerService service = new WorkerService("Test", 3, false);

        Set<String> threadNames = ConcurrentHashMap.newKeySet();
        CountDownLatch latch = new CountDownLatch(20);

        for (int i = 0; i < 20; i++) {
            final long id = i;
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadNames.add(Thread.currentThread().getName());
                    latch.countDown();
                }
            }, id);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertEquals(1, threadNames.size());

        service.stop();
        service.join(1000);
    }

    @Test
        // Equivalence Class: assignable threads enabled, ids map to distinct executors
    void differentIdsMapToDifferentExecutorsWhenAssignableEnabled() throws Exception {
        WorkerService service = new WorkerService("Test", 3, true);

        Set<String> threadNames = ConcurrentHashMap.newKeySet();
        CountDownLatch latch = new CountDownLatch(3);

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
        assertEquals(3, threadNames.size());

        service.stop();
        service.join(1000);
    }

    @Test
        // Equivalence Class: stopped service rejects scheduling and invokes cleanup
    void scheduleAfterStopInvokesCleanupInsteadOfDoWork() {
        WorkerService service = new WorkerService("Test", 1, false);
        service.stop();

        RecordingWorkRequest wr = new RecordingWorkRequest();

        service.schedule(wr);

        assertEquals(0, wr.doWorkCalls.get());
        assertEquals(1, wr.cleanupCalls.get());
    }

    @Test
        // Boundary Value: exception thrown by doWork() => cleanup() invoked
    void cleanupCalledWhenDoWorkThrowsException() {
        WorkerService service = new WorkerService(null, 0, false);

        AtomicInteger cleanupCalls = new AtomicInteger();

        WorkerService.WorkRequest wr = new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                throw new Exception("failure");
            }

            @Override
            public void cleanup() {
                cleanupCalls.incrementAndGet();
            }
        };

        service.schedule(wr);

        assertEquals(1, cleanupCalls.get());
    }

    @Test
        // Boundary Value: negative id maps correctly via modulo normalization
    void negativeIdStillExecutesSuccessfully() throws Exception {
        WorkerService service = new WorkerService("Test", 3, true);

        RecordingWorkRequest wr = new RecordingWorkRequest(new CountDownLatch(1));

        service.schedule(wr, -1);

        assertTrue(wr.latch.await(5, TimeUnit.SECONDS));
        assertEquals(1, wr.doWorkCalls.get());
        assertEquals(0, wr.cleanupCalls.get());

        service.stop();
        service.join(1000);
    }

    @Test
        // Equivalence Class: stop -> start creates mixed state where old executor rejects and new executor accepts
    void stopThenStartOldExecutorRejectsButFreshExecutorAccepts() throws Exception {
        WorkerService service = new WorkerService("Test", 2, true);

        service.stop();
        service.start();

        RecordingWorkRequest rejectedRequest = new RecordingWorkRequest();
        RecordingWorkRequest acceptedRequest = new RecordingWorkRequest(new CountDownLatch(1));

        service.schedule(rejectedRequest, 0);
        service.schedule(acceptedRequest, 2);

        assertTrue(acceptedRequest.latch.await(5, TimeUnit.SECONDS));

        assertEquals(0, rejectedRequest.doWorkCalls.get());
        assertEquals(1, rejectedRequest.cleanupCalls.get());

        assertEquals(1, acceptedRequest.doWorkCalls.get());
        assertEquals(0, acceptedRequest.cleanupCalls.get());

        service.stop();
        service.join(1000);
    }
}