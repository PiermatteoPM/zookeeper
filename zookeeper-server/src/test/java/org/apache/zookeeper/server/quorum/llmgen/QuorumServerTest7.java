package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuorumServerTest7 {

    @Test
    void shouldConstructParticipantWhenTypeOmitted() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldConstructObserverWhenExplicitlyConfigured() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    @Test
    void shouldThrowWhenTooFewSegmentsProvided() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181"));
    }

    @Test
    void shouldThrowWhenServerPortEqualsElectionPort() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2181"));
    }

    @Test
    void shouldConstructWithDifferentPorts() {
        assertDoesNotThrow(
                () -> new QuorumPeer.QuorumServer(2L, "example.com:1234:5678"));
    }

    @Test
    void shouldThrowWhenElectionPortMissing() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:"));
    }

    @Test
    void shouldThrowWhenServerPortMissing() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1::2182"));
    }

    @Test
    void shouldThrowWhenHostMissing() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, ":2181:2182"));
    }

    @Test
    void shouldThrowWhenServerPortIsNotNumeric() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:notaport:2182"));
    }

    @Test
    void shouldThrowWhenElectionPortIsNotNumeric() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:notaport"));
    }

    @Test
    void shouldThrowWhenLearnerTypeIsUnknown() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182:unknown"));
    }

    @Test
    void shouldAcceptParticipantLearnerTypeWhenExplicitlyConfigured() {
        assertDoesNotThrow(
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182:participant"));
    }

    @Test
    void shouldThrowWhenTooManySegmentsProvided() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182:observer:extra"));
    }

    @Test
    void shouldPreserveProvidedServerId() throws Exception {
        long sid = 42L;

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(sid, "host1:2181:2182");

        assertEquals(sid, server.id);
    }

    @Test
    void shouldAcceptNumericHostnamesOrIpAddresses() {
        assertDoesNotThrow(
                () -> new QuorumPeer.QuorumServer(1L, "127.0.0.1:2181:2182"));
    }
}