package org.apache.zookeeper.server.quorum.llmgen;

import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuorumServerTest3 {

    private static final long SID = 1L;

    @Test
    void acceptsSingleServerWithoutType() {
        assertDoesNotThrow(() ->
                new QuorumPeer.QuorumServer(SID, "host1:2888:3888"));
    }

    @Test
    void acceptsSingleParticipantServer() {
        assertDoesNotThrow(() ->
                new QuorumPeer.QuorumServer(SID, "host1:2888:3888:participant"));
    }

    @Test
    void acceptsSingleObserverServer() {
        assertDoesNotThrow(() ->
                new QuorumPeer.QuorumServer(SID, "host1:2888:3888:observer"));
    }

    @Test
    void acceptsMultipleServersSeparatedByPipe() {
        assertDoesNotThrow(() ->
                new QuorumPeer.QuorumServer(
                        SID,
                        "host1:2888:3888|host2:2889:3889|host3:2890:3890"));
    }

    @Test
    void acceptsMultipleServersWithTypes() {
        assertDoesNotThrow(() ->
                new QuorumPeer.QuorumServer(
                        SID,
                        "host1:2888:3888:participant|host2:2889:3889:observer"));
    }

    @Test
    void acceptsClientConfigWithHostAndPort() {
        assertDoesNotThrow(() ->
                new QuorumPeer.QuorumServer(
                        SID,
                        "host1:2888:3888;clientHost:2181"));
    }

    @Test
    void acceptsClientConfigWithPortOnly() {
        assertDoesNotThrow(() ->
                new QuorumPeer.QuorumServer(
                        SID,
                        "host1:2888:3888;2181"));
    }

    @Test
    void rejectsEmptyConfiguration() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(SID, ""));
    }

    @Test
    void rejectsMissingServerPort() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(SID, "host1:2888"));
    }

    @Test
    void rejectsMissingHost() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(SID, ":2888:3888"));
    }

    @Test
    void rejectsNonNumericPorts() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(SID, "host1:abc:3888"));
    }

    @Test
    void rejectsEqualPortsWithinSingleServerEntry() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(SID, "host1:2888:2888"));
    }

    @Test
    void rejectsUnknownServerType() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(SID, "host1:2888:3888:leader"));
    }

    @Test
    void rejectsTooManyFieldsInServerEntry() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(SID, "host1:2888:3888:participant:extra"));
    }

    @Test
    void rejectsMalformedPipeSeparatedEntry() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        SID,
                        "host1:2888:3888||host2:2889:3889"));
    }

    @Test
    void rejectsMalformedClientConfig() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        SID,
                        "host1:2888:3888;clientHost"));
    }

    @Test
    void rejectsMultipleClientSeparators() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        SID,
                        "host1:2888:3888;2181;2182"));
    }

    @Test
    void rejectsServerEntryMissingSecondPort() {
        assertThrows(QuorumPeerConfig.ConfigException.class,
                () -> new QuorumPeer.QuorumServer(
                        SID,
                        "host1:2888:"));
    }
}