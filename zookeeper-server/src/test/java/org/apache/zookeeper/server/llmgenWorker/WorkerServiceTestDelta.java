package org.apache.zookeeper.server.llmgenWorker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

class WorkerServiceTestDelta {

    private static final long TIMEOUT_SECONDS = 5L;

    /**
     * Equivalence class: no worker pool, numThreads == 0.
     * Boundary value: id == 0 with zero configured worker threads.
     */
    @Test
    void scheduleRunsSynchronouslyWhenNoWorkerPoolIsConfigured() {
        WorkerService service = new WorkerService("NoPool", 0, false);
        String callerThreadName = Thread.currentThread().getName();
        AtomicInteger doWorkCount = new AtomicInteger();
        AtomicInteger cleanupCount = new AtomicInteger();
        List<String> threadNames = new ArrayList<>();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                doWorkCount.incrementAndGet();
                threadNames.add(Thread.currentThread().getName());
            }

            @Override
            public void cleanup() {
                cleanupCount.incrementAndGet();
            }
        }, 0L);

        assertEquals(1, doWorkCount.get());
        assertEquals(0, cleanupCount.get());
        assertEquals(callerThreadName, threadNames.get(0));

        service.stop();
        service.join(1000);
    }

    /**
     * Equivalence class: shared worker pool, numThreads > 0 and assignable == false.
     * Boundary values: ids 0, numThreads - 1, and numThreads should all be accepted by the shared pool.
     */
    @Test
    void scheduleUsesSharedThreadPoolWhenThreadsAreNotAssignable() throws Exception {
        int numThreads = 3;
        WorkerService service = new WorkerService("SharedPool", numThreads, false);
        CountDownLatch allStarted = new CountDownLatch(numThreads);
        CountDownLatch release = new CountDownLatch(1);
        CountDownLatch allFinished = new CountDownLatch(numThreads);
        List<String> threadNames = Collections.synchronizedList(new ArrayList<>());
        AtomicInteger cleanupCount = new AtomicInteger();

        WorkerService.WorkRequest blockingRequest = new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                threadNames.add(Thread.currentThread().getName());
                allStarted.countDown();
                assertTrue(release.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
                allFinished.countDown();
            }

            @Override
            public void cleanup() {
                cleanupCount.incrementAndGet();
                allFinished.countDown();
            }
        };

        service.schedule(blockingRequest, 0L);
        service.schedule(blockingRequest, numThreads - 1L);
        service.schedule(blockingRequest, numThreads);

        assertTrue(allStarted.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
        release.countDown();
        assertTrue(allFinished.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));

        assertEquals(0, cleanupCount.get());
        assertEquals(numThreads, threadNames.size());
        assertTrue(threadNames.stream().allMatch(name -> name.startsWith("SharedPoolThread-")));

        service.stop();
        service.join(1000);
    }

    /**
     * Equivalence class: one executor per worker thread, assignable == true.
     * Boundary values for id relative to numThreads == 3:
     * id 0 maps to first worker, id 1 maps to second worker, id 2 maps to last worker,
     * id 3 wraps to first worker, id -1 wraps to last worker, and id -3 wraps to first worker.
     */
    @Test
    void scheduleMapsBoundaryIdsToAssignableSingleThreadExecutors() throws Exception {
        int numThreads = 3;
        WorkerService service = new WorkerService("Assignable", numThreads, true);
        CountDownLatch done = new CountDownLatch(6);
        Map<Long, String> observedThreadById = new ConcurrentHashMap<>();
        AtomicInteger cleanupCount = new AtomicInteger();

        long[] ids = new long[] {0L, 1L, 2L, 3L, -1L, -3L};
        for (long id : ids) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    observedThreadById.put(id, Thread.currentThread().getName());
                    done.countDown();
                }

                @Override
                public void cleanup() {
                    cleanupCount.incrementAndGet();
                    done.countDown();
                }
            }, id);
        }

        assertTrue(done.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
        assertEquals(0, cleanupCount.get());

        assertEquals("AssignableThread-1", observedThreadById.get(0L));
        assertEquals("AssignableThread-2", observedThreadById.get(1L));
        assertEquals("AssignableThread-3", observedThreadById.get(2L));
        assertEquals("AssignableThread-1", observedThreadById.get(3L));
        assertEquals("AssignableThread-3", observedThreadById.get(-1L));
        assertEquals("AssignableThread-1", observedThreadById.get(-3L));

        service.stop();
        service.join(1000);
    }

    /**
     * Boundary values for id relative to numThreads == 2 in assignable mode:
     * Long.MIN_VALUE and Long.MAX_VALUE must still map into a valid worker and execute.
     */
    @Test
    void scheduleHandlesExtremeLongIdsInAssignableMode() throws Exception {
        WorkerService service = new WorkerService("ExtremeIds", 2, true);
        CountDownLatch done = new CountDownLatch(2);
        AtomicInteger doWorkCount = new AtomicInteger();
        AtomicInteger cleanupCount = new AtomicInteger();
        List<String> threadNames = Collections.synchronizedList(new ArrayList<>());

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                doWorkCount.incrementAndGet();
                threadNames.add(Thread.currentThread().getName());
                done.countDown();
            }

            @Override
            public void cleanup() {
                cleanupCount.incrementAndGet();
                done.countDown();
            }
        };

        service.schedule(request, Long.MIN_VALUE);
        service.schedule(request, Long.MAX_VALUE);

        assertTrue(done.await(TIMEOUT_SECONDS, TimeUnit.SECONDS));
        assertEquals(2, doWorkCount.get());
        assertEquals(0, cleanupCount.get());
        assertTrue(threadNames.stream().allMatch(name -> name.startsWith("ExtremeIdsThread-")));

        service.stop();
        service.join(1000);
    }

    /**
     * Lifecycle equivalence class: stopped service.
     * Boundary value: scheduling immediately after stop must not execute work and must call cleanup.
     */
    @Test
    void scheduleCallsCleanupInsteadOfDoWorkWhenServiceIsStopped() {
        WorkerService service = new WorkerService("Stopped", 0, false);
        AtomicInteger doWorkCount = new AtomicInteger();
        AtomicInteger cleanupCount = new AtomicInteger();

        service.stop();

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

        service.join(1000);
    }

    /**
     * Lifecycle equivalence class: stopped then restarted service.
     * Boundary values: numThreads == 0 and id == 0 verify that direct execution resumes after restart.
     */
    @Test
    void scheduleExecutesAgainAfterStoppedServiceIsRestartedWithoutWorkerPool() {
        WorkerService service = new WorkerService("RestartNoPool", 0, false);
        AtomicInteger doWorkCount = new AtomicInteger();
        AtomicInteger cleanupCount = new AtomicInteger();

        service.stop();

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

        service.start();

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

        assertEquals(1, doWorkCount.get());
        assertEquals(1, cleanupCount.get());

        service.stop();
        service.join(1000);
    }

    /**
     * Equivalence class: scheduled work throws an exception.
     * Boundary condition: cleanup is invoked after doWork fails instead of propagating the exception.
     */
    @Test
    void scheduleCallsCleanupWhenWorkRequestThrowsException() {
        WorkerService service = new WorkerService("ExceptionNoPool", 0, false);
        AtomicInteger doWorkCount = new AtomicInteger();
        AtomicInteger cleanupCount = new AtomicInteger();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() throws Exception {
                doWorkCount.incrementAndGet();
                throw new Exception("boom");
            }

            @Override
            public void cleanup() {
                cleanupCount.incrementAndGet();
            }
        }, 0L);

        assertEquals(1, doWorkCount.get());
        assertEquals(1, cleanupCount.get());

        service.stop();
        service.join(1000);
    }
}