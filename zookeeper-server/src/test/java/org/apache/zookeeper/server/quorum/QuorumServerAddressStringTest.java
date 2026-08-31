package org.apache.zookeeper.server.quorum;

import org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType;
import org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException;
import org.apache.zookeeper.KeeperException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Category Partition + BVA per QuorumPeer.QuorumServer(long sid, String addressStr).
 *
 * Riferimento: Report ISW2 - Parte De Angelis, par. 2.1 - tabella di tracciabilita'
 * completa (dimensione D1-D7 -> classe di equivalenza -> rappresentante -> combinazione
 * -> ID test). Ogni metodo qui sotto e' etichettato con l'ID corrispondente (TC-QS-xx).
 *
 * Nota: multiAddressEnabled e canonicalizeHostNames sono system property lette da
 * QuorumPeer al momento del parsing (fanno parte dello stato del SUT, non sono
 * parametri formali) - vengono impostate/ripulite esplicitamente per ogni test che
 * ne ha bisogno, per non inquinare i test successivi nella stessa JVM.
 */
class QuorumServerAddressStringTest {

    @AfterEach
    void clearSystemProperties() {
        System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        System.clearProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES);
    }

    // TC-QS-01 - D1.a, D2.a, D3.b, D4.a, D5.a - baseline: costruzione valida
    @Test
    @DisplayName("TC-QS-01: indirizzo singolo, 3 segmenti, porte diverse valide -> OK, type=PARTICIPANT")
    void tcQs01_baselineValid() throws ConfigException {
        QuorumServer qs = new QuorumServer(1L, "host1:2181:2182");

        assertEquals("host1", qs.hostname);
        assertEquals(LearnerType.PARTICIPANT, qs.type); // default, nessun 4o segmento
        assertFalse(qs.addr.isEmpty());
        assertFalse(qs.electionAddr.isEmpty());
    }

    // TC-QS-02 - D1.b (client-config come host:port)
    @Test
    @DisplayName("TC-QS-02: client-config host:port -> clientAddr impostato correttamente")
    void tcQs02_clientConfigHostPort() throws ConfigException {
        QuorumServer qs = new QuorumServer(1L, "host1:2181:2182;host1:2183");

        assertNotNull(qs.clientAddr);
        assertEquals(2183, qs.clientAddr.getPort());
    }

    // TC-QS-03 - D1.b (client-config solo porta)
    @Test
    @DisplayName("TC-QS-03: client-config solo porta -> clientAddr con host di default 0.0.0.0")
    void tcQs03_clientConfigPortOnly() throws ConfigException {
        QuorumServer qs = new QuorumServer(1L, "host1:2181:2182;2183");

        assertNotNull(qs.clientAddr);
        assertEquals(2183, qs.clientAddr.getPort());
        assertEquals("0.0.0.0", qs.clientAddr.getHostString());
    }

    // TC-QS-04 - D1.c (formato non valido: piu' di un ';')
    @Test
    @DisplayName("TC-QS-04: piu' di un ';' -> ConfigException (wrongFormat)")
    void tcQs04_tooManySemicolons() {
        assertThrows(ConfigException.class, () ->
                new QuorumServer(1L, "host1:2181:2182;host:2183;extra"));
    }

    // TC-QS-05 - D2.b (multi-indirizzo, feature disabilitata - default)
    @Test
    @DisplayName("TC-QS-05: multi-indirizzo con multiAddressEnabled=false (default) -> ConfigException")
    void tcQs05_multiAddressDisabled() {
        assertThrows(ConfigException.class, () ->
                new QuorumServer(1L, "host1:2181:2182|host2:2181:2182"));
    }

    // TC-QS-06 - D2.c (multi-indirizzo, feature abilitata)
    @Test
    @DisplayName("TC-QS-06: multi-indirizzo con multiAddressEnabled=true -> OK, 2 indirizzi")
    void tcQs06_multiAddressEnabled() throws ConfigException {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        // NB: si usano IP letterali (non hostname come "host1") perche' MultipleAddresses.addAddress()
        // aggiunge a un Set basato su InetSocketAddress.equals(): se "host1" e "host2" venissero risolti
        // dalla rete locale (es. redirect DNS di un router/ISP) allo stesso indirizzo, le due voci
        // collasserebbero a una sola in modo non deterministico. Con IP letterali non c'e' risoluzione
        // DNS in mezzo, quindi il test e' deterministico su qualunque macchina.
        QuorumServer qs = new QuorumServer(1L, "10.0.0.1:2181:2182|10.0.0.2:2181:2182");

        assertEquals(2, qs.addr.getAllAddresses().size());
    }

    // TC-QS-07 - D3.a (boundary: 2 segmenti, insufficienti)
    @Test
    @DisplayName("TC-QS-07: 2 segmenti (insufficienti) -> ConfigException")
    void tcQs07_tooFewSegments() {
        assertThrows(ConfigException.class, () -> new QuorumServer(1L, "host1:2181"));
    }

    // TC-QS-08 - D3.c (boundary: 4 segmenti, con tipo)
    @Test
    @DisplayName("TC-QS-08: 4 segmenti con type=observer -> OK, type=OBSERVER")
    void tcQs08_fourSegmentsWithType() throws ConfigException {
        QuorumServer qs = new QuorumServer(1L, "host1:2181:2182:observer");

        assertEquals(LearnerType.OBSERVER, qs.type);
    }

    // TC-QS-09 - D3.d (boundary: 5 segmenti, eccessivi)
    @Test
    @DisplayName("TC-QS-09: 5 segmenti (eccessivi) -> ConfigException")
    void tcQs09_tooManySegments() {
        assertThrows(ConfigException.class, () ->
                new QuorumServer(1L, "host1:2181:2182:observer:extra"));
    }

    // TC-QS-10 - D4.b (porta non numerica)
    @Test
    @DisplayName("TC-QS-10: porta non numerica -> ConfigException (Address unresolved)")
    void tcQs10_nonNumericPort() {
        assertThrows(ConfigException.class, () -> new QuorumServer(1L, "host1:abc:2182"));
    }

    // TC-QS-11 - D4.c (finding: porta fuori range TCP, NON gestita dal codice)
    @Test
    @DisplayName("TC-QS-11: porta fuori range TCP (70000) -> IllegalArgumentException NON gestita")
    void tcQs11_portOutOfRangeIsUnhandled() {
        // Documenta un comportamento anomalo del codice di produzione (vedi Report par.2.1,
        // paragrafo BVA): il metodo valida solo che la porta sia parsabile come intero, non
        // che sia nel range TCP 0-65535. Non e' un requisito nostro, e' cio' che il codice fa
        // oggi - se ZooKeeper lo correggesse in futuro, questo test andrebbe aggiornato.
        assertThrows(IllegalArgumentException.class, () -> new QuorumServer(1L, "host1:70000:2182"));
    }

    // TC-QS-12 - D5.b (porte uguali)
    @Test
    @DisplayName("TC-QS-12: server port == election port -> ConfigException")
    void tcQs12_equalPorts() {
        assertThrows(ConfigException.class, () -> new QuorumServer(1L, "host1:2181:2181"));
    }

    // TC-QS-13 - D6.c (peertype non riconosciuto)
    @Test
    @DisplayName("TC-QS-13: peertype non riconosciuto -> ConfigException (Unrecognised peertype)")
    void tcQs13_unrecognisedPeertype() {
        assertThrows(ConfigException.class, () -> new QuorumServer(1L, "host1:2181:2182:leader"));
    }

    // TC-QS-14 - D7.b (canonicalize abilitato, risoluzione DNS fallita)
    @Test
    @DisplayName("TC-QS-14: canonicalize abilitato, risoluzione fallita (null) -> ConfigException")
    void tcQs14_canonicalizeResolutionFails() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "true");
        Function<InetSocketAddress, InetAddress> alwaysUnresolvable = addr -> null;

        assertThrows(ConfigException.class, () ->
                new QuorumServer(1L, "host1:2181:2182", alwaysUnresolvable));
    }

    // TC-QS-15 - D7.c (canonicalize riuscito, hostname canonico diverso)
    @Test
    @DisplayName("TC-QS-15: canonicalize abilitato, hostname canonico diverso -> hostname sostituito")
    void tcQs15_canonicalizeReplacesHostname() throws ConfigException {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "true");
        InetAddress canonical = mock(InetAddress.class);
        when(canonical.getCanonicalHostName()).thenReturn("host1.canonical.example.org");
        when(canonical.getHostAddress()).thenReturn("10.0.0.1");
        Function<InetSocketAddress, InetAddress> resolver = addr -> canonical;

        QuorumServer qs = new QuorumServer(1L, "host1:2181:2182", resolver);

        assertEquals("host1.canonical.example.org", qs.hostname);
    }

    // TC-QS-16 - D2.c x D6 (combinazione mirata: multi-indirizzo con ruoli diversi tra loro)
    @Test
    @DisplayName("TC-QS-16: multi-indirizzo con ruoli diversi tra loro -> ConfigException")
    void tcQs16_multiAddressWithMismatchedRoles() {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        assertThrows(ConfigException.class, () ->
                new QuorumServer(1L, "host1:2181:2182:observer|host2:2181:2182:participant"));
    }
    //AGGIUNTI DOPO RANDOOP E LLM
    // TC-QS-17 - D1.d: client-config con 3+ parti dopo il ";" (malformato)
    @Test
    @DisplayName("TC-QS-17: client-config con 3+ segmenti dopo ';' -> ConfigException")
    void tcQs17_malformedClientConfigThrows() {
        assertThrows(ConfigException.class, () ->
                new QuorumServer(1L, "host1:2181:2182;host:2183:extra"));
    }
    // TC-QS-18 - D8: hostname vuoto risolto silenziosamente a localhost (finding)
    @Test
    @DisplayName("TC-QS-18: hostname vuoto -> risolto silenziosamente, nessuna eccezione")
    void tcQs18_emptyHostnameResolvesToLocalhost() throws ConfigException {
        QuorumServer qs = new QuorumServer(1L, ":2181:2182");
        assertNotNull(qs);
        // L'indirizzo risolto (localhost/127.0.0.1 o simile) dipende dall'ambiente:
        // quando esegui, annota qui l'IP effettivo osservato per il Report.
    }
    // TC-QS-19 (white-box/coverage-driven) - D4.b su client-config: porta client non numerica
// Stessa classe di equivalenza di TC-QS-10 (porta non numerica), applicata al ramo client.
    @Test
    @DisplayName("TC-QS-19 (white-box): porta client non numerica -> ConfigException")
    void tcQs19_nonNumericClientPortThrows() {
        assertThrows(ConfigException.class, () ->
                new QuorumServer(1L, "host1:2181:2182;abc"));
    }

    // TC-QS-20 (white-box/coverage-driven) - D4.b su porta election: porta election non numerica
// Stessa classe di equivalenza di TC-QS-10, applicata al ramo election.
    @Test
    @DisplayName("TC-QS-20 (white-box): porta election non numerica -> ConfigException")
    void tcQs20_nonNumericElectionPortThrows() {
        assertThrows(ConfigException.class, () ->
                new QuorumServer(1L, "host1:2181:abc"));
    }
    // TC-QS-21 (white-box/coverage-driven) - client-config espresso come "sola porta" -> default 0.0.0.0,
// filtrato da excludedSpecialAddresses (ramo isAnyLocalAddress() mai esercitato finora)
    @Test
    @DisplayName("TC-QS-21 (white-box): client-config solo porta -> 0.0.0.0 filtrato da myAddrs")
    void tcQs21_clientConfigBarePortDefaultsToWildcardAddress() {
        assertDoesNotThrow(() -> new QuorumServer(1L, "host1:2181:2182;3888"));
    }
    // TC-QS-22 (white-box/coverage-driven, mock) - canonicalizzazione riga 378: canonicalHostName == hostname originale -> nessun aggiornamento
// Mock di InetAddress iniettato tramite il parametro Function<InetSocketAddress, InetAddress> del costruttore
// package-private, per controllare deterministicamente l'esito senza dipendere da una vera risoluzione DNS
// (che varierebbe da ambiente ad ambiente - il prof ha confermato che l'uso di mock è ammesso).
    @Test
    @DisplayName("TC-QS-22 (white-box, mock): canonicalHostName == hostname originale -> nessun aggiornamento")
    void tcQs22_canonicalHostNameEqualsOriginal_noUpdate() throws ConfigException {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "true");
        try {
            InetAddress mockAddr = mock(InetAddress.class);
            when(mockAddr.getCanonicalHostName()).thenReturn("host1"); // uguale all'hostname originale -> riga 378 = false
            Function<InetSocketAddress, InetAddress> getInetAddress = addr -> mockAddr;

            QuorumServer qs = new QuorumServer(1L, "host1:2181:2182", getInetAddress);

            assertEquals("host1", qs.hostname);
        } finally {
            System.clearProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES);
        }
    }

    // TC-QS-23 (white-box/coverage-driven, mock) - canonicalizzazione riga 381: canonicalHostName coincide con l'IP nudo -> nessun aggiornamento
    @Test
    @DisplayName("TC-QS-23 (white-box, mock): canonicalHostName coincide con l'IP nudo -> nessun aggiornamento (sicurezza)")
    void tcQs23_canonicalHostNameEqualsRawIp_noUpdate() throws ConfigException {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "true");
        try {
            InetAddress mockAddr = mock(InetAddress.class);
            when(mockAddr.getCanonicalHostName()).thenReturn("10.0.0.1"); // diverso da "host1" -> riga 378 = true
            when(mockAddr.getHostAddress()).thenReturn("10.0.0.1");       // uguale al canonico -> riga 381 = false
            Function<InetSocketAddress, InetAddress> getInetAddress = addr -> mockAddr;

            QuorumServer qs = new QuorumServer(1L, "host1:2181:2182", getInetAddress);

            assertEquals("host1", qs.hostname); // non aggiornato: il canonico è solo l'IP nudo
        } finally {
            System.clearProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES);
        }
    }

    // ============================================================================================
    // NUOVI TEST - combinazione multidimensionale mirata (D2.c incrociato con D3/D5/D7), aggiunta
    // dopo aver riletto initializeWithAddressString riga per riga: D2.c (multi-indirizzo) e' l'unica
    // dimensione che trasforma la validazione da "una tantum" a un ciclo (`for (String serverAddress
    // : serverAddresses)`), quindi e' l'unico punto del metodo dove un problema di interazione tra
    // dimensioni puo' nascondersi - non e' stato scelto per completezza combinatoria fine a se stessa,
    // ma perche' e' l'unico posto dove la teoria del corso ("un'interazione tra due dimensioni attiva
    // un comportamento non raggiungibile diversamente") si applica davvero a questo costruttore.
    // ============================================================================================

    // TC-QS-24 (multi mirata) - D2.c x D7.c: canonicalizzazione con PIU' indirizzi.
    // this.hostname e' un campo scalare (non una lista, a differenza di addr/electionAddr che sono
    // MultipleAddresses), ma viene riassegnato a ogni iterazione del ciclo (riga 400): con 2+ indirizzi,
    // solo l'ULTIMO sopravvive nel campo finale. Non e' documentato ne' nel report ne' nella doc
    // ufficiale: se confermato da questo test, e' un comportamento nuovo, non ancora messo per iscritto
    // da nessuna parte - verificalo tu stesso prima di scriverlo nel report come quinta anomalia.
    //
    // CORREZIONE (dopo il primo mvn test): la versione precedente usava "host1"/"host2" come hostname.
    // Stesso rischio gia' documentato in TC-QS-06: MultipleAddresses.addAddress() inserisce in un
    // Set<InetSocketAddress>, e InetSocketAddress.equals() confronta l'indirizzo RISOLTO (non la stringa
    // originale) quando la risoluzione DNS riesce. Su una rete/PC dove "host1" e "host2" (nomi finti,
    // senza punto) vengono entrambi rediretti dalla rete locale allo stesso IP - capita con alcuni
    // router/ISP che intercettano gli hostname non risolvibili - le due voci collassano a una sola nel
    // Set, in modo non deterministico da macchina a macchina. Con IP letterali non c'e' risoluzione DNS
    // di mezzo: il test e' deterministico ovunque, che e' esattamente il motivo per cui e' fallito il
    // primo mvn test (spiegato al posto di corretto in silenzio, come da criterio del progetto).
    @Test
    @DisplayName("TC-QS-24 (multi mirata): D2.c x D7.c - con piu' indirizzi, solo l'ULTIMO hostname canonicalizzato sopravvive nel campo scalare")
    void tcQs24_multiAddressCanonicalizeOnlyLastSurvives() throws ConfigException {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "true");
        try {
            // 10.1.1.1 canonicalizza a un nome diverso; 10.1.1.2 NON canonicalizza (canonico == originale).
            // Se il campo hostname riflettesse "tutti" gli indirizzi useremmo una lista; riflette invece
            // solo l'ultimo elaborato dal ciclo.
            Function<InetSocketAddress, InetAddress> resolver = addr -> {
                InetAddress mockAddr = mock(InetAddress.class);
                if ("10.1.1.1".equals(addr.getHostString())) {
                    when(mockAddr.getCanonicalHostName()).thenReturn("host1.canonical.example.org");
                    when(mockAddr.getHostAddress()).thenReturn("10.1.1.1");
                } else {
                    when(mockAddr.getCanonicalHostName()).thenReturn("10.1.1.2"); // uguale all'originale -> nessun aggiornamento
                    when(mockAddr.getHostAddress()).thenReturn("10.1.1.2");
                }
                return mockAddr;
            };

            QuorumServer qs = new QuorumServer(1L, "10.1.1.1:2181:2182|10.1.1.2:2181:2182", resolver);

            assertEquals(2, qs.addr.getAllAddresses().size()); // entrambi gli indirizzi sono stati accettati
            assertEquals("10.1.1.2", qs.hostname); // NON "host1.canonical.example.org": il primo viene sovrascritto dal secondo
        } finally {
            System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
            System.clearProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES);
        }
    }

    // TC-QS-25 (multi mirata) - D2.c x D5.b: il controllo "porta server != porta election" (riga 365)
    // e' dentro il ciclo per-indirizzo, quindi si applica a OGNI indirizzo separatamente, non una sola
    // volta sull'intera lista. Verifica che un secondo indirizzo con porte uguali non passi inosservato
    // solo perche' il primo indirizzo della lista era valido.
    @Test
    @DisplayName("TC-QS-25 (multi mirata): D2.c x D5.b - porte uguali sul SECONDO indirizzo di una lista multi-indirizzo -> ConfigException")
    void tcQs25_multiAddressSecondAddressEqualPorts() {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");
        try {
            assertThrows(ConfigException.class, () ->
                    new QuorumServer(1L, "host1:2181:2182|host2:2181:2181"));
        } finally {
            System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        }
    }

    // TC-QS-26 (multi mirata) - D2.c x D3.a: il controllo sul numero di segmenti (righe 342-344) e'
    // anch'esso dentro il ciclo per-indirizzo. Verifica che un secondo indirizzo malformato non venga
    // "coperto" dal fatto che il primo indirizzo della lista era ben formato (nessun cortocircuito
    // silenzioso sul resto della lista).
    @Test
    @DisplayName("TC-QS-26 (multi mirata): D2.c x D3.a - il SECONDO indirizzo di una lista multi-indirizzo ha segmenti insufficienti -> ConfigException")
    void tcQs26_multiAddressSecondAddressTooFewSegments() {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");
        try {
            assertThrows(ConfigException.class, () ->
                    new QuorumServer(1L, "host1:2181:2182|host2:2181"));
        } finally {
            System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        }
    }


    // ============================================================================================
    // NUOVI TEST - BVA completa su D4 (dimensione porta), aggiunta dopo la revisione dei 31 punti:
    // mancavano il minimo (0), il massimo (65535) e il caso appena sotto il minimo (negativo) del
    // range TCP - la BVA su D4 aveva finora solo il lato "sopra il massimo" (TC-QS-11, porta 70000).
    // InetSocketAddress(host, port) accetta 0-65535 inclusi (Javadoc JDK): 0 e 65535 sono quindi
    // gli estremi VALIDI del range, un valore negativo segue lo stesso percorso non gestito di
    // TC-QS-11. Nessuno dei tre tocca D5 in modo significativo: si usa sempre una election port
    // diversa (2182) per isolare la sola dimensione D4. MAI eseguiti: da confermare con mvn test
    // in locale prima di promuoverli in Tabella 2.
    // ============================================================================================

    // TC-QS-27 - D4.a, boundary minimo: porta 0 (valore limite valido secondo il codice)
    @Test
    @DisplayName("TC-QS-27 (BVA D4, minimo): porta 0 -> costruzione OK (limite valido del range TCP)")
    void tcQs27_portZeroIsValidBoundary() {
        assertDoesNotThrow(() -> new QuorumServer(1L, "host1:0:2182"));
    }

    // TC-QS-28 - D4.a, boundary massimo: porta 65535 (valore limite valido secondo il codice)
    @Test
    @DisplayName("TC-QS-28 (BVA D4, massimo): porta 65535 -> costruzione OK (limite valido del range TCP)")
    void tcQs28_portMaxValueIsValidBoundary() {
        assertDoesNotThrow(() -> new QuorumServer(1L, "host1:65535:2182"));
    }

    // TC-QS-29 - D4.c, boundary appena sotto il minimo: porta negativa, stesso percorso non gestito
    // di TC-QS-11 (parsabile come intero, ma IllegalArgumentException non incapsulata in ConfigException).
    @Test
    @DisplayName("TC-QS-29 (BVA D4, sotto il minimo): porta -1 -> IllegalArgumentException NON gestita, come TC-QS-11")
    void tcQs29_negativePortIsUnhandled() {
        assertThrows(IllegalArgumentException.class, () -> new QuorumServer(1L, "host1:-1:2182"));
    }


    // ============================================================================================
    // ESTENSIONE QuorumServer (dopo la critica dei 31 punti): oltre al costruttore, anche
    // checkAddressDuplicate, equals, toString - gli unici altri metodi della classe con logica
    // vera (verificato leggendo l'intera classe sul sorgente reale apache/zookeeper). hashCode()
    // e' rotto di proposito (assert false; return 42;) - documentato ma non testabile nel senso
    // classico. recreateSocketAddresses() e delimitedHostString() restano fuori scope (banali o
    // gia' esercitati indirettamente).
    //
    // NESSUNA DOCUMENTAZIONE UFFICIALE per questi 3 metodi: verificato sul Javadoc pubblico di
    // ZooKeeper su tutte le versioni (3.5.5 -> 3.9.5 -> current), mai comparsa una descrizione
    // testuale, solo firma e throws. A differenza del costruttore (Administrator's Guide), qui
    // non c'e' nessuna Fase 1 da documentazione: e' white-box/grey-box fin dall'inizio.
    //
    // 2 promozioni confermate da Randoop (output gia' esistente sull'intera classe, mai
    // esaminato con questo obiettivo prima d'ora - vedi RegressionTest0.java sul fork,
    // test002/test007 e test008/test022):
    //   - checkAddressDuplicate(null) -> NullPointerException (CD0)
    //   - toString() con LearnerType passato esplicitamente null -> stringa vuota, nessun
    //     suffisso di tipo (TS2, terza classe mai considerata)
    // ============================================================================================

    // ---- checkAddressDuplicate(QuorumServer s) ----

    // TC-QS-30 - CD0.a: s null -> NullPointerException. CONFERMATO da Randoop (RegressionTest0,
    // test002 e test007): "Cannot read field \"addr\" because \"s\" is null". Nessun controllo
    // esplicito su s nel metodo.
    @Test
    @DisplayName("TC-QS-30 (CD0.a, confermato da Randoop): checkAddressDuplicate(null) -> NullPointerException")
    void tcQs30_checkAddressDuplicateNullArgument() throws ConfigException {
        QuorumServer qs = new QuorumServer(1L, "10.0.0.1:2181:2182");
        assertThrows(NullPointerException.class, () -> qs.checkAddressDuplicate(null));
    }

    // TC-QS-31 - CD1.a: nessuna sovrapposizione -> nessuna eccezione (baseline).
    @Test
    @DisplayName("TC-QS-31 (CD1.a): indirizzi disgiunti -> nessuna eccezione")
    void tcQs31_checkAddressDuplicateNoOverlap() throws ConfigException {
        QuorumServer qs1 = new QuorumServer(1L, "10.0.0.1:2181:2182");
        QuorumServer qs2 = new QuorumServer(2L, "10.0.0.2:2181:2182");
        assertDoesNotThrow(() -> qs1.checkAddressDuplicate(qs2));
    }

    // TC-QS-32 - CD1.b x CD2.a: indirizzo server NORMALE condiviso (stesso host:port) -> conflitto
    // reale, BadArgumentsException.
    @Test
    @DisplayName("TC-QS-32 (CD1.b x CD2.a): indirizzo server normale condiviso -> BadArgumentsException")
    void tcQs32_checkAddressDuplicateRealConflict() throws ConfigException {
        QuorumServer qs1 = new QuorumServer(1L, "10.0.0.1:2181:2182");
        QuorumServer qs2 = new QuorumServer(2L, "10.0.0.1:2181:2183"); // stesso server port, election diversa
        assertThrows(KeeperException.BadArgumentsException.class, () -> qs1.checkAddressDuplicate(qs2));
    }

    // TC-QS-33 - CD1.b x CD2.b: l'UNICO indirizzo condiviso e' loopback -> escluso da
    // excludedSpecialAddresses su entrambi i lati, nessuna eccezione nonostante la sovrapposizione
    // nominale.
    @Test
    @DisplayName("TC-QS-33 (CD1.b x CD2.b): indirizzo condiviso e' loopback -> nessuna eccezione (escluso)")
    void tcQs33_checkAddressDuplicateSpecialAddressExcluded() throws ConfigException {
        QuorumServer qs1 = new QuorumServer(1L, "127.0.0.1:2181:2182");
        QuorumServer qs2 = new QuorumServer(2L, "127.0.0.1:2181:2183");
        assertDoesNotThrow(() -> qs1.checkAddressDuplicate(qs2));
    }

    // TC-QS-47 - CD3.b x CD4.c: il conflitto avviene SOLO tramite il clientAddr di s (non addr,
    // non electionAddr) - chiude la classe CD3.b, mai testata dai TC-QS-30..33 (nessuno di quei
    // 4 test costruiva un s con client-config).
    @Test
    @DisplayName("TC-QS-47 (CD3.b x CD4.c): conflitto solo tramite clientAddr di s -> BadArgumentsException")
    void tcQs47_checkAddressDuplicateConflictViaClientAddr() throws ConfigException {
        QuorumServer qs1 = new QuorumServer(1L, "10.0.0.5:2181:2182");
        // il clientAddr di qs2 coincide esattamente con l'indirizzo server di qs1
        QuorumServer qs2 = new QuorumServer(2L, new InetSocketAddress("10.0.0.9", 3000),
                new InetSocketAddress("10.0.0.9", 3001), new InetSocketAddress("10.0.0.5", 2181), LearnerType.PARTICIPANT);
        assertThrows(KeeperException.BadArgumentsException.class, () -> qs1.checkAddressDuplicate(qs2));
    }

    // TC-QS-48 - CD4.b: il conflitto avviene tramite electionAddr di s, non addr - chiude l'ultima
    // classe di CD4 mai testata (TC-QS-32 copriva solo CD4.a/addr).
    @Test
    @DisplayName("TC-QS-48 (CD4.b): conflitto solo tramite electionAddr di s -> BadArgumentsException")
    void tcQs48_checkAddressDuplicateConflictViaElectionAddr() throws ConfigException {
        QuorumServer qs1 = new QuorumServer(1L, "10.0.0.6:2181:2182");
        // l'electionAddr di qs2 coincide esattamente con l'electionAddr di qs1
        QuorumServer qs2 = new QuorumServer(2L, new InetSocketAddress("10.0.0.9", 3000),
                new InetSocketAddress("10.0.0.6", 2182), null, LearnerType.PARTICIPANT);
        assertThrows(KeeperException.BadArgumentsException.class, () -> qs1.checkAddressDuplicate(qs2));
    }

    // ---- equals(Object o) ----

    // TC-QS-34 - EQ1.a: argomento non e' un QuorumServer. CONFERMATO da Randoop (RegressionTest0,
    // test051: equals((Object) ":participant") -> false).
    @Test
    @DisplayName("TC-QS-34 (EQ1.a, confermato da Randoop): argomento non-QuorumServer -> false")
    void tcQs34_equalsWrongType() {
        QuorumServer qs = new QuorumServer(1L, new InetSocketAddress("10.0.0.1", 2181),
                new InetSocketAddress("10.0.0.1", 2182), null, LearnerType.PARTICIPANT);
        assertFalse(qs.equals("non sono un QuorumServer"));
    }

    // TC-QS-35 - EQ2: id diverso, tutto il resto uguale.
    @Test
    @DisplayName("TC-QS-35 (EQ2): id diverso -> false")
    void tcQs35_equalsDifferentId() {
        InetSocketAddress addr = new InetSocketAddress("10.0.0.1", 2181);
        InetSocketAddress election = new InetSocketAddress("10.0.0.1", 2182);
        QuorumServer a = new QuorumServer(1L, addr, election, null, LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(2L, addr, election, null, LearnerType.PARTICIPANT);
        assertFalse(a.equals(b));
    }

    // TC-QS-36 - EQ3: type diverso, id uguale (serve id uguale per arrivare a valutare type).
    @Test
    @DisplayName("TC-QS-36 (EQ3): type diverso, id uguale -> false")
    void tcQs36_equalsDifferentType() {
        InetSocketAddress addr = new InetSocketAddress("10.0.0.1", 2181);
        InetSocketAddress election = new InetSocketAddress("10.0.0.1", 2182);
        QuorumServer a = new QuorumServer(1L, addr, election, null, LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(1L, addr, election, null, LearnerType.OBSERVER);
        assertFalse(a.equals(b));
    }

    // TC-QS-37 - EQ4: addr diverso, id/type uguali (vincolo di cortocircuito: EQ2 ed EQ3 devono
    // essere "uguale" perche' il metodo arrivi a valutare addr).
    @Test
    @DisplayName("TC-QS-37 (EQ4): addr diverso, id/type uguali -> false")
    void tcQs37_equalsDifferentAddr() {
        InetSocketAddress election = new InetSocketAddress("10.0.0.1", 2182);
        QuorumServer a = new QuorumServer(1L, new InetSocketAddress("10.0.0.1", 2181), election, null, LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(1L, new InetSocketAddress("10.0.0.2", 2181), election, null, LearnerType.PARTICIPANT);
        assertFalse(a.equals(b));
    }

    // TC-QS-38 - EQ5: electionAddr diverso, tutto il resto precedente uguale.
    @Test
    @DisplayName("TC-QS-38 (EQ5): electionAddr diverso -> false")
    void tcQs38_equalsDifferentElectionAddr() {
        InetSocketAddress addr = new InetSocketAddress("10.0.0.1", 2181);
        QuorumServer a = new QuorumServer(1L, addr, new InetSocketAddress("10.0.0.1", 2182), null, LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(1L, addr, new InetSocketAddress("10.0.0.1", 2183), null, LearnerType.PARTICIPANT);
        assertFalse(a.equals(b));
    }

    // TC-QS-39 - EQ6/EQ7: clientAddr asimmetrico (uno null, l'altro no) - checkAddressesEqual deve
    // gestire il caso senza NPE e restituire false.
    @Test
    @DisplayName("TC-QS-39 (EQ6/EQ7): clientAddr null su un lato, presente sull'altro -> false")
    void tcQs39_equalsAsymmetricClientAddr() {
        InetSocketAddress addr = new InetSocketAddress("10.0.0.1", 2181);
        InetSocketAddress election = new InetSocketAddress("10.0.0.1", 2182);
        QuorumServer a = new QuorumServer(1L, addr, election, null, LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(1L, addr, election, new InetSocketAddress("10.0.0.1", 3000), LearnerType.PARTICIPANT);
        assertFalse(a.equals(b));
    }

    // TC-QS-52 - EQ6, direzione mancante di TC-QS-39: "il mio clientAddr e' valorizzato, l'altro no"
    // (l'opposto di TC-QS-39). Utile di per se', ma NON chiude il branch mancante di checkAddressesEqual
    // (92%): in entrambe le direzioni asimmetriche l'espressione va in cortocircuito prima di arrivare
    // al confronto vero — vedi TC-QS-53/54 per la chiusura reale, trovata dopo un secondo giro di JaCoCo.
    @Test
    @DisplayName("TC-QS-52 (EQ6): clientAddr presente su this, assente sull'altro -> false")
    void tcQs52_equalsAsymmetricClientAddressOtherDirection() {
        InetSocketAddress addr = new InetSocketAddress("10.0.0.1", 2181);
        InetSocketAddress election = new InetSocketAddress("10.0.0.1", 2182);
        QuorumServer a = new QuorumServer(1L, addr, election, new InetSocketAddress("10.0.0.1", 3000), LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(1L, addr, election, null, LearnerType.PARTICIPANT);
        assertFalse(a.equals(b));
    }

    // TC-QS-53/54 - EQ6, la chiusura reale del branch mancante (92%->100%, secondo giro di JaCoCo):
    // il confronto vero (addr1.equals(addr2) dentro checkAddressesEqual) non era MAI stato raggiunto -
    // in tutti i test precedenti (39, 40, 52) l'espressione andava in cortocircuito prima. Serve un caso
    // con ENTRAMBI i clientAddr non-null: TC-QS-53 diversi (chiude anche il confronto ==false),
    // TC-QS-54 uguali (chiude il confronto ==true, mai visto neppure nel baseline TC-QS-40 che usa
    // entrambi null, non entrambi valorizzati).
    @Test
    @DisplayName("TC-QS-53 (EQ6, chiusura JaCoCo): entrambi i clientAddr non-null ma diversi -> false")
    void tcQs53_equalsBothClientAddressesNonNullDiffer() {
        InetSocketAddress addr = new InetSocketAddress("10.0.0.1", 2181);
        InetSocketAddress election = new InetSocketAddress("10.0.0.1", 2182);
        QuorumServer a = new QuorumServer(1L, addr, election, new InetSocketAddress("10.0.0.9", 3000), LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(1L, addr, election, new InetSocketAddress("10.0.0.8", 3001), LearnerType.PARTICIPANT);
        assertFalse(a.equals(b));
    }

    @Test
    @DisplayName("TC-QS-54 (EQ6, chiusura JaCoCo): entrambi i clientAddr non-null e uguali -> true")
    void tcQs54_equalsBothClientAddressesNonNullEqual() {
        InetSocketAddress addr = new InetSocketAddress("10.0.0.1", 2181);
        InetSocketAddress election = new InetSocketAddress("10.0.0.1", 2182);
        QuorumServer a = new QuorumServer(1L, addr, election, new InetSocketAddress("10.0.0.9", 3000), LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(1L, addr, election, new InetSocketAddress("10.0.0.9", 3000), LearnerType.PARTICIPANT);
        assertTrue(a.equals(b));
    }

    // TC-QS-40 - baseline positiva: tutti i campi rilevanti uguali -> true. Mai testata
    // esplicitamente finora (Randoop non genera coppie di oggetti davvero uguali per caso).
    @Test
    @DisplayName("TC-QS-40 (baseline positiva): tutti i campi uguali -> true")
    void tcQs40_equalsFullyEqual() {
        InetSocketAddress addr = new InetSocketAddress("10.0.0.1", 2181);
        InetSocketAddress election = new InetSocketAddress("10.0.0.1", 2182);
        QuorumServer a = new QuorumServer(1L, addr, election, null, LearnerType.PARTICIPANT);
        QuorumServer b = new QuorumServer(1L, addr, election, null, LearnerType.PARTICIPANT);
        assertTrue(a.equals(b));
    }

    // ---- toString() ----

    // TC-QS-41 - TS1(vuoto) x TS2(participant, default) x TS3.b(client null).
    // CONFERMATO da Randoop (RegressionTest0, test007/test010/test026/ecc.): risultato ":participant".
    @Test
    @DisplayName("TC-QS-41 (baseline, confermato da Randoop): nessun indirizzo, type default -> \":participant\"")
    void tcQs41_toStringDefaultEmpty() {
        QuorumServer qs = new QuorumServer(1L, (InetSocketAddress) null, (InetSocketAddress) null, (InetSocketAddress) null);
        assertEquals(":participant", qs.toString());
    }

    // TC-QS-42 - TS2, terza classe: LearnerType passato esplicitamente null -> stringa vuota,
    // nessun suffisso di tipo. CONFERMATO da Randoop (RegressionTest0, test008/test022) - ANOMALIA,
    // mai documentata: un QuorumServer con type nullo produce un toString() senza ":observer" ne'
    // ":participant", indistinguibile da un oggetto "vuoto" costruito diversamente.
    @Test
    @DisplayName("TC-QS-42 (TS2 terza classe, confermato da Randoop - ANOMALIA): type null -> stringa vuota")
    void tcQs42_toStringNullType() {
        QuorumServer qs = new QuorumServer(1L, null, null, null, null); // learnerType esplicitamente null
        assertEquals("", qs.toString());
    }

    // TC-QS-43 - TS1, liste indirizzi popolate: verifica il formato host:port:port.
    @Test
    @DisplayName("TC-QS-43 (TS1): indirizzi popolati -> formato host:port:port:type")
    void tcQs43_toStringWithAddresses() throws ConfigException {
        QuorumServer qs = new QuorumServer(1L, "10.0.0.1:2181:2182");
        assertEquals("10.0.0.1:2181:2182:participant", qs.toString());
    }

    // TC-QS-44 - TS3.c: clientAddr presente ma isClientAddrFromStatic=true -> comunque non scritto
    // (stesso output di TS3.b/null, meccanismo diverso - stessa distinzione gia' fatta per D7.a/D7.c).
    @Test
    @DisplayName("TC-QS-44 (TS3.c): clientAddr presente ma isClientAddrFromStatic=true -> non scritto")
    void tcQs44_toStringClientAddrFromStaticExcluded() {
        QuorumServer qs = new QuorumServer(1L, (InetSocketAddress) null, (InetSocketAddress) null, (InetSocketAddress) null);
        qs.clientAddr = new InetSocketAddress("10.0.0.1", 3000);
        qs.isClientAddrFromStatic = true;
        assertEquals(":participant", qs.toString());
    }

    // TC-QS-45 - TS3.a: clientAddr presente e non da fonte statica -> scritto con un solo ";" davanti.
    // NOTA DI CORREZIONE: la versione reale di QuorumServer su questo fork (verificata sul sorgente,
    // release-3.9.5) non ha il campo secureClientAddr - e' stato aggiunto solo in versioni successive
    // di ZooKeeper. La dimensione TS4/combinazione TS3xTS4 ipotizzata in una bozza precedente non
    // esiste su questo codice: rimossa, non un'esclusione per scelta ma un dato di fatto verificato.
    @Test
    @DisplayName("TC-QS-45 (TS3.a): clientAddr presente -> \";host:port\"")
    void tcQs45_toStringWithClientAddr() {
        QuorumServer qs = new QuorumServer(1L, (InetSocketAddress) null, (InetSocketAddress) null, (InetSocketAddress) null);
        qs.clientAddr = new InetSocketAddress("10.0.0.1", 3000);
        assertEquals(":participant;10.0.0.1:3000", qs.toString());
    }

    // TC-QS-49 - TS1.b: indirizzi MULTIPLI (non piu' un singolo indirizzo come TC-QS-43). Promosso da
    // un test del prompt LLM P1 (Fase 4, contesto pieno): toString() ordina addr ed electionAddr in
    // modo INDIPENDENTE per hostname, poi li accoppia per indice - un test a un solo indirizzo non
    // esercita mai questo riordinamento. Input volutamente in ordine decrescente (.170 prima di .160)
    // per dimostrare che il riordinamento avviene davvero, non per coincidenza dell'ordine di inserimento.
    @Test
    @DisplayName("TC-QS-49 (TS1.b, promosso da LLM P1): indirizzi multipli -> ordinati per host e accoppiati per indice")
    void tcQs49_toStringMultipleAddressesSortedAndPaired() throws ConfigException {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");
        QuorumServer qs = new QuorumServer(1L, "192.0.2.170:2888:3888|192.0.2.160:2889:3889");
        assertEquals("192.0.2.160:2889:3889|192.0.2.170:2888:3888:participant", qs.toString());
    }

    // TC-QS-50 - CD2.c: indirizzo NON RISOLVIBILE (hostname inesistente) - escluso dal confronto tramite
    // lo stesso ramo di excludedSpecialAddresses (inetaddr == null), non tramite isAnyLocalAddress/
    // isLoopbackAddress come CD2.b. Promosso da 2 prompt LLM indipendenti (P9 e P10, Fase 4) - stessa
    // scoperta trovata due volte separatamente, buon segnale di robustezza.
    @Test
    @DisplayName("TC-QS-50 (CD2.c, promosso da LLM P9+P10): indirizzo non risolvibile -> escluso, nessuna eccezione")
    void tcQs50_checkAddressDuplicateIgnoresUnresolvedAddress() {
        InetSocketAddress unresolved = InetSocketAddress.createUnresolved("host.invalid.test", 2181);
        QuorumServer qs1 = new QuorumServer(1L, unresolved, new InetSocketAddress("10.0.0.1", 2182), null, LearnerType.PARTICIPANT);
        QuorumServer qs2 = new QuorumServer(2L, unresolved, new InetSocketAddress("10.0.0.2", 2182), null, LearnerType.PARTICIPANT);
        assertDoesNotThrow(() -> qs1.checkAddressDuplicate(qs2));
    }

    // TC-QS-51 - conferma empirica della dichiarazione "TS3 e' indipendente" (vedi Combinazione sopra):
    // anche con TS2.c (type null, l'anomalia), il client address viene comunque scritto correttamente.
    // Promosso da LLM P8 (Fase 4) - rafforza con un test una dichiarazione finora solo affermata in prosa.
    @Test
    @DisplayName("TC-QS-51 (conferma Combinazione, promosso da LLM P8): type null + clientAddr presente -> solo il client viene scritto")
    void tcQs51_toStringNullTypeWithClientAddressStillAppendsClient() {
        QuorumServer qs = new QuorumServer(1L, null, null, new InetSocketAddress("10.0.0.5", 2181), null);
        assertEquals(";10.0.0.5:2181", qs.toString());
    }

    // ---- hashCode() -- anomalia, non un test in senso classico ----

    // TC-QS-46 - hashCode() contiene "assert false; return 42;". Le assertion Java sono confermate
    // attive sotto Surefire (mvn test: AssertionError reale, anche confermato indipendentemente
    // dall'LLM P3, Fase 4) MA NON sotto PIT: PIT esegue i test in un processo JVM separato che non
    // eredita automaticamente il flag -ea di Surefire, quindi li' l'assert diventa un no-op e il
    // metodo restituisce 42. Test scritto per reggere in entrambi i casi - la correttezza del test
    // non deve dipendere da quale strumento Maven lo esegue.
    @Test
    @DisplayName("TC-QS-46 (anomalia): hashCode() -> 42, oppure AssertionError se le assertion sono attive")
    void tcQs46_hashCodeConstantOrAssertionError() {
        QuorumServer qs = new QuorumServer(1L, new InetSocketAddress("10.0.0.1", 2181),
                new InetSocketAddress("10.0.0.1", 2182), null, LearnerType.PARTICIPANT);
        try {
            assertEquals(42, qs.hashCode());
        } catch (AssertionError e) {
            assertEquals("hashCode not designed", e.getMessage());
        }
    }
}