package org.apache.zookeeper.server.quorum.llmgen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.InetSocketAddress;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.junit.jupiter.api.Test;

class QuorumServerExtendedTest6 {

    @Test
    void checkAddressDuplicateWithNullServerThrowsNullPointerException() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.10", 2888),
                address("192.0.2.10", 3888)
        );

        assertThrows(
                NullPointerException.class,
                () -> server.checkAddressDuplicate(null)
        );
    }

    @Test
    void checkAddressDuplicateWithSameQuorumAddressThrowsBadArgumentsException() {
        InetSocketAddress duplicatedAddress = address("192.0.2.20", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                duplicatedAddress,
                address("192.0.2.20", 3888)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                duplicatedAddress,
                address("192.0.2.21", 3889)
        );

        KeeperException.BadArgumentsException exception = assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );

        assertTrue(exception.getMessage().contains("server.1"));
        assertTrue(exception.getMessage().contains("server.2"));
        assertTrue(exception.getMessage().contains("2888"));
    }

    @Test
    void checkAddressDuplicateWithSameElectionAddressThrowsBadArgumentsException() {
        InetSocketAddress duplicatedElectionAddress = address("192.0.2.30", 3888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.31", 2888),
                duplicatedElectionAddress
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("192.0.2.32", 2889),
                duplicatedElectionAddress
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    void checkAddressDuplicateWithSameClientAddressThrowsBadArgumentsException() {
        InetSocketAddress duplicatedClientAddress = address("192.0.2.40", 2181);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.41", 2888),
                address("192.0.2.41", 3888),
                duplicatedClientAddress
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("192.0.2.42", 2889),
                address("192.0.2.42", 3889),
                duplicatedClientAddress
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    void checkAddressDuplicateDetectsConflictAcrossDifferentAddressRoles() {
        InetSocketAddress sharedAddress = address("192.0.2.50", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                sharedAddress,
                address("192.0.2.51", 3888)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("192.0.2.52", 2889),
                address("192.0.2.52", 3889),
                sharedAddress
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    void checkAddressDuplicateWithDistinctAddressesDoesNotThrow() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.60", 2888),
                address("192.0.2.60", 3888),
                address("192.0.2.60", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("192.0.2.61", 2888),
                address("192.0.2.61", 3888),
                address("192.0.2.61", 2181)
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
        assertDoesNotThrow(() -> second.checkAddressDuplicate(first));
    }

    @Test
    void checkAddressDuplicateIgnoresWildcardAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("0.0.0.0", 2888),
                address("0.0.0.0", 3888),
                address("0.0.0.0", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("0.0.0.0", 2888),
                address("0.0.0.0", 3888),
                address("0.0.0.0", 2181)
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresLoopbackAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("127.0.0.1", 2888),
                address("127.0.0.1", 3888),
                address("127.0.0.1", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("127.0.0.1", 2888),
                address("127.0.0.1", 3888),
                address("127.0.0.1", 2181)
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void equalsReturnsTrueForSameInstance() {
        QuorumPeer.QuorumServer server = completeServer(
                1L,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(server, server);
    }

    @Test
    void equalsReturnsTrueForIdenticalServers() {
        QuorumPeer.QuorumServer first = completeServer(
                1L,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = completeServer(
                1L,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(first, second);
        assertEquals(second, first);
    }

    @Test
    void equalsReturnsTrueWhenBothClientAddressesAreNull() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.70", 2888),
                address("192.0.2.70", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.70", 2888),
                address("192.0.2.70", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(first, second);
    }

    @Test
    void equalsReturnsFalseForNullAndUnrelatedType() {
        QuorumPeer.QuorumServer server = completeServer(
                1L,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(server.equals(null));
        assertFalse(server.equals("not a quorum server"));
    }

    @Test
    void equalsReturnsFalseWhenIdsDiffer() {
        QuorumPeer.QuorumServer first = completeServer(
                1L,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = completeServer(
                2L,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenLearnerTypesDiffer() {
        QuorumPeer.QuorumServer participant = completeServer(
                1L,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer observer = completeServer(
                1L,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertNotEquals(participant, observer);
    }

    @Test
    void equalsReturnsFalseWhenQuorumAddressesDiffer() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.80", 2888),
                address("192.0.2.80", 3888),
                address("192.0.2.80", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.81", 2888),
                address("192.0.2.80", 3888),
                address("192.0.2.80", 2181)
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenElectionAddressesDiffer() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.90", 2888),
                address("192.0.2.90", 3888),
                address("192.0.2.90", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.90", 2888),
                address("192.0.2.91", 3888),
                address("192.0.2.90", 2181)
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenClientAddressesDiffer() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.100", 2888),
                address("192.0.2.100", 3888),
                address("192.0.2.100", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.100", 2888),
                address("192.0.2.100", 3888),
                address("192.0.2.101", 2181)
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenOnlyOneClientAddressIsNull() {
        QuorumPeer.QuorumServer withClientAddress = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.110", 2888),
                address("192.0.2.110", 3888),
                address("192.0.2.110", 2181)
        );
        QuorumPeer.QuorumServer withoutClientAddress = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.110", 2888),
                address("192.0.2.110", 3888),
                (InetSocketAddress) null
        );

        assertNotEquals(withClientAddress, withoutClientAddress);
        assertNotEquals(withoutClientAddress, withClientAddress);
    }

    @Test
    void toStringWithNoAddressesAndDefaultTypeReturnsParticipantSuffix() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                (InetSocketAddress) null
        );

        assertEquals(":participant", server.toString());
    }

    @Test
    void toStringFormatsParticipantWithAllAddresses() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.120", 2888),
                address("192.0.2.120", 3888),
                address("192.0.2.120", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(
                "192.0.2.120:2888:3888:participant;192.0.2.120:2181",
                server.toString()
        );
    }

    @Test
    void toStringFormatsObserverRole() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.121", 2888),
                address("192.0.2.121", 3888),
                null,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertEquals(
                "192.0.2.121:2888:3888:observer",
                server.toString()
        );
    }

    @Test
    void toStringOmitsClientAddressWhenItComesFromStaticConfiguration() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.122", 2888),
                address("192.0.2.122", 3888),
                address("192.0.2.122", 2181)
        );
        server.isClientAddrFromStatic = true;

        assertEquals(
                "192.0.2.122:2888:3888:participant",
                server.toString()
        );
    }

    @Test
    void toStringDoesNotRenderPartialQuorumAddressPair() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.123", 2888)
        );

        assertEquals(":participant", server.toString());
    }

    @Test
    void toStringEnclosesIpv6HostsInSquareBrackets() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                unresolvedAddress("2001:db8::1", 2888),
                unresolvedAddress("2001:db8::1", 3888),
                unresolvedAddress("2001:db8::1", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(
                "[2001:db8::1]:2888:3888:participant;[2001:db8::1]:2181",
                server.toString()
        );
    }

    private static QuorumPeer.QuorumServer completeServer(
            long id,
            QuorumPeer.LearnerType type
    ) {
        return new QuorumPeer.QuorumServer(
                id,
                address("192.0.2.200", 2888),
                address("192.0.2.200", 3888),
                address("192.0.2.200", 2181),
                type
        );
    }

    private static InetSocketAddress address(String host, int port) {
        return new InetSocketAddress(host, port);
    }

    private static InetSocketAddress unresolvedAddress(String host, int port) {
        return InetSocketAddress.createUnresolved(host, port);
    }
}