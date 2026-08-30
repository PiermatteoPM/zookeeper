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

class QuorumServerExtendedTest3 {

    private static QuorumPeer.QuorumServer createServer(
            long id,
            String quorumHost,
            int quorumPort,
            String electionHost,
            int electionPort,
            String clientHost,
            int clientPort,
            QuorumPeer.LearnerType learnerType) {

        return new QuorumPeer.QuorumServer(
                id,
                new InetSocketAddress(quorumHost, quorumPort),
                new InetSocketAddress(electionHost, electionPort),
                new InetSocketAddress(clientHost, clientPort),
                learnerType);
    }

    @Test
    void checkAddressDuplicateThrowsWhenQuorumAddressesOverlap() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.10",
                3888,
                "192.0.2.10",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                2L,
                "192.0.2.10",
                2888,
                "192.0.2.20",
                3889,
                "192.0.2.20",
                2182,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateThrowsWhenElectionAddressesOverlap() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.30",
                3888,
                "192.0.2.10",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                2L,
                "192.0.2.20",
                2889,
                "192.0.2.30",
                3888,
                "192.0.2.20",
                2182,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateThrowsWhenClientAddressesOverlap() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.10",
                3888,
                "192.0.2.40",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                2L,
                "192.0.2.20",
                2889,
                "192.0.2.20",
                3889,
                "192.0.2.40",
                2181,
                QuorumPeer.LearnerType.OBSERVER);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateAllowsDistinctAddresses() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.10",
                3888,
                "192.0.2.10",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                2L,
                "192.0.2.20",
                2889,
                "192.0.2.20",
                3889,
                "192.0.2.20",
                2182,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
        assertDoesNotThrow(() -> second.checkAddressDuplicate(first));
    }

    @Test
    void checkAddressDuplicateIgnoresWildcardAddresses() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "0.0.0.0",
                2888,
                "0.0.0.0",
                3888,
                "0.0.0.0",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                2L,
                "0.0.0.0",
                2888,
                "0.0.0.0",
                3888,
                "0.0.0.0",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresLoopbackAddresses() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "127.0.0.1",
                2888,
                "127.0.0.1",
                3888,
                "127.0.0.1",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                2L,
                "127.0.0.1",
                2888,
                "127.0.0.1",
                3888,
                "127.0.0.1",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void equalsReturnsTrueForSameInstance() {
        QuorumPeer.QuorumServer server = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.10",
                3888,
                "192.0.2.10",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(server, server);
    }

    @Test
    void equalsReturnsTrueWhenAllComparedFieldsAreEqual() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(first, second);
        assertEquals(second, first);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    void equalsReturnsFalseForNullAndUnrelatedTypes() {
        QuorumPeer.QuorumServer server = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.10",
                3888,
                "192.0.2.10",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(null, server);
        assertFalse(server.equals("not a quorum server"));
    }

    @Test
    void equalsReturnsFalseWhenIdDiffers() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                2L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenLearnerTypeDiffers() {
        QuorumPeer.QuorumServer participant = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer observer = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.OBSERVER);

        assertNotEquals(participant, observer);
    }

    @Test
    void equalsReturnsFalseWhenQuorumAddressDiffers() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                1L,
                "192.0.2.20",
                2889,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenElectionAddressDiffers() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.21",
                3988,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenClientAddressDiffers() {
        QuorumPeer.QuorumServer first = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.12",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.11",
                3888,
                "192.0.2.22",
                2182,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    void toStringCombinesAddressesTypeAndClientAddressUsingExpectedDelimiters() {
        QuorumPeer.QuorumServer server = createServer(
                1L,
                "192.0.2.10",
                2888,
                "192.0.2.10",
                3888,
                "192.0.2.10",
                2181,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(
                "192.0.2.10:2888:3888:participant;192.0.2.10:2181",
                server.toString());
    }

    @Test
    void toStringUsesObserverLabelForObserverServer() {
        QuorumPeer.QuorumServer server = createServer(
                5L,
                "192.0.2.50",
                2889,
                "192.0.2.50",
                3889,
                "192.0.2.51",
                2182,
                QuorumPeer.LearnerType.OBSERVER);

        String result = server.toString();

        assertEquals(
                "192.0.2.50:2889:3889:observer;192.0.2.51:2182",
                result);
        assertTrue(result.contains(":observer;"));
    }
}