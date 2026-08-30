package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.KeeperException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.InetSocketAddress;

import org.junit.jupiter.api.Test;

class QuorumServerExtendedTest {

    private static InetSocketAddress address(String host, int port) {
        return new InetSocketAddress(host, port);
    }

    @Test
    void checkAddressDuplicateThrowsWhenQuorumAddressesConflict() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.10", 2888),
                address("192.0.2.10", 3888),
                address("192.0.2.10", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("192.0.2.10", 2888),
                address("192.0.2.20", 3888),
                address("192.0.2.20", 2181)
        );

        KeeperException.BadArgumentsException exception = assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );

        assertTrue(exception.getMessage().contains("server.1"));
        assertTrue(exception.getMessage().contains("server.2"));
        assertTrue(exception.getMessage().contains("conflicts"));
    }

    @Test
    void checkAddressDuplicateThrowsWhenAddressConflictsAcrossDifferentRoles() {
        InetSocketAddress sharedAddress = address("192.0.2.30", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                sharedAddress,
                address("192.0.2.30", 3888),
                (InetSocketAddress) null
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("192.0.2.40", 2888),
                address("192.0.2.40", 3888),
                sharedAddress
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    void checkAddressDuplicateDoesNotThrowForDistinctAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.50", 2888),
                address("192.0.2.50", 3888),
                address("192.0.2.50", 2181)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("192.0.2.60", 2888),
                address("192.0.2.60", 3888),
                address("192.0.2.60", 2181)
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresLoopbackWildcardAndNullAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("127.0.0.1", 2888),
                address("0.0.0.0", 3888),
                (InetSocketAddress) null
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("127.0.0.1", 2888),
                address("0.0.0.0", 3888),
                (InetSocketAddress) null
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void equalsReturnsTrueForSameInstanceAndEquivalentServer() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.70", 2888),
                address("192.0.2.70", 3888),
                address("192.0.2.70", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer equivalent = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.70", 2888),
                address("192.0.2.70", 3888),
                address("192.0.2.70", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(first, first);
        assertEquals(first, equivalent);
        assertEquals(equivalent, first);
    }

    @Test
    void equalsSupportsEquivalentServersWithNullClientAddresses() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.80", 2888),
                address("192.0.2.80", 3888),
                null,
                QuorumPeer.LearnerType.OBSERVER
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.80", 2888),
                address("192.0.2.80", 3888),
                null,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertEquals(first, second);
    }

    @Test
    void equalsReturnsFalseForNullAndUnrelatedObject() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.90", 2888),
                address("192.0.2.90", 3888)
        );

        assertNotEquals(server, null);
        assertNotEquals(server, "not a quorum server");
    }

    @Test
    void equalsReturnsFalseWhenIdsDiffer() {
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.100", 2888),
                address("192.0.2.100", 3888)
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                2L,
                address("192.0.2.100", 2888),
                address("192.0.2.100", 3888)
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenLearnerTypesDiffer() {
        QuorumPeer.QuorumServer participant = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.110", 2888),
                address("192.0.2.110", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer observer = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.110", 2888),
                address("192.0.2.110", 3888),
                null,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertNotEquals(participant, observer);
    }

    @Test
    void equalsReturnsFalseWhenQuorumElectionOrClientAddressDiffers() {
        QuorumPeer.QuorumServer baseline = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.120", 2888),
                address("192.0.2.120", 3888),
                address("192.0.2.120", 2181)
        );
        QuorumPeer.QuorumServer differentQuorumAddress = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.121", 2888),
                address("192.0.2.120", 3888),
                address("192.0.2.120", 2181)
        );
        QuorumPeer.QuorumServer differentElectionAddress = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.120", 2888),
                address("192.0.2.121", 3888),
                address("192.0.2.120", 2181)
        );
        QuorumPeer.QuorumServer differentClientAddress = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.120", 2888),
                address("192.0.2.120", 3888),
                address("192.0.2.121", 2181)
        );
        QuorumPeer.QuorumServer nullClientAddress = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.120", 2888),
                address("192.0.2.120", 3888),
                (InetSocketAddress) null
        );

        assertNotEquals(baseline, differentQuorumAddress);
        assertNotEquals(baseline, differentElectionAddress);
        assertNotEquals(baseline, differentClientAddress);
        assertNotEquals(baseline, nullClientAddress);
        assertFalse(nullClientAddress.equals(baseline));
    }

    @Test
    void toStringFormatsParticipantWithClientAddress() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.130", 2888),
                address("192.0.2.130", 3888),
                address("192.0.2.130", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(
                "192.0.2.130:2888:3888:participant;192.0.2.130:2181",
                server.toString()
        );
    }

    @Test
    void toStringFormatsObserverWithoutClientAddress() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.140", 2888),
                address("192.0.2.140", 3888),
                null,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertEquals("192.0.2.140:2888:3888:observer", server.toString());
    }

    @Test
    void toStringOmitsClientAddressWhenItCameFromStaticConfiguration() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.150", 2888),
                address("192.0.2.150", 3888),
                address("192.0.2.150", 2181)
        );
        server.isClientAddrFromStatic = true;

        assertEquals("192.0.2.150:2888:3888:participant", server.toString());
    }

    @Test
    void toStringWrapsIpv6HostNamesInBrackets() {
        InetSocketAddress quorumAddress =
                InetSocketAddress.createUnresolved("2001:db8::1", 2888);
        InetSocketAddress electionAddress =
                InetSocketAddress.createUnresolved("2001:db8::1", 3888);
        InetSocketAddress clientAddress =
                InetSocketAddress.createUnresolved("2001:db8::1", 2181);

        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                quorumAddress,
                electionAddress,
                clientAddress,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(
                "[2001:db8::1]:2888:3888:participant;[2001:db8::1]:2181",
                server.toString()
        );
    }

    @Test
    void toStringHandlesMissingQuorumAndElectionAddresses() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                null,
                null,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(":participant", server.toString());
    }

    @Test
    void toStringPairsMultipleAddressesAfterSortingByHost() {
        QuorumPeer.QuorumServer server = new QuorumPeer.QuorumServer(
                1L,
                address("192.0.2.170", 2888),
                address("192.0.2.170", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        server.addr.addAddress(address("192.0.2.160", 2889));
        server.electionAddr.addAddress(address("192.0.2.160", 3889));

        assertEquals(
                "192.0.2.160:2889:3889|192.0.2.170:2888:3888:participant",
                server.toString()
        );
    }
}