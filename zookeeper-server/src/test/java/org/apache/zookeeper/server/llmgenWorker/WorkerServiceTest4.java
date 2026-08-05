package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest4 {

    private static class TrackingWorkRequest extends WorkerService.WorkRequest {
        private final AtomicBoolean worked;
        private final AtomicBoolean cleaned;
        private final CountDownLatch latch;

        TrackingWorkRequest(AtomicBoolean worked,
                            AtomicBoolean cleaned,
                            CountDownLatch latch) {
            this.worked = worked;
            this.cleaned = cleaned;
            this.latch = latch;
        }

        @Override
        public void doWork() {
            worked.set(true);
            latch.countDown();
        }

        @Override
        public void cleanup() {
            cleaned.set(true);
            latch.countDown();
        }
    }

    @Test
    void testNoThreadPoolExecutesSynchronously() {
        // Equivalence Class: numThreads = 0 (no worker pool configuration)
        WorkerService service = new WorkerService("test", 0, false);

        AtomicBoolean worked = new AtomicBoolean(false);
        AtomicBoolean cleaned = new AtomicBoolean(false);

        service.schedule(new TrackingWorkRequest(
                worked,
                cleaned,
                new CountDownLatch(1)));

        assertTrue(worked.get());
        assertFalse(cleaned.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void testSharedThreadPoolExecutesWork() throws Exception {
        // Equivalence Class: numThreads > 0 with assignableThreads = false (shared pool)
        WorkerService service = new WorkerService("test", 2, false);

        AtomicBoolean worked = new AtomicBoolean(false);
        AtomicBoolean cleaned = new AtomicBoolean(false);
        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new TrackingWorkRequest(worked, cleaned, latch), 0);

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertTrue(worked.get());
        assertFalse(cleaned.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void testAssignableThreadsUsesDifferentExecutorsForDifferentIds() throws Exception {
        // Equivalence Class: numThreads > 0 with assignableThreads = true (one executor per thread)
        WorkerService service = new WorkerService("assignable", 2, true);

        Set<String> threadNames = ConcurrentHashMap.newKeySet();
        CountDownLatch latch = new CountDownLatch(2);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadNames.add(Thread.currentThread().getName());
                latch.countDown();
            }
        }, 0);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadNames.add(Thread.currentThread().getName());
                latch.countDown();
            }
        }, 1);

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertEquals(2, threadNames.size());

        service.stop();
        service.join(1000);
    }

    @Test
    void testIdBoundaryValueZero() throws Exception {
        // Boundary Value: id = 0 (lower partition representative)
        WorkerService service = new WorkerService("test", 3, true);

        AtomicBoolean worked = new AtomicBoolean(false);
        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
                latch.countDown();
            }
        }, 0);

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertTrue(worked.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void testIdBoundaryValueEqualToWorkerCount() throws Exception {
        // Boundary Value: id = numberOfWorkers (3), wraps to first executor
        WorkerService service = new WorkerService("test", 3, true);

        AtomicBoolean worked = new AtomicBoolean(false);
        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
                latch.countDown();
            }
        }, 3);

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertTrue(worked.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void testIdBoundaryValueJustBelowWorkerCount() throws Exception {
        // Boundary Value: id = numberOfWorkers - 1
        WorkerService service = new WorkerService("test", 3, true);

        AtomicBoolean worked = new AtomicBoolean(false);
        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
                latch.countDown();
            }
        }, 2);

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertTrue(worked.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void testIdBoundaryValueNegativeOne() throws Exception {
        // Boundary Value: id = -1 (negative boundary, modulo normalization path)
        WorkerService service = new WorkerService("test", 3, true);

        AtomicBoolean worked = new AtomicBoolean(false);
        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
                latch.countDown();
            }
        }, -1);

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertTrue(worked.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void testStoppedServiceInvokesCleanup() throws Exception {
        // Equivalence Class: service lifecycle state = stopped
        WorkerService service = new WorkerService("test", 1, false);
        service.stop();

        AtomicBoolean worked = new AtomicBoolean(false);
        AtomicBoolean cleaned = new AtomicBoolean(false);
        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new TrackingWorkRequest(worked, cleaned, latch));

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertFalse(worked.get());
        assertTrue(cleaned.get());

        service.join(1000);
    }

    @Test
    void testRestartedServiceAcceptsWorkAgain() throws Exception {
        // Equivalence Class: lifecycle transition stopped -> restarted -> running
        WorkerService service = new WorkerService("test", 1, false);

        service.stop();
        service.join(1000);

        service.start();

        AtomicBoolean worked = new AtomicBoolean(false);
        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
                latch.countDown();
            }
        });

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertTrue(worked.get());

        service.stop();
        service.join(1000);
    }

    @Test
    void testExceptionInWorkTriggersCleanup() throws Exception {
        // Equivalence Class: work request throws exception
        WorkerService service = new WorkerService("test", 1, false);

        AtomicBoolean cleaned = new AtomicBoolean(false);
        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                throw new Exception("failure");
            }

            @Override
            public void cleanup() {
                cleaned.set(true);
                latch.countDown();
            }
        });

        assertTrue(latch.await(2, TimeUnit.SECONDS));
        assertTrue(cleaned.get());

        service.stop();
        service.join(1000);
    }
}