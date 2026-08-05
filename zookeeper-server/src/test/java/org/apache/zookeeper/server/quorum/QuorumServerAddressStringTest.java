package org.apache.zookeeper.server.quorum;

import org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType;
import org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException;
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
}