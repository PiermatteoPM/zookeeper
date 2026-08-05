package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuorumServerTest9 {

    @AfterEach
    void cleanupSystemProperties() {
        System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        System.clearProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES);
    }

    // Step 3: Valid combination - single address, no client config, no role.
    @Test
    void shouldCreateSingleAddressWithoutClientConfigAndRole() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:2888:3888");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertNull(server.clientAddr);
    }

    // Step 3: Valid combination - single address with client config port only.
    @Test
    void shouldCreateSingleAddressWithClientPortOnly() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:2888:3888;2181");

        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
    }

    // Step 3: Valid combination - single address with client host and port.
    @Test
    void shouldCreateSingleAddressWithClientHostAndPort() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:2888:3888;127.0.0.1:2181");

        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
    }

    // Step 3: Valid combination - explicit observer role.
    @Test
    void shouldCreateSingleAddressWithObserverRole() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:2888:3888:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    // Step 3: Valid combination - multiple addresses with consistent role.
    @Test
    void shouldCreateMultipleAddressesWithSameRole() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2888:3888:participant|host2:2889:3889:participant");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    // Step 1: Invalid structure - more than one ';'.
    @Test
    void shouldRejectMoreThanOneSemicolonSection() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:2888:3888;2181;extra"));
    }

    // Step 1: Invalid structure - server config has too few components.
    @Test
    void shouldRejectServerConfigWithTooFewParts() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:2888"));
    }

    // Step 1: Invalid structure - server config has too many components.
    @Test
    void shouldRejectServerConfigWithTooManyParts() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:1:2:participant:extra"));
    }

    // Step 1: Invalid structure - client config has too many components.
    @Test
    void shouldRejectClientConfigWithTooManyParts() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:2888:3888;host:2181:extra"));
    }

    // Step 1: Invalid role string.
    @Test
    void shouldRejectUnknownRole() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:2888:3888:unknown"));
    }

    // Step 1: Multiple addresses disabled but multiple specified.
    @Test
    void shouldRejectMultipleAddressesWhenFeatureDisabled() {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2888:3888|host2:2889:3889"));
    }

    // Step 1: Multiple addresses with inconsistent roles.
    @Test
    void shouldRejectMultipleAddressesWithDifferentRoles() {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:2888:3888:participant|host2:2889:3889:observer"));
    }

    // Step 1: Quorum and election ports must differ.
    @Test
    void shouldRejectEqualQuorumAndElectionPorts() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:2888:2888"));
    }

    // Step 1: Non-numeric quorum port.
    @Test
    void shouldRejectNonNumericQuorumPort() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:notANumber:3888"));
    }

    // Step 1: Non-numeric election port.
    @Test
    void shouldRejectNonNumericElectionPort() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:2888:notANumber"));
    }

    // Step 1: Non-numeric client port.
    @Test
    void shouldRejectNonNumericClientPort() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:2888:3888;notANumber"));
    }

    // Step 2: Lower boundary - port 0 should be accepted.
    @Test
    void shouldAcceptPortZero() throws Exception {
        assertDoesNotThrow(
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:0:1"));
    }

    // Step 2: Upper boundary - port 65535 should be accepted.
    @Test
    void shouldAcceptPort65535() throws Exception {
        assertDoesNotThrow(
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:65534:65535"));
    }

    // Step 2: Below lower boundary - negative port.
    @Test
    void shouldRejectNegativePort() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:-1:3888"));
    }

    // Step 2: Above upper boundary - port greater than 65535.
    @Test
    void shouldRejectPortGreaterThan65535() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:65536:3888"));
    }
}