package org.apache.zookeeper.server.quorum.llmgen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class QuorumServerTestDelta {

    private String previousMultiAddressEnabled;
    private boolean multiAddressPropertyChanged = false;

    private void setMultiAddressEnabled(String value) {
        previousMultiAddressEnabled = System.getProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        multiAddressPropertyChanged = true;
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, value);
    }

    @AfterEach
    void restoreSystemProperties() {
        if (!multiAddressPropertyChanged) {
            return;
        }

        if (previousMultiAddressEnabled == null) {
            System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
        } else {
            System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, previousMultiAddressEnabled);
        }

        multiAddressPropertyChanged = false;
        previousMultiAddressEnabled = null;
    }

    @Test
    void validSingleParticipantAddressWithClientPort() throws Exception {
        // Equivalence class: well-formed single server address with explicit participant role and client port.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "127.0.0.1:2888:3888:participant;2181");

        assertEquals(1L, server.getId());
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals(2181, server.clientAddr.getPort());
        assertEquals("0.0.0.0", server.clientAddr.getHostString());
    }

    @Test
    void validSingleObserverAddressWithClientHostAndPort() throws Exception {
        // Equivalence class: well-formed single server address with observer role and host:port client config.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, "127.0.0.1:2888:3888:observer;127.0.0.1:2181");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals("127.0.0.1", server.clientAddr.getHostString());
        assertEquals(2181, server.clientAddr.getPort());
    }

    @Test
    void validAddressWithoutClientConfigDefaultsToParticipant() throws Exception {
        // Equivalence class: well-formed single server address without client config and without role.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(3L, "127.0.0.1:2888:3888");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertNull(server.clientAddr);
    }

    @Test
    void missingElectionPortIsMalformed() {
        // Equivalence class: malformed server string with fewer than host:quorumPort:electionPort parts.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(4L, "127.0.0.1:2888"));
    }

    @Test
    void emptyAddressStringIsMalformed() {
        // Equivalence class: malformed empty server string.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(5L, ""));
    }

    @Test
    void extraServerPartIsMalformed() {
        // Equivalence class: malformed server string with more than four server parts.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(6L, "127.0.0.1:2888:3888:participant:extra"));
    }

    @Test
    void extraClientPartIsMalformed() {
        // Equivalence class: malformed client config with more than host:port parts.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(7L, "clientHost:2888:3888;clientHost:2181:extra"));
    }

    @Test
    void tooManyServerClientSectionsIsMalformed() {
        // Equivalence class: malformed string with more than server_config;client_config sections.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(8L, "127.0.0.1:2888:3888;2181;extra"));
    }

    @Test
    void nonNumericQuorumPortIsMalformed() {
        // Equivalence class: malformed server string with non-numeric quorum port.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(9L, "127.0.0.1:notANumber:3888"));
    }

    @Test
    void nonNumericElectionPortIsMalformed() {
        // Equivalence class: malformed server string with non-numeric election port.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(10L, "127.0.0.1:2888:notANumber"));
    }

    @Test
    void nonNumericClientPortIsMalformed() {
        // Equivalence class: malformed client config with non-numeric client port.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(11L, "127.0.0.1:2888:3888;clientHost:notANumber"));
    }

    @Test
    void unknownLearnerTypeIsMalformed() {
        // Equivalence class: malformed server string with invalid learner type.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(12L, "127.0.0.1:2888:3888:leader"));
    }

    @Test
    void quorumPortAndElectionPortMustBeDifferent() {
        // Equivalence class: invalid semantic configuration where quorum and election ports are equal.
        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(13L, "127.0.0.1:2888:2888"));
    }

    @Test
    void minimumAndMaximumValidPortsAreAccepted() throws Exception {
        // Boundary values: minimum valid port 0 and maximum valid port 65535.
        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(14L, "127.0.0.1:0:65535:participant;0");

        assertTrue(
                server.addr.getAllAddresses().stream().anyMatch(address -> address.getPort() == 0),
                "Expected quorum address set to contain port 0");

        assertTrue(
                server.electionAddr.getAllAddresses().stream().anyMatch(address -> address.getPort() == 65535),
                "Expected election address set to contain port 65535");

        assertEquals(0, server.clientAddr.getPort());
    }

    @Test
    void quorumPortBelowMinimumIsRejected() {
        // Boundary value: quorum port -1 is immediately below valid range.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(15L, "127.0.0.1:-1:3888"));
    }

    @Test
    void electionPortBelowMinimumIsRejected() {
        // Boundary value: election port -1 is immediately below valid range.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(16L, "127.0.0.1:2888:-1"));
    }

    @Test
    void clientPortBelowMinimumIsRejected() {
        // Boundary value: client port -1 is immediately below valid range.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(17L, "127.0.0.1:2888:3888;-1"));
    }

    @Test
    void quorumPortAboveMaximumIsRejected() {
        // Boundary value: quorum port 65536 is immediately above valid range.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(18L, "127.0.0.1:65536:3888"));
    }

    @Test
    void electionPortAboveMaximumIsRejected() {
        // Boundary value: election port 65536 is immediately above valid range.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(19L, "127.0.0.1:2888:65536"));
    }

    @Test
    void clientPortAboveMaximumIsRejected() {
        // Boundary value: client port 65536 is immediately above valid range.
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuorumPeer.QuorumServer(20L, "127.0.0.1:2888:3888;65536"));
    }

    @Test
    void multipleServerAddressesAreAcceptedWhenFeatureEnabled() throws Exception {
        // Equivalence class: well-formed multiple server addresses with consistent participant roles.
        setMultiAddressEnabled("true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        21L,
                        "127.0.0.1:2888:3888:participant|127.0.0.2:2889:3889:participant;2181");

        assertEquals(2, server.addr.getAllAddresses().size());
        assertEquals(2, server.electionAddr.getAllAddresses().size());
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertEquals(2181, server.clientAddr.getPort());
    }

    @Test
    void multipleServerAddressesAreRejectedWhenFeatureDisabled() {
        // Equivalence class: multiple server addresses while multi-address feature is disabled.
        setMultiAddressEnabled("false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        22L,
                        "127.0.0.1:2888:3888|127.0.0.2:2889:3889"));
    }

    @Test
    void multipleServerAddressesWithDifferentRolesAreRejected() {
        // Equivalence class: multiple server addresses with inconsistent learner roles.
        setMultiAddressEnabled("true");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        23L,
                        "127.0.0.1:2888:3888:participant|127.0.0.2:2889:3889:observer"));
    }
}