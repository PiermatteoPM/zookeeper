package org.apache.zookeeper.server.quorum.llmgen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuorumServerExtendedTest8 {

    private static InetSocketAddress address(String host, int port, int lastOctet)
            throws UnknownHostException {
        return new InetSocketAddress(
                InetAddress.getByAddress(host, new byte[] {
                        (byte) 192, 0, 2, (byte) lastOctet
                }),
                port);
    }

    private static InetSocketAddress ipv6Address(String host, int port)
            throws UnknownHostException {
        return new InetSocketAddress(
                InetAddress.getByAddress(
                        host,
                        new byte[] {
                                0x20, 0x01, 0x0d, (byte) 0xb8,
                                0, 0, 0, 0,
                                0, 0, 0, 0,
                                0, 0, 0, 1
                        }),
                port);
    }

    @Test
    @DisplayName("EC checkAddressDuplicate: null server reference")
    void checkAddressDuplicateWithNullThrowsNullPointerException()
            throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("server-one.example", 2888, 1));

        assertThrows(
                NullPointerException.class,
                () -> server.checkAddressDuplicate(null));
    }

    @Test
    @DisplayName("EC checkAddressDuplicate: duplicate quorum address")
    void checkAddressDuplicateWithSameQuorumAddressThrowsBadArgumentsException()
            throws Exception {
        InetSocketAddress sharedAddress =
                address("shared.example", 2888, 2);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(1L, sharedAddress);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(2L, sharedAddress);

        KeeperException.BadArgumentsException exception = assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));

        assertTrue(exception.getMessage().contains("server.1"));
        assertTrue(exception.getMessage().contains("server.2"));
        assertTrue(exception.getMessage().contains("2888"));
    }

    @Test
    @DisplayName("EC checkAddressDuplicate: quorum address duplicates another server's election address")
    void checkAddressDuplicateDetectsDuplicateAcrossAddressCategories()
            throws Exception {
        InetSocketAddress sharedAddress =
                address("cross-category.example", 3888, 3);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                sharedAddress,
                address("first-election.example", 4888, 4));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("second-quorum.example", 2888, 5),
                sharedAddress);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    @DisplayName("EC checkAddressDuplicate: duplicate client address")
    void checkAddressDuplicateWithSameClientAddressThrowsBadArgumentsException()
            throws Exception {
        InetSocketAddress sharedClient =
                address("shared-client.example", 2181, 6);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("first-quorum.example", 2888, 7),
                address("first-election.example", 3888, 7),
                sharedClient);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("second-quorum.example", 2888, 8),
                address("second-election.example", 3888, 8),
                sharedClient);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    @DisplayName("EC checkAddressDuplicate: all effective addresses distinct")
    void checkAddressDuplicateWithDistinctAddressesDoesNotThrow()
            throws Exception {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("first-quorum.example", 2888, 9),
                address("first-election.example", 3888, 9),
                address("first-client.example", 2181, 9));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("second-quorum.example", 2888, 10),
                address("second-election.example", 3888, 10),
                address("second-client.example", 2181, 10));

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    @DisplayName("EC checkAddressDuplicate: equal ports on different hosts are not duplicates")
    void checkAddressDuplicateWithSamePortsButDifferentHostsDoesNotThrow()
            throws Exception {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("first.example", 2888, 11),
                address("first.example", 3888, 11));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("second.example", 2888, 12),
                address("second.example", 3888, 12));

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    @DisplayName("EC checkAddressDuplicate: wildcard, loopback, and null addresses are excluded")
    void checkAddressDuplicateIgnoresSpecialAddresses() {
        InetSocketAddress wildcard = new InetSocketAddress("0.0.0.0", 2888);
        InetSocketAddress loopback = new InetSocketAddress("127.0.0.1", 3888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                wildcard,
                loopback,
                (InetSocketAddress) null);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                wildcard,
                loopback,
                (InetSocketAddress) null);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    @DisplayName("EC equals: same object reference")
    void equalsReturnsTrueForSameReference() throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("server.example", 2888, 20),
                address("server.example", 3888, 20),
                address("client.example", 2181, 20),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(server, server);
    }

    @Test
    @DisplayName("EC equals: identical id, type, quorum address, election address, and client address")
    void equalsReturnsTrueForIdenticalServers() throws Exception {
        InetSocketAddress quorum = address("server.example", 2888, 21);
        InetSocketAddress election = address("server.example", 3888, 21);
        InetSocketAddress client = address("client.example", 2181, 21);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                client,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                client,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(first, second);
        assertEquals(second, first);
    }

    @Test
    @DisplayName("EC equals: both client addresses null")
    void equalsReturnsTrueWhenBothClientAddressesAreNull() throws Exception {
        InetSocketAddress quorum = address("server.example", 2888, 22);
        InetSocketAddress election = address("server.example", 3888, 22);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(first, second);
    }

    @Test
    @DisplayName("EC equals: compared object is null")
    void equalsReturnsFalseForNull() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, null, null);

        assertNotEquals(server, null);
    }

    @Test
    @DisplayName("EC equals: compared object has a different runtime type")
    void equalsReturnsFalseForNonQuorumServerObject() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, null, null);

        assertFalse(server.equals("not a quorum server"));
    }

    @Test
    @DisplayName("EC equals: server ids differ")
    void equalsReturnsFalseWhenIdsDiffer() throws Exception {
        InetSocketAddress quorum = address("server.example", 2888, 23);
        InetSocketAddress election = address("server.example", 3888, 23);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(1L, quorum, election);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(2L, quorum, election);

        assertNotEquals(first, second);
    }

    @Test
    @DisplayName("EC equals: learner types differ")
    void equalsReturnsFalseWhenLearnerTypesDiffer() throws Exception {
        InetSocketAddress quorum = address("server.example", 2888, 24);
        InetSocketAddress election = address("server.example", 3888, 24);

        QuorumPeer.QuorumServer participant = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer observer = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                null,
                QuorumPeer.LearnerType.OBSERVER);

        assertNotEquals(participant, observer);
    }

    @Test
    @DisplayName("EC equals: quorum addresses differ")
    void equalsReturnsFalseWhenQuorumAddressesDiffer() throws Exception {
        InetSocketAddress election = address("server.example", 3888, 25);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("first.example", 2888, 25),
                election);

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                address("second.example", 2888, 26),
                election);

        assertNotEquals(first, second);
    }

    @Test
    @DisplayName("EC equals: election addresses differ")
    void equalsReturnsFalseWhenElectionAddressesDiffer() throws Exception {
        InetSocketAddress quorum = address("server.example", 2888, 27);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                address("first-election.example", 3888, 27));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                address("second-election.example", 3888, 28));

        assertNotEquals(first, second);
    }

    @Test
    @DisplayName("EC equals: client addresses differ")
    void equalsReturnsFalseWhenClientAddressesDiffer() throws Exception {
        InetSocketAddress quorum = address("server.example", 2888, 29);
        InetSocketAddress election = address("server.example", 3888, 29);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                address("first-client.example", 2181, 29));

        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                address("second-client.example", 2181, 30));

        assertNotEquals(first, second);
    }

    @Test
    @DisplayName("EC equals: exactly one client address is null")
    void equalsReturnsFalseWhenOnlyOneClientAddressIsNull() throws Exception {
        InetSocketAddress quorum = address("server.example", 2888, 31);
        InetSocketAddress election = address("server.example", 3888, 31);

        QuorumPeer.QuorumServer withoutClient = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                (InetSocketAddress) null);

        QuorumPeer.QuorumServer withClient = new QuorumPeer.QuorumServer(
                1L,
                quorum,
                election,
                address("client.example", 2181, 31));

        assertNotEquals(withoutClient, withClient);
        assertNotEquals(withClient, withoutClient);
    }

    @Test
    @DisplayName("EC toString: no addresses with default participant type")
    void toStringWithNoAddressesAndDefaultTypeReturnsParticipantSuffix() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, null, null);

        assertEquals(":participant", server.toString());
    }

    @Test
    @DisplayName("EC toString: explicitly null learner type and no addresses")
    void toStringWithNullLearnerTypeReturnsEmptyString() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                null,
                null,
                null,
                (QuorumPeer.LearnerType) null);

        assertEquals("", server.toString());
    }

    @Test
    @DisplayName("EC toString: no addresses with observer type")
    void toStringWithNoAddressesAndObserverTypeReturnsObserverSuffix() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                null,
                null,
                null,
                QuorumPeer.LearnerType.OBSERVER);

        assertEquals(":observer", server.toString());
    }

    @Test
    @DisplayName("EC toString: one IPv4 quorum/election pair and participant type")
    void toStringFormatsSingleAddressPair() throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("server.example", 2888, 40),
                address("server.example", 3888, 40));

        assertEquals(
                "server.example:2888:3888:participant",
                server.toString());
    }

    @Test
    @DisplayName("EC toString: dynamic client address is included")
    void toStringIncludesNonStaticClientAddress() throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("server.example", 2888, 41),
                address("server.example", 3888, 41),
                address("client.example", 2181, 41));

        assertEquals(
                "server.example:2888:3888:participant;client.example:2181",
                server.toString());
    }

    @Test
    @DisplayName("EC toString: client address from static configuration is omitted")
    void toStringOmitsClientAddressFromStaticConfiguration() throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("server.example", 2888, 42),
                address("server.example", 3888, 42),
                address("client.example", 2181, 42));

        server.isClientAddrFromStatic = true;

        assertEquals(
                "server.example:2888:3888:participant",
                server.toString());
    }

    @Test
    @DisplayName("EC toString: observer address pair")
    void toStringFormatsObserverType() throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("observer.example", 2888, 43),
                address("observer.example", 3888, 43),
                null,
                QuorumPeer.LearnerType.OBSERVER);

        assertEquals(
                "observer.example:2888:3888:observer",
                server.toString());
    }

    @Test
    @DisplayName("EC toString: IPv6 hosts require square-bracket delimiters")
    void toStringDelimitsIpv6Addresses() throws Exception {
        InetSocketAddress ipv6 = ipv6Address("2001:db8::1", 2888);
        InetSocketAddress ipv6Election = ipv6Address("2001:db8::1", 3888);
        InetSocketAddress ipv6Client = ipv6Address("2001:db8::1", 2181);

        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                ipv6,
                ipv6Election,
                ipv6Client,
                QuorumPeer.LearnerType.PARTICIPANT);

        String result = server.toString();

        assertTrue(result.contains("[2001:db8::1]:2888:3888"));
        assertTrue(result.contains(":participant"));
        assertTrue(result.contains(";[2001:db8::1]:2181"));
    }

    @Test
    @DisplayName("BVA toString: quorum address exists but election address is empty")
    void toStringWithOnlyQuorumAddressOmitsServerAddressPart()
            throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("server.example", 2888, 44),
                null);

        assertEquals(":participant", server.toString());
    }

    @Test
    @DisplayName("BVA toString: election address exists but quorum address is empty")
    void toStringWithOnlyElectionAddressOmitsServerAddressPart()
            throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                null,
                address("server.example", 3888, 45));

        assertEquals(":participant", server.toString());
    }

    @Test
    @DisplayName("BVA toString: null type with a dynamic client but no server address pair")
    void toStringWithNullTypeAndClientReturnsOnlyClientPart()
            throws Exception {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                null,
                null,
                address("client.example", 2181, 46),
                null);

        assertEquals(";client.example:2181", server.toString());
    }
}