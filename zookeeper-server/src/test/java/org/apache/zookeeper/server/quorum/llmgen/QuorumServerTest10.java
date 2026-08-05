package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuorumServerTest10 {

    @BeforeEach
    void setUp() {
        System.setProperty(
                QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES,
                "false");
        System.setProperty(
                QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED,
                "true");
    }

    @AfterEach
    void tearDown() {
        System.clearProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES);
        System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
    }

    /*
     * STEP 1/2: Structural validity matrix
     */

    @Test
    void shouldConstructSingleAddressWithoutClientAndWithoutRole() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:2888:3888");

        assertEquals(1L, server.id);
        assertEquals("localhost", server.hostname);
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertNull(server.clientAddr);
    }

    @Test
    void shouldConstructSingleAddressWithRoleObserver() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, "localhost:2888:3888:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    @Test
    void shouldConstructSingleAddressWithClientPortOnly() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(3L, "localhost:2888:3888;2181");

        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
        assertEquals("0.0.0.0", server.clientAddr.getHostString());
    }

    @Test
    void shouldConstructSingleAddressWithClientHostAndPort() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        4L,
                        "localhost:2888:3888;127.0.0.1:2181");

        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
        assertEquals("127.0.0.1", server.clientAddr.getHostString());
    }

    @Test
    void shouldConstructMultipleAddressesWithoutRole() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        5L,
                        "host1:2888:3888|host2:2889:3889");

        assertNotNull(server);
    }

    @Test
    void shouldConstructMultipleAddressesWithConsistentRole() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        6L,
                        "host1:2888:3888:participant|host2:2889:3889:participant");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldRejectTooManyClientSegments() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        7L,
                        "localhost:2888:3888;host:2181:extra"));

        assertTrue(ex.getMessage().contains("does not have the form"));
    }

    @Test
    void shouldRejectTooManySemicolonSections() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        8L,
                        "localhost:2888:3888;a;b"));

        assertTrue(ex.getMessage().contains("does not have the form"));
    }

    @Test
    void shouldRejectMissingElectionPort() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        9L,
                        "localhost:2888"));

        assertTrue(ex.getMessage().contains("does not have the form"));
    }

    @Test
    void shouldRejectTooManyServerFields() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        10L,
                        "localhost:1:2:participant:extra"));

        assertTrue(ex.getMessage().contains("does not have the form"));
    }

    /*
     * STEP 3/4: Edge cases and boundary values
     */

    @Test
    void shouldRejectNonNumericQuorumPort() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        11L,
                        "localhost:abc:3888"));

        assertTrue(ex.getMessage().contains("Address unresolved"));
    }

    @Test
    void shouldRejectNonNumericElectionPort() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        12L,
                        "localhost:2888:def"));

        assertTrue(ex.getMessage().contains("Address unresolved"));
    }

    @Test
    void shouldRejectNonNumericClientPort() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        13L,
                        "localhost:2888:3888;abc"));

        assertTrue(ex.getMessage().contains("Address unresolved"));
    }

    @Test
    void shouldRejectSameQuorumAndElectionPort() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        14L,
                        "localhost:3888:3888"));

        assertTrue(ex.getMessage().contains("Client and election port must be different"));
    }

    @Test
    void shouldRejectUnknownRole() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        15L,
                        "localhost:2888:3888:leader"));

        assertTrue(ex.getMessage().contains("Unrecognised peertype"));
    }

    @Test
    void shouldRejectMultipleAddressesWithDifferentRoles() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        16L,
                        "host1:2888:3888:participant|host2:2889:3889:observer"));

        assertTrue(ex.getMessage().contains("Multiple addresses should have similar roles"));
    }

    @Test
    void shouldRejectMultipleAddressesWhenFeatureDisabled() {
        System.setProperty(
                QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED,
                "false");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        17L,
                        "host1:2888:3888|host2:2889:3889"));

        assertTrue(ex.getMessage().contains("Multiple address feature is disabled"));
    }

    @Test
    void shouldAcceptBoundaryPortZero() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        18L,
                        "localhost:0:1");

        assertNotNull(server);
    }

    @Test
    void shouldAcceptBoundaryPort65535() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        19L,
                        "localhost:65534:65535");

        assertNotNull(server);
    }

    @Test
    void shouldHandleRoleCaseInsensitively() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        "localhost:2888:3888:ObSeRvEr");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    @Test
    void shouldAcceptIpv6ServerAddress() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        21L,
                        "[::1]:2888:3888");

        assertNotNull(server);
    }

    @Test
    void shouldRejectMalformedIpv6AddressWithoutClosingBracket() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        22L,
                        "[::1:2888:3888"));

        assertTrue(ex.getMessage().contains("no matching"));
    }

    @Test
    void shouldRejectIpv6WithoutPortAfterBracket() {
        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        23L,
                        "[::1]"));

        assertTrue(ex.getMessage().contains("doesn't have a port"));
    }
}