package org.apache.zookeeper.server.quorum.llmgen;

import java.net.InetAddress;
import java.net.InetSocketAddress;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuorumServerExtendedTest4 {

    @Test
    void delimitedHostStringReturnsIpv4HostWithoutBrackets() {
        // Equivalence class: valid non-null IPv4 address.
        InetSocketAddress address = new InetSocketAddress("192.0.2.10", 2888);

        assertEquals(
                "192.0.2.10",
                QuorumPeer.QuorumServer.delimitedHostString(address)
        );
    }

    @Test
    void delimitedHostStringEnclosesIpv6HostInBrackets() {
        // Equivalence class: valid non-null IPv6 address containing colon delimiters.
        InetSocketAddress address =
                InetSocketAddress.createUnresolved("2001:db8::10", 3888);

        assertEquals(
                "[2001:db8::10]",
                QuorumPeer.QuorumServer.delimitedHostString(address)
        );
    }

    @Test
    void delimitedHostStringSupportsWildcardIpv4Address() {
        // Equivalence class: wildcard IPv4 address.
        InetSocketAddress address = new InetSocketAddress("0.0.0.0", 0);

        assertEquals(
                "0.0.0.0",
                QuorumPeer.QuorumServer.delimitedHostString(address)
        );
    }

    @Test
    void delimitedHostStringSupportsLoopbackAddress() {
        // Equivalence class: loopback address.
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 65535);

        assertEquals(
                "127.0.0.1",
                QuorumPeer.QuorumServer.delimitedHostString(address)
        );
    }

    @Test
    void delimitedHostStringRejectsNullAddress() {
        // Equivalence class: invalid null argument.
        assertThrows(
                NullPointerException.class,
                () -> QuorumPeer.QuorumServer.delimitedHostString(null)
        );
    }

    @Test
    void delimitedHostStringSupportsMinimumPortBoundary() {
        // Equivalence class: valid address at the minimum port boundary, port zero.
        InetSocketAddress address = new InetSocketAddress("192.0.2.20", 0);

        assertEquals(
                "192.0.2.20",
                QuorumPeer.QuorumServer.delimitedHostString(address)
        );
    }

    @Test
    void delimitedHostStringSupportsMaximumPortBoundary() {
        // Equivalence class: valid address at the maximum port boundary, port 65535.
        InetSocketAddress address = new InetSocketAddress("192.0.2.21", 65535);

        assertEquals(
                "192.0.2.21",
                QuorumPeer.QuorumServer.delimitedHostString(address)
        );
    }

    @Test
    void equalsReturnsTrueForSameReference() {
        // Equivalence class: comparison with the same object reference.
        QuorumPeer.QuorumServer server = createServer(
                1L,
                "192.0.2.1",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertTrue(server.equals(server));
    }

    @Test
    void equalsReturnsTrueWhenAllFieldsAreEqual() {
        // Equivalence class: distinct objects with all public fields equal.
        QuorumPeer.QuorumServer first = createServer(
                10L,
                "192.0.2.10",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = createServer(
                10L,
                "192.0.2.10",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        first.hostname = "server.example.test";
        second.hostname = "server.example.test";
        first.isClientAddrFromStatic = true;
        second.isClientAddrFromStatic = true;

        assertTrue(first.equals(second));
        assertTrue(second.equals(first));
    }

    @Test
    void equalsReturnsTrueWhenBothClientAddressesAreNull() {
        // Equivalence class: equal objects with both optional client addresses absent.
        InetSocketAddress quorumAddress =
                new InetSocketAddress("192.0.2.11", 2888);
        InetSocketAddress electionAddress =
                new InetSocketAddress("192.0.2.11", 3888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                11L,
                quorumAddress,
                electionAddress,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                11L,
                quorumAddress,
                electionAddress,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertTrue(first.equals(second));
    }

    @Test
    void equalsReturnsFalseForNullArgument() {
        // Equivalence class: null comparison argument.
        QuorumPeer.QuorumServer server = createServer(
                12L,
                "192.0.2.12",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(server.equals(null));
    }

    @Test
    void equalsReturnsFalseForDifferentObjectType() {
        // Equivalence class: non-null argument of an unrelated type.
        QuorumPeer.QuorumServer server = createServer(
                13L,
                "192.0.2.13",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(server.equals("not a quorum server"));
    }

    @Test
    void equalsReturnsFalseWhenIdsDiffer() {
        // Equivalence class: servers differing only by identifier.
        QuorumPeer.QuorumServer first = createServer(
                Long.MIN_VALUE,
                "192.0.2.14",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = createServer(
                Long.MAX_VALUE,
                "192.0.2.14",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenLearnerTypesDiffer() {
        // Equivalence class: servers differing only by learner type.
        QuorumPeer.QuorumServer participant = createServer(
                15L,
                "192.0.2.15",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer observer = createServer(
                15L,
                "192.0.2.15",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.OBSERVER
        );

        assertNotEquals(participant, observer);
    }

    @Test
    void equalsReturnsFalseWhenQuorumAddressesDiffer() {
        // Equivalence class: servers differing only by quorum address.
        QuorumPeer.QuorumServer first = createServer(
                16L,
                "192.0.2.16",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = createServer(
                16L,
                "192.0.2.17",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenElectionAddressesDiffer() {
        // Equivalence class: servers differing only by election port.
        QuorumPeer.QuorumServer first = createServer(
                17L,
                "192.0.2.18",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = createServer(
                17L,
                "192.0.2.18",
                2888,
                3889,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalsReturnsFalseWhenOnlyOneClientAddressIsNull() {
        // Equivalence class: one optional client address absent and the other present.
        InetSocketAddress quorumAddress =
                new InetSocketAddress("192.0.2.19", 2888);
        InetSocketAddress electionAddress =
                new InetSocketAddress("192.0.2.19", 3888);

        QuorumPeer.QuorumServer withoutClient = new QuorumPeer.QuorumServer(
                18L,
                quorumAddress,
                electionAddress,
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer withClient = new QuorumPeer.QuorumServer(
                18L,
                quorumAddress,
                electionAddress,
                new InetSocketAddress("192.0.2.19", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertFalse(withoutClient.equals(withClient));
        assertFalse(withClient.equals(withoutClient));
    }

    @Test
    void equalsReturnsFalseWhenClientAddressesDiffer() {
        // Equivalence class: servers differing only by non-null client address.
        QuorumPeer.QuorumServer first = createServer(
                19L,
                "192.0.2.22",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = createServer(
                19L,
                "192.0.2.22",
                2888,
                3888,
                2182,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertNotEquals(first, second);
    }

    @Test
    void checkAddressDuplicateAcceptsServersWithDistinctAddresses() {
        // Equivalence class: two servers with no address or port conflicts.
        QuorumPeer.QuorumServer first = createServer(
                20L,
                "192.0.2.30",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = createServer(
                21L,
                "192.0.2.31",
                2889,
                3889,
                2182,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateRejectsMatchingQuorumAddresses() {
        // Equivalence class: duplicate regular quorum address.
        InetSocketAddress duplicate = new InetSocketAddress("192.0.2.40", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                30L,
                duplicate,
                new InetSocketAddress("192.0.2.40", 3888),
                new InetSocketAddress("192.0.2.40", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                31L,
                duplicate,
                new InetSocketAddress("192.0.2.41", 3889),
                new InetSocketAddress("192.0.2.41", 2182),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    void checkAddressDuplicateRejectsCrossRoleAddressConflict() {
        // Equivalence class: one server's quorum address equals the other's client address.
        InetSocketAddress conflict = new InetSocketAddress("192.0.2.50", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                40L,
                conflict,
                new InetSocketAddress("192.0.2.50", 3888),
                new InetSocketAddress("192.0.2.50", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                41L,
                new InetSocketAddress("192.0.2.51", 2889),
                new InetSocketAddress("192.0.2.51", 3889),
                conflict,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second)
        );
    }

    @Test
    void checkAddressDuplicateIgnoresMatchingWildcardAddresses() {
        // Equivalence class: duplicate wildcard addresses excluded from conflict detection.
        InetSocketAddress wildcard = new InetSocketAddress("0.0.0.0", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                50L,
                wildcard,
                new InetSocketAddress("0.0.0.0", 3888),
                new InetSocketAddress("0.0.0.0", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                51L,
                wildcard,
                new InetSocketAddress("0.0.0.0", 3888),
                new InetSocketAddress("0.0.0.0", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresMatchingIpv6WildcardAddresses()
            throws Exception {
        // Equivalence class: duplicate IPv6 wildcard addresses excluded from conflict detection.
        InetAddress anyIpv6 = InetAddress.getByAddress(new byte[16]);
        InetSocketAddress wildcard = new InetSocketAddress(anyIpv6, 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                52L,
                wildcard,
                new InetSocketAddress(anyIpv6, 3888),
                new InetSocketAddress(anyIpv6, 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                53L,
                wildcard,
                new InetSocketAddress(anyIpv6, 3888),
                new InetSocketAddress(anyIpv6, 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateIgnoresMatchingLoopbackAddresses() {
        // Equivalence class: duplicate loopback addresses excluded from conflict detection.
        InetSocketAddress loopback = new InetSocketAddress("127.0.0.1", 2888);

        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                60L,
                loopback,
                new InetSocketAddress("127.0.0.1", 3888),
                new InetSocketAddress("127.0.0.1", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                61L,
                loopback,
                new InetSocketAddress("127.0.0.1", 3888),
                new InetSocketAddress("127.0.0.1", 2181),
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateHandlesNullClientAddresses() {
        // Equivalence class: both servers have absent optional client addresses.
        QuorumPeer.QuorumServer first = new QuorumPeer.QuorumServer(
                70L,
                new InetSocketAddress("192.0.2.70", 2888),
                new InetSocketAddress("192.0.2.70", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );
        QuorumPeer.QuorumServer second = new QuorumPeer.QuorumServer(
                71L,
                new InetSocketAddress("192.0.2.71", 2889),
                new InetSocketAddress("192.0.2.71", 3889),
                null,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    void checkAddressDuplicateRejectsNullServerArgument() {
        // Equivalence class: invalid null QuorumServer argument.
        QuorumPeer.QuorumServer server = createServer(
                80L,
                "192.0.2.80",
                2888,
                3888,
                2181,
                QuorumPeer.LearnerType.PARTICIPANT
        );

        assertThrows(
                NullPointerException.class,
                () -> server.checkAddressDuplicate(null)
        );
    }

    private static QuorumPeer.QuorumServer createServer(
            long id,
            String host,
            int quorumPort,
            int electionPort,
            int clientPort,
            QuorumPeer.LearnerType type
    ) {
        return new QuorumPeer.QuorumServer(
                id,
                new InetSocketAddress(host, quorumPort),
                new InetSocketAddress(host, electionPort),
                new InetSocketAddress(host, clientPort),
                type
        );
    }
}