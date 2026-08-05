package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest7 {

    private WorkerService service;

    @AfterEach
    void tearDown() {
        if (service != null) {
            service.stop();
        }
    }

    @Test
    void testScheduleRunsImmediatelyWhenNoWorkersConfigured() {
        service = new WorkerService(null, 0, false);

        AtomicBoolean doWorkCalled = new AtomicBoolean(false);
        AtomicReference<Thread> executingThread = new AtomicReference<>();

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                doWorkCalled.set(true);
                executingThread.set(Thread.currentThread());
            }

            @Override
            public void cleanup() {
                fail("cleanup() should not be called");
            }
        };

        Thread caller = Thread.currentThread();
        service.schedule(request);

        assertTrue(doWorkCalled.get());
        assertSame(caller, executingThread.get());
    }

    @Test
    void testStoppedServiceInvokesCleanupInsteadOfDoWork() {
        service = new WorkerService("Test", 1, false);
        service.stop();

        AtomicBoolean doWorkCalled = new AtomicBoolean(false);
        AtomicBoolean cleanupCalled = new AtomicBoolean(false);

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                doWorkCalled.set(true);
            }

            @Override
            public void cleanup() {
                cleanupCalled.set(true);
            }
        };

        service.schedule(request);

        assertFalse(doWorkCalled.get());
        assertTrue(cleanupCalled.get());
    }

    @Test
    void testStartAfterStopAllowsWorkAgain() throws Exception {
        service = new WorkerService("Test", 1, false);
        service.stop();
        service.start();

        CountDownLatch latch = new CountDownLatch(1);

        WorkerService.WorkRequest request = new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                latch.countDown();
            }

            @Override
            public void cleanup() {
                fail("cleanup() should not be called after restart");
            }
        };

        service.schedule(request);

        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    @Test
    void testSharedExecutorUsedWhenNotAssigningWorkersById() throws Exception {
        service = new WorkerService("Test", 3, false);

        CountDownLatch latch = new CountDownLatch(3);
        Set<String> threadNames = ConcurrentHashMap.newKeySet();

        for (long id : new long[]{0L, 1L, 2L}) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadNames.add(Thread.currentThread().getName());
                    latch.countDown();
                }

                @Override
                public void cleanup() {
                    fail("cleanup() should not be called");
                }
            }, id);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        /*
         * A shared executor configuration is expected to route all work
         * through the same backing worker/executor.
         */
        assertEquals(1, threadNames.size());
    }

    @Test
    void testDifferentIdsCanUseDifferentWorkersWhenAssignedById() throws Exception {
        service = new WorkerService("Test", 3, true);

        CountDownLatch latch = new CountDownLatch(3);
        Set<String> threadNames = ConcurrentHashMap.newKeySet();

        for (long id : new long[]{0L, 1L, 2L}) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadNames.add(Thread.currentThread().getName());
                    latch.countDown();
                }

                @Override
                public void cleanup() {
                    fail("cleanup() should not be called");
                }
            }, id);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));

        assertEquals(3, threadNames.size());
    }

    @Test
    void testSameIdIsConsistentlyRoutedToSameWorker() throws Exception {
        service = new WorkerService("Test", 3, true);

        CountDownLatch latch = new CountDownLatch(5);
        Set<String> threadNames = ConcurrentHashMap.newKeySet();

        for (int i = 0; i < 5; i++) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    threadNames.add(Thread.currentThread().getName());
                    latch.countDown();
                }

                @Override
                public void cleanup() {
                    fail("cleanup() should not be called");
                }
            }, 1L);
        }

        assertTrue(latch.await(5, TimeUnit.SECONDS));
        assertEquals(1, threadNames.size());
    }

    @Test
    void testWorkRequestsForSameIdExecuteSerially() throws Exception {
        service = new WorkerService("Test", 3, true);

        CountDownLatch finished = new CountDownLatch(2);
        AtomicInteger active = new AtomicInteger();
        AtomicInteger maxActive = new AtomicInteger();

        Runnable body = () -> {
            int now = active.incrementAndGet();
            maxActive.updateAndGet(v -> Math.max(v, now));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                active.decrementAndGet();
                finished.countDown();
            }
        };

        for (int i = 0; i < 2; i++) {
            service.schedule(new WorkerService.WorkRequest() {
                @Override
                public void doWork() {
                    body.run();
                }

                @Override
                public void cleanup() {
                    fail("cleanup() should not be called");
                }
            }, 7L);
        }

        assertTrue(finished.await(5, TimeUnit.SECONDS));
        assertEquals(1, maxActive.get());
    }

    @Test
    void testExceptionInWorkRequestDoesNotPreventSubsequentExecution() throws Exception {
        service = new WorkerService("Test", 1, false);

        CountDownLatch latch = new CountDownLatch(1);

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                throw new RuntimeException("expected");
            }

            @Override
            public void cleanup() {
            }
        });

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                throw new RuntimeException("expected");
            }

            @Override
            public void cleanup() {
            }
        });

        service.schedule(new WorkerService.WorkRequest() {
            @Override
            public void doWork() {
                latch.countDown();
            }

            @Override
            public void cleanup() {
                fail("cleanup() should not be called");
            }
        });

        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }
}