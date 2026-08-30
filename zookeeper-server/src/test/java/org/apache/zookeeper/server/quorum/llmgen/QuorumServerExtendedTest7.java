package org.apache.zookeeper.server.quorum.llmgen;

import java.net.InetSocketAddress;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.KeeperException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuorumServerExtendedTest7 {

    @Test
    void checkAddressDuplicateThrowsNullPointerExceptionForNullServer() {
        QuorumPeer.QuorumServer server = server(
                1L,
                address("192.0.2.10", 2888),
                address("192.0.2.10", 3888),
                address("192.0.2.10", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertThrows(
                NullPointerException.class,
                () -> server.checkAddressDuplicate(null)
        );
    }

    @Test
    void checkAddressDuplicateRejectsMatchingQuorumAddress() {
        InetSocketAddress duplicateAddress = address("192.0.2.20", 2888);

        QuorumPeer.QuorumServer first = server(
                1L,
                duplicateAddress,
                address("192.0.2.20", 3888),
                address("192.0.2.20", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = server(
                2L,
                duplicateAddress,
                address("192.0.2.21", 3888),
                address("192.0.2.21", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    void checkAddressDuplicateRejectsAddressUsedForDifferentPurposes() {
        InetSocketAddress sharedAddress = address("192.0.2.30", 3888);

        QuorumPeer.QuorumServer first = server(
                1L,
                address("192.0.2.30", 2888),
                sharedAddress,
                address("192.0.2.30", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = server(
                2L,
                address("192.0.2.31", 2888),
                address("192.0.2.31", 3889),
                sharedAddress,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    void checkAddressDuplicateAcceptsDistinctAddresses() {
        QuorumPeer.QuorumServer first = server(
                1L,
                address("192.0.2.40", 2888),
                address("192.0.2.40", 3888),
                address("192.0.2.40", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = server(
                2L,
                address("192.0.2.41", 2888),
                address("192.0.2.41", 3888),
                address("192.0.2.41", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
        assertDoesNotThrow(() -> second.checkAddressDuplicate(first));
    }

    @Test
    void checkAddressDuplicateIgnoresWildcardAndLoopbackAddresses() {
        QuorumPeer.QuorumServer wildcardFirst = server(
                1L,
                address("0.0.0.0", 2888),
                address("0.0.0.0", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer wildcardSecond = server(
                2L,
                address("0.0.0.0", 2888),
                address("0.0.0.0", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        QuorumPeer.QuorumServer loopbackFirst = server(
                3L,
                address("127.0.0.1", 2888),
                address("127.0.0.1", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer loopbackSecond = server(
                4L,
                address("127.0.0.1", 2888),
                address("127.0.0.1", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertDoesNotThrow(
                () -> wildcardFirst.checkAddressDuplicate(wildcardSecond)
        );
        assertDoesNotThrow(
                () -> loopbackFirst.checkAddressDuplicate(loopbackSecond)
        );
    }

    @Test
    void equalsReturnsTrueForIdenticalServers() {
        QuorumPeer.QuorumServer first = server(
                7L,
                address("192.0.2.50", 2888),
                address("192.0.2.50", 3888),
                address("192.0.2.50", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = server(
                7L,
                address("192.0.2.50", 2888),
                address("192.0.2.50", 3888),
                address("192.0.2.50", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(first, second);
        assertEquals(second, first);
        assertEquals(first, first);
    }

    @Test
    void equalsReturnsTrueWhenBothClientAddressesAreNull() {
        QuorumPeer.QuorumServer first = server(
                7L,
                address("192.0.2.51", 2888),
                address("192.0.2.51", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = server(
                7L,
                address("192.0.2.51", 2888),
                address("192.0.2.51", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(first, second);
    }

    @Test
    void equalsReturnsFalseForNullAndUnrelatedObjects() {
        QuorumPeer.QuorumServer server = server(
                7L,
                address("192.0.2.52", 2888),
                address("192.0.2.52", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(server.equals(null));
        assertFalse(server.equals("not a quorum server"));
    }

    @Test
    void equalsReturnsFalseWhenIdDiffers() {
        QuorumPeer.QuorumServer first = server(
                1L,
                address("192.0.2.53", 2888),
                address("192.0.2.53", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = server(
                2L,
                address("192.0.2.53", 2888),
                address("192.0.2.53", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(first.equals(second));
    }

    @Test
    void equalsReturnsFalseWhenLearnerTypeDiffers() {
        QuorumPeer.QuorumServer participant = server(
                7L,
                address("192.0.2.54", 2888),
                address("192.0.2.54", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer observer = server(
                7L,
                address("192.0.2.54", 2888),
                address("192.0.2.54", 3888),
                null,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertFalse(participant.equals(observer));
    }

    @Test
    void equalsReturnsFalseWhenAnyAddressDiffers() {
        QuorumPeer.QuorumServer baseline = server(
                7L,
                address("192.0.2.55", 2888),
                address("192.0.2.55", 3888),
                address("192.0.2.55", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        QuorumPeer.QuorumServer differentQuorumAddress = server(
                7L,
                address("192.0.2.56", 2888),
                address("192.0.2.55", 3888),
                address("192.0.2.55", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer differentElectionAddress = server(
                7L,
                address("192.0.2.55", 2888),
                address("192.0.2.56", 3888),
                address("192.0.2.55", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer differentClientAddress = server(
                7L,
                address("192.0.2.55", 2888),
                address("192.0.2.55", 3888),
                address("192.0.2.56", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer missingClientAddress = server(
                7L,
                address("192.0.2.55", 2888),
                address("192.0.2.55", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(baseline.equals(differentQuorumAddress));
        assertFalse(baseline.equals(differentElectionAddress));
        assertFalse(baseline.equals(differentClientAddress));
        assertFalse(baseline.equals(missingClientAddress));
        assertFalse(missingClientAddress.equals(baseline));
    }

    @Test
    void toStringReturnsOnlyParticipantTypeWhenAddressesAreMissing() {
        QuorumPeer.QuorumServer server = server(
                1L,
                null,
                null,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(":participant", server.toString());
    }

    @Test
    void toStringIncludesObserverType() {
        QuorumPeer.QuorumServer server = server(
                1L,
                null,
                null,
                null,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertEquals(":observer", server.toString());
    }

    @Test
    void toStringIncludesQuorumElectionAndClientAddresses() {
        QuorumPeer.QuorumServer server = server(
                1L,
                unresolvedAddress("server.example.test", 2888),
                unresolvedAddress("server.example.test", 3888),
                unresolvedAddress("client.example.test", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(
                "server.example.test:2888:3888:participant;"
                        + "client.example.test:2181",
                server.toString()
        );
    }

    @Test
    void toStringOmitsClientSuffixWhenClientAddressIsNull() {
        QuorumPeer.QuorumServer server = server(
                1L,
                unresolvedAddress("server.example.test", 2888),
                unresolvedAddress("server.example.test", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertEquals(
                "server.example.test:2888:3888:participant",
                server.toString()
        );
    }

    @Test
    void toStringDelimitsIpv6AddressesWithBrackets() {
        QuorumPeer.QuorumServer server = server(
                1L,
                unresolvedAddress("2001:db8::10", 2888),
                unresolvedAddress("2001:db8::10", 3888),
                unresolvedAddress("2001:db8::20", 2181),
                QuorumPeer.LearnerType.OBSERVER
        );

        assertEquals(
                "[2001:db8::10]:2888:3888:observer;[2001:db8::20]:2181",
                server.toString()
        );
    }

    private static QuorumPeer.QuorumServer server(
            long id,
            InetSocketAddress quorumAddress,
            InetSocketAddress electionAddress,
            InetSocketAddress clientAddress,
            QuorumPeer.LearnerType learnerType
    ) {
        return new QuorumPeer.QuorumServer(
                id,
                quorumAddress,
                electionAddress,
                clientAddress,
                learnerType
        );
    }

    private static InetSocketAddress address(String host, int port) {
        return new InetSocketAddress(host, port);
    }

    private static InetSocketAddress unresolvedAddress(
            String host,
            int port
    ) {
        return InetSocketAddress.createUnresolved(host, port);
    }
}