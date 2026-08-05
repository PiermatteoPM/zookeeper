package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuorumServerTest {

    @AfterEach
    void clearProperties() {
        System.clearProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES);
        System.clearProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED);
    }

    @Test
    void constructorShouldParseValidParticipantConfiguration() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:2888:3888");

        assertEquals(1L, server.id);
        assertEquals("localhost", server.hostname);
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertNull(server.clientAddr);
    }

    @Test
    void constructorShouldParseObserverConfiguration() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, "localhost:2888:3888:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals("localhost", server.hostname);
    }

    @Test
    void constructorShouldParseClientAddressWithHost() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        3L,
                        "localhost:2888:3888;127.0.0.1:2181");

        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
        assertEquals("127.0.0.1", server.clientAddr.getHostString());
    }

    @Test
    void constructorShouldParseClientPortOnlyUsingWildcardHost() throws Exception {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        4L,
                        "localhost:2888:3888;2181");

        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
        assertEquals("0.0.0.0", server.clientAddr.getHostString());
    }

    @Test
    void constructorShouldRejectTooFewServerParts() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(5L, "localhost:2888"));
    }

    @Test
    void constructorShouldRejectTooManyServerParts() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        6L,
                        "localhost:1:2:participant:extra"));
    }

    @Test
    void constructorShouldRejectInvalidServerPort() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        7L,
                        "localhost:notANumber:3888"));

        assertTrue(ex.getMessage().contains("Address unresolved"));
    }

    @Test
    void constructorShouldRejectInvalidElectionPort() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        8L,
                        "localhost:2888:notANumber"));

        assertTrue(ex.getMessage().contains("Address unresolved"));
    }

    @Test
    void constructorShouldRejectSameQuorumAndElectionPorts() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        9L,
                        "localhost:2888:2888"));

        assertTrue(ex.getMessage().contains("Client and election port must be different"));
    }

    @Test
    void constructorShouldRejectUnknownLearnerType() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        10L,
                        "localhost:2888:3888:invalidType"));

        assertTrue(ex.getMessage().contains("Unrecognised peertype"));
    }

    @Test
    void constructorShouldRejectMalformedClientConfig() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        11L,
                        "localhost:2888:3888;host:2181:extra"));
    }

    @Test
    void constructorShouldRejectMoreThanOneClientSeparator() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        12L,
                        "localhost:2888:3888;2181;extra"));
    }

    @Test
    void constructorShouldRejectMultipleAddressesWhenFeatureDisabled() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "false");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        13L,
                        "host1:2888:3888|host2:2889:3889"));

        assertTrue(ex.getMessage().contains("Multiple address feature is disabled"));
    }

    @Test
    void constructorShouldRejectMixedRolesAcrossMultipleAddresses() {
        System.setProperty(QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES, "false");
        System.setProperty(QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED, "true");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        14L,
                        "host1:2888:3888:participant|host2:2889:3889:observer"));

        assertTrue(ex.getMessage().contains("Multiple addresses should have similar roles"));
    }
}