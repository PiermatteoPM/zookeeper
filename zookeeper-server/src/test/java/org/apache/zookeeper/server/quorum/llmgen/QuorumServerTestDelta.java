package org.apache.zookeeper.server.quorum.llmgen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.InetSocketAddress;
import java.util.Set;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class QuorumServerTestDelta {

    @AfterEach
    void restoreSystemProperties() {
        System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
    }

    private static InetSocketAddress onlyAddress(Set<InetSocketAddress> addresses) {
        assertEquals(1, addresses.size());
        return addresses.iterator().next();
    }

    private static boolean containsPort(Set<InetSocketAddress> addresses, int port) {
        return addresses.stream().anyMatch(address -> address.getPort() == port);
    }

    // Equivalence class: well-formed single server address without client address and default participant type.
    @Test
    void validSingleServerAddressDefaultsToParticipant() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "127.0.0.1:2888:3888");

        assertEquals(1L, server.getId());
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals("127.0.0.1", server.hostname);
        assertEquals(2888, onlyAddress(server.addr.getAllAddresses()).getPort());
        assertEquals(3888, onlyAddress(server.electionAddr.getAllAddresses()).getPort());
    }

    // Equivalence class: well-formed single server address with explicit observer type.
    @Test
    void validSingleServerAddressWithObserverType() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, "127.0.0.1:2888:3888:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertTrue(server.toString().contains(":observer"));
    }

    // Equivalence class: well-formed server address with client configuration using host:port.
    @Test
    void validServerAddressWithExplicitClientHostAndPort() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(3L, "127.0.0.1:2888:3888;localhost:2181");

        assertNotNull(server.clientAddr);
        assertEquals("localhost", server.clientAddr.getHostString());
        assertEquals(2181, server.clientAddr.getPort());
    }

    // Equivalence class: well-formed server address with client configuration using port only.
    @Test
    void validServerAddressWithClientPortOnlyUsesWildcardHost() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(4L, "127.0.0.1:2888:3888;2181");

        assertNotNull(server.clientAddr);
        assertEquals("0.0.0.0", server.clientAddr.getHostString());
        assertEquals(2181, server.clientAddr.getPort());
    }

    // Boundary value: minimum valid port 0 for quorum port and maximum valid port 65535 for election port.
    @Test
    void acceptsBoundaryPortsZeroAnd65535() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(5L, "127.0.0.1:0:65535");

        assertEquals(0, onlyAddress(server.addr.getAllAddresses()).getPort());
        assertEquals(65535, onlyAddress(server.electionAddr.getAllAddresses()).getPort());
    }

    // Boundary value: minimum valid client port 0.
    @Test
    void acceptsClientPortZeroBoundary() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(6L, "127.0.0.1:2888:3888;0");

        assertNotNull(server.clientAddr);
        assertEquals(0, server.clientAddr.getPort());
    }

    // Boundary value: maximum valid client port 65535.
    @Test
    void acceptsClientPort65535Boundary() throws Exception {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(7L, "127.0.0.1:2888:3888;localhost:65535");

        assertNotNull(server.clientAddr);
        assertEquals(65535, server.clientAddr.getPort());
    }

    // Boundary value: invalid quorum port immediately below valid range, -1.
    @Test
    void rejectsPortBelowZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(8L, "127.0.0.1:-1:3888"));
    }

    // Boundary value: invalid quorum port immediately above valid range, 65536.
    @Test
    void rejectsPortAbove65535() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(9L, "127.0.0.1:65536:3888"));
    }

    // Boundary value: invalid client port immediately above valid range, 65536.
    @Test
    void rejectsClientPortAbove65535() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(10L, "127.0.0.1:2888:3888;localhost:65536"));
    }

    // Boundary value: quorum and election ports are equal, which is explicitly disallowed.
    @Test
    void rejectsEqualQuorumAndElectionPorts() {
        QuorumPeerConfig.ConfigException thrown = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(11L, "127.0.0.1:2888:2888"));

        assertTrue(thrown.getMessage().contains("must be different"));
    }

    // Malformed string equivalence class: server address has too few fields.
    @Test
    void rejectsMalformedServerAddressWithTooFewFields() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(12L, "127.0.0.1:2888"));
    }

    // Malformed string equivalence class: server address has too many fields.
    @Test
    void rejectsMalformedServerAddressWithTooManyFields() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(13L, "127.0.0.1:2888:3888:participant:extra"));
    }

    // Malformed string equivalence class: non-numeric quorum port.
    @Test
    void rejectsMalformedServerAddressWithNonNumericQuorumPort() {
        QuorumPeerConfig.ConfigException thrown = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(14L, "127.0.0.1:notaport:3888"));

        assertTrue(thrown.getMessage().contains("Address unresolved"));
    }

    // Malformed string equivalence class: non-numeric election port.
    @Test
    void rejectsMalformedServerAddressWithNonNumericElectionPort() {
        QuorumPeerConfig.ConfigException thrown = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(15L, "127.0.0.1:2888:notaport"));

        assertTrue(thrown.getMessage().contains("Address unresolved"));
    }

    // Malformed string equivalence class: non-numeric client port.
    @Test
    void rejectsMalformedClientAddressWithNonNumericPort() {
        QuorumPeerConfig.ConfigException thrown = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(16L, "127.0.0.1:2888:3888;localhost:notaport"));

        assertTrue(thrown.getMessage().contains("Address unresolved"));
    }

    // Malformed string equivalence class: client address has too many fields.
    @Test
    void rejectsMalformedClientAddressWithTooManyFields() {
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(17L, "127.0.0.1:2888:3888;localhost:2181:extra"));
    }

    // Malformed string equivalence class: unrecognized learner type.
    @Test
    void rejectsUnknownLearnerType() {
        QuorumPeerConfig.ConfigException thrown = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(18L, "127.0.0.1:2888:3888:leader"));

        assertTrue(thrown.getMessage().contains("Unrecognised peertype"));
    }

    // Multiple-address equivalence class: multiple server addresses are rejected when the feature is disabled.
    @Test
    void rejectsMultipleServerAddressesWhenFeatureDisabled() {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "false");

        QuorumPeerConfig.ConfigException thrown = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        19L,
                        "127.0.0.1:2888:3888|127.0.0.2:2889:3889"));

        assertTrue(thrown.getMessage().contains("Multiple address feature is disabled"));
    }

    // Multiple-address equivalence class: multiple server addresses are accepted when the feature is enabled.
    @Test
    void acceptsMultipleServerAddressesWhenFeatureEnabled() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        "127.0.0.1:2888:3888:participant|127.0.0.2:2889:3889:participant");

        assertEquals(2, server.addr.getAllAddresses().size());
        assertEquals(2, server.electionAddr.getAllAddresses().size());
        assertTrue(containsPort(server.addr.getAllAddresses(), 2888));
        assertTrue(containsPort(server.addr.getAllAddresses(), 2889));
        assertTrue(containsPort(server.electionAddr.getAllAddresses(), 3888));
        assertTrue(containsPort(server.electionAddr.getAllAddresses(), 3889));
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    // Multiple-address equivalence class: all server addresses must have the same learner role.
    @Test
    void rejectsMultipleServerAddressesWithMixedLearnerTypes() {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeerConfig.ConfigException thrown = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        21L,
                        "127.0.0.1:2888:3888:participant|127.0.0.2:2889:3889:observer"));

        assertTrue(thrown.getMessage().contains("Multiple addresses should have similar roles"));
    }

    // Multiple-address equivalence class: multiple observer addresses with client configuration are accepted.
    @Test
    void acceptsMultipleObserverAddressesWithClientAddress() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        22L,
                        "127.0.0.1:2888:3888:observer|127.0.0.2:2889:3889:observer;localhost:2181");

        assertEquals(2, server.addr.getAllAddresses().size());
        assertEquals(2, server.electionAddr.getAllAddresses().size());
        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
    }

    // Equivalence class: constructor using InetSocketAddress objects preserves id, addresses, client address, and type.
    @Test
    void validInetSocketAddressConstructorPreservesFields() {
        InetSocketAddress quorumAddress = new InetSocketAddress("127.0.0.1", 2888);
        InetSocketAddress electionAddress = new InetSocketAddress("127.0.0.1", 3888);
        InetSocketAddress clientAddress = new InetSocketAddress("localhost", 2181);

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        23L,
                        quorumAddress,
                        electionAddress,
                        clientAddress,
                        QuorumPeer.LearnerType.OBSERVER);

        assertEquals(23L, server.getId());
        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals(clientAddress, server.clientAddr);
        assertEquals(quorumAddress, onlyAddress(server.addr.getAllAddresses()));
        assertEquals(electionAddress, onlyAddress(server.electionAddr.getAllAddresses()));
    }
}