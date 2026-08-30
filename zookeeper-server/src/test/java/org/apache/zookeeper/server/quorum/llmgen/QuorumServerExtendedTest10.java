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
import org.junit.jupiter.api.Test;

/**
 * Extended tests for {@link QuorumPeer.QuorumServer}.
 *
 * <p>Equivalence classes identified by the three testing experts:</p>
 *
 * <ul>
 *   <li>
 *     {@code checkAddressDuplicate}: no overlapping addresses, quorum address
 *     overlap, election address overlap, client address overlap, overlap across
 *     address roles, wildcard/loopback/unresolved addresses, and null input.
 *   </li>
 *   <li>
 *     {@code equals}: same instance, equivalent server, null, unrelated type,
 *     different id, different learner type, different quorum addresses,
 *     different election addresses, and all client-address null/equality
 *     combinations.
 *   </li>
 *   <li>
 *     {@code toString}: participant and observer roles, client address included
 *     or suppressed, empty addresses, deterministic multi-address ordering,
 *     IPv4/host-name formatting, IPv6 delimiter formatting, and mismatched
 *     quorum/election address counts.
 *   </li>
 * </ul>
 *
 * <p>All tests are top-level methods because older Maven Surefire versions may
 * not discover tests contained only in nested JUnit 5 test classes.</p>
 */
public class QuorumServerExtendedTest10 {

    private static InetSocketAddress resolvedAddress(
            String hostname,
            int lastOctet,
            int port) {
        try {
            InetAddress address = InetAddress.getByAddress(
                    hostname,
                    new byte[] {(byte) 10, 20, 30, (byte) lastOctet});
            return new InetSocketAddress(address, port);
        } catch (UnknownHostException e) {
            throw new AssertionError("Failed to create test address", e);
        }
    }

    private static QuorumPeer.QuorumServer server(
            long id,
            InetSocketAddress quorumAddress,
            InetSocketAddress electionAddress,
            InetSocketAddress clientAddress,
            QuorumPeer.LearnerType type) {
        return new QuorumPeer.QuorumServer(
                id,
                quorumAddress,
                electionAddress,
                clientAddress,
                type);
    }

    /*
     * Step 1, Expert A:
     * Basic checkAddressDuplicate equivalence class with disjoint addresses.
     */
    @Test
    public void checkAddressDuplicateAllowsCompletelyDistinctServers() {
        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("first-quorum", 1, 2888),
                resolvedAddress("first-election", 1, 3888),
                resolvedAddress("first-client", 1, 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                resolvedAddress("second-quorum", 2, 2888),
                resolvedAddress("second-election", 2, 3888),
                resolvedAddress("second-client", 2, 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    /*
     * Step 1, Expert B:
     * Basic equals equivalence class for two independently created servers with
     * equal fields.
     */
    @Test
    public void equalsReturnsTrueForEquivalentServers() {
        QuorumPeer.QuorumServer first = server(
                7L,
                resolvedAddress("quorum", 7, 2888),
                resolvedAddress("election", 7, 3888),
                resolvedAddress("client", 7, 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                7L,
                resolvedAddress("quorum-copy", 7, 2888),
                resolvedAddress("election-copy", 7, 3888),
                resolvedAddress("client-copy", 7, 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(first, second);
        assertEquals(second, first);
    }

    /*
     * Step 1, Expert C:
     * Basic toString equivalence class for a participant with all addresses.
     */
    @Test
    public void toStringFormatsParticipantWithClientAddress() {
        QuorumPeer.QuorumServer quorumServer = server(
                1L,
                InetSocketAddress.createUnresolved("server.example", 2888),
                InetSocketAddress.createUnresolved("server.example", 3888),
                InetSocketAddress.createUnresolved("client.example", 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(
                "server.example:2888:3888:participant;client.example:2181",
                quorumServer.toString());
    }

    /*
     * Step 2, Expert A:
     * A duplicate quorum address must be rejected.
     */
    @Test
    public void checkAddressDuplicateRejectsDuplicateQuorumAddress() {
        InetSocketAddress duplicate = resolvedAddress("duplicate", 10, 2888);

        QuorumPeer.QuorumServer first = server(
                1L,
                duplicate,
                resolvedAddress("first-election", 11, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                resolvedAddress("duplicate-alias", 10, 2888),
                resolvedAddress("second-election", 12, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        KeeperException.BadArgumentsException exception =
                assertThrows(
                        KeeperException.BadArgumentsException.class,
                        () -> first.checkAddressDuplicate(second));

        assertTrue(exception.getMessage().contains("server.1"));
        assertTrue(exception.getMessage().contains("server.2"));
        assertTrue(exception.getMessage().contains("conflicts"));
    }

    /*
     * Step 2, Expert B:
     * Equality must reject objects from another equivalence class.
     */
    @Test
    public void equalsRejectsNullAndUnrelatedObjects() {
        QuorumPeer.QuorumServer quorumServer = server(
                1L,
                resolvedAddress("quorum", 20, 2888),
                resolvedAddress("election", 20, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertFalse(quorumServer.equals(null));
        assertFalse(quorumServer.equals("not a quorum server"));
    }

    /*
     * Step 2, Expert C:
     * Observer formatting is distinct from participant formatting.
     */
    @Test
    public void toStringFormatsObserverRole() {
        QuorumPeer.QuorumServer quorumServer = server(
                2L,
                InetSocketAddress.createUnresolved("observer.example", 2888),
                InetSocketAddress.createUnresolved("observer.example", 3888),
                null,
                QuorumPeer.LearnerType.OBSERVER);

        assertEquals(
                "observer.example:2888:3888:observer",
                quorumServer.toString());
    }

    /*
     * Step 3, Expert A:
     * Duplicate detection must compare all address categories, not just
     * corresponding categories.
     */
    @Test
    public void checkAddressDuplicateRejectsQuorumAddressMatchingOtherClientAddress() {
        InetSocketAddress duplicate = resolvedAddress("shared", 30, 2999);

        QuorumPeer.QuorumServer first = server(
                1L,
                duplicate,
                resolvedAddress("first-election", 31, 3999),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                resolvedAddress("second-quorum", 32, 2888),
                resolvedAddress("second-election", 32, 3888),
                resolvedAddress("shared-client-alias", 30, 2999),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    /*
     * Step 3, Expert B:
     * Exercise every relevant field that can make equals return false.
     */
    @Test
    public void equalsReturnsFalseForDifferentId() {
        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("quorum", 40, 2888),
                resolvedAddress("election", 40, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                resolvedAddress("quorum-copy", 40, 2888),
                resolvedAddress("election-copy", 40, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    public void equalsReturnsFalseForDifferentLearnerType() {
        QuorumPeer.QuorumServer participant = server(
                1L,
                resolvedAddress("quorum", 41, 2888),
                resolvedAddress("election", 41, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer observer = server(
                1L,
                resolvedAddress("quorum-copy", 41, 2888),
                resolvedAddress("election-copy", 41, 3888),
                null,
                QuorumPeer.LearnerType.OBSERVER);

        assertNotEquals(participant, observer);
    }

    @Test
    public void equalsReturnsFalseForDifferentQuorumAddress() {
        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("first-quorum", 42, 2888),
                resolvedAddress("election", 42, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                1L,
                resolvedAddress("second-quorum", 43, 2888),
                resolvedAddress("election-copy", 42, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    public void equalsReturnsFalseForDifferentElectionAddress() {
        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("quorum", 44, 2888),
                resolvedAddress("first-election", 44, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                1L,
                resolvedAddress("quorum-copy", 44, 2888),
                resolvedAddress("second-election", 45, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    public void equalsReturnsFalseWhenOnlyFirstClientAddressIsNull() {
        QuorumPeer.QuorumServer withoutClient = server(
                1L,
                resolvedAddress("quorum", 46, 2888),
                resolvedAddress("election", 46, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer withClient = server(
                1L,
                resolvedAddress("quorum-copy", 46, 2888),
                resolvedAddress("election-copy", 46, 3888),
                resolvedAddress("client", 46, 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(withoutClient, withClient);
        assertNotEquals(withClient, withoutClient);
    }

    @Test
    public void equalsReturnsFalseForDifferentNonNullClientAddresses() {
        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("quorum", 47, 2888),
                resolvedAddress("election", 47, 3888),
                resolvedAddress("first-client", 47, 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                1L,
                resolvedAddress("quorum-copy", 47, 2888),
                resolvedAddress("election-copy", 47, 3888),
                resolvedAddress("second-client", 48, 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertNotEquals(first, second);
    }

    @Test
    public void equalsReturnsTrueForSameInstanceAndForTwoNullClientAddresses() {
        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("quorum", 49, 2888),
                resolvedAddress("election", 49, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                1L,
                resolvedAddress("quorum-copy", 49, 2888),
                resolvedAddress("election-copy", 49, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(first, first);
        assertEquals(first, second);
    }

    /*
     * Step 3, Expert C:
     * Test deterministic ordering and client-address suppression.
     */
    @Test
    public void toStringSortsMultipleAddressesByHostName() {
        QuorumPeer.QuorumServer quorumServer = server(
                9L,
                InetSocketAddress.createUnresolved("z-host", 2889),
                InetSocketAddress.createUnresolved("z-host", 3889),
                InetSocketAddress.createUnresolved("client-host", 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        quorumServer.addr.addAddress(
                InetSocketAddress.createUnresolved("a-host", 2888));
        quorumServer.electionAddr.addAddress(
                InetSocketAddress.createUnresolved("a-host", 3888));

        assertEquals(
                "a-host:2888:3888|z-host:2889:3889"
                        + ":participant;client-host:2181",
                quorumServer.toString());
    }

    @Test
    public void toStringOmitsClientAddressWhenItCameFromStaticConfiguration() {
        QuorumPeer.QuorumServer quorumServer = server(
                3L,
                InetSocketAddress.createUnresolved("server.example", 2888),
                InetSocketAddress.createUnresolved("server.example", 3888),
                InetSocketAddress.createUnresolved("client.example", 2181),
                QuorumPeer.LearnerType.PARTICIPANT);
        quorumServer.isClientAddrFromStatic = true;

        assertEquals(
                "server.example:2888:3888:participant",
                quorumServer.toString());
    }

    /*
     * Step 4, Expert A:
     * Special addresses are intentionally excluded from duplicate checking.
     */
    @Test
    public void checkAddressDuplicateIgnoresWildcardAddresses() {
        InetSocketAddress wildcard = new InetSocketAddress("0.0.0.0", 2888);

        QuorumPeer.QuorumServer first = server(
                1L,
                wildcard,
                resolvedAddress("first-election", 60, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                wildcard,
                resolvedAddress("second-election", 61, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    public void checkAddressDuplicateIgnoresLoopbackAddresses() {
        InetSocketAddress loopback = new InetSocketAddress("127.0.0.1", 2888);

        QuorumPeer.QuorumServer first = server(
                1L,
                loopback,
                resolvedAddress("first-election", 62, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                loopback,
                resolvedAddress("second-election", 63, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    public void checkAddressDuplicateIgnoresUnresolvedAddresses() {
        InetSocketAddress unresolved =
                InetSocketAddress.createUnresolved("unresolved.invalid", 2888);

        QuorumPeer.QuorumServer first = server(
                1L,
                unresolved,
                resolvedAddress("first-election", 64, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                unresolved,
                resolvedAddress("second-election", 65, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    @Test
    public void checkAddressDuplicateRejectsDuplicateElectionAddress() {
        InetSocketAddress duplicateElection =
                resolvedAddress("shared-election", 66, 3888);

        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("first-quorum", 66, 2888),
                duplicateElection,
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                resolvedAddress("second-quorum", 67, 2888),
                resolvedAddress("shared-election-alias", 66, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    public void checkAddressDuplicateRejectsDuplicateClientAddress() {
        InetSocketAddress duplicateClient =
                resolvedAddress("shared-client", 68, 2181);

        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("first-quorum", 68, 2888),
                resolvedAddress("first-election", 68, 3888),
                duplicateClient,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                2L,
                resolvedAddress("second-quorum", 69, 2888),
                resolvedAddress("second-election", 69, 3888),
                resolvedAddress("shared-client-alias", 68, 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    @Test
    public void checkAddressDuplicateThrowsNullPointerExceptionForNullServer() {
        QuorumPeer.QuorumServer quorumServer = server(
                1L,
                resolvedAddress("quorum", 70, 2888),
                resolvedAddress("election", 70, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertThrows(
                NullPointerException.class,
                () -> quorumServer.checkAddressDuplicate(null));
    }

    /*
     * Step 4, Expert B:
     * Ensure equality responds to public-field mutation after construction.
     */
    @Test
    public void equalsReturnsFalseAfterClientAddressMutation() {
        QuorumPeer.QuorumServer first = server(
                1L,
                resolvedAddress("quorum", 71, 2888),
                resolvedAddress("election", 71, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer second = server(
                1L,
                resolvedAddress("quorum-copy", 71, 2888),
                resolvedAddress("election-copy", 71, 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(first, second);

        second.clientAddr = resolvedAddress("client", 71, 2181);

        assertNotEquals(first, second);
    }

    /*
     * Step 4, Expert C:
     * Cover IPv6 delimiters, empty address collections, and the current
     * behavior for mismatched address-list sizes.
     */
    @Test
    public void toStringDelimitsIpv6AddressesWithBrackets() {
        QuorumPeer.QuorumServer quorumServer = server(
                4L,
                InetSocketAddress.createUnresolved("2001:db8::1", 2888),
                InetSocketAddress.createUnresolved("2001:db8::1", 3888),
                InetSocketAddress.createUnresolved("2001:db8::2", 2181),
                QuorumPeer.LearnerType.OBSERVER);

        assertEquals(
                "[2001:db8::1]:2888:3888:observer;[2001:db8::2]:2181",
                quorumServer.toString());
    }

    @Test
    public void toStringWithNoServerAddressesContainsOnlyRole() {
        QuorumPeer.QuorumServer participant = server(
                5L,
                null,
                null,
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        QuorumPeer.QuorumServer observer = server(
                6L,
                null,
                null,
                null,
                QuorumPeer.LearnerType.OBSERVER);

        assertEquals(":participant", participant.toString());
        assertEquals(":observer", observer.toString());
    }

    @Test
    public void toStringWithNoServerAddressesStillIncludesDynamicClientAddress() {
        QuorumPeer.QuorumServer quorumServer = server(
                7L,
                null,
                null,
                InetSocketAddress.createUnresolved("client.example", 2181),
                QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(
                ":participant;client.example:2181",
                quorumServer.toString());
    }

    @Test
    public void toStringThrowsWhenQuorumAddressesOutnumberElectionAddresses() {
        QuorumPeer.QuorumServer quorumServer = server(
                8L,
                InetSocketAddress.createUnresolved("a-host", 2888),
                InetSocketAddress.createUnresolved("a-host", 3888),
                null,
                QuorumPeer.LearnerType.PARTICIPANT);

        quorumServer.addr.addAddress(
                InetSocketAddress.createUnresolved("b-host", 2889));

        assertThrows(
                IndexOutOfBoundsException.class,
                quorumServer::toString);
    }
}