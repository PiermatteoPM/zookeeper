package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;

import static org.junit.jupiter.api.Assertions.*;

public class QuorumServerTest2 {

    private static final String MULTI_ADDRESS_KEY =
            QuorumPeer.CONFIG_KEY_MULTI_ADDRESS_ENABLED;

    private static final String CANONICALIZE_KEY =
            QuorumPeer.CONFIG_KEY_KERBEROS_CANONICALIZE_HOST_NAMES;

    @AfterEach
    void cleanupSystemProperties() {
        System.clearProperty(MULTI_ADDRESS_KEY);
        System.clearProperty(CANONICALIZE_KEY);
    }

    @Test
    void shouldCreateParticipantFromValidThreePartConfig()
            throws QuorumPeerConfig.ConfigException {

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(1L, "localhost:2888:3888");

        assertEquals(1L, server.id);
        assertEquals("localhost", server.hostname);
        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
        assertNull(server.clientAddr);
    }

    @Test
    void shouldCreateObserverWhenRoleSpecified()
            throws QuorumPeerConfig.ConfigException {

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(2L, "localhost:2888:3888:observer");

        assertEquals(QuorumPeer.LearnerType.OBSERVER, server.type);
        assertEquals("localhost", server.hostname);
    }

    @Test
    void shouldAcceptParticipantRoleCaseInsensitively()
            throws QuorumPeerConfig.ConfigException {

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(3L, "localhost:2888:3888:PaRtIcIpAnT");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldParseClientPortOnlyAndUseWildcardHost()
            throws QuorumPeerConfig.ConfigException {

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(4L, "localhost:2888:3888;2181");

        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
    }

    @Test
    void shouldParseExplicitClientHostAndPort()
            throws QuorumPeerConfig.ConfigException {

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(5L, "localhost:2888:3888;127.0.0.1:2181");

        InetSocketAddress clientAddr = server.clientAddr;

        assertNotNull(clientAddr);
        assertEquals(2181, clientAddr.getPort());
        assertEquals("127.0.0.1", clientAddr.getHostString());
    }

    @Test
    void shouldRejectUnknownPeerType() {

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        6L,
                        "localhost:2888:3888:leader")
        );

        assertTrue(ex.getMessage().contains("Unrecognised peertype"));
    }

    @Test
    void shouldRejectWhenPortsAreEqual() {

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        7L,
                        "localhost:2888:2888")
        );

        assertTrue(ex.getMessage().contains("Client and election port must be different"));
    }

    @Test
    void shouldRejectNonNumericQuorumPort() {

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        8L,
                        "localhost:abc:3888")
        );

        assertTrue(ex.getMessage().contains("Address unresolved"));
        assertTrue(ex.getMessage().contains("localhost:abc"));
    }

    @Test
    void shouldRejectNonNumericElectionPort() {

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        9L,
                        "localhost:2888:def")
        );

        assertTrue(ex.getMessage().contains("Address unresolved"));
        assertTrue(ex.getMessage().contains("localhost:def"));
    }

    @Test
    void shouldRejectNonNumericClientPort() {

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        10L,
                        "localhost:2888:3888;localhost:notANumber")
        );

        assertTrue(ex.getMessage().contains("Address unresolved"));
    }

    @Test
    void shouldRejectTooFewServerParts() {

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        11L,
                        "localhost:2888")
        );
    }

    @Test
    void shouldRejectTooManyServerParts() {

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        12L,
                        "localhost:2888:3888:participant:extra")
        );
    }

    @Test
    void shouldRejectTooManyClientParts() {

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        13L,
                        "localhost:2888:3888;h1:2181:extra")
        );
    }

    @Test
    void shouldRejectMoreThanOneSemicolonSection() {

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        14L,
                        "localhost:2888:3888;2181;2191")
        );
    }

    @Test
    void shouldRejectMultipleAddressesWhenFeatureDisabled() {

        System.setProperty(MULTI_ADDRESS_KEY, "false");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        15L,
                        "host1:2888:3888|host2:2889:3889")
        );

        assertTrue(ex.getMessage().contains("Multiple address feature is disabled"));
    }

    @Test
    void shouldAllowMultipleAddressesWithSameRoleWhenEnabled()
            throws QuorumPeerConfig.ConfigException {

        System.setProperty(MULTI_ADDRESS_KEY, "true");

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        16L,
                        "host1:2888:3888:participant|host2:2889:3889:participant");

        assertEquals(QuorumPeer.LearnerType.PARTICIPANT, server.type);
    }

    @Test
    void shouldRejectMultipleAddressesWithDifferentRoles() {

        System.setProperty(MULTI_ADDRESS_KEY, "true");

        QuorumPeerConfig.ConfigException ex = assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        17L,
                        "host1:2888:3888:participant|host2:2889:3889:observer")
        );

        assertTrue(ex.getMessage().contains("Multiple addresses should have similar roles"));
    }

    @Test
    void shouldSupportIpv6AddressWithClientConfig()
            throws QuorumPeerConfig.ConfigException {

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        18L,
                        "[::1]:2888:3888;[::1]:2181");

        assertNotNull(server);
        assertNotNull(server.clientAddr);
        assertEquals(2181, server.clientAddr.getPort());
    }

    @Test
    void shouldRejectMalformedIpv6WithoutClosingBracket() {

        assertThrows(
                QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        19L,
                        "[::1:2888:3888")
        );
    }

    @Test
    void shouldRejectEmptyAddressString() {

        assertThrows(
                Exception.class,
                () -> new QuorumPeer.QuorumServer(
                        20L,
                        "")
        );
    }

    @Test
    void shouldPreserveServerId()
            throws QuorumPeerConfig.ConfigException {

        long sid = Long.MAX_VALUE;

        QuorumPeer.QuorumServer server =
                new QuorumPeer.QuorumServer(
                        sid,
                        "localhost:2888:3888");

        assertEquals(sid, server.id);
    }
}