package org.apache.zookeeper.server.llmgenWorker;

import org.apache.zookeeper.server.WorkerService;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerServiceTest10 {

    private static class RecordingWorkRequest extends WorkerService.WorkRequest {
        final AtomicBoolean worked = new AtomicBoolean(false);
        final AtomicBoolean cleaned = new AtomicBoolean(false);
        final CountDownLatch latch = new CountDownLatch(1);
        final AtomicReference<String> threadName = new AtomicReference<>();

        @Override
        public void doWork() {
            worked.set(true);
            threadName.set(Thread.currentThread().getName());
            latch.countDown();
        }

        @Override
        public void cleanup() {
            cleaned.set(true);
            latch.countDown();
        }
    }

    private static class FailingWorkRequest extends WorkerService.WorkRequest {
        final AtomicBoolean cleaned = new AtomicBoolean(false);
        final CountDownLatch latch = new CountDownLatch(1);

        @Override
        public void doWork() throws Exception {
            throw new Exception("expected test exception");
        }

        @Override
        public void cleanup() {
            cleaned.set(true);
            latch.countDown();
        }
    }

    /**
     * Configuration: no pool (numThreads = 0)
     * Expected: work executed directly on caller thread.
     */
    @Test
    void shouldExecuteDirectlyWhenNoWorkersConfigured() {
        WorkerService service = new WorkerService("direct", 0, false);

        RecordingWorkRequest request = new RecordingWorkRequest();
        String callerThread = Thread.currentThread().getName();

        service.schedule(request);

        assertTrue(request.worked.get());
        assertFalse(request.cleaned.get());
        assertEquals(callerThread, request.threadName.get());
    }

    /**
     * Configuration: shared pool.
     * Expected: work executed on worker thread.
     */
    @Test
    void shouldExecuteOnSharedPoolThread() throws Exception {
        WorkerService service = new WorkerService("shared", 2, false);

        RecordingWorkRequest request = new RecordingWorkRequest();

        service.schedule(request);

        assertTrue(request.latch.await(5, TimeUnit.SECONDS));
        assertTrue(request.worked.get());
        assertFalse(request.cleaned.get());
        assertNotNull(request.threadName.get());
        assertNotEquals(Thread.currentThread().getName(), request.threadName.get());

        service.stop();
        service.join(1000);
    }

    /**
     * Configuration: assignable threads (one executor per logical worker).
     * Expected: same id maps to same worker thread.
     */
    @Test
    void shouldRouteSameIdToSameAssignableWorker() throws Exception {
        WorkerService service = new WorkerService("assignable", 3, true);

        RecordingWorkRequest r1 = new RecordingWorkRequest();
        RecordingWorkRequest r2 = new RecordingWorkRequest();

        long id = 7L;

        service.schedule(r1, id);
        service.schedule(r2, id);

        assertTrue(r1.latch.await(5, TimeUnit.SECONDS));
        assertTrue(r2.latch.await(5, TimeUnit.SECONDS));

        assertTrue(r1.worked.get());
        assertTrue(r2.worked.get());
        assertEquals(r1.threadName.get(), r2.threadName.get());

        service.stop();
        service.join(1000);
    }

    /**
     * Lifecycle state: stopped.
     * Expected: cleanup invoked instead of doWork.
     */
    @Test
    void shouldInvokeCleanupWhenStopped() {
        WorkerService service = new WorkerService("stopped", 1, false);
        service.stop();

        RecordingWorkRequest request = new RecordingWorkRequest();

        service.schedule(request);

        assertFalse(request.worked.get());
        assertTrue(request.cleaned.get());

        service.join(1000);
    }

    /**
     * Lifecycle state: stop -> start (restart).
     * Expected: work can execute again after restart.
     */
    @Test
    void shouldExecuteWorkAfterRestart() throws Exception {
        WorkerService service = new WorkerService("restart", 1, false);

        service.stop();

        RecordingWorkRequest stoppedRequest = new RecordingWorkRequest();
        service.schedule(stoppedRequest);

        assertTrue(stoppedRequest.cleaned.get());
        assertFalse(stoppedRequest.worked.get());

        service.start();

        RecordingWorkRequest restartedRequest = new RecordingWorkRequest();
        service.schedule(restartedRequest);

        assertTrue(restartedRequest.latch.await(5, TimeUnit.SECONDS));
        assertTrue(restartedRequest.worked.get());

        service.stop();
        service.join(1000);
    }

    /**
     * Boundary value: id = 0.
     */
    @Test
    void shouldHandleZeroId() throws Exception {
        WorkerService service = new WorkerService("zero", 2, true);

        RecordingWorkRequest request = new RecordingWorkRequest();

        service.schedule(request, 0L);

        assertTrue(request.latch.await(5, TimeUnit.SECONDS));
        assertTrue(request.worked.get());

        service.stop();
        service.join(1000);
    }

    /**
     * Boundary value: negative id.
     * Verifies normalization logic:
     * ((id % size) + size) % size
     */
    @Test
    void shouldHandleNegativeId() throws Exception {
        WorkerService service = new WorkerService("negative", 3, true);

        RecordingWorkRequest request = new RecordingWorkRequest();

        service.schedule(request, -1L);

        assertTrue(request.latch.await(5, TimeUnit.SECONDS));
        assertTrue(request.worked.get());

        service.stop();
        service.join(1000);
    }

    /**
     * Boundary value: large id greater than executor count.
     */
    @Test
    void shouldHandleIdLargerThanExecutorCount() throws Exception {
        WorkerService service = new WorkerService("large", 3, true);

        RecordingWorkRequest request = new RecordingWorkRequest();

        service.schedule(request, 1_000_000L);

        assertTrue(request.latch.await(5, TimeUnit.SECONDS));
        assertTrue(request.worked.get());

        service.stop();
        service.join(1000);
    }

    /**
     * Edge case: doWork throws.
     * Expected: cleanup invoked.
     */
    @Test
    void shouldCleanupWhenDoWorkThrowsException() throws Exception {
        WorkerService service = new WorkerService("exception", 1, false);

        FailingWorkRequest request = new FailingWorkRequest();

        service.schedule(request);

        assertTrue(request.latch.await(5, TimeUnit.SECONDS));
        assertTrue(request.cleaned.get());

        service.stop();
        service.join(1000);
    }

    /**
     * Edge case: null WorkRequest.
     * Current implementation dereferences the request immediately.
     */
    @Test
    void shouldThrowNullPointerExceptionForNullWorkRequest() {
        WorkerService service = new WorkerService("null", 0, false);

        assertThrows(NullPointerException.class,
                () -> service.schedule(null));

        service.stop();
    }
}