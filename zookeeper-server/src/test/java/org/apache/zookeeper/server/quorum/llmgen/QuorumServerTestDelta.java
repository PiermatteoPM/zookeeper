package org.apache.zookeeper.server.quorum.llmgen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuorumServerTestDelta {

    private String originalMultiAddressEnabled;
    private String originalCanonicalizeHostNames;

    @BeforeEach
    void setUp() {
        originalMultiAddressEnabled = System.getProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        originalCanonicalizeHostNames = System.getProperty("zookeeper.kerberos.canonicalizeHostNames");

        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "false");
        System.setProperty("zookeeper.kerberos.canonicalizeHostNames", "false");
    }

    @AfterEach
    void tearDown() {
        restoreProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, originalMultiAddressEnabled);
        restoreProperty("zookeeper.kerberos.canonicalizeHostNames", originalCanonicalizeHostNames);
    }

    private void restoreProperty(String key, String value) {
        if (value == null) {
            System.clearProperty(key);
        } else {
            System.setProperty(key, value);
        }
    }

    @Test
    void parsesMinimalParticipantServerConfig() throws Exception {
        // Equivalence class: valid single server address with host:quorumPort:electionPort and default PARTICIPANT role.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "127.0.0.1:2888:3888");

        assertEquals(1L, server.getId());
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals("127.0.0.1", server.hostname);
        assertEquals(1, server.addr.getAllAddresses().size());
        assertEquals(2888, server.addr.getAllAddresses().iterator().next().getPort());
        assertEquals(1, server.electionAddr.getAllAddresses().size());
        assertEquals(3888, server.electionAddr.getAllAddresses().iterator().next().getPort());
    }

    @Test
    void parsesObserverServerConfigWithExplicitClientHost() throws Exception {
        // Equivalence class: valid single server address with explicit OBSERVER role and host:port client address.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, "127.0.0.1:2888:3888:observer;127.0.0.1:2181");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals("127.0.0.1", server.clientAddr.getHostString());
        assertEquals(2181, server.clientAddr.getPort());
    }

    @Test
    void parsesClientConfigWithPortOnlyAsWildcardHost() throws Exception {
        // Equivalence class: valid client_config containing only a client port, mapped to 0.0.0.0.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(3L, "127.0.0.1:2888:3888:participant;2181");

        assertEquals("0.0.0.0", server.clientAddr.getHostString());
        assertEquals(2181, server.clientAddr.getPort());
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void acceptsQuorumPortAtLowerBoundaryZero() throws Exception {
        // Boundary value: quorum server port at minimum legal value 0 while election port is different.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(4L, "127.0.0.1:0:1");

        assertEquals(0, server.addr.getAllAddresses().iterator().next().getPort());
        assertEquals(1, server.electionAddr.getAllAddresses().iterator().next().getPort());
    }

    @Test
    void acceptsElectionPortAtUpperBoundary65535() throws Exception {
        // Boundary value: election port at maximum legal value 65535 while quorum port is different.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(5L, "127.0.0.1:65534:65535");

        assertEquals(65534, server.addr.getAllAddresses().iterator().next().getPort());
        assertEquals(65535, server.electionAddr.getAllAddresses().iterator().next().getPort());
    }

    @Test
    void rejectsNegativeQuorumPortBelowLowerBoundary() {
        // Boundary value: quorum server port below minimum legal value, -1.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(6L, "127.0.0.1:-1:1"));
    }

    @Test
    void rejectsElectionPortAboveUpperBoundary() {
        // Boundary value: election port above maximum legal value, 65536.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(7L, "127.0.0.1:65535:65536"));
    }

    @Test
    void rejectsEqualQuorumAndElectionPorts() {
        // Boundary/constraint value: quorum and election ports are individually valid but equal, which is invalid.
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(8L, "127.0.0.1:2888:2888"));

        assertTrue(ex.getMessage().contains("Client and election port must be different"));
    }

    @Test
    void rejectsMalformedServerConfigWithMissingElectionPort() {
        // Equivalence class: malformed server_config with fewer than three host/port fields.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(9L, "127.0.0.1:2888"));
    }

    @Test
    void rejectsMalformedServerConfigWithTooManyServerFields() {
        // Equivalence class: malformed server_config with more than four host/port/type fields.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(10L, "127.0.0.1:2888:3888:participant:extra"));
    }

    @Test
    void rejectsMalformedConfigWithTooManySemicolonParts() {
        // Equivalence class: malformed address string with more than server_config and client_config sections.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(11L, "127.0.0.1:2888:3888;127.0.0.1:2181;extra"));
    }

    @Test
    void rejectsMalformedClientConfigWithTooManyFields() {
        // Equivalence class: malformed client_config with more than host:port fields.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(12L, "127.0.0.1:2888:3888;127.0.0.1:2181:extra"));
    }

    @Test
    void rejectsNonNumericServerPort() {
        // Equivalence class: malformed numeric field, quorum server port is not an integer.
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(13L, "127.0.0.1:notANumber:3888"));

        assertTrue(ex.getMessage().contains("Address unresolved"));
    }

    @Test
    void rejectsNonNumericClientPort() {
        // Equivalence class: malformed numeric field, client port is not an integer.
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(14L, "127.0.0.1:2888:3888;127.0.0.1:notANumber"));

        assertTrue(ex.getMessage().contains("Address unresolved"));
    }

    @Test
    void rejectsUnknownLearnerType() {
        // Equivalence class: malformed server_config with unrecognized learner type.
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(15L, "127.0.0.1:2888:3888:voter"));

        assertTrue(ex.getMessage().contains("Unrecognised peertype"));
    }

    @Test
    void rejectsMultipleServerAddressesWhenFeatureDisabled() {
        // Equivalence class: multiple server addresses provided while multi-address feature is disabled.
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "false");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        16L,
                        "127.0.0.1:2888:3888|127.0.0.2:2889:3889"));

        assertTrue(ex.getMessage().contains("Multiple address feature is disabled"));
    }

    @Test
    void parsesMultipleServerAddressesWithSameParticipantRoleWhenFeatureEnabled() throws Exception {
        // Equivalence class: valid multiple server addresses with matching PARTICIPANT roles.
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        17L,
                        "127.0.0.1:2888:3888:participant|127.0.0.2:2889:3889:participant");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals(2, server.addr.getAllAddresses().size());
        assertEquals(2, server.electionAddr.getAllAddresses().size());
    }

    @Test
    void parsesMultipleServerAddressesWithSameObserverRoleWhenFeatureEnabled() throws Exception {
        // Equivalence class: valid multiple server addresses with matching OBSERVER roles.
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        18L,
                        "127.0.0.1:2888:3888:observer|127.0.0.2:2889:3889:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals(2, server.addr.getAllAddresses().size());
        assertEquals(2, server.electionAddr.getAllAddresses().size());
    }

    @Test
    void rejectsMultipleServerAddressesWithMixedLearnerRoles() {
        // Equivalence class: invalid multiple server addresses because learner roles differ.
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        19L,
                        "127.0.0.1:2888:3888:participant|127.0.0.2:2889:3889:observer"));

        assertTrue(ex.getMessage().contains("Multiple addresses should have similar roles"));
    }
}