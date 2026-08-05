package org.apache.zookeeper.server;

import org.apache.zookeeper.server.WorkerService.WorkRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Category Partition + BVA per WorkerService (costruttore, start(), schedule(), stop()).
 *
 * Riferimento: Report ISW2 - Parte De Angelis, par. 2.3 - tabella di tracciabilita'
 * completa (dimensioni W1-W6 -> classe di equivalenza -> rappresentante -> combinazione
 * -> ID test). Ogni metodo qui sotto e' etichettato con l'ID corrispondente (TC-WS-xx).
 * W5 e W6 (TC-WS-08, TC-WS-09) sono emerse dall'esecuzione di Randoop e poi formalizzate
 * qui come classi di equivalenza a tutti gli effetti (si veda Report par.3a e Diario).
 *
 * Nota: un solo ramo resta escluso dalla Category Partition manuale perche' sembra
 * raggiungibile solo tramite una race condition genuina - il controllo "stopped" dentro
 * ScheduledWorkRequest.run(), per un lavoro gia' in coda quando arriva lo stop() mentre e'
 * in esecuzione su un altro thread. Il ramo catch(RejectedExecutionException), che sembrava
 * avere lo stesso problema, si e' invece rivelato raggiungibile in modo deterministico
 * (TC-WS-08) grazie a start() richiamato dopo stop() - correzione rispetto a quanto scritto
 * inizialmente nel Report.
 */
class WorkerServiceTest {

    private WorkerService service;

    @AfterEach
    void tearDown() {
        if (service != null) {
            service.stop();
            service.join(2000);
        }
    }

    /** WorkRequest di supporto: registra se e' stata eseguita, su quale thread, e se e' stata ripulita. */
    private static class RecordingWorkRequest extends WorkRequest {
        final CountDownLatch executed = new CountDownLatch(1);
        final AtomicBoolean cleaned = new AtomicBoolean(false);
        final AtomicReference<String> threadName = new AtomicReference<>();

        @Override
        public void doWork() {
            threadName.set(Thread.currentThread().getName());
            executed.countDown();
        }

        @Override
        public void cleanup() {
            cleaned.set(true);
        }
    }

    // TC-WS-01 - W1.a, W2.a, W4.a: nome nullo, nessun pool -> esecuzione diretta sincrona
    @Test
    @DisplayName("TC-WS-01: name=null, numThreads=0 -> esecuzione diretta sul thread chiamante")
    void tcWs01_nullNameNoPoolDirectExecution() {
        service = new WorkerService(null, 0, false);
        RecordingWorkRequest wr = new RecordingWorkRequest();

        service.schedule(wr);

        // esecuzione sincrona: al ritorno di schedule() doWork() e' gia' stato chiamato
        assertEquals(0, wr.executed.getCount());
        assertEquals(Thread.currentThread().getName(), wr.threadName.get());
        assertFalse(wr.cleaned.get());
    }

    // TC-WS-02 - W1.b, W2.b: nome non nullo, pool condiviso (size=1, un solo ExecutorService)
    @Test
    @DisplayName("TC-WS-02: name=\"Test\", numThreads=3, assignable=false -> un solo executor condiviso")
    void tcWs02_sharedPoolAllIdsSameExecutor() throws InterruptedException {
        service = new WorkerService("Test", 3, false);
        RecordingWorkRequest wr0 = new RecordingWorkRequest();
        RecordingWorkRequest wr1 = new RecordingWorkRequest();

        service.schedule(wr0, 0);
        service.schedule(wr1, 1);

        assertTrue(wr0.executed.await(2, TimeUnit.SECONDS));
        assertTrue(wr1.executed.await(2, TimeUnit.SECONDS));
        // stesso (unico) executor, ma con 3 thread interni: si verifica solo il prefisso,
        // non l'identita' del thread (il pool puo' distribuire su thread diversi al suo interno)
        assertTrue(wr0.threadName.get().startsWith("TestThread"));
        assertTrue(wr1.threadName.get().startsWith("TestThread"));
    }

    // TC-WS-03 - W2.c, W3.a: pool assegnabile, id nel range naturale -> executor distinti
    @Test
    @DisplayName("TC-WS-03: numThreads=3, assignable=true -> id diversi instradati a thread diversi")
    void tcWs03_assignablePoolDifferentIdsDifferentThreads() throws InterruptedException {
        service = new WorkerService("Test", 3, true);
        RecordingWorkRequest wr0 = new RecordingWorkRequest();
        RecordingWorkRequest wr1 = new RecordingWorkRequest();

        service.schedule(wr0, 0);
        service.schedule(wr1, 1);

        assertTrue(wr0.executed.await(2, TimeUnit.SECONDS));
        assertTrue(wr1.executed.await(2, TimeUnit.SECONDS));
        assertNotEquals(wr0.threadName.get(), wr1.threadName.get());
    }

    // TC-WS-04 - W3.b (boundary): id negativo, formula esplicita di normalizzazione
    @Test
    @DisplayName("TC-WS-04: id=-1 su size=3 -> instradato come id=2 (stesso thread)")
    void tcWs04_negativeIdNormalizesLikePositiveEquivalent() throws InterruptedException {
        service = new WorkerService("Test", 3, true);
        RecordingWorkRequest wrRef = new RecordingWorkRequest();
        RecordingWorkRequest wrNeg = new RecordingWorkRequest();

        service.schedule(wrRef, 2);
        assertTrue(wrRef.executed.await(2, TimeUnit.SECONDS));

        service.schedule(wrNeg, -1);
        assertTrue(wrNeg.executed.await(2, TimeUnit.SECONDS));

        assertEquals(wrRef.threadName.get(), wrNeg.threadName.get());
    }

    // TC-WS-05 - W3.c (boundary): wraparound, id == size
    @Test
    @DisplayName("TC-WS-05: id=3 su size=3 -> instradato come id=0 (stesso thread)")
    void tcWs05_wraparoundIdMatchesZero() throws InterruptedException {
        service = new WorkerService("Test", 3, true);
        RecordingWorkRequest wrRef = new RecordingWorkRequest();
        RecordingWorkRequest wrWrap = new RecordingWorkRequest();

        service.schedule(wrRef, 0);
        assertTrue(wrRef.executed.await(2, TimeUnit.SECONDS));

        service.schedule(wrWrap, 3);
        assertTrue(wrWrap.executed.await(2, TimeUnit.SECONDS));

        assertEquals(wrRef.threadName.get(), wrWrap.threadName.get());
    }

    // TC-WS-06 - W4.b: servizio fermato prima di schedule()
    @Test
    @DisplayName("TC-WS-06: stop() prima di schedule() -> cleanup() invocato, doWork() mai eseguito")
    void tcWs06_scheduleAfterStopCallsCleanupOnly() {
        service = new WorkerService("Test", 3, true);
        service.stop();

        RecordingWorkRequest wr = new RecordingWorkRequest();
        service.schedule(wr, 0);

        assertTrue(wr.cleaned.get());
        assertEquals(1, wr.executed.getCount()); // mai decrementato: doWork() non chiamato
    }

    // TC-WS-07 - W2.a (boundary numThreads negativo): trattato come "nessun pool"
    @Test
    @DisplayName("TC-WS-07: numThreads=-1 -> trattato come 0, esecuzione diretta senza eccezioni")
    void tcWs07_negativeNumThreadsTreatedAsZero() {
        service = new WorkerService("Test", -1, false);
        RecordingWorkRequest wr = new RecordingWorkRequest();

        assertDoesNotThrow(() -> service.schedule(wr));
        assertEquals(0, wr.executed.getCount());
    }

    // TC-WS-08 - W5 (emerso da Randoop, poi formalizzato): start() dopo stop() fa crescere
    // la lista "workers" senza svuotarla, lasciando dentro anche gli executor gia' spenti.
    // Con size=2 (1 vecchio morto + 1 nuovo vivo), l'id che punta al vecchio executor
    // finisce in RejectedExecutionException (gestita: solo cleanup(), mai doWork()),
    // mentre l'id che punta al nuovo executor funziona normalmente - stesso servizio,
    // stesso stato "non fermato", esito diverso a seconda del solo id. Corregge inoltre
    // quanto scritto nel Report par.2.3 (BVA): questo ramo NON richiede una race condition,
    // e' raggiungibile in modo deterministico con una singola sequenza stop()->start().
    @Test
    @DisplayName("TC-WS-08: stop() poi start() -> il vecchio executor resta in lista, morto; instradamento incoerente")
    void tcWs08_restartAfterStopLeavesDeadExecutorInList() throws InterruptedException {
        service = new WorkerService("Test", 1, true);
        // dopo il costruttore: workers = [executorVecchio] (size=1)
        service.stop();
        // executorVecchio.shutdown() chiamato, ma non rimosso dalla lista
        service.start();
        // workers = [executorVecchio(morto), executorNuovo(vivo)] (size=2)

        RecordingWorkRequest wrOldSlot = new RecordingWorkRequest();
        RecordingWorkRequest wrNewSlot = new RecordingWorkRequest();

        // id=0 -> workerNum=0 -> executorVecchio (morto): RejectedExecutionException e'
        // catturata DENTRO schedule(), che chiama cleanup() in modo sincrono prima di
        // ritornare - quindi qui non serve nessun await, il risultato e' gia' pronto.
        service.schedule(wrOldSlot, 0);
        assertTrue(wrOldSlot.cleaned.get(), "id=0 deve finire su un executor morto -> cleanup() sincrono");
        assertEquals(1, wrOldSlot.executed.getCount(), "id=0 non deve MAI eseguire doWork()");

        // id=1 -> workerNum=1 -> executorNuovo (vivo): sottomissione asincrona reale,
        // qui serve aspettare il completamento.
        service.schedule(wrNewSlot, 1);
        assertTrue(wrNewSlot.executed.await(2, TimeUnit.SECONDS), "id=1 deve arrivare al nuovo executor ed essere eseguito");
        assertFalse(wrNewSlot.cleaned.get());
    }

    // TC-WS-09 - W6 (emerso da Randoop, poi formalizzato): WorkRequest nullo passato a schedule()
    // mentre il servizio e' fermo. Il codice chiama workRequest.cleanup() senza controllare
    // se workRequest e' null -> NullPointerException non gestita, non intercettata da nessun
    // meccanismo del metodo (a differenza degli altri casi limite, qui non c'e' nessun catch).
    @Test
    @DisplayName("TC-WS-09: WorkRequest nullo + servizio fermo -> NullPointerException non gestita")
    void tcWs09_nullWorkRequestWhileStoppedThrowsNPE() {
        service = new WorkerService("Test", 1, false);
        service.stop();

        assertThrows(NullPointerException.class, () -> service.schedule(null, 0));
    }
    //AGGIUNTI DOPO
    // TC-WS-10 - W5 x W2.b: riavvio con pool condiviso, size=1 - vecchio executor riceve ancora lavoro (finding)
    @Test
    @DisplayName("TC-WS-10: riavvio con pool condiviso - vecchio executor spento riceve lavoro")
    void tcWs10_restartWithSharedPoolRoutesToDeadExecutor() throws InterruptedException {
        service = new WorkerService("t", 1, false);
        service.stop();
        service.start();

        RecordingWorkRequest a = new RecordingWorkRequest();
        RecordingWorkRequest b = new RecordingWorkRequest();

        service.schedule(a);      // id=0 -> workerNum 0 -> vecchio executor (già in shutdown)
        service.schedule(b, 1);   // id=1 -> workerNum 1 -> nuovo executor (attivo)

        assertEquals(1, a.executed.getCount());
        assertTrue(a.cleaned.get());
        assertTrue(b.executed.await(5, TimeUnit.SECONDS));
    }

    // TC-WS-11 - W6 x W2.a: WorkRequest nullo a servizio attivo, percorso sincrono
    @Test
    @DisplayName("TC-WS-11: WorkRequest nullo a servizio attivo -> NullPointerException")
    void tcWs11_nullWorkRequestToActiveServiceSyncPath() {
        service = new WorkerService("n", 0, false);
        assertThrows(NullPointerException.class, () -> service.schedule(null));
    }
    // TC-WS-12 (white-box/coverage-driven) - ScheduledWorkRequest.run(): stopped=true osservato su richiesta già in coda
// Candidato originariamente escluso dalla CP manuale come "race non deterministica" (par.61) - richiudibile
// deterministicamente mettendo la richiesta in coda dietro un WorkRequest bloccante prima di chiamare stop().
    @Test
    @DisplayName("TC-WS-12 (white-box): stop() con richiesta già in coda -> cleanup(), non doWork()")
    void tcWs12_stoppedObservedInsideQueuedRun() throws InterruptedException {
        service = new WorkerService("t", 1, false);

        CountDownLatch blockerStarted = new CountDownLatch(1);
        CountDownLatch releaseBlocker = new CountDownLatch(1);
        WorkRequest blocker = new WorkRequest() {
            @Override public void doWork() throws Exception {
                blockerStarted.countDown();
                releaseBlocker.await(5, TimeUnit.SECONDS);
            }
        };
        RecordingWorkRequest target = new RecordingWorkRequest();

        service.schedule(blocker);
        blockerStarted.await(5, TimeUnit.SECONDS);
        service.schedule(target);
        service.stop();
        releaseBlocker.countDown();
        service.join(5000);   // aspetta che l'executor esaurisca la coda (blocker + target) prima di controllare

        assertTrue(target.cleaned.get());
        assertEquals(1, target.executed.getCount());
    }
    // TC-WS-13 (white-box/coverage-driven) - join(): timeout insufficiente -> ramo shutdownNow()
    @Test
    @DisplayName("TC-WS-13 (white-box): join() con timeout insufficiente -> shutdownNow()")
    void tcWs13_joinTimeoutTriggersHardShutdown() throws InterruptedException {
        service = new WorkerService("t", 1, false);
        CountDownLatch blockerStarted = new CountDownLatch(1);
        CountDownLatch releaseBlocker = new CountDownLatch(1);
        WorkRequest slow = new WorkRequest() {
            @Override public void doWork() throws Exception {
                blockerStarted.countDown();
                releaseBlocker.await(5, TimeUnit.SECONDS);
            }
        };
        service.schedule(slow);
        assertTrue(blockerStarted.await(5, TimeUnit.SECONDS)); // garantisce che il task sia già in esecuzione
        service.stop();
        assertDoesNotThrow(() -> service.join(1)); // margine ridotto al minimo, niente più ambiguità
        releaseBlocker.countDown();
    }
    // TC-WS-14 (white-box/coverage-driven) - ScheduledWorkRequest.run(): catch(Exception) con cleanup() che completa
    @Test
    @DisplayName("TC-WS-14 (white-box): eccezione generica in doWork() -> cleanup() chiamato e completa")
    void tcWs14_genericExceptionCallsCleanupSuccessfully() {
        service = new WorkerService("n", 0, false); // percorso sincrono, size=0
        RecordingWorkRequest target = new RecordingWorkRequest() {
            @Override public void doWork() {
                throw new RuntimeException("errore generico simulato");
            }
        };
        assertDoesNotThrow(() -> service.schedule(target));
        assertTrue(target.cleaned.get());
    }
}