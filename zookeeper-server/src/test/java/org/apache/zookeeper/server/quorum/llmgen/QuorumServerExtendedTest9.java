package org.apache.zookeeper.server.quorum.llmgen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.net.InetAddress;
import java.net.InetSocketAddress;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.junit.jupiter.api.Test;

public class QuorumServerExtendedTest9 {

    private static InetSocketAddress unresolved(String host, int port) {
        return InetSocketAddress.createUnresolved(host, port);
    }

    private static InetSocketAddress resolved(String address, int port) {
        try {
            return new InetSocketAddress(InetAddress.getByName(address), port);
        } catch (Exception e) {
            throw new AssertionError("Unable to create test address " + address, e);
        }
    }

    // Step 1, case 1: the single-address constructor accepts a null quorum address.
    @Test
    public void constructorAllowsNullQuorumAddress() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, (InetSocketAddress) null);

        assertEquals(1L, server.getId());
        assertTrue(server.addr.isEmpty());
        assertTrue(server.electionAddr.isEmpty());
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    // Step 1, case 2: quorum and election addresses may both be absent.
    @Test
    public void constructorAllowsNullQuorumAndElectionAddresses() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, null, null);

        assertTrue(server.addr.isEmpty());
        assertTrue(server.electionAddr.isEmpty());
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    // Step 1, case 3: the optional client address may be absent.
    @Test
    public void constructorAllowsNullClientAddress() {
        InetSocketAddress quorum = unresolved("server.example", 2888);
        InetSocketAddress election = unresolved("server.example", 3888);

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(3L, quorum, election, (InetSocketAddress) null);

        assertEquals(quorum, server.addr.getAllAddresses().iterator().next());
        assertEquals(election, server.electionAddr.getAllAddresses().iterator().next());
        assertEquals(null, server.clientAddr);
    }

    // Step 1, case 4: recreateSocketAddresses returns safely when quorum addresses are empty.
    @Test
    public void recreateSocketAddressesReturnsWhenQuorumAddressIsEmpty() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(4L, null, unresolved("server.example", 3888));

        assertDoesNotThrow(server::recreateSocketAddresses);
        assertTrue(server.addr.isEmpty());
    }

    // Step 1, case 5: recreateSocketAddresses returns safely when election addresses are empty.
    @Test
    public void recreateSocketAddressesReturnsWhenElectionAddressIsEmpty() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(5L, unresolved("server.example", 2888), null);

        assertDoesNotThrow(server::recreateSocketAddresses);
        assertTrue(server.electionAddr.isEmpty());
    }

    // Step 1, case 6: delimitedHostString leaves a normal hostname unchanged.
    @Test
    public void delimitedHostStringLeavesHostnameUndelimited() {
        InetSocketAddress address = unresolved("server.example", 2888);

        assertEquals(
                "server.example",
                QuorumPeer.QuorumServer.delimitedHostString(address));
    }

    // Step 1, case 7: delimitedHostString encloses an IPv6 literal in brackets.
    @Test
    public void delimitedHostStringBracketsIpv6Literal() {
        InetSocketAddress address = unresolved("2001:db8::1", 2888);

        assertEquals(
                "[2001:db8::1]",
                QuorumPeer.QuorumServer.delimitedHostString(address));
    }

    // Step 1, case 8: delimitedHostString rejects a null argument.
    @Test
    public void delimitedHostStringRejectsNullAddress() {
        assertThrows(
                NullPointerException.class,
                () -> QuorumPeer.QuorumServer.delimitedHostString(null));
    }

    // Step 2, case 1: equals rejects null before comparing any fields.
    @Test
    public void equalsReturnsFalseForNull() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(10L, unresolved("a.example", 2888));

        assertFalse(server.equals(null));
    }

    // Step 2, case 2: equals rejects an object that is not a QuorumServer.
    @Test
    public void equalsReturnsFalseForDifferentObjectType() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(10L, unresolved("a.example", 2888));

        assertFalse(server.equals("not a quorum server"));
    }

    // Step 2, case 3: equals returns true for the same object.
    @Test
    public void equalsReturnsTrueForSameInstance() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(10L, unresolved("a.example", 2888));

        assertTrue(server.equals(server));
    }

    // Step 2, case 4: the first field comparison rejects different server IDs.
    @Test
    public void equalsReturnsFalseWhenIdDiffers() {
        InetSocketAddress quorum = unresolved("a.example", 2888);
        InetSocketAddress election = unresolved("a.example", 3888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(10L, quorum, election, (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(11L, quorum, election, (InetSocketAddress) null);

        assertNotEquals(first, second);
    }

    // Step 2, case 5: the initial comparison also rejects different learner types.
    @Test
    public void equalsReturnsFalseWhenLearnerTypeDiffers() {
        InetSocketAddress quorum = unresolved("a.example", 2888);
        InetSocketAddress election = unresolved("a.example", 3888);

        QuorumPeer.QuorumServer participant =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        election,
                        null,
                        QuorumPeer.LearnerType.PARTICIPANT);
        QuorumPeer.QuorumServer observer =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        election,
                        null,
                        QuorumPeer.LearnerType.OBSERVER);

        assertNotEquals(participant, observer);
    }

    // Step 2, case 6: after ID and type match, equals rejects different quorum addresses.
    @Test
    public void equalsReturnsFalseWhenQuorumAddressDiffers() {
        InetSocketAddress election = unresolved("a.example", 3888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        10L,
                        unresolved("a.example", 2888),
                        election,
                        (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        10L,
                        unresolved("b.example", 2888),
                        election,
                        (InetSocketAddress) null);

        assertNotEquals(first, second);
    }

    // Step 2, case 7: after quorum addresses match, equals rejects different election addresses.
    @Test
    public void equalsReturnsFalseWhenElectionAddressDiffers() {
        InetSocketAddress quorum = unresolved("a.example", 2888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        unresolved("a.example", 3888),
                        (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        unresolved("b.example", 3888),
                        (InetSocketAddress) null);

        assertNotEquals(first, second);
    }

    // Step 2, case 8: the final comparison treats two null client addresses as equal.
    @Test
    public void equalsReturnsTrueWhenBothClientAddressesAreNull() {
        InetSocketAddress quorum = unresolved("a.example", 2888);
        InetSocketAddress election = unresolved("a.example", 3888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(10L, quorum, election, (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(10L, quorum, election, (InetSocketAddress) null);

        assertEquals(first, second);
        assertEquals(second, first);
    }

    // Step 2, case 9: the final comparison rejects null versus non-null client addresses.
    @Test
    public void equalsReturnsFalseWhenOnlyFirstClientAddressIsNull() {
        InetSocketAddress quorum = unresolved("a.example", 2888);
        InetSocketAddress election = unresolved("a.example", 3888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(10L, quorum, election, (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        election,
                        unresolved("client.example", 2181));

        assertNotEquals(first, second);
    }

    // Step 2, case 10: null handling in the final comparison is symmetric.
    @Test
    public void equalsReturnsFalseWhenOnlySecondClientAddressIsNull() {
        InetSocketAddress quorum = unresolved("a.example", 2888);
        InetSocketAddress election = unresolved("a.example", 3888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        election,
                        unresolved("client.example", 2181));
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(10L, quorum, election, (InetSocketAddress) null);

        assertNotEquals(first, second);
    }

    // Step 2, case 11: non-null but different client addresses are not equal.
    @Test
    public void equalsReturnsFalseWhenClientAddressesDiffer() {
        InetSocketAddress quorum = unresolved("a.example", 2888);
        InetSocketAddress election = unresolved("a.example", 3888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        election,
                        unresolved("client-a.example", 2181));
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        election,
                        unresolved("client-b.example", 2181));

        assertNotEquals(first, second);
    }

    // Step 2, case 12: all compared fields being equal makes equals return true.
    @Test
    public void equalsReturnsTrueWhenAllComparedFieldsMatch() {
        InetSocketAddress quorum = unresolved("a.example", 2888);
        InetSocketAddress election = unresolved("a.example", 3888);
        InetSocketAddress client = unresolved("client.example", 2181);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        election,
                        client,
                        QuorumPeer.LearnerType.OBSERVER);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        10L,
                        quorum,
                        election,
                        client,
                        QuorumPeer.LearnerType.OBSERVER);

        assertEquals(first, second);
        assertEquals(second, first);
    }

    // Step 3, case 1: empty quorum and election address collections produce only the role.
    @Test
    public void toStringWithNoServerAddressesProducesParticipantRole() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(20L, null, null, (InetSocketAddress) null);

        assertEquals(":participant", server.toString());
    }

    // Step 3, case 2: participant is emitted after a complete quorum/election pair.
    @Test
    public void toStringIncludesParticipantRole() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        unresolved("server.example", 2888),
                        unresolved("server.example", 3888),
                        null,
                        QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(
                "server.example:2888:3888:participant",
                server.toString());
    }

    // Step 3, case 3: observer changes the role suffix.
    @Test
    public void toStringIncludesObserverRole() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        unresolved("server.example", 2888),
                        unresolved("server.example", 3888),
                        null,
                        QuorumPeer.LearnerType.OBSERVER);

        assertEquals(
                "server.example:2888:3888:observer",
                server.toString());
    }

    // Step 3, case 4: a null learner type causes no role suffix to be appended.
    @Test
    public void toStringOmitsRoleWhenLearnerTypeIsNull() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        unresolved("server.example", 2888),
                        unresolved("server.example", 3888),
                        null,
                        null);

        assertEquals("server.example:2888:3888", server.toString());
    }

    // Step 3, case 5: a non-static client address is appended after a semicolon.
    @Test
    public void toStringIncludesNonStaticClientAddress() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        unresolved("server.example", 2888),
                        unresolved("server.example", 3888),
                        unresolved("client.example", 2181),
                        QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(
                "server.example:2888:3888:participant;client.example:2181",
                server.toString());
    }

    // Step 3, case 6: a static client address is deliberately suppressed.
    @Test
    public void toStringOmitsStaticClientAddress() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        unresolved("server.example", 2888),
                        unresolved("server.example", 3888),
                        unresolved("client.example", 2181),
                        QuorumPeer.LearnerType.PARTICIPANT);
        server.isClientAddrFromStatic = true;

        assertEquals(
                "server.example:2888:3888:participant",
                server.toString());
    }

    // Step 3, case 7: IPv6 quorum and client hosts are bracket-delimited.
    @Test
    public void toStringBracketsIpv6Hosts() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        unresolved("2001:db8::1", 2888),
                        unresolved("2001:db8::1", 3888),
                        unresolved("2001:db8::2", 2181),
                        QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(
                "[2001:db8::1]:2888:3888:participant;[2001:db8::2]:2181",
                server.toString());
    }

    // Step 3, case 8: an absent quorum side prevents the host/port tuple from being emitted.
    @Test
    public void toStringOmitsAddressTupleWhenQuorumAddressIsAbsent() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        null,
                        unresolved("server.example", 3888),
                        null,
                        QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(":participant", server.toString());
    }

    // Step 3, case 9: an absent election side also prevents the tuple from being emitted.
    @Test
    public void toStringOmitsAddressTupleWhenElectionAddressIsAbsent() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        20L,
                        unresolved("server.example", 2888),
                        null,
                        null,
                        QuorumPeer.LearnerType.PARTICIPANT);

        assertEquals(":participant", server.toString());
    }

    // Step 4, case 1: duplicate checking accepts distinct non-special addresses.
    @Test
    public void checkAddressDuplicateAcceptsDistinctAddresses() {
        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        30L,
                        resolved("192.0.2.1", 2888),
                        resolved("192.0.2.1", 3888),
                        resolved("192.0.2.1", 2181));
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        31L,
                        resolved("192.0.2.2", 2888),
                        resolved("192.0.2.2", 3888),
                        resolved("192.0.2.2", 2181));

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 2: an exact non-special quorum-address duplicate is rejected.
    @Test
    public void checkAddressDuplicateRejectsMatchingQuorumAddress() {
        InetSocketAddress duplicate = resolved("192.0.2.10", 2888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        30L,
                        duplicate,
                        resolved("192.0.2.10", 3888),
                        (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        31L,
                        duplicate,
                        resolved("192.0.2.11", 3888),
                        (InetSocketAddress) null);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 3: duplicate detection compares addresses across their logical roles.
    @Test
    public void checkAddressDuplicateRejectsCrossRoleMatch() {
        InetSocketAddress duplicate = resolved("192.0.2.20", 2888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        30L,
                        duplicate,
                        resolved("192.0.2.20", 3888),
                        (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        31L,
                        resolved("192.0.2.21", 2888),
                        resolved("192.0.2.21", 3888),
                        duplicate);

        assertThrows(
                KeeperException.BadArgumentsException.class,
                () -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 4: wildcard addresses are excluded from duplicate detection.
    @Test
    public void checkAddressDuplicateIgnoresWildcardAddresses() {
        InetSocketAddress wildcard = resolved("0.0.0.0", 2888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(30L, wildcard, (InetSocketAddress) null, (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(31L, wildcard, (InetSocketAddress) null, (InetSocketAddress) null);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 5: IPv6 wildcard addresses are also excluded.
    @Test
    public void checkAddressDuplicateIgnoresIpv6WildcardAddresses() {
        InetSocketAddress wildcard = resolved("::", 2888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(30L, wildcard, (InetSocketAddress) null, (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(31L, wildcard, (InetSocketAddress) null, (InetSocketAddress) null);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 6: IPv4 loopback addresses are excluded from duplicate detection.
    @Test
    public void checkAddressDuplicateIgnoresIpv4LoopbackAddresses() {
        InetSocketAddress loopback = resolved("127.0.0.1", 2888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(30L, loopback, null, (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(31L, loopback, null, (InetSocketAddress) null);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 7: IPv6 loopback addresses are excluded from duplicate detection.
    @Test
    public void checkAddressDuplicateIgnoresIpv6LoopbackAddresses() {
        InetSocketAddress loopback = resolved("::1", 2888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(30L, loopback, null, (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(31L, loopback, null, (InetSocketAddress) null);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 8: unresolved addresses are excluded because getAddress() returns null.
    @Test
    public void checkAddressDuplicateIgnoresUnresolvedAddresses() {
        InetSocketAddress unresolved = unresolved("unresolvable.invalid", 2888);

        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(30L, unresolved, null, (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(31L, unresolved, null, (InetSocketAddress) null);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 9: absent client addresses are excluded without causing an error.
    @Test
    public void checkAddressDuplicateIgnoresAbsentClientAddresses() {
        QuorumPeer.QuorumServer first =
                new QuorumPeer.QuorumServer(
                        30L,
                        resolved("192.0.2.30", 2888),
                        resolved("192.0.2.30", 3888),
                        (InetSocketAddress) null);
        QuorumPeer.QuorumServer second =
                new QuorumPeer.QuorumServer(
                        31L,
                        resolved("192.0.2.31", 2888),
                        resolved("192.0.2.31", 3888),
                        (InetSocketAddress) null);

        assertDoesNotThrow(() -> first.checkAddressDuplicate(second));
    }

    // Step 4, case 10: a null QuorumServer argument is not accepted.
    @Test
    public void checkAddressDuplicateRejectsNullServer() {
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        30L,
                        resolved("192.0.2.40", 2888),
                        resolved("192.0.2.40", 3888),
                        (InetSocketAddress) null);

        assertThrows(
                NullPointerException.class,
                () -> server.checkAddressDuplicate(null));
    }
}