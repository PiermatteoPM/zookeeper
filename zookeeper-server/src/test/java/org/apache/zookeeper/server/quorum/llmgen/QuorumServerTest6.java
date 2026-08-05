package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuorumServerTest6 {

    private static final String MULTI_ADDRESS_KEY =
            QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED;

    private static final String CANONICALIZE_KEY =
            QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES;

    @BeforeEach
    void setUp() {
        System.setProperty(CANONICALIZE_KEY, "false");
        System.setProperty(MULTI_ADDRESS_KEY, "true");
    }

    @AfterEach
    void tearDown() {
        System.clearProperty(CANONICALIZE_KEY);
        System.clearProperty(MULTI_ADDRESS_KEY);
    }

    @Test
    void shouldConstructParticipantWhenTypeIsOmitted() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182");

        assertEquals(1L, server.id);
        assertEquals("host1", server.hostname);
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldConstructObserverWhenObserverTypeSpecified() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, "host1:2181:2182:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals("host1", server.hostname);
    }

    @Test
    void shouldConstructParticipantWhenParticipantTypeSpecified() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(3L, "host1:2181:2182:participant");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldAcceptTypeCaseInsensitivelyAndWithWhitespace() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(4L, "host1:2181:2182:  ObSeRvEr ");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    @Test
    void shouldThrowWhenTooFewSegmentsProvided() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181")
        );
    }

    @Test
    void shouldThrowWhenTooManyServerSegmentsProvided() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182:participant:extra")
        );
    }

    @Test
    void shouldThrowWhenServerAndElectionPortsAreEqual() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2181")
        );

        assertTrue(ex.getMessage().contains("Client and election port must be different"));
    }

    @Test
    void shouldThrowForUnknownLearnerType() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182:leader")
        );

        assertTrue(ex.getMessage().contains("Unrecognised peertype"));
    }

    @Test
    void shouldThrowWhenServerPortIsNotNumeric() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:notaport:2182")
        );
    }

    @Test
    void shouldThrowWhenElectionPortIsNotNumeric() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:notaport")
        );
    }

    @Test
    void shouldCreateClientAddressWhenClientConfigContainsHostAndPort() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182;clientHost:3333");

        assertNotNull(server.clientAddr);
        assertEquals(3333, server.clientAddr.getPort());
        assertEquals("clientHost", server.clientAddr.getHostString());
    }

    @Test
    void shouldCreateClientAddressUsingDefaultHostWhenOnlyPortProvided() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182;3333");

        assertNotNull(server.clientAddr);
        assertEquals(3333, server.clientAddr.getPort());
        assertEquals("0.0.0.0", server.clientAddr.getHostString());
    }

    @Test
    void shouldThrowWhenClientConfigHasTooManyParts() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182;client:3333:extra")
        );
    }

    @Test
    void shouldThrowWhenClientPortIsNotNumeric() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182;client:notaport")
        );
    }

    @Test
    void shouldSupportIpv6ServerAddressFormat() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        1L,
                        "[2001:db8::1]:2181:2182");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals("2001:db8::1", server.hostname);
    }

    @Test
    void shouldThrowForMalformedIpv6Address() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "[2001:db8::1:2181:2182")
        );
    }

    @Test
    void shouldAllowMultipleAddressesWhenFeatureEnabled() throws Exception {
        System.setProperty(MULTI_ADDRESS_KEY, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182|host2:3181:3182");

        assertNotNull(server);
        assertEquals("host2", server.hostname);
    }

    @Test
    void shouldRejectMultipleAddressesWhenFeatureDisabled() {
        System.setProperty(MULTI_ADDRESS_KEY, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182|host2:3181:3182")
        );
    }

    @Test
    void shouldAcceptMultipleAddressesWithSameRole() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182:observer|host2:3181:3182:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    @Test
    void shouldRejectMultipleAddressesWithDifferentRoles() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182:observer|host2:3181:3182:participant")
        );
    }

    @Test
    void shouldThrowWhenMoreThanOneSemicolonSectionExists() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182;3333;extra")
        );
    }
}