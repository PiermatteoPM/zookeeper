package org.apache.zookeeper.server.quorum.llmgen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.InetAddress;
import java.net.InetSocketAddress;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.junit.jupiter.api.Test;

class QuorumServerExtendedTest2 {

    private static final long SERVER_ID_1 = 1L;
    private static final long SERVER_ID_2 = 2L;

    private static InetSocketAddress address(String host, int port) {
        try {
            return new InetSocketAddress(InetAddress.getByName(host), port);
        } catch (Exception e) {
            throw new AssertionError("Unable to create test address " + host + ":" + port, e);
        }
    }

    private static QuorumPeer.QuorumServer server(
            long id,
            String quorumHost,
            int quorumPort,
            String electionHost,
            int electionPort,
            String clientHost,
            int clientPort,
            QuorumPeer.LearnerType learnerType) {

        InetSocketAddress clientAddress =
                clientHost == null ? null : address(clientHost, clientPort);

        return new QuorumPeer.QuorumServer(
                id,
                address(quorumHost, quorumPort),
                address(electionHost, electionPort),
                clientAddress,
                learnerType);
    }

    /*
     * Tests for QuorumServer.delimitedHostString(InetSocketAddress)
     */

    @Test
    void delimitedHostStringReturnsIpv4HostWithoutBrackets() {
        InetSocketAddress ipv4 = address("192.0.2.10", 2888);

        assertEquals("192.0.2.10", QuorumPeer.QuorumServer.delimitedHostString(ipv4));
    }

    @Test
    void delimitedHostStringReturnsHostnameWithoutBrackets() {
        InetSocketAddress unresolved =
                InetSocketAddress.createUnresolved("zk-node.example.test", 2888);

        assertEquals(
                "zk-node.example.test",
                QuorumPeer.QuorumServer.delimitedHostString(unresolved));
    }

    @Test
    void delimitedHostStringWrapsIpv6LiteralInBrackets() {
        InetSocketAddress ipv6 =
                InetSocketAddress.createUnresolved("2001:db8::10", 2888);

        assertEquals("[2001:db8::10]", QuorumPeer.QuorumServer.delimitedHostString(ipv6));
    }

    @Test
    void delimitedHostStringDoesNotIncludePort() {
        InetSocketAddress address = this.address("192.0.2.20", 3888);

        String result = QuorumPeer.QuorumServer.delimitedHostString(address);

        assertEquals("192.0.2.20", result);
        assertFalse(result.contains("3888"));
    }

    @Test
    void delimitedHostStringThrowsNullPointerExceptionForNullAddress() {
        assertThrows(
                NullPointerException.class,
                () -> QuorumPeer.QuorumServer.delimitedHostString(null));
    }

    /*
     * Tests for QuorumServer.equals(Object)
     */

    @Test
    void equalsReturnsTrueForSameInstance() {
        QuorumPeer.QuorumServer server = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                "192.0.2.1",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(server, server);
    }

    @Test
    void equalsReturnsTrueForEquivalentServers() {
        QuorumPeer.QuorumServer first = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                "192.0.2.1",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                "192.0.2.1",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(first, second);
        assertEquals(second, first);
    }

    @Test
    void equalsReturnsFalseForNull() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        assertNotEquals(server, null);
    }

    @Test
    void equalsReturnsFalseForDifferentObjectType() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        assertNotEquals(server, "not a quorum server");
    }

    @Test
    void equalsReturnsFalseForDifferentServerId() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_2,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseForDifferentLearnerType() {
        QuorumPeer.QuorumServer participant = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                null,
                0,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer observer = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                null,
                0,
                QuorumPeer.LearnerType.OBSERVER);

        assertNotEquals(participant, observer);
    }

    @Test
    void equalsReturnsFalseForDifferentQuorumAddress() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.2", 2888),
                address("192.0.2.1", 3888));

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseForDifferentQuorumPort() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2889),
                address("192.0.2.1", 3888));

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseForDifferentElectionAddress() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.2", 3888));

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenOnlyOneServerHasClientAddress() {
        QuorumPeer.QuorumServer withClientAddress = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                "192.0.2.1",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer withoutClientAddress = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                null,
                0,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(withClientAddress, withoutClientAddress);
        assertNotEquals(withoutClientAddress, withClientAddress);
    }

    @Test
    void equalsReturnsFalseForDifferentClientAddress() {
        QuorumPeer.QuorumServer first = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                "192.0.2.1",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                "192.0.2.2",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsTrueWhenBothClientAddressesAreNull() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        assertEquals(first, second);
    }

    @Test
    void equalsHandlesServersCreatedWithNullAddresses() {
        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(SERVER_ID_1, (InetSocketAddress) null);

        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(SERVER_ID_1, (InetSocketAddress) null);

        assertEquals(first, second);
    }

    /*
     * Tests for QuorumServer.checkAddressDuplicate(QuorumServer)
     */

    @Test
    void checkAddressDuplicateDoesNotThrowForDistinctAddresses() {
        QuorumPeer.QuorumServer first = server(
                SERVER_ID_1,
                "192.0.2.1",
                2888,
                "192.0.2.1",
                3888,
                "192.0.2.1",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                SERVER_ID_2,
                "192.0.2.2",
                2888,
                "192.0.2.2",
                3888,
                "192.0.2.2",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateDetectsDuplicateQuorumAddress() {
        QuorumPeer.QuorumServer first = server(
                SERVER_ID_1,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                SERVER_ID_2,
                "192.0.2.10",
                2888,
                "192.0.2.21",
                3888,
                "192.0.2.22",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        KeeperException.BadArgumentsException exception = assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));

        assertTrue(exception.getMessage().contains("server." + SERVER_ID_1));
        assertTrue(exception.getMessage().contains("server." + SERVER_ID_2));
        assertTrue(exception.getMessage().contains("192.0.2.10"));
    }

    @Test
    void checkAddressDuplicateDetectsDuplicateElectionAddress() {
        QuorumPeer.QuorumServer first = server(
                SERVER_ID_1,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                SERVER_ID_2,
                "192.0.2.20",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.22",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateDetectsDuplicateClientAddress() {
        QuorumPeer.QuorumServer first = server(
                SERVER_ID_1,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                SERVER_ID_2,
                "192.0.2.20",
                2888,
                "192.0.2.21",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateDetectsConflictAcrossDifferentAddressRoles() {
        InetSocketAddress sharedAddress = address("192.0.2.30", 3888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.10", 2888),
                sharedAddress,
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_2,
                address("192.0.2.20", 2888),
                address("192.0.2.21", 3888),
                sharedAddress,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresNullClientAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_2,
                address("192.0.2.2", 2888),
                address("192.0.2.2", 3888));

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresWildcardAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("0.0.0.0", 2888),
                address("0.0.0.0", 3888),
                address("0.0.0.0", 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_2,
                address("0.0.0.0", 2888),
                address("0.0.0.0", 3888),
                address("0.0.0.0", 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresLoopbackAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("127.0.0.1", 2888),
                address("127.0.0.1", 3888),
                address("127.0.0.1", 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_2,
                address("127.0.0.1", 2888),
                address("127.0.0.1", 3888),
                address("127.0.0.1", 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresUnresolvedAddresses() {
        InetSocketAddress unresolvedQuorum =
                InetSocketAddress.createUnresolved("unresolved.example.test", 2888);
        InetSocketAddress unresolvedElection =
                InetSocketAddress.createUnresolved("unresolved.example.test", 3888);
        InetSocketAddress unresolvedClient =
                InetSocketAddress.createUnresolved("unresolved.example.test", 2181);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                unresolvedQuorum,
                unresolvedElection,
                unresolvedClient,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                SERVER_ID_2,
                unresolvedQuorum,
                unresolvedElection,
                unresolvedClient,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateThrowsNullPointerExceptionForNullServer() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                SERVER_ID_1,
                address("192.0.2.1", 2888),
                address("192.0.2.1", 3888));

        assertThrows(
                NullPointerException.class,
                () -> server.checkAddressDuplicate(null));
    }

    @Test
    void checkAddressDuplicateDoesNotThrowWhenBothServersHaveNoAddresses() {
        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(SERVER_ID_1, (InetSocketAddress) null);

        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(SERVER_ID_2, (InetSocketAddress) null);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }
}