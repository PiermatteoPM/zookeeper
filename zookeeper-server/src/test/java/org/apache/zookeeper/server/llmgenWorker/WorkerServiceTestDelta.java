package org.apache.zookeeper.server.llmgenWorker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

public class WorkerServiceTestDelta {

    @Test
    public void testNoPoolExecutesSynchronouslyOnCallingThread() {
        WorkerService service = new WorkerService("NoPool", 0, false);
        String callingThread = Thread.currentThread().getName();
        AtomicBoolean workDone = new AtomicBoolean(false);
        AtomicReference<String> executionThread = new AtomicReference<>();

        try {
            // Equivalence class: no worker pool configuration, numThreads == 0.
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    workDone.set(true);
                    executionThread.set(Thread.currentThread().getName());
                }
            });

            assertTrue(workDone.get());
            assertEquals(callingThread, executionThread.get());
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    public void testSharedPoolUsesCommonExecutorForMultipleTasks() throws Exception {
        WorkerService service = new WorkerService("Shared", 2, false);
        CountDownLatch tasksStarted = new CountDownLatch(2);
        CountDownLatch releaseTasks = new CountDownLatch(1);
        CountDownLatch tasksFinished = new CountDownLatch(2);
        Set<String> executionThreads = ConcurrentHashMap.newKeySet();

        try {
            // Equivalence class: shared worker pool configuration, numThreads > 0 and assignable == false.
            WorkerService.WorkRequest blockingWork = new WorkerService.WorkRequest() {
                @Override
                public void doWork() throws Exception {
                    executionThreads.add(Thread.currentThread().getName());
                    tasksStarted.countDown();
                    releaseTasks.await(5, TimeUnit.SECONDS);
                    tasksFinished.countDown();
                }
            };

            service.schedule(blockingWork, 0);
            service.schedule(blockingWork, 1);

            assertTrue(tasksStarted.await(5, TimeUnit.SECONDS));
            releaseTasks.countDown();
            assertTrue(tasksFinished.await(5, TimeUnit.SECONDS));

            assertEquals(2, executionThreads.size());
            assertTrue(executionThreads.stream().allMatch(name -> name.startsWith("SharedThread-")));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    public void testAssignablePoolMapsBoundaryIdsToExpectedWorkerThreads() throws Exception {
        WorkerService service = new WorkerService("Assignable", 3, true);
        CountDownLatch finished = new CountDownLatch(5);
        Map<Long, String> threadById = new ConcurrentHashMap<>();

        try {
            scheduleRecordingWork(service, -1L, threadById, finished);
            scheduleRecordingWork(service, 0L, threadById, finished);
            scheduleRecordingWork(service, 2L, threadById, finished);
            scheduleRecordingWork(service, 3L, threadById, finished);
            scheduleRecordingWork(service, 4L, threadById, finished);

            assertTrue(finished.await(5, TimeUnit.SECONDS));

            // Boundary value: id == -1 maps to the last worker when numThreads == 3.
            assertEquals("AssignableThread-3", threadById.get(-1L));

            // Boundary value: id == 0 maps to the first worker.
            assertEquals("AssignableThread-1", threadById.get(0L));

            // Boundary value: id == numThreads - 1 maps to the last worker.
            assertEquals("AssignableThread-3", threadById.get(2L));

            // Boundary value: id == numThreads wraps around to the first worker.
            assertEquals("AssignableThread-1", threadById.get(3L));

            // Boundary value: id == numThreads + 1 maps to the second worker.
            assertEquals("AssignableThread-2", threadById.get(4L));
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    public void testScheduleWithoutIdOnAssignablePoolUsesFirstWorker() throws Exception {
        WorkerService service = new WorkerService("DefaultAssignable", 3, true);
        CountDownLatch finished = new CountDownLatch(1);
        AtomicReference<String> executionThread = new AtomicReference<>();

        try {
            // Equivalence class: assignable worker pool called through schedule(workRequest), default id == 0.
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    executionThread.set(Thread.currentThread().getName());
                    finished.countDown();
                }
            });

            assertTrue(finished.await(5, TimeUnit.SECONDS));
            assertEquals("DefaultAssignableThread-1", executionThread.get());
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    @Test
    public void testStoppedServiceCleansUpAndRestartedServiceRunsWork() {
        WorkerService service = new WorkerService("Lifecycle", 0, false);
        AtomicInteger workCount = new AtomicInteger(0);
        AtomicInteger cleanupCount = new AtomicInteger(0);

        try {
            service.stop();

            // Lifecycle boundary: service is stopped, so scheduled work is not executed and cleanup is called.
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    workCount.incrementAndGet();
                }

                @Override
                public void cleanup() {
                    cleanupCount.incrementAndGet();
                }
            });

            assertEquals(0, workCount.get());
            assertEquals(1, cleanupCount.get());

            service.start();

            // Lifecycle equivalence class: service has been restarted, so scheduled work executes normally.
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    workCount.incrementAndGet();
                }

                @Override
                public void cleanup() {
                    cleanupCount.incrementAndGet();
                }
            });

            assertEquals(1, workCount.get());
            assertEquals(1, cleanupCount.get());
        } finally {
            service.stop();
            service.join(1000);
        }
    }

    private static void scheduleRecordingWork(
            WorkerService service,
            long id,
            Map<Long, String> threadById,
            CountDownLatch finished) {

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                threadById.put(id, Thread.currentThread().getName());
                finished.countDown();
            }
        }, id);
    }
}