package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest9 {

    @SuppressWarnings("unchecked")
    private ArrayList<ExecutorService> workersOf(WorkerService service) throws Exception {
        Field f = WorkerService.class.getDeclaredField("workers");
        f.setAccessible(true);
        return (ArrayList<ExecutorService>) f.get(service);
    }

    private boolean stoppedOf(WorkerService service) throws Exception {
        Field f = WorkerService.class.getDeclaredField("stopped");
        f.setAccessible(true);
        return f.getBoolean(service);
    }

    // Step 1 / Case 1:
    // numThreads <= 0 => no worker executors, synchronous execution path.
    @Test
    void shouldCreateNoWorkersWhenNumThreadsIsZero() throws Exception {
        WorkerService service = new WorkerService("test", 0, false);

        assertEquals(0, workersOf(service).size());
        assertFalse(stoppedOf(service));

        service.stop();
    }

    // Step 1 / Case 2:
    // numThreads > 0 and assignable=false => exactly one executor in workers list.
    @Test
    void shouldCreateSingleExecutorWhenThreadsAreNotAssignable() throws Exception {
        WorkerService service = new WorkerService("test", 3, false);

        assertEquals(1, workersOf(service).size());
        assertFalse(stoppedOf(service));

        service.stop();
        service.join(1000);
    }

    // Step 1 / Case 3:
    // numThreads > 0 and assignable=true => one executor per worker thread.
    @Test
    void shouldCreateOneExecutorPerThreadWhenThreadsAreAssignable() throws Exception {
        WorkerService service = new WorkerService("test", 3, true);

        assertEquals(3, workersOf(service).size());
        assertFalse(stoppedOf(service));

        service.stop();
        service.join(1000);
    }

    // Step 2 / Case 1:
    // id = 0 should map to worker index 0.
    @Test
    void shouldRouteIdZeroToFirstAssignableWorker() throws Exception {
        WorkerService service = new WorkerService("route", 3, true);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<String> threadName = new AtomicReference<>();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadName.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, 0);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(threadName.get().contains("routeThread-1"));

        service.stop();
        service.join(1000);
    }

    // Step 2 / Case 2:
    // id = size - 1 should map to the last worker.
    @Test
    void shouldRouteLastInRangeIdToLastWorker() throws Exception {
        WorkerService service = new WorkerService("route", 3, true);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<String> threadName = new AtomicReference<>();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadName.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, 2);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(threadName.get().contains("routeThread-3"));

        service.stop();
        service.join(1000);
    }

    // Step 2 / Case 3:
    // id = size should wrap via modulo to worker index 0.
    @Test
    void shouldWrapAroundWhenIdEqualsWorkerCount() throws Exception {
        WorkerService service = new WorkerService("route", 3, true);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<String> threadName = new AtomicReference<>();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadName.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, 3);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(threadName.get().contains("routeThread-1"));

        service.stop();
        service.join(1000);
    }

    // Step 2 / Case 4:
    // negative ids should be normalized into a valid worker index.
    @Test
    void shouldNormalizeNegativeIdToValidWorkerIndex() throws Exception {
        WorkerService service = new WorkerService("route", 3, true);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<String> threadName = new AtomicReference<>();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadName.set(Thread.currentThread().getName());
                latch.countDown();
            }
        }, -1);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(threadName.get().contains("routeThread-3"));

        service.stop();
        service.join(1000);
    }

    // Step 3 / Case 1:
    // scheduling while running executes doWork and not cleanup.
    @Test
    void shouldExecuteWorkWhileRunning() throws Exception {
        WorkerService service = new WorkerService("run", 1, false);

        CountDownLatch latch = new CountDownLatch(1);
        AtomicBoolean worked = new AtomicBoolean(false);
        AtomicBoolean cleaned = new AtomicBoolean(false);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
                latch.countDown();
            }

            @Override
            public void cleanup() {
                cleaned.set(true);
            }
        });

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(worked.get());
        assertFalse(cleaned.get());

        service.stop();
        service.join(1000);
    }

    // Step 3 / Case 2:
    // scheduling after stop invokes cleanup immediately.
    @Test
    void shouldCleanupInsteadOfExecutingAfterStop() {
        WorkerService service = new WorkerService("stop", 1, false);
        service.stop();

        AtomicBoolean worked = new AtomicBoolean(false);
        AtomicBoolean cleaned = new AtomicBoolean(false);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                worked.set(true);
            }

            @Override
            public void cleanup() {
                cleaned.set(true);
            }
        });

        assertFalse(worked.get());
        assertTrue(cleaned.get());
    }

    // Step 3 / Case 3:
    // scheduling after stop then start executes again.
    @Test
    void shouldExecuteWorkAfterStopThenRestart() throws Exception {
        WorkerService service = new WorkerService("restart", 1, false);

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
        });

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertTrue(worked.get());

        service.stop();
        service.join(1000);
    }

    // Additional behavior directly visible in code:
    // when there are no workers, ScheduledWorkRequest.run() is invoked synchronously.
    @Test
    void shouldRunSynchronouslyWhenNoWorkersExist() {
        WorkerService service = new WorkerService("sync", 0, false);

        AtomicReference<String> threadName = new AtomicReference<>();
        String callerThread = Thread.currentThread().getName();

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadName.set(Thread.currentThread().getName());
            }
        });

        assertEquals(callerThread, threadName.get());

        service.stop();
    }
}