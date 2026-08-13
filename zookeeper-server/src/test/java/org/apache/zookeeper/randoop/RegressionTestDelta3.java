package org.apache.zookeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestDelta3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1501");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.lang.String str18 = quorumServer17.toString();
        long long19 = quorumServer17.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.addr;
        quorumServer11.electionAddr = multipleAddresses20;
        quorumServer4.electionAddr = multipleAddresses20;
        java.lang.Object obj23 = null;
        boolean boolean24 = quorumServer4.equals(obj23);
        java.lang.String str25 = quorumServer4.toString();
        boolean boolean26 = quorumServer4.isClientAddrFromStatic;
        quorumServer4.isClientAddrFromStatic = false;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress30, inetSocketAddress31, inetSocketAddress32);
        boolean boolean35 = quorumServer33.equals((java.lang.Object) 0.0f);
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress37);
        java.net.InetSocketAddress inetSocketAddress39 = null;
        quorumServer38.clientAddr = inetSocketAddress39;
        quorumServer38.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress43, inetSocketAddress44, inetSocketAddress45);
        java.lang.String str47 = quorumServer46.toString();
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer52 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress49, inetSocketAddress50, inetSocketAddress51);
        java.lang.String str53 = quorumServer52.toString();
        long long54 = quorumServer52.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer52.addr;
        quorumServer46.electionAddr = multipleAddresses55;
        long long57 = quorumServer46.id;
        java.net.InetSocketAddress inetSocketAddress59 = null;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer62 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress59, inetSocketAddress60, inetSocketAddress61);
        java.lang.String str63 = quorumServer62.toString();
        long long64 = quorumServer62.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses65 = quorumServer62.addr;
        quorumServer46.addr = multipleAddresses65;
        quorumServer38.addr = multipleAddresses65;
        quorumServer33.addr = multipleAddresses65;
        quorumServer4.electionAddr = multipleAddresses65;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ":participant" + "'", str47, ":participant");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + ":participant" + "'", str53, ":participant");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 97L + "'", long54 == 97L);
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 97L + "'", long57 == 97L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + ":participant" + "'", str63, ":participant");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 97L + "'", long64 == 97L);
        org.junit.Assert.assertNotNull(multipleAddresses65);
    }
}

