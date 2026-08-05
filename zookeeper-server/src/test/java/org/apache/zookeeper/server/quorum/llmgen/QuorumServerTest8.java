package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuorumServerTest8 {

    @AfterEach
    void resetSystemProperties() {
        System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        System.clearProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES);
    }

    /**
     * EC_VALID_SERVER_CONFIG_DEFAULT_TYPE
     * host:serverPort:electionPort
     * Type should default to PARTICIPANT.
     */
    @Test
    void shouldConstructWithDefaultParticipantType() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182");

        assertEquals(1L, server.id);
        assertEquals("host1", server.hostname);
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    /**
     * BVA_MIN_SEGMENTS_MINUS_ONE / EC_TOO_FEW_SERVER_SEGMENTS
     * host:port
     */
    @Test
    void shouldThrowWhenTooFewServerSegmentsProvided() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181")
        );
    }

    /**
     * BVA_PORTS_EQUAL
     * serverPort == electionPort.
     */
    @Test
    void shouldThrowWhenServerAndElectionPortsAreEqual() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2181")
        );
    }

    /**
     * EC_VALID_OBSERVER_TYPE
     * Explicit observer role.
     */
    @Test
    void shouldConstructObserverServer() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    /**
     * EC_INVALID_ROLE
     * Unrecognised learner type.
     */
    @Test
    void shouldThrowForUnknownLearnerType() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "host1:2181:2182:leader")
        );
    }

    /**
     * EC_MULTI_ADDRESS_DISABLED
     * Multiple server addresses are not allowed when the feature is disabled.
     */
    @Test
    void shouldThrowWhenMultipleAddressesAndFeatureDisabled() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182|host2:2181:2182")
        );
    }

    /**
     * EC_VALID_PARTICIPANT_TYPE
     * Explicit participant role.
     */
    @Test
    void shouldConstructParticipantServerWhenTypeSpecified() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "host1:2181:2182:participant");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    /**
     * BVA_MAX_SERVER_PARTS_PLUS_ONE / EC_TOO_MANY_SERVER_SEGMENTS
     * host:port:port:type:extra
     */
    @Test
    void shouldThrowWhenTooManyServerSegmentsProvided() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182:participant:extra")
        );
    }

    /**
     * EC_INVALID_SERVER_PORT
     * Non-numeric server port.
     */
    @Test
    void shouldThrowForNonNumericServerPort() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:abc:2182")
        );
    }

    /**
     * EC_INVALID_ELECTION_PORT
     * Non-numeric election port.
     */
    @Test
    void shouldThrowForNonNumericElectionPort() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:abc")
        );
    }

    /**
     * EC_VALID_CLIENT_CONFIG_HOST_AND_PORT
     * server_config;clientHost:clientPort
     */
    @Test
    void shouldConstructWithExplicitClientAddress() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182;clientHost:3333");

        assertNotNull(server.clientAddr);
        assertEquals(3333, server.clientAddr.getPort());
    }

    /**
     * EC_INVALID_CLIENT_CONFIG_TOO_MANY_SEGMENTS
     * client configuration contains more than host:port.
     */
    @Test
    void shouldThrowWhenClientConfigHasTooManySegments() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2181:2182;client:1234:extra")
        );
    }
}