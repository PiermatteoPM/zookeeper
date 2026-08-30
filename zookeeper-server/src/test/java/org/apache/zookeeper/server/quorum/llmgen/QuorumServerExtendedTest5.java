package org.apache.zookeeper.server.quorum.llmgen;

import java.net.InetSocketAddress;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuorumServerExtendedTest5 {

    @Test
    public void checkAddressDuplicateWithNullServerThrowsNullPointerException() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                new InetSocketAddress("192.0.2.1", 2888),
                new InetSocketAddress("192.0.2.1", 3888)
        );

        assertThrows(
                NullPointerException.class,
                () -> server.checkAddressDuplicate(null)
        );
    }

    @Test
    public void checkAddressDuplicateWithSameQuorumAddressThrowsBadArgumentsException() {
        InetSocketAddress duplicateAddress = new InetSocketAddress("192.0.2.10", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                duplicateAddress,
                new InetSocketAddress("192.0.2.11", 3888)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                duplicateAddress,
                new InetSocketAddress("192.0.2.12", 3888)
        );

        KeeperException.BadArgumentsException exception = assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );

        assertTrue(exception.getMessage().contains("server.1"));
        assertTrue(exception.getMessage().contains("server.2"));
    }

    @Test
    public void checkAddressDuplicateDetectsConflictAcrossAddressRoles() {
        InetSocketAddress sharedAddress = new InetSocketAddress("192.0.2.20", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                sharedAddress,
                new InetSocketAddress("192.0.2.21", 3888)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                new InetSocketAddress("192.0.2.22", 2888),
                sharedAddress
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    public void checkAddressDuplicateWithDistinctAddressesDoesNotThrow() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                new InetSocketAddress("192.0.2.30", 2888),
                new InetSocketAddress("192.0.2.30", 3888),
                new InetSocketAddress("192.0.2.30", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                new InetSocketAddress("192.0.2.31", 2888),
                new InetSocketAddress("192.0.2.31", 3888),
                new InetSocketAddress("192.0.2.31", 2181)
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    public void checkAddressDuplicateIgnoresLoopbackAndWildcardAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                new InetSocketAddress("127.0.0.1", 2888),
                new InetSocketAddress("0.0.0.0", 3888),
                new InetSocketAddress("127.0.0.1", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                new InetSocketAddress("127.0.0.1", 2888),
                new InetSocketAddress("0.0.0.0", 3888),
                new InetSocketAddress("127.0.0.1", 2181)
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    public void equalsReturnsTrueForSameInstance() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                new InetSocketAddress("192.0.2.40", 2888),
                new InetSocketAddress("192.0.2.40", 3888),
                new InetSocketAddress("192.0.2.40", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertTrue(server.equals(server));
    }

    @Test
    public void equalsReturnsTrueForIdenticalServers() {
        InetSocketAddress quorumAddress = new InetSocketAddress("192.0.2.50", 2888);
        InetSocketAddress electionAddress = new InetSocketAddress("192.0.2.50", 3888);
        InetSocketAddress clientAddress = new InetSocketAddress("192.0.2.50", 2181);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                5L,
                quorumAddress,
                electionAddress,
                clientAddress,
                QuorumPeer.LearnerType.OBSERVER
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                5L,
                quorumAddress,
                electionAddress,
                clientAddress,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertTrue(first.equals(second));
        assertTrue(second.equals(first));
    }

    @Test
    public void equalsReturnsTrueWhenBothClientAddressesAreNull() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                6L,
                new InetSocketAddress("192.0.2.60", 2888),
                new InetSocketAddress("192.0.2.60", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                6L,
                new InetSocketAddress("192.0.2.60", 2888),
                new InetSocketAddress("192.0.2.60", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertTrue(first.equals(second));
    }

    @Test
    public void equalsReturnsFalseForNullAndUnrelatedObject() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                7L,
                new InetSocketAddress("192.0.2.70", 2888),
                new InetSocketAddress("192.0.2.70", 3888)
        );

        assertFalse(server.equals(null));
        assertFalse(server.equals("not a quorum server"));
    }

    @Test
    public void equalsReturnsFalseWhenIdsDiffer() {
        InetSocketAddress quorumAddress = new InetSocketAddress("192.0.2.80", 2888);
        InetSocketAddress electionAddress = new InetSocketAddress("192.0.2.80", 3888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                8L,
                quorumAddress,
                electionAddress
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                9L,
                quorumAddress,
                electionAddress
        );

        assertFalse(first.equals(second));
    }

    @Test
    public void equalsReturnsFalseWhenLearnerTypesDiffer() {
        InetSocketAddress quorumAddress = new InetSocketAddress("192.0.2.90", 2888);
        InetSocketAddress electionAddress = new InetSocketAddress("192.0.2.90", 3888);

        QuorumPeer.QuorumServer participant = new QuorumPeer.QuorumServer(
                10L,
                quorumAddress,
                electionAddress,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer observer = new QuorumPeer.QuorumServer(
                10L,
                quorumAddress,
                electionAddress,
                null,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertFalse(participant.equals(observer));
    }

    @Test
    public void equalsReturnsFalseWhenQuorumAddressesDiffer() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                11L,
                new InetSocketAddress("192.0.2.100", 2888),
                new InetSocketAddress("192.0.2.100", 3888)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                11L,
                new InetSocketAddress("192.0.2.101", 2888),
                new InetSocketAddress("192.0.2.100", 3888)
        );

        assertFalse(first.equals(second));
    }

    @Test
    public void equalsReturnsFalseWhenElectionAddressesDiffer() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                12L,
                new InetSocketAddress("192.0.2.110", 2888),
                new InetSocketAddress("192.0.2.110", 3888)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                12L,
                new InetSocketAddress("192.0.2.110", 2888),
                new InetSocketAddress("192.0.2.111", 3888)
        );

        assertFalse(first.equals(second));
    }

    @Test
    public void equalsReturnsFalseWhenOnlyOneClientAddressIsNull() {
        InetSocketAddress quorumAddress = new InetSocketAddress("192.0.2.120", 2888);
        InetSocketAddress electionAddress = new InetSocketAddress("192.0.2.120", 3888);

        QuorumPeer.QuorumServer withoutClient = new QuorumPeer.QuorumServer(
                13L,
                quorumAddress,
                electionAddress,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer withClient = new QuorumPeer.QuorumServer(
                13L,
                quorumAddress,
                electionAddress,
                new InetSocketAddress("192.0.2.120", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(withoutClient.equals(withClient));
        assertFalse(withClient.equals(withoutClient));
    }

    @Test
    public void equalsReturnsFalseWhenClientAddressesDiffer() {
        InetSocketAddress quorumAddress = new InetSocketAddress("192.0.2.130", 2888);
        InetSocketAddress electionAddress = new InetSocketAddress("192.0.2.130", 3888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                14L,
                quorumAddress,
                electionAddress,
                new InetSocketAddress("192.0.2.130", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                14L,
                quorumAddress,
                electionAddress,
                new InetSocketAddress("192.0.2.130", 2182),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(first.equals(second));
    }

    @Test
    public void toStringReturnsParticipantForServerWithoutAddresses() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                15L,
                null,
                null,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(":participant", server.toString());
    }

    @Test
    public void toStringReturnsObserverForServerWithoutAddresses() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                16L,
                null,
                null,
                null,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertEquals(":observer", server.toString());
    }

    @Test
    public void toStringIncludesQuorumElectionAndClientAddresses() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                17L,
                InetSocketAddress.createUnresolved("server.example.com", 2888),
                InetSocketAddress.createUnresolved("server.example.com", 3888),
                InetSocketAddress.createUnresolved("client.example.com", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(
                "server.example.com:2888:3888:participant;client.example.com:2181",
                server.toString()
        );
    }

    @Test
    public void toStringOmitsClientAddressWhenItCameFromStaticConfiguration() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                18L,
                InetSocketAddress.createUnresolved("server.example.com", 2888),
                InetSocketAddress.createUnresolved("server.example.com", 3888),
                InetSocketAddress.createUnresolved("client.example.com", 2181),
                QuorumPeer.LearnerType.OBSERVER
        );
        server.isClientAddrFromStatic = true;

        assertEquals(
                "server.example.com:2888:3888:observer",
                server.toString()
        );
    }

    @Test
    public void toStringDelimitsIpv6AddressesWithBrackets() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                19L,
                InetSocketAddress.createUnresolved("2001:db8::1", 2888),
                InetSocketAddress.createUnresolved("2001:db8::1", 3888),
                InetSocketAddress.createUnresolved("2001:db8::2", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(
                "[2001:db8::1]:2888:3888:participant;[2001:db8::2]:2181",
                server.toString()
        );
    }

    @Test
    public void toStringOmitsServerAddressesWhenElectionAddressIsMissing() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                20L,
                InetSocketAddress.createUnresolved("server.example.com", 2888),
                null,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(":participant", server.toString());
    }
}