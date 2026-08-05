package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuorumServerTest4 {

    @BeforeEach
    void setUp() {
        System.setProperty(
                QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES,
                "false");
        System.setProperty(
                QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED,
                "true");
    }

    @Test
    void shouldCreateParticipantWithValidSingleAddress() throws Exception {
        // Equivalence class: valid server_config (host:port:port)
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:1234:2345");

        assertEquals(1L, server.id);
        assertEquals("localhost", server.hostname);
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldCreateObserverWithExplicitRole() throws Exception {
        // Equivalence class: valid server_config with explicit observer role
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:1234:2345:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
    }

    @Test
    void shouldAcceptClientConfiguration() throws Exception {
        // Equivalence class: valid server_config;client_config
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:1234:2345;2181");

        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
    }

    @Test
    void shouldRejectTooFewServerParts() {
        // Equivalence class: malformed string with fewer than 3 server fields
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(1L, "localhost:1234"));
    }

    @Test
    void shouldRejectTooManyServerParts() {
        // Equivalence class: malformed string with more than 4 server fields
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:1234:2345:participant:extra"));
    }

    @Test
    void shouldRejectTooManySemicolonSections() {
        // Equivalence class: malformed string containing more than one client section
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:1234:2345;2181;extra"));
    }

    @Test
    void shouldRejectNonNumericQuorumPort() {
        // Equivalence class: malformed string with non-numeric quorum port
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:abc:2345"));
    }

    @Test
    void shouldRejectNonNumericElectionPort() {
        // Equivalence class: malformed string with non-numeric election port
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:1234:def"));
    }

    @Test
    void shouldRejectNonNumericClientPort() {
        // Equivalence class: malformed string with non-numeric client port
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:1234:2345;abcd"));
    }

    @Test
    void shouldRejectUnknownLearnerType() {
        // Equivalence class: invalid learner type
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:1234:2345:invalidRole"));
    }

    @Test
    void shouldRejectEqualQuorumAndElectionPorts() {
        // Boundary/value rule: quorum port equals election port
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:1234:1234"));
    }

    @Test
    void shouldAcceptPortZero() throws Exception {
        // Boundary value: minimum valid port = 0
        assertDoesNotThrow(
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:0:1"));
    }

    @Test
    void shouldAcceptPort65535() throws Exception {
        // Boundary value: maximum valid port = 65535
        assertDoesNotThrow(
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:65535:65534"));
    }

    @Test
    void shouldRejectNegativePort() {
        // Boundary value: port below valid range (-1)
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:-1:1"));
    }

    @Test
    void shouldRejectPortGreaterThan65535() {
        // Boundary value: port above valid range (65536)
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "localhost:65536:1"));
    }

    @Test
    void shouldAcceptMultipleAddressesWhenEnabled() throws Exception {
        // Equivalence class: valid multiple server addresses with same role
        System.setProperty(
                QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED,
                "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        1L,
                        "host1:1234:2345:participant|host2:1235:2346:participant");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldRejectMultipleAddressesWhenFeatureDisabled() {
        // Equivalence class: multiple addresses while feature is disabled
        System.setProperty(
                QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED,
                "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:1234:2345|host2:1235:2346"));
    }

    @Test
    void shouldRejectMultipleAddressesWithDifferentRoles() {
        // Equivalence class: multiple addresses with inconsistent learner roles
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "host1:1234:2345:participant|host2:1235:2346:observer"));
    }

    @Test
    void shouldRejectMalformedIpv6AddressWithoutClosingBracket() {
        // Equivalence class: malformed IPv6 literal
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "[2001:db8::1:1234:2345"));
    }

    @Test
    void shouldRejectIpv6AddressWithoutPortAfterBracket() {
        // Equivalence class: malformed IPv6 literal missing port
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        1L,
                        "[2001:db8::1]"));
    }
}