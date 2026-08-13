package org.apache.zookeeper.server.quorum.llmgen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.InetSocketAddress;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuorumServerTestDelta {

    private String previousMultiAddressEnabled;

    @BeforeEach
    void rememberSystemProperties() {
        previousMultiAddressEnabled = System.getProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
    }

    @AfterEach
    void restoreSystemProperties() {
        if (previousMultiAddressEnabled == null) {
            System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        } else {
            System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, previousMultiAddressEnabled);
        }
    }

    @Test
    void parsesValidParticipantServerAddressWithoutClientAddress() throws Exception {
        // Equivalence class: valid server_config with host:quorumPort:electionPort and implicit PARTICIPANT type.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "127.0.0.1:2888:3888");

        assertEquals(1L, server.getId());
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals("127.0.0.1:2888:3888:participant", server.toString());
    }

    @Test
    void parsesValidObserverServerAddressWithClientHostAndPort() throws Exception {
        // Equivalence class: valid server_config with explicit OBSERVER type and client_config as host:port.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, "127.0.0.1:2888:3888:observer;127.0.0.1:2181");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals(new InetSocketAddress("127.0.0.1", 2181), server.clientAddr);
        assertEquals("127.0.0.1:2888:3888:observer;127.0.0.1:2181", server.toString());
    }

    @Test
    void parsesValidParticipantServerAddressWithClientPortOnly() throws Exception {
        // Equivalence class: valid client_config containing only a port, defaulting client host to 0.0.0.0.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(3L, "127.0.0.1:2888:3888:participant;2181");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals(new InetSocketAddress("0.0.0.0", 2181), server.clientAddr);
        assertEquals("127.0.0.1:2888:3888:participant;0.0.0.0:2181", server.toString());
    }

    @Test
    void acceptsMinimumAndMaximumValidServerPorts() throws Exception {
        // Boundary values: quorum port at minimum valid value 0 and election port at maximum valid value 65535.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(4L, "127.0.0.1:0:65535");

        assertEquals("127.0.0.1:0:65535:participant", server.toString());
    }

    @Test
    void acceptsMinimumAndMaximumValidClientPorts() throws Exception {
        // Boundary values: client port minimum 0 and maximum 65535 are valid InetSocketAddress ports.
        QuorumPeer.QuorumServer minClient =
                new QuorumPeer.QuorumServer(5L, "127.0.0.1:2888:3888;0");
        QuorumPeer.QuorumServer maxClient =
                new QuorumPeer.QuorumServer(6L, "127.0.0.1:2888:3888;65535");

        assertEquals(new InetSocketAddress("0.0.0.0", 0), minClient.clientAddr);
        assertEquals(new InetSocketAddress("0.0.0.0", 65535), maxClient.clientAddr);
    }

    @Test
    void rejectsServerPortBelowMinimum() {
        // Boundary value: quorum port -1 is immediately below the valid lower bound 0.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(7L, "127.0.0.1:-1:3888"));
    }

    @Test
    void rejectsServerPortAboveMaximum() {
        // Boundary value: election port 65536 is immediately above the valid upper bound 65535.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(8L, "127.0.0.1:2888:65536"));
    }

    @Test
    void rejectsClientPortBelowMinimum() {
        // Boundary value: client port -1 is immediately below the valid lower bound 0.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(9L, "127.0.0.1:2888:3888;-1"));
    }

    @Test
    void rejectsClientPortAboveMaximum() {
        // Boundary value: client port 65536 is immediately above the valid upper bound 65535.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(10L, "127.0.0.1:2888:3888;65536"));
    }

    @Test
    void rejectsMalformedServerAddressWithMissingElectionPort() {
        // Equivalence class: malformed string with too few server_config fields.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(11L, "127.0.0.1:2888"));
    }

    @Test
    void rejectsMalformedServerAddressWithTooManyServerFields() {
        // Equivalence class: malformed string with too many server_config fields.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(12L, "127.0.0.1:2888:3888:participant:extra"));
    }

    @Test
    void rejectsMalformedAddressWithTooManySemicolonParts() {
        // Equivalence class: malformed string with more than server_config and client_config parts.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(13L, "127.0.0.1:2888:3888;2181;extra"));
    }

    @Test
    void rejectsNonNumericServerPort() {
        // Equivalence class: malformed string containing a non-numeric quorum port.
        QuorumPeerConfig.ConfigException exception = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(14L, "127.0.0.1:notANumber:3888"));

        assertTrue(exception.getMessage().contains("Address unresolved"));
    }

    @Test
    void rejectsNonNumericClientPort() {
        // Equivalence class: malformed string containing a non-numeric client port.
        QuorumPeerConfig.ConfigException exception = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(15L, "127.0.0.1:2888:3888;clientPort"));

        assertTrue(exception.getMessage().contains("Address unresolved"));
    }

    @Test
    void rejectsClientAddressWithTooManyFields() {
        // Equivalence class: malformed client_config with more than host:port fields.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(16L, "127.0.0.1:2888:3888;127.0.0.1:2181:extra"));
    }

    @Test
    void rejectsUnrecognizedLearnerType() {
        // Equivalence class: invalid learner type outside {observer, participant}.
        QuorumPeerConfig.ConfigException exception = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(17L, "127.0.0.1:2888:3888:follower"));

        assertTrue(exception.getMessage().contains("Unrecognised peertype"));
    }

    @Test
    void rejectsSameQuorumAndElectionPorts() {
        // Equivalence class: invalid port relationship where quorum and election ports are equal.
        QuorumPeerConfig.ConfigException exception = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(18L, "127.0.0.1:2888:2888"));

        assertTrue(exception.getMessage().contains("Client and election port must be different"));
    }

    @Test
    void rejectsMultipleServerAddressesWhenFeatureDisabled() {
        // Equivalence class: multiple server addresses supplied while multi-address feature is disabled.
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "false");

        QuorumPeerConfig.ConfigException exception = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(19L, "127.0.0.1:2888:3888|127.0.0.1:2889:3889"));

        assertTrue(exception.getMessage().contains("Multiple address feature is disabled"));
    }

    @Test
    void parsesMultipleServerAddressesWhenFeatureEnabled() throws Exception {
        // Equivalence class: valid server_config containing multiple pipe-separated server addresses.
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(20L, "127.0.0.1:2888:3888|127.0.0.1:2889:3889");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals("127.0.0.1:2888:3888|127.0.0.1:2889:3889:participant", server.toString());
    }

    @Test
    void parsesMultipleServerAddressesWithConsistentObserverRole() throws Exception {
        // Equivalence class: valid multiple server addresses with the same explicit OBSERVER role.
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        21L,
                        "127.0.0.1:2888:3888:observer|127.0.0.1:2889:3889:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals("127.0.0.1:2888:3888|127.0.0.1:2889:3889:observer", server.toString());
    }

    @Test
    void rejectsMultipleServerAddressesWithMixedRoles() {
        // Equivalence class: invalid multiple server addresses with inconsistent learner roles.
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeerConfig.ConfigException exception = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        22L,
                        "127.0.0.1:2888:3888:participant|127.0.0.1:2889:3889:observer"));

        assertTrue(exception.getMessage().contains("Multiple addresses should have similar roles"));
    }
}