package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuorumServerTest5 {

    @Test
    void shouldConstructParticipantWhenThreeSegmentsProvided() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182");

        assertEquals(1L, server.id);
        assertEquals("host1", server.hostname);
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldConstructObserverWhenObserverRoleProvided() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182:observer");

        assertEquals("host1", server.hostname);
        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    @Test
    void shouldConstructParticipantWhenParticipantRoleProvided() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182:participant");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldAcceptRoleCaseInsensitively() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182:OBSERVER");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    @Test
    void shouldThrowWhenTooFewServerSegmentsProvided() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181"));
    }

    @Test
    void shouldThrowWhenTooManyServerSegmentsProvided() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182:observer:extra"));
    }

    @Test
    void shouldThrowWhenServerAndElectionPortsAreEqual() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2181"));
    }

    @Test
    void shouldThrowWhenRoleIsUnrecognized() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182:unknown"));
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
    void shouldCreateClientAddressWhenClientPortSpecified() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182;1234");

        assertNotNull(server.clientAddr);
        assertEquals(1234, server.clientAddr.getPort());
    }

    @Test
    void shouldCreateClientAddressWhenClientHostAndPortSpecified() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182;clienthost:1234");

        assertNotNull(server.clientAddr);
        assertEquals(1234, server.clientAddr.getPort());
        assertEquals("clienthost", server.clientAddr.getHostString());
    }

    @Test
    void shouldThrowWhenClientConfigHasTooManyParts() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182;a:b:c"));
    }

    @Test
    void shouldThrowWhenClientPortIsNotNumeric() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182;notaport"));
    }

    @Test
    void shouldThrowWhenMoreThanOneClientSectionIsProvided() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182;1234;5678"));
    }
}