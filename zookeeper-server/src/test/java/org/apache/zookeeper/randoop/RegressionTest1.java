package org.apache.zookeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType7);
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress10, inetSocketAddress11, learnerType12);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer13.type = learnerType14;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        quorumServer8.checkAddressDuplicate(quorumServer13);
        quorumServer13.id = ' ';
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        quorumServer13.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, learnerType29);
        java.lang.Class<?> wildcardClass32 = learnerType29.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        quorumServer4.id = 52L;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        quorumServer4.clientAddr = inetSocketAddress11;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 100, true);
        workerService3.stop();
        workerService3.join((long) 100);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        quorumServer9.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress18, inetSocketAddress19, learnerType20);
        quorumServer21.isClientAddrFromStatic = true;
        java.lang.String str24 = quorumServer21.hostname;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress26);
        quorumServer27.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.addr;
        quorumServer21.electionAddr = multipleAddresses30;
        quorumServer9.electionAddr = multipleAddresses30;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer9.addr;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(multipleAddresses33);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        quorumServer4.isClientAddrFromStatic = true;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType9 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType9.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, false);
        workerService3.stop();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress12, inetSocketAddress13, learnerType14);
        quorumServer15.hostname = "hi!";
        quorumServer15.id = (byte) 100;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer15.addr;
        quorumServer4.addr = multipleAddresses20;
        boolean boolean23 = quorumServer4.equals((java.lang.Object) (-1L));
        java.net.InetSocketAddress inetSocketAddress24 = quorumServer4.clientAddr;
        java.lang.String str25 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inetSocketAddress24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(52L, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer2.checkAddressDuplicate(quorumServer7);
        quorumServer2.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress9, inetSocketAddress10, learnerType11);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        quorumServer12.type = learnerType13;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer12.electionAddr;
        long long16 = quorumServer12.id;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress18, inetSocketAddress19, inetSocketAddress20, learnerType21);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer22.electionAddr;
        quorumServer22.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer22.addr;
        quorumServer12.addr = multipleAddresses26;
        quorumServer4.electionAddr = multipleAddresses26;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress37, inetSocketAddress38, inetSocketAddress39, learnerType40);
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress43, inetSocketAddress44, learnerType45);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType47 = null;
        quorumServer46.type = learnerType47;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses49 = quorumServer46.electionAddr;
        quorumServer41.checkAddressDuplicate(quorumServer46);
        quorumServer46.id = ' ';
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress54, inetSocketAddress55, inetSocketAddress56);
        java.lang.String str58 = quorumServer57.toString();
        quorumServer57.hostname = "hi!";
        quorumServer57.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType62 = quorumServer57.type;
        quorumServer46.type = learnerType62;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer64 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress34, inetSocketAddress35, learnerType62);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType65 = quorumServer64.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer66 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress30, inetSocketAddress31, inetSocketAddress32, learnerType65);
        long long67 = quorumServer66.getId();
        quorumServer4.checkAddressDuplicate(quorumServer66);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNotNull(multipleAddresses49);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + ":participant" + "'", str58, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType62 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType62.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType65 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType65.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress11, inetSocketAddress12, learnerType13);
        quorumServer14.hostname = "hi!";
        quorumServer14.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress20);
        quorumServer14.checkAddressDuplicate(quorumServer21);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress8, inetSocketAddress9, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType26);
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress29, inetSocketAddress30, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = null;
        quorumServer32.type = learnerType33;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress36, inetSocketAddress37, inetSocketAddress38, learnerType39);
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress42, inetSocketAddress43, learnerType44);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType46 = null;
        quorumServer45.type = learnerType46;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer45.electionAddr;
        quorumServer40.checkAddressDuplicate(quorumServer45);
        java.net.InetSocketAddress inetSocketAddress51 = null;
        java.net.InetSocketAddress inetSocketAddress52 = null;
        java.net.InetSocketAddress inetSocketAddress53 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress51, inetSocketAddress52, inetSocketAddress53);
        java.lang.String str55 = quorumServer54.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses56 = quorumServer54.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses57 = quorumServer54.electionAddr;
        java.lang.String str58 = quorumServer54.hostname;
        java.lang.String str59 = quorumServer54.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType60 = null;
        quorumServer54.type = learnerType60;
        boolean boolean62 = quorumServer40.equals((java.lang.Object) quorumServer54);
        java.net.InetSocketAddress inetSocketAddress64 = null;
        java.net.InetSocketAddress inetSocketAddress65 = null;
        java.net.InetSocketAddress inetSocketAddress66 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer67 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress64, inetSocketAddress65, inetSocketAddress66);
        java.net.InetSocketAddress inetSocketAddress69 = null;
        java.net.InetSocketAddress inetSocketAddress70 = null;
        java.net.InetSocketAddress inetSocketAddress71 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType72 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer73 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress69, inetSocketAddress70, inetSocketAddress71, learnerType72);
        java.net.InetSocketAddress inetSocketAddress75 = null;
        java.net.InetSocketAddress inetSocketAddress76 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType77 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer78 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress75, inetSocketAddress76, learnerType77);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType79 = null;
        quorumServer78.type = learnerType79;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses81 = quorumServer78.electionAddr;
        quorumServer73.checkAddressDuplicate(quorumServer78);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses83 = quorumServer73.electionAddr;
        quorumServer67.electionAddr = multipleAddresses83;
        quorumServer54.addr = multipleAddresses83;
        quorumServer32.checkAddressDuplicate(quorumServer54);
        boolean boolean87 = quorumServer27.equals((java.lang.Object) quorumServer54);
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType26 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType26.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + ":participant" + "'", str55, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses56);
        org.junit.Assert.assertNotNull(multipleAddresses57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(multipleAddresses81);
        org.junit.Assert.assertNotNull(multipleAddresses83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType8);
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        quorumServer14.type = learnerType15;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        quorumServer9.checkAddressDuplicate(quorumServer14);
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress20, inetSocketAddress21, inetSocketAddress22);
        java.lang.String str24 = quorumServer23.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer23.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        java.lang.String str27 = quorumServer23.hostname;
        java.lang.String str28 = quorumServer23.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        quorumServer23.type = learnerType29;
        boolean boolean31 = quorumServer9.equals((java.lang.Object) quorumServer23);
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress33, inetSocketAddress34, inetSocketAddress35);
        java.lang.String str37 = quorumServer36.toString();
        quorumServer36.hostname = "hi!";
        quorumServer36.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = quorumServer36.type;
        quorumServer23.type = learnerType41;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType41);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":participant" + "'", str24, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":participant" + "'", str37, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType41 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType41.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer5.addr;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        long long16 = quorumServer14.getId();
        quorumServer14.id = 100L;
        quorumServer14.recreateSocketAddresses();
        quorumServer5.checkAddressDuplicate(quorumServer14);
        quorumServer14.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService26 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService26.start();
        workerService26.stop();
        workerService26.stop();
        workerService26.stop();
        boolean boolean31 = quorumServer14.equals((java.lang.Object) workerService26);
        java.lang.String str32 = quorumServer14.hostname;
        quorumServer14.id = '4';
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress36, inetSocketAddress37, learnerType38);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses40 = quorumServer39.addr;
        boolean boolean41 = quorumServer14.equals((java.lang.Object) quorumServer39);
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(multipleAddresses40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        quorumServer5.checkAddressDuplicate(quorumServer10);
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress16, inetSocketAddress17, inetSocketAddress18);
        java.lang.String str20 = quorumServer19.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer19.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer19.electionAddr;
        java.lang.String str23 = quorumServer19.hostname;
        java.lang.String str24 = quorumServer19.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        quorumServer19.type = learnerType25;
        boolean boolean27 = quorumServer5.equals((java.lang.Object) quorumServer19);
        long long28 = quorumServer5.getId();
        java.net.InetSocketAddress inetSocketAddress29 = quorumServer5.clientAddr;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress31, inetSocketAddress32, learnerType33);
        quorumServer34.recreateSocketAddresses();
        quorumServer5.checkAddressDuplicate(quorumServer34);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":participant" + "'", str20, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(inetSocketAddress29);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((long) (short) 0);
        workerService3.start();
        java.lang.Class<?> wildcardClass9 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.electionAddr;
        quorumServer4.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress13, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer17.electionAddr;
        quorumServer17.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer17.addr;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        long long28 = quorumServer26.getId();
        quorumServer26.id = 100L;
        quorumServer26.recreateSocketAddresses();
        quorumServer17.checkAddressDuplicate(quorumServer26);
        quorumServer26.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService38 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService38.start();
        workerService38.stop();
        workerService38.stop();
        workerService38.stop();
        boolean boolean43 = quorumServer26.equals((java.lang.Object) workerService38);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses44 = quorumServer26.electionAddr;
        boolean boolean45 = quorumServer4.equals((java.lang.Object) quorumServer26);
        boolean boolean46 = quorumServer26.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses47 = quorumServer26.addr;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer52 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress49, inetSocketAddress50, inetSocketAddress51);
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType56 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress54, inetSocketAddress55, learnerType56);
        java.net.InetSocketAddress inetSocketAddress59 = null;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer62 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress59, inetSocketAddress60, inetSocketAddress61);
        java.lang.String str63 = quorumServer62.toString();
        long long64 = quorumServer62.getId();
        quorumServer62.id = 100L;
        quorumServer62.recreateSocketAddresses();
        boolean boolean68 = quorumServer57.equals((java.lang.Object) quorumServer62);
        quorumServer62.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress71 = null;
        java.net.InetSocketAddress inetSocketAddress72 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType73 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer74 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress71, inetSocketAddress72, learnerType73);
        quorumServer74.isClientAddrFromStatic = true;
        java.lang.String str77 = quorumServer74.hostname;
        java.net.InetSocketAddress inetSocketAddress79 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer80 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress79);
        quorumServer80.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses83 = quorumServer80.addr;
        quorumServer74.electionAddr = multipleAddresses83;
        quorumServer62.electionAddr = multipleAddresses83;
        quorumServer52.addr = multipleAddresses83;
        quorumServer26.electionAddr = multipleAddresses83;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer88 = null;
        // The following exception was thrown during execution in test generation
        try {
            quorumServer26.checkAddressDuplicate(quorumServer88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"addr\" because \"s\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(multipleAddresses44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(multipleAddresses47);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + ":participant" + "'", str63, ":participant");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 35L + "'", long64 == 35L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(multipleAddresses83);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.stop();
        workerService3.join((long) (byte) 1);
        workerService3.join((long) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 0, false);
        workerService3.start();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer5.addr;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        long long16 = quorumServer14.getId();
        quorumServer14.id = 100L;
        quorumServer14.recreateSocketAddresses();
        quorumServer5.checkAddressDuplicate(quorumServer14);
        quorumServer14.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService26 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService26.start();
        workerService26.stop();
        workerService26.stop();
        workerService26.stop();
        boolean boolean31 = quorumServer14.equals((java.lang.Object) workerService26);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer14.electionAddr;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress34, inetSocketAddress35);
        boolean boolean37 = quorumServer14.equals((java.lang.Object) inetSocketAddress35);
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress11, inetSocketAddress12, inetSocketAddress13, learnerType14);
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress17, inetSocketAddress18, learnerType19);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        quorumServer20.type = learnerType21;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer20.electionAddr;
        quorumServer15.checkAddressDuplicate(quorumServer20);
        quorumServer20.id = ' ';
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress28, inetSocketAddress29, inetSocketAddress30);
        java.lang.String str32 = quorumServer31.toString();
        quorumServer31.hostname = "hi!";
        quorumServer31.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = quorumServer31.type;
        quorumServer20.type = learnerType36;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress8, inetSocketAddress9, learnerType36);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType36);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, learnerType36);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":participant" + "'", str32, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType36 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType36.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) 'a', true);
        workerService3.join(10L);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        boolean boolean6 = quorumServer4.isClientAddrFromStatic;
        java.lang.String str7 = quorumServer4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        boolean boolean8 = quorumServer7.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        quorumServer7.type = learnerType9;
        java.lang.String str11 = quorumServer7.toString();
        long long12 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress18, inetSocketAddress19, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType29);
        quorumServer7.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, learnerType29);
        java.lang.String str34 = quorumServer33.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses35 = quorumServer33.addr;
        quorumServer33.isClientAddrFromStatic = true;
        java.lang.Class<?> wildcardClass38 = quorumServer33.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(multipleAddresses35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.start();
        workerService3.join((long) 1);
        workerService3.join(32L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress15, inetSocketAddress16, inetSocketAddress17);
        java.lang.String str19 = quorumServer18.toString();
        quorumServer18.hostname = "hi!";
        quorumServer18.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer18.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress12, inetSocketAddress13, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType23);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":participant" + "'", str19, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) 'a', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        workerService3.stop();
        workerService3.join((long) (byte) 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        java.lang.Class<?> wildcardClass6 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        long long10 = quorumServer4.id;
        org.apache.zookeeper.server.WorkerService workerService14 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        boolean boolean15 = quorumServer4.equals((java.lang.Object) workerService14);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer21.addr;
        quorumServer4.addr = multipleAddresses23;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress26, inetSocketAddress27, learnerType28);
        boolean boolean31 = quorumServer29.equals((java.lang.Object) 35L);
        long long32 = quorumServer29.id;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        quorumServer29.clientAddr = inetSocketAddress33;
        quorumServer4.checkAddressDuplicate(quorumServer29);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress12, inetSocketAddress13, inetSocketAddress14, learnerType15);
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress18, inetSocketAddress19, learnerType20);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        quorumServer21.type = learnerType22;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.electionAddr;
        quorumServer16.checkAddressDuplicate(quorumServer21);
        quorumServer21.id = ' ';
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress29, inetSocketAddress30, inetSocketAddress31);
        java.lang.String str33 = quorumServer32.toString();
        quorumServer32.hostname = "hi!";
        quorumServer32.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = quorumServer32.type;
        quorumServer21.type = learnerType37;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress5, inetSocketAddress6, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType37);
        java.net.InetSocketAddress inetSocketAddress42 = quorumServer41.clientAddr;
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":participant" + "'", str33, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(inetSocketAddress42);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress9, inetSocketAddress10, learnerType11);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        quorumServer12.type = learnerType13;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer12.electionAddr;
        java.lang.String str16 = quorumServer12.toString();
        long long17 = quorumServer12.id;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress19, inetSocketAddress20, inetSocketAddress21);
        java.lang.String str23 = quorumServer22.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer22.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer22.electionAddr;
        boolean boolean27 = quorumServer22.equals((java.lang.Object) true);
        quorumServer12.checkAddressDuplicate(quorumServer22);
        java.lang.String str29 = quorumServer22.hostname;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress31, inetSocketAddress32, inetSocketAddress33);
        java.lang.String str35 = quorumServer34.toString();
        quorumServer34.hostname = "hi!";
        quorumServer34.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = quorumServer34.type;
        quorumServer22.type = learnerType39;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = quorumServer22.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType41);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType41);
        long long44 = quorumServer43.id;
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":participant" + "'", str23, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ":participant" + "'", str35, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType39 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType39.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType41 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType41.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.lang.String str9 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress11, inetSocketAddress12);
        quorumServer4.checkAddressDuplicate(quorumServer13);
        java.net.InetSocketAddress inetSocketAddress15 = null;
        quorumServer4.clientAddr = inetSocketAddress15;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.toString();
        java.lang.Class<?> wildcardClass6 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress7, inetSocketAddress8, inetSocketAddress9);
        java.lang.String str11 = quorumServer10.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer10.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        java.lang.String str14 = quorumServer10.hostname;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        quorumServer10.clientAddr = inetSocketAddress15;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = quorumServer10.type;
        quorumServer5.type = learnerType17;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":participant" + "'", str11, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + learnerType17 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType17.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress4, inetSocketAddress5, learnerType6);
        quorumServer7.recreateSocketAddresses();
        long long9 = quorumServer7.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress18, inetSocketAddress19, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress11, inetSocketAddress12, learnerType29);
        quorumServer7.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType29);
        quorumServer34.isClientAddrFromStatic = true;
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        quorumServer14.type = learnerType15;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        long long18 = quorumServer14.id;
        java.lang.String str19 = quorumServer14.hostname;
        boolean boolean20 = quorumServer4.equals((java.lang.Object) str19);
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress22, inetSocketAddress23, inetSocketAddress24);
        java.lang.String str26 = quorumServer25.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses27 = quorumServer25.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses28 = quorumServer25.electionAddr;
        java.lang.String str29 = quorumServer25.hostname;
        long long30 = quorumServer25.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer25.electionAddr;
        quorumServer4.checkAddressDuplicate(quorumServer25);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer4.addr;
        long long34 = quorumServer4.getId();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNotNull(multipleAddresses33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.stop();
        workerService3.join(32L);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        java.lang.String str11 = quorumServer4.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer4.electionAddr;
        long long13 = quorumServer4.getId();
        long long14 = quorumServer4.getId();
        boolean boolean15 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str21 = quorumServer14.hostname;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress23, inetSocketAddress24, learnerType25);
        java.net.InetSocketAddress inetSocketAddress27 = null;
        quorumServer26.clientAddr = inetSocketAddress27;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer26.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer26.type = learnerType30;
        quorumServer26.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress35, inetSocketAddress36, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        quorumServer38.type = learnerType39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        java.lang.String str42 = quorumServer38.toString();
        long long43 = quorumServer38.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses44 = quorumServer38.electionAddr;
        quorumServer26.addr = multipleAddresses44;
        boolean boolean46 = quorumServer14.equals((java.lang.Object) quorumServer26);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses47 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType48 = quorumServer14.type;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(learnerType29);
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(multipleAddresses47);
        org.junit.Assert.assertTrue("'" + learnerType48 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType48.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 100, false);
        workerService3.stop();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        long long9 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer7.clientAddr = inetSocketAddress10;
        quorumServer7.id = (-1);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer7.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType14);
        quorumServer15.recreateSocketAddresses();
        java.lang.String str17 = quorumServer15.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType14 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType14.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":participant" + "'", str17, ":participant");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1, inetSocketAddress2);
        quorumServer3.hostname = ":participant";
        java.lang.String str6 = quorumServer3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":participant" + "'", str6, ":participant");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress6 = quorumServer5.clientAddr;
        java.lang.String str7 = quorumServer5.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress9, inetSocketAddress10, inetSocketAddress11, learnerType12);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer13.electionAddr;
        quorumServer13.isClientAddrFromStatic = false;
        quorumServer5.checkAddressDuplicate(quorumServer13);
        long long18 = quorumServer5.getId();
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 10, true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress8, inetSocketAddress9, learnerType10);
        quorumServer11.hostname = "hi!";
        quorumServer11.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress17);
        quorumServer11.checkAddressDuplicate(quorumServer18);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = quorumServer18.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress5, inetSocketAddress6, learnerType20);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType20);
        quorumServer22.isClientAddrFromStatic = false;
        org.junit.Assert.assertTrue("'" + learnerType20 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType20.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.isClientAddrFromStatic = true;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNull(learnerType5);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 52L);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        boolean boolean8 = quorumServer7.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        quorumServer7.type = learnerType9;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress15, inetSocketAddress16, inetSocketAddress17, learnerType18);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer19.electionAddr;
        quorumServer19.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer19.addr;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        long long30 = quorumServer28.getId();
        quorumServer28.id = 100L;
        quorumServer28.recreateSocketAddresses();
        quorumServer19.checkAddressDuplicate(quorumServer28);
        quorumServer28.id = (-1L);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = quorumServer28.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress12, inetSocketAddress13, learnerType37);
        quorumServer7.type = learnerType37;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2, learnerType37);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress6, inetSocketAddress7, learnerType8);
        quorumServer9.hostname = "hi!";
        quorumServer9.id = (byte) 100;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer9.addr;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        quorumServer9.clientAddr = inetSocketAddress15;
        boolean boolean17 = quorumServer4.equals((java.lang.Object) inetSocketAddress15);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer4.addr;
        java.lang.String str19 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":participant" + "'", str19, ":participant");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        quorumServer4.id = '#';
        quorumServer4.hostname = "hi!";
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress14, inetSocketAddress15);
        quorumServer4.checkAddressDuplicate(quorumServer16);
        long long18 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress19 = null;
        quorumServer4.clientAddr = inetSocketAddress19;
        long long21 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress23, inetSocketAddress24, learnerType25);
        quorumServer26.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        quorumServer26.clientAddr = inetSocketAddress29;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer26.electionAddr;
        quorumServer26.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress35, inetSocketAddress36, inetSocketAddress37, learnerType38);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses40 = quorumServer39.electionAddr;
        quorumServer39.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer39.addr;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress45, inetSocketAddress46, inetSocketAddress47);
        java.lang.String str49 = quorumServer48.toString();
        long long50 = quorumServer48.getId();
        quorumServer48.id = 100L;
        quorumServer48.recreateSocketAddresses();
        quorumServer39.checkAddressDuplicate(quorumServer48);
        quorumServer48.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService60 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService60.start();
        workerService60.stop();
        workerService60.stop();
        workerService60.stop();
        boolean boolean65 = quorumServer48.equals((java.lang.Object) workerService60);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses66 = quorumServer48.electionAddr;
        boolean boolean67 = quorumServer26.equals((java.lang.Object) quorumServer48);
        boolean boolean68 = quorumServer48.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses69 = quorumServer48.addr;
        quorumServer4.addr = multipleAddresses69;
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNotNull(multipleAddresses40);
        org.junit.Assert.assertNotNull(multipleAddresses43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ":participant" + "'", str49, ":participant");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 35L + "'", long50 == 35L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(multipleAddresses66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(multipleAddresses69);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        quorumServer14.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress21, inetSocketAddress22, learnerType23);
        quorumServer24.hostname = "hi!";
        quorumServer24.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress30);
        quorumServer24.checkAddressDuplicate(quorumServer31);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = quorumServer31.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress18, inetSocketAddress19, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress11, inetSocketAddress12, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress7, inetSocketAddress8, inetSocketAddress9, learnerType33);
        long long38 = quorumServer37.id;
        quorumServer37.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = null;
        quorumServer37.type = learnerType40;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer37.addr;
        quorumServer4.electionAddr = multipleAddresses42;
        org.junit.Assert.assertNotNull(multipleAddresses5);
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(multipleAddresses42);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        boolean boolean11 = quorumServer10.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        quorumServer10.type = learnerType12;
        java.lang.String str14 = quorumServer10.toString();
        long long15 = quorumServer10.getId();
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        quorumServer27.hostname = "hi!";
        quorumServer27.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = quorumServer27.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress21, inetSocketAddress22, learnerType32);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress17, inetSocketAddress18, inetSocketAddress19, learnerType32);
        quorumServer10.type = learnerType32;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress4, inetSocketAddress5, learnerType32);
        quorumServer2.type = learnerType32;
        quorumServer2.id = (short) 100;
        boolean boolean40 = quorumServer2.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType32 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType32.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str21 = quorumServer14.hostname;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        quorumServer26.hostname = "hi!";
        quorumServer26.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = quorumServer26.type;
        quorumServer14.type = learnerType31;
        boolean boolean33 = quorumServer14.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress35, inetSocketAddress36, inetSocketAddress37);
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress40, inetSocketAddress41, inetSocketAddress42, learnerType43);
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress46, inetSocketAddress47, learnerType48);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType50 = null;
        quorumServer49.type = learnerType50;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses52 = quorumServer49.electionAddr;
        quorumServer44.checkAddressDuplicate(quorumServer49);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses54 = quorumServer44.electionAddr;
        quorumServer38.electionAddr = multipleAddresses54;
        quorumServer14.electionAddr = multipleAddresses54;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType31 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType31.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(multipleAddresses52);
        org.junit.Assert.assertNotNull(multipleAddresses54);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        quorumServer4.clientAddr = inetSocketAddress8;
        boolean boolean10 = quorumServer4.isClientAddrFromStatic;
        quorumServer4.id = 0;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = quorumServer4.type;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(learnerType13);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.net.InetSocketAddress inetSocketAddress21 = quorumServer14.clientAddr;
        long long22 = quorumServer14.getId();
        quorumServer14.isClientAddrFromStatic = false;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inetSocketAddress21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 0, false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        long long9 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer7.clientAddr = inetSocketAddress10;
        quorumServer7.id = (-1);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer7.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType14);
        quorumServer15.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = quorumServer15.type;
        long long18 = quorumServer15.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType14 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType14.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType17 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType17.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        boolean boolean8 = quorumServer7.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        quorumServer7.type = learnerType9;
        java.lang.String str11 = quorumServer7.toString();
        long long12 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress18, inetSocketAddress19, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType29);
        quorumServer7.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, learnerType29);
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress35, inetSocketAddress36, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        quorumServer38.type = learnerType39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        java.lang.String str42 = quorumServer38.toString();
        long long43 = quorumServer38.getId();
        boolean boolean44 = quorumServer38.isClientAddrFromStatic;
        quorumServer33.checkAddressDuplicate(quorumServer38);
        java.lang.String str46 = quorumServer33.hostname;
        java.net.InetSocketAddress inetSocketAddress47 = quorumServer33.clientAddr;
        quorumServer33.recreateSocketAddresses();
        quorumServer33.hostname = "hi!";
        java.net.InetSocketAddress inetSocketAddress52 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress52);
        quorumServer33.checkAddressDuplicate(quorumServer53);
        quorumServer33.recreateSocketAddresses();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(inetSocketAddress47);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress15, inetSocketAddress16, learnerType17);
        quorumServer18.hostname = "hi!";
        quorumServer18.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress24);
        quorumServer18.checkAddressDuplicate(quorumServer25);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress5, inetSocketAddress6, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType27);
        long long32 = quorumServer31.id;
        quorumServer31.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer31.addr;
        boolean boolean35 = quorumServer31.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + learnerType27 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType27.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(multipleAddresses34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress5, inetSocketAddress6, learnerType7);
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress17, inetSocketAddress18, inetSocketAddress19);
        java.lang.String str21 = quorumServer20.toString();
        quorumServer20.hostname = "hi!";
        quorumServer20.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = quorumServer20.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress14, inetSocketAddress15, learnerType25);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType25);
        quorumServer8.type = learnerType25;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType25);
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress31, inetSocketAddress32, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        quorumServer34.type = learnerType35;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer34.electionAddr;
        java.lang.String str38 = quorumServer34.toString();
        long long39 = quorumServer34.id;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress41, inetSocketAddress42, inetSocketAddress43);
        java.lang.String str45 = quorumServer44.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses46 = quorumServer44.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses47 = quorumServer44.electionAddr;
        boolean boolean49 = quorumServer44.equals((java.lang.Object) true);
        quorumServer34.checkAddressDuplicate(quorumServer44);
        java.lang.String str51 = quorumServer44.hostname;
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType55 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress53, inetSocketAddress54, learnerType55);
        java.net.InetSocketAddress inetSocketAddress57 = null;
        quorumServer56.clientAddr = inetSocketAddress57;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType59 = quorumServer56.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType60 = null;
        quorumServer56.type = learnerType60;
        quorumServer56.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress65 = null;
        java.net.InetSocketAddress inetSocketAddress66 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType67 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer68 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress65, inetSocketAddress66, learnerType67);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType69 = null;
        quorumServer68.type = learnerType69;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses71 = quorumServer68.electionAddr;
        java.lang.String str72 = quorumServer68.toString();
        long long73 = quorumServer68.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses74 = quorumServer68.electionAddr;
        quorumServer56.addr = multipleAddresses74;
        boolean boolean76 = quorumServer44.equals((java.lang.Object) quorumServer56);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses77 = quorumServer44.addr;
        quorumServer29.addr = multipleAddresses77;
        java.lang.Class<?> wildcardClass79 = quorumServer29.getClass();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType25 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType25.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ":participant" + "'", str45, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses46);
        org.junit.Assert.assertNotNull(multipleAddresses47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(learnerType59);
        org.junit.Assert.assertNotNull(multipleAddresses71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(multipleAddresses77);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1);
        long long3 = quorumServer2.id;
        quorumServer2.isClientAddrFromStatic = true;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        long long16 = quorumServer9.getId();
        quorumServer9.isClientAddrFromStatic = true;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) true);
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer4.addr = multipleAddresses15;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer4.electionAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses17);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) (short) 10);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean6 = quorumServer4.equals((java.lang.Object) 35L);
        long long7 = quorumServer4.id;
        java.lang.String str8 = quorumServer4.hostname;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        long long6 = quorumServer4.getId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType7);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer8.electionAddr;
        quorumServer8.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer8.addr;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.lang.String str18 = quorumServer17.toString();
        long long19 = quorumServer17.getId();
        quorumServer17.id = 100L;
        quorumServer17.recreateSocketAddresses();
        quorumServer8.checkAddressDuplicate(quorumServer17);
        quorumServer17.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService29 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService29.start();
        workerService29.stop();
        workerService29.stop();
        workerService29.stop();
        boolean boolean34 = quorumServer17.equals((java.lang.Object) workerService29);
        workerService29.start();
        boolean boolean36 = quorumServer2.equals((java.lang.Object) workerService29);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest37 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService29.schedule(workRequest37, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        long long5 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress7, inetSocketAddress8, inetSocketAddress9);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses11 = quorumServer10.electionAddr;
        quorumServer4.checkAddressDuplicate(quorumServer10);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.lang.String str18 = quorumServer17.toString();
        quorumServer17.hostname = "hi!";
        quorumServer17.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses28 = quorumServer26.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer26.electionAddr;
        java.lang.String str30 = quorumServer26.hostname;
        long long31 = quorumServer26.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer26.electionAddr;
        quorumServer17.addr = multipleAddresses32;
        quorumServer4.addr = multipleAddresses32;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(multipleAddresses11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses32);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType11);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        quorumServer12.checkAddressDuplicate(quorumServer17);
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses28 = quorumServer26.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer26.electionAddr;
        java.lang.String str30 = quorumServer26.hostname;
        java.lang.String str31 = quorumServer26.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        quorumServer26.type = learnerType32;
        boolean boolean34 = quorumServer12.equals((java.lang.Object) quorumServer26);
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress41, inetSocketAddress42, inetSocketAddress43, learnerType44);
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType49 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer50 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress47, inetSocketAddress48, learnerType49);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = null;
        quorumServer50.type = learnerType51;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses53 = quorumServer50.electionAddr;
        quorumServer45.checkAddressDuplicate(quorumServer50);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer45.electionAddr;
        quorumServer39.electionAddr = multipleAddresses55;
        quorumServer26.addr = multipleAddresses55;
        quorumServer4.checkAddressDuplicate(quorumServer26);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses59 = quorumServer4.electionAddr;
        long long60 = quorumServer4.getId();
        boolean boolean61 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses62 = quorumServer4.electionAddr;
        java.lang.Class<?> wildcardClass63 = multipleAddresses62.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertNotNull(multipleAddresses59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(multipleAddresses62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"this.workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, false);
        workerService3.start();
        workerService3.join((long) (short) 0);
        workerService3.join((long) '4');
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        java.lang.String str11 = quorumServer4.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer4.electionAddr;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multipleAddresses12);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        quorumServer4.isClientAddrFromStatic = true;
        quorumServer4.isClientAddrFromStatic = false;
        quorumServer4.isClientAddrFromStatic = true;
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        quorumServer4.id = '4';
        long long8 = quorumServer4.id;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1);
        java.lang.String str3 = quorumServer2.hostname;
        boolean boolean4 = quorumServer2.isClientAddrFromStatic;
        boolean boolean5 = quorumServer2.isClientAddrFromStatic;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType11);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        quorumServer12.checkAddressDuplicate(quorumServer17);
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses28 = quorumServer26.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer26.electionAddr;
        java.lang.String str30 = quorumServer26.hostname;
        java.lang.String str31 = quorumServer26.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        quorumServer26.type = learnerType32;
        boolean boolean34 = quorumServer12.equals((java.lang.Object) quorumServer26);
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress41, inetSocketAddress42, inetSocketAddress43, learnerType44);
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType49 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer50 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress47, inetSocketAddress48, learnerType49);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = null;
        quorumServer50.type = learnerType51;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses53 = quorumServer50.electionAddr;
        quorumServer45.checkAddressDuplicate(quorumServer50);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer45.electionAddr;
        quorumServer39.electionAddr = multipleAddresses55;
        quorumServer26.addr = multipleAddresses55;
        quorumServer4.checkAddressDuplicate(quorumServer26);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses59 = quorumServer4.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses60 = quorumServer4.electionAddr;
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertNotNull(multipleAddresses59);
        org.junit.Assert.assertNotNull(multipleAddresses60);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        quorumServer4.id = '#';
        quorumServer4.hostname = "hi!";
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress18, inetSocketAddress19, inetSocketAddress20, learnerType21);
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress24, inetSocketAddress25, learnerType26);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        quorumServer27.type = learnerType28;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.electionAddr;
        quorumServer22.checkAddressDuplicate(quorumServer27);
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress33, inetSocketAddress34, inetSocketAddress35);
        java.lang.String str37 = quorumServer36.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses38 = quorumServer36.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses39 = quorumServer36.electionAddr;
        java.lang.String str40 = quorumServer36.hostname;
        java.lang.String str41 = quorumServer36.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType42 = null;
        quorumServer36.type = learnerType42;
        boolean boolean44 = quorumServer22.equals((java.lang.Object) quorumServer36);
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress46, inetSocketAddress47, inetSocketAddress48);
        java.lang.String str50 = quorumServer49.toString();
        quorumServer49.hostname = "hi!";
        quorumServer49.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType54 = quorumServer49.type;
        quorumServer36.type = learnerType54;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType54);
        boolean boolean57 = quorumServer4.equals((java.lang.Object) inetSocketAddress16);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":participant" + "'", str37, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses38);
        org.junit.Assert.assertNotNull(multipleAddresses39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":participant" + "'", str50, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType54 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType54.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.stop();
        workerService3.join((long) (byte) 100);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        long long9 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer7.clientAddr = inetSocketAddress10;
        quorumServer7.id = (-1);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer7.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType14);
        quorumServer15.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = quorumServer15.type;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.addr;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType14 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType14.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType17 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType17.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses18);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType7);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer8.electionAddr;
        quorumServer8.id = 35L;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress13, inetSocketAddress14, learnerType15);
        boolean boolean17 = quorumServer16.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer16.type = learnerType18;
        java.lang.String str20 = quorumServer16.toString();
        long long21 = quorumServer16.getId();
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress30, inetSocketAddress31, inetSocketAddress32);
        java.lang.String str34 = quorumServer33.toString();
        quorumServer33.hostname = "hi!";
        quorumServer33.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = quorumServer33.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress27, inetSocketAddress28, learnerType38);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress23, inetSocketAddress24, inetSocketAddress25, learnerType38);
        quorumServer16.type = learnerType38;
        quorumServer8.type = learnerType38;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, learnerType38);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":participant" + "'", str34, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType38 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType38.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        quorumServer5.checkAddressDuplicate(quorumServer10);
        quorumServer10.id = ' ';
        long long17 = quorumServer10.id;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress19, inetSocketAddress20, learnerType21);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = null;
        quorumServer22.type = learnerType23;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer22.electionAddr;
        long long26 = quorumServer22.id;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress28, inetSocketAddress29, inetSocketAddress30, learnerType31);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer32.electionAddr;
        quorumServer32.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses36 = quorumServer32.addr;
        quorumServer22.addr = multipleAddresses36;
        quorumServer22.isClientAddrFromStatic = true;
        long long40 = quorumServer22.id;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress42, inetSocketAddress43, inetSocketAddress44);
        java.lang.String str46 = quorumServer45.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses47 = quorumServer45.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer45.electionAddr;
        java.lang.String str49 = quorumServer45.hostname;
        long long50 = quorumServer45.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses51 = quorumServer45.electionAddr;
        quorumServer22.electionAddr = multipleAddresses51;
        quorumServer10.addr = multipleAddresses51;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses33);
        org.junit.Assert.assertNotNull(multipleAddresses36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":participant" + "'", str46, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses47);
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 35L + "'", long50 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses51);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress5, inetSocketAddress6, learnerType7);
        boolean boolean9 = quorumServer8.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        quorumServer8.type = learnerType10;
        java.lang.String str12 = quorumServer8.toString();
        long long13 = quorumServer8.getId();
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress22, inetSocketAddress23, inetSocketAddress24);
        java.lang.String str26 = quorumServer25.toString();
        quorumServer25.hostname = "hi!";
        quorumServer25.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress19, inetSocketAddress20, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress15, inetSocketAddress16, inetSocketAddress17, learnerType30);
        quorumServer8.type = learnerType30;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType30);
        java.lang.String str35 = quorumServer34.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses36 = quorumServer34.addr;
        quorumServer34.id = 0;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(multipleAddresses36);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        long long9 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer7.clientAddr = inetSocketAddress10;
        quorumServer7.id = (-1);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer7.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType14);
        quorumServer15.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = quorumServer15.type;
        quorumServer15.id = 0L;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType14 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType14.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType17 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType17.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress1);
        boolean boolean3 = quorumServer2.isClientAddrFromStatic;
        boolean boolean4 = quorumServer2.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress6, inetSocketAddress7, learnerType8);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        quorumServer9.type = learnerType10;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer9.electionAddr;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        quorumServer9.clientAddr = inetSocketAddress13;
        boolean boolean15 = quorumServer9.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress17, inetSocketAddress18, learnerType19);
        boolean boolean22 = quorumServer20.equals((java.lang.Object) 35L);
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress31, inetSocketAddress32, inetSocketAddress33, learnerType34);
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress37, inetSocketAddress38, learnerType39);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        quorumServer40.type = learnerType41;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer40.electionAddr;
        quorumServer35.checkAddressDuplicate(quorumServer40);
        quorumServer40.id = ' ';
        java.net.InetSocketAddress inetSocketAddress48 = null;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer51 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress48, inetSocketAddress49, inetSocketAddress50);
        java.lang.String str52 = quorumServer51.toString();
        quorumServer51.hostname = "hi!";
        quorumServer51.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType56 = quorumServer51.type;
        quorumServer40.type = learnerType56;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer58 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress27, inetSocketAddress28, inetSocketAddress29, learnerType56);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer59 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress24, inetSocketAddress25, learnerType56);
        quorumServer20.type = learnerType56;
        quorumServer9.type = learnerType56;
        quorumServer2.type = learnerType56;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(multipleAddresses43);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ":participant" + "'", str52, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType56 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType56.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) 0;
        long long9 = quorumServer4.id;
        quorumServer4.hostname = ":participant";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str21 = quorumServer14.hostname;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        quorumServer26.hostname = "hi!";
        quorumServer26.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = quorumServer26.type;
        quorumServer14.type = learnerType31;
        long long33 = quorumServer14.id;
        java.net.InetSocketAddress inetSocketAddress34 = quorumServer14.clientAddr;
        long long35 = quorumServer14.getId();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType31 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType31.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertNull(inetSocketAddress34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        workerService3.start();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        quorumServer4.id = 10L;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.lang.String str9 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress11, inetSocketAddress12);
        quorumServer4.checkAddressDuplicate(quorumServer13);
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress16, inetSocketAddress17, learnerType18);
        quorumServer13.checkAddressDuplicate(quorumServer19);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer19.addr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(multipleAddresses21);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer9.type = learnerType16;
        java.lang.String str18 = quorumServer9.hostname;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress20, inetSocketAddress21, learnerType22);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = null;
        quorumServer23.type = learnerType24;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        long long27 = quorumServer23.id;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress29, inetSocketAddress30, inetSocketAddress31, learnerType32);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer33.electionAddr;
        quorumServer33.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer33.addr;
        quorumServer23.addr = multipleAddresses37;
        quorumServer23.hostname = "";
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress42, inetSocketAddress43, inetSocketAddress44);
        java.lang.String str46 = quorumServer45.toString();
        long long47 = quorumServer45.getId();
        quorumServer45.id = (short) 0;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        quorumServer45.clientAddr = inetSocketAddress50;
        quorumServer23.checkAddressDuplicate(quorumServer45);
        quorumServer9.checkAddressDuplicate(quorumServer45);
        boolean boolean54 = quorumServer9.isClientAddrFromStatic;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses34);
        org.junit.Assert.assertNotNull(multipleAddresses37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":participant" + "'", str46, ":participant");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.lang.Class<?> wildcardClass6 = quorumServer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) -1, true);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        long long5 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress6 = quorumServer4.clientAddr;
        java.net.InetSocketAddress inetSocketAddress7 = quorumServer4.clientAddr;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNull(inetSocketAddress7);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress15, inetSocketAddress16, learnerType17);
        quorumServer18.hostname = "hi!";
        quorumServer18.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress24);
        quorumServer18.checkAddressDuplicate(quorumServer25);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress5, inetSocketAddress6, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType27);
        long long32 = quorumServer31.id;
        quorumServer31.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = null;
        quorumServer31.type = learnerType34;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = null;
        quorumServer31.type = learnerType36;
        org.junit.Assert.assertTrue("'" + learnerType27 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType27.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 10);
        workerService3.stop();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = ":participant";
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.getId();
        boolean boolean10 = quorumServer4.isClientAddrFromStatic;
        long long11 = quorumServer4.getId();
        long long12 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress14, inetSocketAddress15);
        boolean boolean17 = quorumServer16.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        quorumServer16.clientAddr = inetSocketAddress18;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress21, inetSocketAddress22, learnerType23);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer24.electionAddr;
        quorumServer16.electionAddr = multipleAddresses25;
        quorumServer4.electionAddr = multipleAddresses25;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(multipleAddresses25);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        boolean boolean8 = quorumServer7.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        quorumServer7.type = learnerType9;
        java.lang.String str11 = quorumServer7.toString();
        long long12 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress18, inetSocketAddress19, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType29);
        quorumServer7.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, learnerType29);
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress35, inetSocketAddress36, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        quorumServer38.type = learnerType39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        java.lang.String str42 = quorumServer38.toString();
        long long43 = quorumServer38.getId();
        boolean boolean44 = quorumServer38.isClientAddrFromStatic;
        quorumServer33.checkAddressDuplicate(quorumServer38);
        java.lang.String str46 = quorumServer33.hostname;
        long long47 = quorumServer33.getId();
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType52 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress49, inetSocketAddress50, inetSocketAddress51, learnerType52);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses54 = quorumServer53.electionAddr;
        quorumServer53.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses57 = quorumServer53.addr;
        java.net.InetSocketAddress inetSocketAddress59 = null;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer62 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress59, inetSocketAddress60, inetSocketAddress61);
        java.lang.String str63 = quorumServer62.toString();
        long long64 = quorumServer62.getId();
        quorumServer62.id = 100L;
        quorumServer62.recreateSocketAddresses();
        quorumServer53.checkAddressDuplicate(quorumServer62);
        java.net.InetSocketAddress inetSocketAddress69 = null;
        quorumServer53.clientAddr = inetSocketAddress69;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses71 = quorumServer53.addr;
        quorumServer33.electionAddr = multipleAddresses71;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertNotNull(multipleAddresses54);
        org.junit.Assert.assertNotNull(multipleAddresses57);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + ":participant" + "'", str63, ":participant");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 35L + "'", long64 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses71);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 10);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer9.type = learnerType16;
        java.lang.String str18 = quorumServer9.hostname;
        quorumServer9.id = 10L;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress22, inetSocketAddress23, learnerType24);
        java.net.InetSocketAddress inetSocketAddress26 = null;
        quorumServer25.clientAddr = inetSocketAddress26;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        quorumServer25.type = learnerType29;
        quorumServer9.checkAddressDuplicate(quorumServer25);
        java.lang.String str32 = quorumServer25.hostname;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(learnerType28);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer14.addr;
        quorumServer4.addr = multipleAddresses18;
        quorumServer4.isClientAddrFromStatic = true;
        long long22 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer27.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.electionAddr;
        java.lang.String str31 = quorumServer27.hostname;
        long long32 = quorumServer27.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer27.electionAddr;
        quorumServer4.electionAddr = multipleAddresses33;
        java.lang.String str35 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress4, inetSocketAddress5, learnerType6);
        quorumServer7.hostname = "";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        quorumServer2.electionAddr = multipleAddresses10;
        java.lang.Class<?> wildcardClass12 = quorumServer2.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer5.addr;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress9, inetSocketAddress10, learnerType11);
        java.net.InetSocketAddress inetSocketAddress13 = null;
        quorumServer12.clientAddr = inetSocketAddress13;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = quorumServer12.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer12.type = learnerType16;
        quorumServer12.hostname = ":participant";
        quorumServer5.checkAddressDuplicate(quorumServer12);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(learnerType15);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) 'a', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((long) (short) 1);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress16, inetSocketAddress17, learnerType18);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        quorumServer19.type = learnerType20;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer19.electionAddr;
        quorumServer14.checkAddressDuplicate(quorumServer19);
        quorumServer19.id = ' ';
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress27, inetSocketAddress28, inetSocketAddress29);
        java.lang.String str31 = quorumServer30.toString();
        quorumServer30.hostname = "hi!";
        quorumServer30.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = quorumServer30.type;
        quorumServer19.type = learnerType35;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress7, inetSocketAddress8, learnerType35);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress4, inetSocketAddress5, learnerType35);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType35);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses40 = quorumServer39.electionAddr;
        java.lang.Class<?> wildcardClass41 = multipleAddresses40.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":participant" + "'", str31, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType35 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType35.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer4.type = learnerType8;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress12, inetSocketAddress13, learnerType14);
        quorumServer15.isClientAddrFromStatic = true;
        java.lang.String str18 = quorumServer15.hostname;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress20);
        quorumServer21.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.addr;
        quorumServer15.electionAddr = multipleAddresses24;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress45, inetSocketAddress46, inetSocketAddress47);
        java.lang.String str49 = quorumServer48.toString();
        quorumServer48.hostname = "hi!";
        quorumServer48.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType53 = quorumServer48.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress42, inetSocketAddress43, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer55 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress38, inetSocketAddress39, inetSocketAddress40, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress35, inetSocketAddress36, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress31, inetSocketAddress32, inetSocketAddress33, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer58 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress27, inetSocketAddress28, inetSocketAddress29, learnerType53);
        quorumServer15.type = learnerType53;
        quorumServer15.id = (short) 1;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses62 = quorumServer15.electionAddr;
        quorumServer4.addr = multipleAddresses62;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses64 = quorumServer4.electionAddr;
        org.junit.Assert.assertNull(learnerType7);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ":participant" + "'", str49, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType53 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType53.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses62);
        org.junit.Assert.assertNotNull(multipleAddresses64);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        quorumServer4.type = learnerType6;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress12, inetSocketAddress13, inetSocketAddress14);
        java.lang.String str16 = quorumServer15.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer15.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        java.lang.String str19 = quorumServer15.hostname;
        java.lang.String str20 = quorumServer15.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        quorumServer15.type = learnerType21;
        java.net.InetSocketAddress inetSocketAddress23 = quorumServer15.clientAddr;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer28.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer28.electionAddr;
        java.lang.String str32 = quorumServer28.hostname;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        quorumServer28.clientAddr = inetSocketAddress33;
        java.lang.String str35 = quorumServer28.hostname;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress37, inetSocketAddress38, learnerType39);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        quorumServer40.type = learnerType41;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer40.electionAddr;
        long long44 = quorumServer40.id;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType49 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer50 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress46, inetSocketAddress47, inetSocketAddress48, learnerType49);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses51 = quorumServer50.electionAddr;
        quorumServer50.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses54 = quorumServer50.addr;
        quorumServer40.addr = multipleAddresses54;
        quorumServer28.electionAddr = multipleAddresses54;
        quorumServer15.addr = multipleAddresses54;
        java.net.InetSocketAddress inetSocketAddress58 = quorumServer15.clientAddr;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer63 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress60, inetSocketAddress61, inetSocketAddress62);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses64 = quorumServer63.electionAddr;
        quorumServer15.electionAddr = multipleAddresses64;
        quorumServer10.electionAddr = multipleAddresses64;
        quorumServer4.electionAddr = multipleAddresses64;
        long long68 = quorumServer4.id;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":participant" + "'", str16, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(inetSocketAddress23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(multipleAddresses43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses51);
        org.junit.Assert.assertNotNull(multipleAddresses54);
        org.junit.Assert.assertNull(inetSocketAddress58);
        org.junit.Assert.assertNotNull(multipleAddresses64);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress15, inetSocketAddress16, inetSocketAddress17, learnerType18);
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress21, inetSocketAddress22, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        quorumServer24.type = learnerType25;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses27 = quorumServer24.electionAddr;
        quorumServer19.checkAddressDuplicate(quorumServer24);
        quorumServer24.id = ' ';
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress32, inetSocketAddress33, inetSocketAddress34);
        java.lang.String str36 = quorumServer35.toString();
        quorumServer35.hostname = "hi!";
        quorumServer35.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = quorumServer35.type;
        quorumServer24.type = learnerType40;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress11, inetSocketAddress12, inetSocketAddress13, learnerType40);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress8, inetSocketAddress9, learnerType40);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType40);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1, inetSocketAddress2, learnerType40);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ":participant" + "'", str36, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType40 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType40.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress1);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer7.hostname = "hi!";
        quorumServer7.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = quorumServer7.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, learnerType12);
        quorumServer13.isClientAddrFromStatic = true;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType12 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType12.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress18, inetSocketAddress19, learnerType20);
        quorumServer21.hostname = "hi!";
        quorumServer21.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress27);
        quorumServer21.checkAddressDuplicate(quorumServer28);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = quorumServer28.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress15, inetSocketAddress16, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress11, inetSocketAddress12, inetSocketAddress13, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress8, inetSocketAddress9, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1, inetSocketAddress2, learnerType30);
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer14.addr;
        quorumServer4.addr = multipleAddresses18;
        java.net.InetSocketAddress inetSocketAddress20 = quorumServer4.clientAddr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNull(inetSocketAddress20);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress7, inetSocketAddress8, inetSocketAddress9, learnerType10);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer11.electionAddr;
        quorumServer11.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer11.addr;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress17, inetSocketAddress18, inetSocketAddress19);
        java.lang.String str21 = quorumServer20.toString();
        long long22 = quorumServer20.getId();
        quorumServer20.id = 100L;
        quorumServer20.recreateSocketAddresses();
        quorumServer11.checkAddressDuplicate(quorumServer20);
        quorumServer20.id = (-1L);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer20.type;
        quorumServer5.type = learnerType29;
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        quorumServer4.id = (byte) -1;
        java.lang.Class<?> wildcardClass13 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        quorumServer5.checkAddressDuplicate(quorumServer10);
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress16, inetSocketAddress17, learnerType18);
        boolean boolean21 = quorumServer19.equals((java.lang.Object) 35L);
        long long22 = quorumServer19.id;
        quorumServer10.checkAddressDuplicate(quorumServer19);
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        quorumServer28.hostname = "hi!";
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = quorumServer28.type;
        quorumServer19.type = learnerType32;
        quorumServer19.isClientAddrFromStatic = false;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType32 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType32.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType7);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer8.electionAddr;
        quorumServer8.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer8.addr;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.lang.String str18 = quorumServer17.toString();
        long long19 = quorumServer17.getId();
        quorumServer17.id = 100L;
        quorumServer17.recreateSocketAddresses();
        quorumServer8.checkAddressDuplicate(quorumServer17);
        quorumServer17.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService29 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService29.start();
        workerService29.stop();
        workerService29.stop();
        workerService29.stop();
        boolean boolean34 = quorumServer17.equals((java.lang.Object) workerService29);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses35 = quorumServer17.electionAddr;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress41, inetSocketAddress42, learnerType43);
        boolean boolean45 = quorumServer44.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType46 = null;
        quorumServer44.type = learnerType46;
        java.lang.String str48 = quorumServer44.toString();
        long long49 = quorumServer44.getId();
        java.net.InetSocketAddress inetSocketAddress51 = null;
        java.net.InetSocketAddress inetSocketAddress52 = null;
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        java.net.InetSocketAddress inetSocketAddress58 = null;
        java.net.InetSocketAddress inetSocketAddress59 = null;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer61 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress58, inetSocketAddress59, inetSocketAddress60);
        java.lang.String str62 = quorumServer61.toString();
        quorumServer61.hostname = "hi!";
        quorumServer61.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType66 = quorumServer61.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer67 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress55, inetSocketAddress56, learnerType66);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer68 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress51, inetSocketAddress52, inetSocketAddress53, learnerType66);
        quorumServer44.type = learnerType66;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer70 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress37, inetSocketAddress38, inetSocketAddress39, learnerType66);
        java.lang.String str71 = quorumServer70.hostname;
        quorumServer70.id = 0L;
        java.net.InetSocketAddress inetSocketAddress75 = null;
        java.net.InetSocketAddress inetSocketAddress76 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType77 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer78 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress75, inetSocketAddress76, learnerType77);
        quorumServer78.isClientAddrFromStatic = true;
        java.lang.String str81 = quorumServer78.hostname;
        java.net.InetSocketAddress inetSocketAddress83 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer84 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress83);
        quorumServer84.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses87 = quorumServer84.addr;
        quorumServer78.electionAddr = multipleAddresses87;
        quorumServer70.electionAddr = multipleAddresses87;
        quorumServer17.checkAddressDuplicate(quorumServer70);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType91 = quorumServer70.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer92 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1, inetSocketAddress2, learnerType91);
        quorumServer92.id = 0L;
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(multipleAddresses35);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + ":participant" + "'", str62, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType66 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType66.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(multipleAddresses87);
        org.junit.Assert.assertTrue("'" + learnerType91 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType91.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) ' ', true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress15, inetSocketAddress16, learnerType17);
        quorumServer18.hostname = "hi!";
        quorumServer18.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress24);
        quorumServer18.checkAddressDuplicate(quorumServer25);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress5, inetSocketAddress6, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType27);
        quorumServer31.id = (short) 10;
        org.junit.Assert.assertTrue("'" + learnerType27 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType27.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        boolean boolean7 = quorumServer4.isClientAddrFromStatic;
        quorumServer4.hostname = "hi!";
        quorumServer4.hostname = "";
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress27, inetSocketAddress28, learnerType29);
        quorumServer30.hostname = "hi!";
        quorumServer30.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress36);
        quorumServer30.checkAddressDuplicate(quorumServer37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = quorumServer37.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress24, inetSocketAddress25, learnerType39);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress20, inetSocketAddress21, inetSocketAddress22, learnerType39);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress17, inetSocketAddress18, learnerType39);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress13, inetSocketAddress14, inetSocketAddress15, learnerType39);
        long long44 = quorumServer43.id;
        long long45 = quorumServer43.getId();
        quorumServer43.recreateSocketAddresses();
        boolean boolean47 = quorumServer4.equals((java.lang.Object) quorumServer43);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + learnerType39 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType39.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1);
        quorumServer2.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer2.addr;
        long long6 = quorumServer2.id;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress8);
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        quorumServer14.hostname = "hi!";
        quorumServer9.checkAddressDuplicate(quorumServer14);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer14.addr;
        quorumServer2.addr = multipleAddresses19;
        org.junit.Assert.assertNotNull(multipleAddresses5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses19);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress8, inetSocketAddress9, learnerType10);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        quorumServer11.clientAddr = inetSocketAddress12;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer11.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        quorumServer11.type = learnerType15;
        java.net.InetSocketAddress inetSocketAddress17 = quorumServer11.clientAddr;
        quorumServer11.hostname = ":participant";
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        quorumServer11.type = learnerType20;
        quorumServer5.checkAddressDuplicate(quorumServer11);
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress24, inetSocketAddress25);
        quorumServer26.hostname = ":participant";
        quorumServer5.checkAddressDuplicate(quorumServer26);
        org.junit.Assert.assertNull(learnerType14);
        org.junit.Assert.assertNull(inetSocketAddress17);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer14.addr;
        quorumServer4.addr = multipleAddresses18;
        quorumServer4.hostname = "";
        long long22 = quorumServer4.getId();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer5.addr;
        java.lang.String str10 = quorumServer5.toString();
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        boolean boolean11 = quorumServer10.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        quorumServer10.type = learnerType12;
        java.lang.String str14 = quorumServer10.toString();
        long long15 = quorumServer10.getId();
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        quorumServer27.hostname = "hi!";
        quorumServer27.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = quorumServer27.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress21, inetSocketAddress22, learnerType32);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress17, inetSocketAddress18, inetSocketAddress19, learnerType32);
        quorumServer10.type = learnerType32;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress4, inetSocketAddress5, learnerType32);
        java.lang.String str37 = quorumServer36.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses38 = quorumServer36.addr;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = quorumServer36.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(32L, inetSocketAddress1, inetSocketAddress2, learnerType39);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType32 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType32.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(multipleAddresses38);
        org.junit.Assert.assertTrue("'" + learnerType39 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType39.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress1);
        quorumServer2.id = (byte) 0;
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.lang.String str9 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress11, inetSocketAddress12);
        quorumServer4.checkAddressDuplicate(quorumServer13);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress16 = quorumServer4.clientAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + learnerType15 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType15.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(inetSocketAddress16);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        quorumServer4.type = learnerType6;
        java.lang.String str8 = quorumServer4.toString();
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        java.lang.String str11 = quorumServer4.toString();
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress13, inetSocketAddress14, inetSocketAddress15);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = quorumServer16.type;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress19, inetSocketAddress20, learnerType21);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = null;
        quorumServer22.type = learnerType23;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer22.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer22.addr;
        quorumServer16.addr = multipleAddresses26;
        quorumServer4.electionAddr = multipleAddresses26;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + learnerType17 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType17.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertNotNull(multipleAddresses26);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.net.InetSocketAddress inetSocketAddress21 = quorumServer14.clientAddr;
        long long22 = quorumServer14.getId();
        java.lang.String str23 = quorumServer14.hostname;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inetSocketAddress21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) true);
        quorumServer4.recreateSocketAddresses();
        quorumServer4.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress19, inetSocketAddress20, inetSocketAddress21, learnerType22);
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress25, inetSocketAddress26, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        quorumServer28.type = learnerType29;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer28.electionAddr;
        quorumServer23.checkAddressDuplicate(quorumServer28);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer23.electionAddr;
        quorumServer17.electionAddr = multipleAddresses33;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress41, inetSocketAddress42, inetSocketAddress43, learnerType44);
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType49 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer50 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress47, inetSocketAddress48, learnerType49);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = null;
        quorumServer50.type = learnerType51;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses53 = quorumServer50.electionAddr;
        quorumServer45.checkAddressDuplicate(quorumServer50);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer45.electionAddr;
        quorumServer39.electionAddr = multipleAddresses55;
        quorumServer17.addr = multipleAddresses55;
        quorumServer4.checkAddressDuplicate(quorumServer17);
        java.net.InetSocketAddress inetSocketAddress59 = null;
        quorumServer4.clientAddr = inetSocketAddress59;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNotNull(multipleAddresses33);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertNotNull(multipleAddresses55);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress7, inetSocketAddress8, inetSocketAddress9);
        java.lang.String str11 = quorumServer10.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer10.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        boolean boolean15 = quorumServer10.equals((java.lang.Object) "hi!");
        quorumServer4.checkAddressDuplicate(quorumServer10);
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer21.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.electionAddr;
        java.lang.String str25 = quorumServer21.hostname;
        java.lang.String str26 = quorumServer21.hostname;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress28, inetSocketAddress29);
        quorumServer21.checkAddressDuplicate(quorumServer30);
        quorumServer4.checkAddressDuplicate(quorumServer30);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":participant" + "'", str11, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress7, inetSocketAddress8, inetSocketAddress9);
        java.lang.String str11 = quorumServer10.toString();
        long long12 = quorumServer10.getId();
        java.net.InetSocketAddress inetSocketAddress13 = null;
        quorumServer10.clientAddr = inetSocketAddress13;
        quorumServer10.id = (-1);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = quorumServer10.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress4, inetSocketAddress5, learnerType17);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, inetSocketAddress1, inetSocketAddress2, learnerType17);
        java.lang.String str20 = quorumServer19.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":participant" + "'", str11, ":participant");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType17 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType17.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":participant" + "'", str20, ":participant");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2);
        quorumServer3.recreateSocketAddresses();
        quorumServer3.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = quorumServer3.type;
        org.junit.Assert.assertTrue("'" + learnerType6 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType6.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress5 = quorumServer4.clientAddr;
        org.junit.Assert.assertNull(inetSocketAddress5);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        long long9 = quorumServer4.getId();
        quorumServer4.id = 35L;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer4.addr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses12);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        java.lang.String str11 = quorumServer4.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer4.electionAddr;
        long long13 = quorumServer4.getId();
        long long14 = quorumServer4.getId();
        java.lang.String str15 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        workerService3.join((long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        quorumServer4.hostname = "hi!";
        quorumServer4.id = ' ';
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        java.lang.String str14 = quorumServer10.toString();
        quorumServer10.isClientAddrFromStatic = true;
        boolean boolean17 = quorumServer4.equals((java.lang.Object) quorumServer10);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.lang.String str7 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress9);
        quorumServer10.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.addr;
        quorumServer4.electionAddr = multipleAddresses13;
        long long15 = quorumServer4.id;
        quorumServer4.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress19, inetSocketAddress20, inetSocketAddress21);
        java.lang.String str23 = quorumServer22.toString();
        long long24 = quorumServer22.getId();
        java.net.InetSocketAddress inetSocketAddress25 = null;
        quorumServer22.clientAddr = inetSocketAddress25;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses27 = quorumServer22.addr;
        quorumServer4.checkAddressDuplicate(quorumServer22);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer22.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer22.electionAddr;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":participant" + "'", str23, ":participant");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNotNull(multipleAddresses30);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.join((long) 0);
        workerService3.start();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean8 = quorumServer4.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer4.addr = multipleAddresses15;
        long long17 = quorumServer4.getId();
        java.lang.String str18 = quorumServer4.toString();
        java.lang.String str19 = quorumServer4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":participant" + "'", str19, ":participant");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer7.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        java.lang.String str11 = quorumServer7.hostname;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        quorumServer7.clientAddr = inetSocketAddress12;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer7.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1, inetSocketAddress2, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer15.type;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + learnerType14 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType14.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer5.addr;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        long long16 = quorumServer14.getId();
        quorumServer14.id = 100L;
        quorumServer14.recreateSocketAddresses();
        quorumServer5.checkAddressDuplicate(quorumServer14);
        quorumServer14.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService26 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService26.start();
        workerService26.stop();
        workerService26.stop();
        workerService26.stop();
        boolean boolean31 = quorumServer14.equals((java.lang.Object) workerService26);
        java.lang.String str32 = quorumServer14.hostname;
        java.lang.Class<?> wildcardClass33 = quorumServer14.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress5, inetSocketAddress6, learnerType7);
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress10, inetSocketAddress11, inetSocketAddress12);
        java.lang.String str14 = quorumServer13.toString();
        long long15 = quorumServer13.getId();
        quorumServer13.id = 100L;
        quorumServer13.recreateSocketAddresses();
        boolean boolean19 = quorumServer8.equals((java.lang.Object) quorumServer13);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = quorumServer13.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType20);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + learnerType20 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType20.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        quorumServer4.id = '4';
        quorumServer4.isClientAddrFromStatic = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7);
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress10, inetSocketAddress11, inetSocketAddress12);
        java.lang.String str14 = quorumServer13.toString();
        quorumServer13.hostname = "hi!";
        quorumServer8.checkAddressDuplicate(quorumServer13);
        quorumServer13.recreateSocketAddresses();
        quorumServer4.checkAddressDuplicate(quorumServer13);
        org.junit.Assert.assertNull(learnerType5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress4, inetSocketAddress5, learnerType6);
        quorumServer7.hostname = "hi!";
        quorumServer7.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress13);
        quorumServer7.checkAddressDuplicate(quorumServer14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer14.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType16);
        quorumServer17.id = 32L;
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.junit.Assert.assertNull(learnerType7);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 1);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress1);
        long long3 = quorumServer2.getId();
        quorumServer2.recreateSocketAddresses();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress4, inetSocketAddress5, learnerType6);
        quorumServer7.hostname = "hi!";
        quorumServer7.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress13);
        quorumServer7.checkAddressDuplicate(quorumServer14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer14.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) -1, inetSocketAddress1, inetSocketAddress2, learnerType16);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer17.electionAddr;
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses18);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) -1;
        long long9 = quorumServer4.getId();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses11 = quorumServer4.addr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + learnerType10 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType10.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses11);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", 100, true);
        workerService3.stop();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer7.type = learnerType8;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        quorumServer7.clientAddr = inetSocketAddress11;
        boolean boolean13 = quorumServer7.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress15, inetSocketAddress16, learnerType17);
        boolean boolean20 = quorumServer18.equals((java.lang.Object) 35L);
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress29, inetSocketAddress30, inetSocketAddress31, learnerType32);
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress35, inetSocketAddress36, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        quorumServer38.type = learnerType39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        quorumServer33.checkAddressDuplicate(quorumServer38);
        quorumServer38.id = ' ';
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress46, inetSocketAddress47, inetSocketAddress48);
        java.lang.String str50 = quorumServer49.toString();
        quorumServer49.hostname = "hi!";
        quorumServer49.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType54 = quorumServer49.type;
        quorumServer38.type = learnerType54;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress25, inetSocketAddress26, inetSocketAddress27, learnerType54);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress22, inetSocketAddress23, learnerType54);
        quorumServer18.type = learnerType54;
        quorumServer7.type = learnerType54;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer60 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress1, inetSocketAddress2, learnerType54);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":participant" + "'", str50, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType54 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType54.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType8);
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        quorumServer14.type = learnerType15;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        quorumServer9.checkAddressDuplicate(quorumServer14);
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress20, inetSocketAddress21, inetSocketAddress22);
        java.lang.String str24 = quorumServer23.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer23.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        java.lang.String str27 = quorumServer23.hostname;
        java.lang.String str28 = quorumServer23.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        quorumServer23.type = learnerType29;
        boolean boolean31 = quorumServer9.equals((java.lang.Object) quorumServer23);
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress33, inetSocketAddress34, inetSocketAddress35);
        java.lang.String str37 = quorumServer36.toString();
        quorumServer36.hostname = "hi!";
        quorumServer36.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = quorumServer36.type;
        quorumServer23.type = learnerType41;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType41);
        java.net.InetSocketAddress inetSocketAddress44 = null;
        quorumServer43.clientAddr = inetSocketAddress44;
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":participant" + "'", str24, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":participant" + "'", str37, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType41 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType41.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        long long5 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress7, inetSocketAddress8, inetSocketAddress9);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses11 = quorumServer10.electionAddr;
        quorumServer4.checkAddressDuplicate(quorumServer10);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress25, inetSocketAddress26, inetSocketAddress27, learnerType28);
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress31, inetSocketAddress32, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        quorumServer34.type = learnerType35;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer34.electionAddr;
        quorumServer29.checkAddressDuplicate(quorumServer34);
        quorumServer34.id = ' ';
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress42, inetSocketAddress43, inetSocketAddress44);
        java.lang.String str46 = quorumServer45.toString();
        quorumServer45.hostname = "hi!";
        quorumServer45.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType50 = quorumServer45.type;
        quorumServer34.type = learnerType50;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer52 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress21, inetSocketAddress22, inetSocketAddress23, learnerType50);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress17, inetSocketAddress18, inetSocketAddress19, learnerType50);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress14, inetSocketAddress15, learnerType50);
        quorumServer10.type = learnerType50;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(multipleAddresses11);
        org.junit.Assert.assertNotNull(multipleAddresses37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":participant" + "'", str46, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType50 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType50.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType11);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        quorumServer12.checkAddressDuplicate(quorumServer17);
        quorumServer17.id = ' ';
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        quorumServer28.hostname = "hi!";
        quorumServer28.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = quorumServer28.type;
        quorumServer17.type = learnerType33;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1, inetSocketAddress2, learnerType33);
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress38, inetSocketAddress39, learnerType40);
        quorumServer41.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        quorumServer41.clientAddr = inetSocketAddress44;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses46 = quorumServer41.electionAddr;
        quorumServer41.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress50 = null;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        java.net.InetSocketAddress inetSocketAddress52 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress50, inetSocketAddress51, inetSocketAddress52);
        java.lang.String str54 = quorumServer53.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer53.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses56 = quorumServer53.electionAddr;
        boolean boolean58 = quorumServer53.equals((java.lang.Object) "hi!");
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses59 = quorumServer53.electionAddr;
        quorumServer41.addr = multipleAddresses59;
        quorumServer36.addr = multipleAddresses59;
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ":participant" + "'", str54, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertNotNull(multipleAddresses56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(multipleAddresses59);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.recreateSocketAddresses();
        java.lang.String str6 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer11.addr;
        quorumServer4.checkAddressDuplicate(quorumServer11);
        boolean boolean15 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress15, inetSocketAddress16, learnerType17);
        quorumServer18.hostname = "hi!";
        quorumServer18.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress24);
        quorumServer18.checkAddressDuplicate(quorumServer25);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress5, inetSocketAddress6, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType27);
        long long32 = quorumServer31.id;
        long long33 = quorumServer31.getId();
        quorumServer31.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress36, inetSocketAddress37, inetSocketAddress38, learnerType39);
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress42, inetSocketAddress43, learnerType44);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType46 = null;
        quorumServer45.type = learnerType46;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer45.electionAddr;
        quorumServer40.checkAddressDuplicate(quorumServer45);
        quorumServer45.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses51 = quorumServer45.electionAddr;
        quorumServer31.addr = multipleAddresses51;
        org.junit.Assert.assertTrue("'" + learnerType27 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType27.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertNotNull(multipleAddresses51);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        java.lang.String str7 = quorumServer4.hostname;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress13, inetSocketAddress14, learnerType15);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        quorumServer16.type = learnerType17;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress20, inetSocketAddress21, inetSocketAddress22, learnerType23);
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress26, inetSocketAddress27, learnerType28);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer29.type = learnerType30;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer29.electionAddr;
        quorumServer24.checkAddressDuplicate(quorumServer29);
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress35, inetSocketAddress36, inetSocketAddress37);
        java.lang.String str39 = quorumServer38.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses40 = quorumServer38.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        java.lang.String str42 = quorumServer38.hostname;
        java.lang.String str43 = quorumServer38.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        quorumServer38.type = learnerType44;
        boolean boolean46 = quorumServer24.equals((java.lang.Object) quorumServer38);
        java.net.InetSocketAddress inetSocketAddress48 = null;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer51 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress48, inetSocketAddress49, inetSocketAddress50);
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType56 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress53, inetSocketAddress54, inetSocketAddress55, learnerType56);
        java.net.InetSocketAddress inetSocketAddress59 = null;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer62 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress59, inetSocketAddress60, learnerType61);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType63 = null;
        quorumServer62.type = learnerType63;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses65 = quorumServer62.electionAddr;
        quorumServer57.checkAddressDuplicate(quorumServer62);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses67 = quorumServer57.electionAddr;
        quorumServer51.electionAddr = multipleAddresses67;
        quorumServer38.addr = multipleAddresses67;
        quorumServer16.checkAddressDuplicate(quorumServer38);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses71 = quorumServer16.electionAddr;
        quorumServer4.addr = multipleAddresses71;
        java.net.InetSocketAddress inetSocketAddress73 = null;
        quorumServer4.clientAddr = inetSocketAddress73;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(learnerType11);
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ":participant" + "'", str39, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses40);
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(multipleAddresses65);
        org.junit.Assert.assertNotNull(multipleAddresses67);
        org.junit.Assert.assertNotNull(multipleAddresses71);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"this.workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress12, inetSocketAddress13, inetSocketAddress14);
        java.lang.String str16 = quorumServer15.toString();
        quorumServer15.hostname = "hi!";
        quorumServer15.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = quorumServer15.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress9, inetSocketAddress10, learnerType20);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType20);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType20);
        quorumServer23.isClientAddrFromStatic = false;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":participant" + "'", str16, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType20 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType20.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) "hi!");
        boolean boolean10 = quorumServer4.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress12, inetSocketAddress13, learnerType14);
        quorumServer15.hostname = "hi!";
        quorumServer15.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress21);
        quorumServer15.checkAddressDuplicate(quorumServer22);
        quorumServer4.checkAddressDuplicate(quorumServer22);
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress26, inetSocketAddress27, learnerType28);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer29.type = learnerType30;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer29.electionAddr;
        java.lang.String str33 = quorumServer29.toString();
        long long34 = quorumServer29.id;
        long long35 = quorumServer29.id;
        org.apache.zookeeper.server.WorkerService workerService39 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        boolean boolean40 = quorumServer29.equals((java.lang.Object) workerService39);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer29.addr;
        quorumServer22.addr = multipleAddresses41;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(multipleAddresses41);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 100, true);
        workerService3.join(10L);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join((long) ' ');
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer14.addr;
        quorumServer4.addr = multipleAddresses18;
        quorumServer4.hostname = "";
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        long long28 = quorumServer26.getId();
        quorumServer26.id = (short) 0;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        quorumServer26.clientAddr = inetSocketAddress31;
        quorumServer4.checkAddressDuplicate(quorumServer26);
        java.lang.String str34 = quorumServer4.toString();
        long long35 = quorumServer4.id;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType8 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType8.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType9 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType9.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) "hi!");
        long long10 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress12, inetSocketAddress13, inetSocketAddress14);
        java.lang.String str16 = quorumServer15.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer15.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        java.lang.String str19 = quorumServer15.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer15.addr;
        quorumServer4.checkAddressDuplicate(quorumServer15);
        boolean boolean22 = quorumServer15.isClientAddrFromStatic;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":participant" + "'", str16, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        workerService3.join((long) '#');
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        quorumServer11.hostname = "hi!";
        quorumServer11.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer11.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress5, inetSocketAddress6, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType16);
        quorumServer18.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer18.addr;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses20);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress5, inetSocketAddress6, learnerType7);
        boolean boolean9 = quorumServer8.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        quorumServer8.type = learnerType10;
        java.lang.String str12 = quorumServer8.toString();
        long long13 = quorumServer8.getId();
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress22, inetSocketAddress23, inetSocketAddress24);
        java.lang.String str26 = quorumServer25.toString();
        quorumServer25.hostname = "hi!";
        quorumServer25.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress19, inetSocketAddress20, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress15, inetSocketAddress16, inetSocketAddress17, learnerType30);
        quorumServer8.type = learnerType30;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType30);
        java.lang.String str35 = quorumServer34.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses36 = quorumServer34.addr;
        long long37 = quorumServer34.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(multipleAddresses36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress8, inetSocketAddress9, learnerType10);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        quorumServer11.clientAddr = inetSocketAddress12;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer11.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        quorumServer11.type = learnerType15;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer11.addr;
        quorumServer4.addr = multipleAddresses17;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = quorumServer4.type;
        org.junit.Assert.assertNull(learnerType14);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertNull(learnerType19);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str21 = quorumServer14.hostname;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress23, inetSocketAddress24, learnerType25);
        java.net.InetSocketAddress inetSocketAddress27 = null;
        quorumServer26.clientAddr = inetSocketAddress27;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer26.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer26.type = learnerType30;
        quorumServer26.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress35, inetSocketAddress36, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        quorumServer38.type = learnerType39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        java.lang.String str42 = quorumServer38.toString();
        long long43 = quorumServer38.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses44 = quorumServer38.electionAddr;
        quorumServer26.addr = multipleAddresses44;
        boolean boolean46 = quorumServer14.equals((java.lang.Object) quorumServer26);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType47 = quorumServer14.type;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(learnerType29);
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + learnerType47 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType47.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = quorumServer2.type;
        org.junit.Assert.assertTrue("'" + learnerType3 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType3.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) true);
        quorumServer4.recreateSocketAddresses();
        quorumServer4.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        java.lang.String str21 = quorumServer17.toString();
        long long22 = quorumServer17.id;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer27.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.electionAddr;
        boolean boolean32 = quorumServer27.equals((java.lang.Object) true);
        quorumServer17.checkAddressDuplicate(quorumServer27);
        java.lang.String str34 = quorumServer27.hostname;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress36, inetSocketAddress37, learnerType38);
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress41, inetSocketAddress42, inetSocketAddress43);
        java.lang.String str45 = quorumServer44.toString();
        long long46 = quorumServer44.getId();
        quorumServer44.id = 100L;
        quorumServer44.recreateSocketAddresses();
        boolean boolean50 = quorumServer39.equals((java.lang.Object) quorumServer44);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = quorumServer44.type;
        quorumServer27.type = learnerType51;
        quorumServer4.checkAddressDuplicate(quorumServer27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ":participant" + "'", str45, ":participant");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 35L + "'", long46 == 35L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + learnerType51 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType51.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress10, inetSocketAddress11, inetSocketAddress12);
        java.lang.String str14 = quorumServer13.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer13.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        java.lang.String str17 = quorumServer13.hostname;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        quorumServer13.clientAddr = inetSocketAddress18;
        boolean boolean20 = quorumServer4.equals((java.lang.Object) inetSocketAddress18);
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress22, inetSocketAddress23, inetSocketAddress24, learnerType25);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses27 = quorumServer26.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses28 = quorumServer26.electionAddr;
        quorumServer4.addr = multipleAddresses28;
        boolean boolean30 = quorumServer4.isClientAddrFromStatic;
        java.lang.String str31 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) -1, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        quorumServer4.hostname = "";
        quorumServer4.recreateSocketAddresses();
        quorumServer4.isClientAddrFromStatic = true;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer7.hostname = "hi!";
        quorumServer2.checkAddressDuplicate(quorumServer7);
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress20, inetSocketAddress21, inetSocketAddress22, learnerType23);
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress26, inetSocketAddress27, learnerType28);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer29.type = learnerType30;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer29.electionAddr;
        quorumServer24.checkAddressDuplicate(quorumServer29);
        quorumServer29.id = ' ';
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress37, inetSocketAddress38, inetSocketAddress39);
        java.lang.String str41 = quorumServer40.toString();
        quorumServer40.hostname = "hi!";
        quorumServer40.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = quorumServer40.type;
        quorumServer29.type = learnerType45;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress17, inetSocketAddress18, learnerType45);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress13, inetSocketAddress14, inetSocketAddress15, learnerType45);
        quorumServer2.type = learnerType45;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType50 = quorumServer2.type;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":participant" + "'", str41, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType45 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType45.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType50 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType50.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 100, true);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.getId();
        boolean boolean10 = quorumServer4.isClientAddrFromStatic;
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress13, inetSocketAddress14, learnerType15);
        quorumServer16.hostname = "hi!";
        quorumServer16.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress22);
        quorumServer16.checkAddressDuplicate(quorumServer23);
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress26, inetSocketAddress27, learnerType28);
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress31, inetSocketAddress32, inetSocketAddress33);
        java.lang.String str35 = quorumServer34.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses36 = quorumServer34.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer34.electionAddr;
        boolean boolean39 = quorumServer34.equals((java.lang.Object) true);
        quorumServer34.recreateSocketAddresses();
        quorumServer34.hostname = ":participant";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer34.addr;
        quorumServer29.addr = multipleAddresses43;
        boolean boolean45 = quorumServer16.equals((java.lang.Object) quorumServer29);
        long long46 = quorumServer16.getId();
        boolean boolean47 = quorumServer4.equals((java.lang.Object) long46);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ":participant" + "'", str35, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses36);
        org.junit.Assert.assertNotNull(multipleAddresses37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(multipleAddresses43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 10);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) -1, true);
        workerService3.start();
        workerService3.join((long) (-1));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        quorumServer4.id = (short) 10;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.addr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress10, inetSocketAddress11, learnerType12);
        quorumServer13.hostname = "hi!";
        quorumServer13.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress19);
        quorumServer13.checkAddressDuplicate(quorumServer20);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = quorumServer20.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType22);
        quorumServer4.type = learnerType22;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        quorumServer4.clientAddr = inetSocketAddress25;
        org.junit.Assert.assertNotNull(multipleAddresses5);
        org.junit.Assert.assertTrue("'" + learnerType22 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType22.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2);
        java.lang.String str4 = quorumServer3.hostname;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress7, inetSocketAddress8, inetSocketAddress9);
        java.lang.String str11 = quorumServer10.toString();
        quorumServer10.hostname = "hi!";
        quorumServer10.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = quorumServer10.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress4, inetSocketAddress5, learnerType15);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress1, inetSocketAddress2, learnerType15);
        java.lang.String str18 = quorumServer17.hostname;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":participant" + "'", str11, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType15 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType15.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) '#', true);
        workerService3.start();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        quorumServer4.isClientAddrFromStatic = false;
        java.lang.String str13 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        quorumServer4.clientAddr = inetSocketAddress14;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = quorumServer24.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress17, inetSocketAddress18, inetSocketAddress19, learnerType25);
        java.net.InetSocketAddress inetSocketAddress27 = null;
        quorumServer26.clientAddr = inetSocketAddress27;
        boolean boolean29 = quorumServer26.isClientAddrFromStatic;
        quorumServer26.isClientAddrFromStatic = false;
        boolean boolean32 = quorumServer4.equals((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + learnerType25 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType25.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) 0);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        quorumServer5.recreateSocketAddresses();
        quorumServer5.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses6);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.start();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) 0);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) 0;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        boolean boolean16 = quorumServer15.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress27, inetSocketAddress28, inetSocketAddress29, learnerType30);
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress33, inetSocketAddress34, learnerType35);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        quorumServer36.type = learnerType37;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses39 = quorumServer36.electionAddr;
        quorumServer31.checkAddressDuplicate(quorumServer36);
        quorumServer36.id = ' ';
        java.net.InetSocketAddress inetSocketAddress44 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress44, inetSocketAddress45, inetSocketAddress46);
        java.lang.String str48 = quorumServer47.toString();
        quorumServer47.hostname = "hi!";
        quorumServer47.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType52 = quorumServer47.type;
        quorumServer36.type = learnerType52;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress24, inetSocketAddress25, learnerType52);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer55 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress21, inetSocketAddress22, learnerType52);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress18, inetSocketAddress19, learnerType52);
        quorumServer15.type = learnerType52;
        quorumServer4.type = learnerType52;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multipleAddresses39);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":participant" + "'", str48, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType52 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType52.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str21 = quorumServer14.hostname;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress27, inetSocketAddress28, inetSocketAddress29);
        java.lang.String str31 = quorumServer30.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer30.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer30.electionAddr;
        java.lang.String str34 = quorumServer30.hostname;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        quorumServer30.clientAddr = inetSocketAddress35;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = quorumServer30.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress23, inetSocketAddress24, inetSocketAddress25, learnerType37);
        quorumServer14.type = learnerType37;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":participant" + "'", str31, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertNotNull(multipleAddresses33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (byte) 0);
        workerService3.join((long) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses8 = quorumServer4.addr;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNotNull(multipleAddresses8);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 100);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress19, inetSocketAddress20, learnerType21);
        quorumServer22.hostname = "hi!";
        quorumServer22.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress28);
        quorumServer22.checkAddressDuplicate(quorumServer29);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = quorumServer29.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress16, inetSocketAddress17, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress12, inetSocketAddress13, inetSocketAddress14, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress9, inetSocketAddress10, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType31);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer36.addr;
        org.junit.Assert.assertTrue("'" + learnerType31 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType31.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses37);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer5.electionAddr;
        long long8 = quorumServer5.id;
        long long9 = quorumServer5.id;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.recreateSocketAddresses();
        quorumServer4.id = 52L;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        org.junit.Assert.assertNull(learnerType5);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.join((long) (short) -1);
        workerService3.start();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.lang.String str7 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress9);
        quorumServer10.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.addr;
        quorumServer4.electionAddr = multipleAddresses13;
        boolean boolean15 = quorumServer4.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        quorumServer4.clientAddr = inetSocketAddress16;
        quorumServer4.hostname = "hi!";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) true);
        quorumServer4.id = 1L;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        workerService3.join((long) (byte) 100);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.lang.String str9 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress11, inetSocketAddress12);
        quorumServer4.checkAddressDuplicate(quorumServer13);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = quorumServer4.type;
        quorumServer4.hostname = ":participant";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + learnerType15 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType15.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer4.type = learnerType8;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress12, inetSocketAddress13, learnerType14);
        quorumServer15.isClientAddrFromStatic = true;
        java.lang.String str18 = quorumServer15.hostname;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress20);
        quorumServer21.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.addr;
        quorumServer15.electionAddr = multipleAddresses24;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress45, inetSocketAddress46, inetSocketAddress47);
        java.lang.String str49 = quorumServer48.toString();
        quorumServer48.hostname = "hi!";
        quorumServer48.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType53 = quorumServer48.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress42, inetSocketAddress43, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer55 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress38, inetSocketAddress39, inetSocketAddress40, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress35, inetSocketAddress36, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress31, inetSocketAddress32, inetSocketAddress33, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer58 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress27, inetSocketAddress28, inetSocketAddress29, learnerType53);
        quorumServer15.type = learnerType53;
        quorumServer15.id = (short) 1;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses62 = quorumServer15.electionAddr;
        quorumServer4.addr = multipleAddresses62;
        java.net.InetSocketAddress inetSocketAddress64 = null;
        quorumServer4.clientAddr = inetSocketAddress64;
        org.junit.Assert.assertNull(learnerType7);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ":participant" + "'", str49, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType53 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType53.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses62);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress1, inetSocketAddress2);
        quorumServer3.hostname = "";
        long long6 = quorumServer3.id;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = 100L;
        quorumServer4.recreateSocketAddresses();
        quorumServer4.id = 0;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress13, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer17.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer17.electionAddr;
        quorumServer4.addr = multipleAddresses19;
        long long21 = quorumServer4.getId();
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        long long5 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress6 = quorumServer4.clientAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress8 = quorumServer4.clientAddr;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(inetSocketAddress8);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        quorumServer4.id = (short) 10;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.junit.Assert.assertTrue("'" + learnerType7 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType7.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.start();
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.join((long) 0);
        workerService3.join((long) 10);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        boolean boolean6 = quorumServer4.isClientAddrFromStatic;
        long long7 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress8 = quorumServer4.clientAddr;
        boolean boolean9 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(inetSocketAddress8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean8 = quorumServer4.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer4.addr = multipleAddresses15;
        long long17 = quorumServer4.getId();
        java.lang.String str18 = quorumServer4.toString();
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress20, inetSocketAddress21, learnerType22);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = null;
        quorumServer23.type = learnerType24;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        java.lang.String str27 = quorumServer23.toString();
        quorumServer4.checkAddressDuplicate(quorumServer23);
        org.apache.zookeeper.server.WorkerService workerService32 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        boolean boolean33 = quorumServer23.equals((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.net.InetSocketAddress inetSocketAddress21 = quorumServer14.clientAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inetSocketAddress21);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        quorumServer5.checkAddressDuplicate(quorumServer10);
        quorumServer10.recreateSocketAddresses();
        quorumServer10.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses13);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        boolean boolean6 = quorumServer4.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = quorumServer4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":participant" + "'", str7, ":participant");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress1);
        long long3 = quorumServer2.getId();
        java.net.InetSocketAddress inetSocketAddress4 = null;
        quorumServer2.clientAddr = inetSocketAddress4;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress4, inetSocketAddress5, learnerType6);
        quorumServer7.hostname = "";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        quorumServer2.electionAddr = multipleAddresses10;
        long long12 = quorumServer2.getId();
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 'a');
        workerService3.join((long) 0);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer7.hostname = "hi!";
        quorumServer7.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = quorumServer7.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, learnerType12);
        quorumServer13.id = (short) 100;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer13.type;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType12 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType12.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress7, inetSocketAddress8, inetSocketAddress9, learnerType10);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer11.electionAddr;
        quorumServer11.id = 35L;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress16, inetSocketAddress17, learnerType18);
        boolean boolean20 = quorumServer19.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        quorumServer19.type = learnerType21;
        java.lang.String str23 = quorumServer19.toString();
        long long24 = quorumServer19.getId();
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress33, inetSocketAddress34, inetSocketAddress35);
        java.lang.String str37 = quorumServer36.toString();
        quorumServer36.hostname = "hi!";
        quorumServer36.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = quorumServer36.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress30, inetSocketAddress31, learnerType41);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress26, inetSocketAddress27, inetSocketAddress28, learnerType41);
        quorumServer19.type = learnerType41;
        quorumServer11.type = learnerType41;
        quorumServer4.type = learnerType41;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType47 = quorumServer4.type;
        org.junit.Assert.assertNull(learnerType5);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":participant" + "'", str37, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType41 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType41.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType47 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType47.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) true);
        quorumServer4.id = ' ';
        java.lang.String str12 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress10);
        quorumServer4.checkAddressDuplicate(quorumServer11);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        java.lang.String str21 = quorumServer17.toString();
        long long22 = quorumServer17.id;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer27.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.electionAddr;
        boolean boolean32 = quorumServer27.equals((java.lang.Object) true);
        quorumServer17.checkAddressDuplicate(quorumServer27);
        java.lang.String str34 = quorumServer27.hostname;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.lang.String str40 = quorumServer39.toString();
        quorumServer39.hostname = "hi!";
        quorumServer39.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = quorumServer39.type;
        quorumServer27.type = learnerType44;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType46 = quorumServer27.type;
        quorumServer4.type = learnerType46;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        quorumServer4.clientAddr = inetSocketAddress48;
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ":participant" + "'", str40, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType44 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType44.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType46 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType46.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType7);
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress10, inetSocketAddress11, learnerType12);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer13.type = learnerType14;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        quorumServer8.checkAddressDuplicate(quorumServer13);
        quorumServer13.id = ' ';
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        quorumServer13.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = quorumServer31.type;
        java.lang.String str33 = quorumServer31.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer31.electionAddr;
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType32 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType32.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(multipleAddresses34);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress1, inetSocketAddress2);
        boolean boolean4 = quorumServer3.isClientAddrFromStatic;
        java.lang.String str5 = quorumServer3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) 0;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress12, inetSocketAddress13, learnerType14);
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress17, inetSocketAddress18, inetSocketAddress19);
        java.lang.String str21 = quorumServer20.toString();
        long long22 = quorumServer20.getId();
        quorumServer20.id = 100L;
        quorumServer20.recreateSocketAddresses();
        boolean boolean26 = quorumServer15.equals((java.lang.Object) quorumServer20);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses27 = quorumServer15.addr;
        quorumServer4.checkAddressDuplicate(quorumServer15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(multipleAddresses27);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        java.lang.String str6 = quorumServer4.hostname;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer9.type = learnerType16;
        java.lang.String str18 = quorumServer9.hostname;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress20, inetSocketAddress21, learnerType22);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = null;
        quorumServer23.type = learnerType24;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        long long27 = quorumServer23.id;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress29, inetSocketAddress30, inetSocketAddress31, learnerType32);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer33.electionAddr;
        quorumServer33.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer33.addr;
        quorumServer23.addr = multipleAddresses37;
        quorumServer23.hostname = "";
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress42, inetSocketAddress43, inetSocketAddress44);
        java.lang.String str46 = quorumServer45.toString();
        long long47 = quorumServer45.getId();
        quorumServer45.id = (short) 0;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        quorumServer45.clientAddr = inetSocketAddress50;
        quorumServer23.checkAddressDuplicate(quorumServer45);
        quorumServer9.checkAddressDuplicate(quorumServer45);
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType57 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer58 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress55, inetSocketAddress56, learnerType57);
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer63 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress60, inetSocketAddress61, inetSocketAddress62);
        java.lang.String str64 = quorumServer63.toString();
        long long65 = quorumServer63.getId();
        quorumServer63.id = 100L;
        quorumServer63.recreateSocketAddresses();
        boolean boolean69 = quorumServer58.equals((java.lang.Object) quorumServer63);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType70 = null;
        quorumServer63.type = learnerType70;
        java.net.InetSocketAddress inetSocketAddress73 = null;
        java.net.InetSocketAddress inetSocketAddress74 = null;
        java.net.InetSocketAddress inetSocketAddress76 = null;
        java.net.InetSocketAddress inetSocketAddress77 = null;
        java.net.InetSocketAddress inetSocketAddress78 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer79 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress76, inetSocketAddress77, inetSocketAddress78);
        java.lang.String str80 = quorumServer79.toString();
        quorumServer79.hostname = "hi!";
        quorumServer79.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType84 = quorumServer79.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer85 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress73, inetSocketAddress74, learnerType84);
        quorumServer63.type = learnerType84;
        quorumServer45.type = learnerType84;
        java.net.InetSocketAddress inetSocketAddress88 = null;
        quorumServer45.clientAddr = inetSocketAddress88;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses34);
        org.junit.Assert.assertNotNull(multipleAddresses37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":participant" + "'", str46, ":participant");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + ":participant" + "'", str64, ":participant");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 35L + "'", long65 == 35L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + ":participant" + "'", str80, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType84 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType84.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.join((long) 'a');
        workerService3.start();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress5, inetSocketAddress6, learnerType7);
        boolean boolean9 = quorumServer8.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        quorumServer8.type = learnerType10;
        java.lang.String str12 = quorumServer8.toString();
        long long13 = quorumServer8.getId();
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress22, inetSocketAddress23, inetSocketAddress24);
        java.lang.String str26 = quorumServer25.toString();
        quorumServer25.hostname = "hi!";
        quorumServer25.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress19, inetSocketAddress20, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress15, inetSocketAddress16, inetSocketAddress17, learnerType30);
        quorumServer8.type = learnerType30;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType30);
        quorumServer34.isClientAddrFromStatic = false;
        java.lang.String str37 = quorumServer34.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":participant" + "'", str37, ":participant");
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress4, inetSocketAddress5, learnerType6);
        boolean boolean9 = quorumServer7.equals((java.lang.Object) 35L);
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress18, inetSocketAddress19, inetSocketAddress20, learnerType21);
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress24, inetSocketAddress25, learnerType26);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        quorumServer27.type = learnerType28;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.electionAddr;
        quorumServer22.checkAddressDuplicate(quorumServer27);
        quorumServer27.id = ' ';
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress35, inetSocketAddress36, inetSocketAddress37);
        java.lang.String str39 = quorumServer38.toString();
        quorumServer38.hostname = "hi!";
        quorumServer38.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = quorumServer38.type;
        quorumServer27.type = learnerType43;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType43);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress11, inetSocketAddress12, learnerType43);
        quorumServer7.type = learnerType43;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(52L, inetSocketAddress1, inetSocketAddress2, learnerType43);
        long long49 = quorumServer48.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ":participant" + "'", str39, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType43 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType43.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 52L + "'", long49 == 52L);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"this.workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress6, inetSocketAddress7, learnerType8);
        quorumServer9.isClientAddrFromStatic = true;
        java.lang.String str12 = quorumServer9.hostname;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress14);
        quorumServer15.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.addr;
        quorumServer9.electionAddr = multipleAddresses18;
        long long20 = quorumServer9.id;
        quorumServer9.isClientAddrFromStatic = true;
        quorumServer9.hostname = "";
        boolean boolean25 = quorumServer4.equals((java.lang.Object) quorumServer9);
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        quorumServer4.isClientAddrFromStatic = false;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.lang.String str18 = quorumServer17.toString();
        quorumServer4.checkAddressDuplicate(quorumServer17);
        java.lang.Class<?> wildcardClass20 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer7.hostname = "hi!";
        quorumServer2.checkAddressDuplicate(quorumServer7);
        quorumServer7.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress13 = quorumServer7.clientAddr;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertNull(inetSocketAddress13);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress5, inetSocketAddress6, learnerType7);
        quorumServer8.isClientAddrFromStatic = true;
        java.lang.String str11 = quorumServer8.hostname;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress13);
        quorumServer14.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.addr;
        quorumServer8.electionAddr = multipleAddresses17;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress38, inetSocketAddress39, inetSocketAddress40);
        java.lang.String str42 = quorumServer41.toString();
        quorumServer41.hostname = "hi!";
        quorumServer41.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType46 = quorumServer41.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress35, inetSocketAddress36, learnerType46);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress31, inetSocketAddress32, inetSocketAddress33, learnerType46);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress28, inetSocketAddress29, learnerType46);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer50 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress24, inetSocketAddress25, inetSocketAddress26, learnerType46);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer51 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress20, inetSocketAddress21, inetSocketAddress22, learnerType46);
        quorumServer8.type = learnerType46;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(32L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType46);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + ":participant" + "'", str42, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType46 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType46.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) 'a', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress9, inetSocketAddress10, inetSocketAddress11, learnerType12);
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress15, inetSocketAddress16, learnerType17);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        quorumServer18.type = learnerType19;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer18.electionAddr;
        quorumServer13.checkAddressDuplicate(quorumServer18);
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer27.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.electionAddr;
        java.lang.String str31 = quorumServer27.hostname;
        java.lang.String str32 = quorumServer27.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = null;
        quorumServer27.type = learnerType33;
        boolean boolean35 = quorumServer13.equals((java.lang.Object) quorumServer27);
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress37, inetSocketAddress38, inetSocketAddress39);
        java.lang.String str41 = quorumServer40.toString();
        quorumServer40.hostname = "hi!";
        quorumServer40.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = quorumServer40.type;
        quorumServer27.type = learnerType45;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType45);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType45);
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":participant" + "'", str41, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType45 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType45.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress4, inetSocketAddress5, learnerType6);
        quorumServer7.hostname = "hi!";
        quorumServer7.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress13);
        quorumServer7.checkAddressDuplicate(quorumServer14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer14.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1, inetSocketAddress2, learnerType16);
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress5, inetSocketAddress6, learnerType7);
        boolean boolean9 = quorumServer8.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        quorumServer8.type = learnerType10;
        java.lang.String str12 = quorumServer8.toString();
        long long13 = quorumServer8.getId();
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress22, inetSocketAddress23, inetSocketAddress24);
        java.lang.String str26 = quorumServer25.toString();
        quorumServer25.hostname = "hi!";
        quorumServer25.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress19, inetSocketAddress20, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress15, inetSocketAddress16, inetSocketAddress17, learnerType30);
        quorumServer8.type = learnerType30;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType30);
        java.lang.String str35 = quorumServer34.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses36 = quorumServer34.addr;
        java.lang.Class<?> wildcardClass37 = quorumServer34.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(multipleAddresses36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        quorumServer4.isClientAddrFromStatic = false;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        long long10 = quorumServer4.id;
        org.apache.zookeeper.server.WorkerService workerService14 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        boolean boolean15 = quorumServer4.equals((java.lang.Object) workerService14);
        quorumServer4.id = (byte) 1;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer7.hostname = "hi!";
        quorumServer2.checkAddressDuplicate(quorumServer7);
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress20, inetSocketAddress21, inetSocketAddress22, learnerType23);
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress26, inetSocketAddress27, learnerType28);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer29.type = learnerType30;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer29.electionAddr;
        quorumServer24.checkAddressDuplicate(quorumServer29);
        quorumServer29.id = ' ';
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress37, inetSocketAddress38, inetSocketAddress39);
        java.lang.String str41 = quorumServer40.toString();
        quorumServer40.hostname = "hi!";
        quorumServer40.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = quorumServer40.type;
        quorumServer29.type = learnerType45;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress17, inetSocketAddress18, learnerType45);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress13, inetSocketAddress14, inetSocketAddress15, learnerType45);
        quorumServer2.type = learnerType45;
        long long50 = quorumServer2.id;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":participant" + "'", str41, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType45 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType45.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress10, inetSocketAddress11, inetSocketAddress12);
        java.lang.String str14 = quorumServer13.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer13.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        java.lang.String str17 = quorumServer13.hostname;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        quorumServer13.clientAddr = inetSocketAddress18;
        boolean boolean20 = quorumServer4.equals((java.lang.Object) inetSocketAddress18);
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress31, inetSocketAddress32, inetSocketAddress33, learnerType34);
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress37, inetSocketAddress38, learnerType39);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        quorumServer40.type = learnerType41;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer40.electionAddr;
        quorumServer35.checkAddressDuplicate(quorumServer40);
        quorumServer40.id = ' ';
        java.net.InetSocketAddress inetSocketAddress48 = null;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer51 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress48, inetSocketAddress49, inetSocketAddress50);
        java.lang.String str52 = quorumServer51.toString();
        quorumServer51.hostname = "hi!";
        quorumServer51.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType56 = quorumServer51.type;
        quorumServer40.type = learnerType56;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer58 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress28, inetSocketAddress29, learnerType56);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer59 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress25, inetSocketAddress26, learnerType56);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer60 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress22, inetSocketAddress23, learnerType56);
        quorumServer4.type = learnerType56;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multipleAddresses43);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ":participant" + "'", str52, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType56 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType56.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType11);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        quorumServer12.checkAddressDuplicate(quorumServer17);
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses28 = quorumServer26.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer26.electionAddr;
        java.lang.String str30 = quorumServer26.hostname;
        java.lang.String str31 = quorumServer26.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        quorumServer26.type = learnerType32;
        boolean boolean34 = quorumServer12.equals((java.lang.Object) quorumServer26);
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress41, inetSocketAddress42, inetSocketAddress43, learnerType44);
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType49 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer50 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress47, inetSocketAddress48, learnerType49);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = null;
        quorumServer50.type = learnerType51;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses53 = quorumServer50.electionAddr;
        quorumServer45.checkAddressDuplicate(quorumServer50);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer45.electionAddr;
        quorumServer39.electionAddr = multipleAddresses55;
        quorumServer26.addr = multipleAddresses55;
        quorumServer4.checkAddressDuplicate(quorumServer26);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses59 = quorumServer4.electionAddr;
        boolean boolean60 = quorumServer4.isClientAddrFromStatic;
        java.lang.String str61 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertNotNull(multipleAddresses59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1);
        java.lang.String str3 = quorumServer2.hostname;
        boolean boolean4 = quorumServer2.isClientAddrFromStatic;
        java.lang.String str5 = quorumServer2.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer2.electionAddr;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.join((long) 0);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer5.addr;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        long long16 = quorumServer14.getId();
        quorumServer14.id = 100L;
        quorumServer14.recreateSocketAddresses();
        quorumServer5.checkAddressDuplicate(quorumServer14);
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer5.clientAddr = inetSocketAddress21;
        long long23 = quorumServer5.id;
        quorumServer5.id = 0;
        quorumServer5.id = 10;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        quorumServer4.clientAddr = inetSocketAddress8;
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress12, inetSocketAddress13);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress24, inetSocketAddress25, learnerType26);
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.lang.String str40 = quorumServer39.toString();
        quorumServer39.hostname = "hi!";
        quorumServer39.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = quorumServer39.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress33, inetSocketAddress34, learnerType44);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress29, inetSocketAddress30, inetSocketAddress31, learnerType44);
        quorumServer27.type = learnerType44;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress20, inetSocketAddress21, inetSocketAddress22, learnerType44);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress17, inetSocketAddress18, learnerType44);
        quorumServer14.type = learnerType44;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ":participant" + "'", str40, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType44 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType44.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        quorumServer5.type = learnerType6;
        quorumServer5.isClientAddrFromStatic = false;
        quorumServer5.recreateSocketAddresses();
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress5, inetSocketAddress6, inetSocketAddress7);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer8.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress12, inetSocketAddress13, learnerType14);
        quorumServer15.isClientAddrFromStatic = true;
        java.lang.String str18 = quorumServer15.hostname;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress20);
        quorumServer21.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.addr;
        quorumServer15.electionAddr = multipleAddresses24;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress45, inetSocketAddress46, inetSocketAddress47);
        java.lang.String str49 = quorumServer48.toString();
        quorumServer48.hostname = "hi!";
        quorumServer48.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType53 = quorumServer48.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress42, inetSocketAddress43, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer55 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress38, inetSocketAddress39, inetSocketAddress40, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress35, inetSocketAddress36, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress31, inetSocketAddress32, inetSocketAddress33, learnerType53);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer58 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress27, inetSocketAddress28, inetSocketAddress29, learnerType53);
        quorumServer15.type = learnerType53;
        quorumServer15.id = (short) 1;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses62 = quorumServer15.electionAddr;
        boolean boolean63 = quorumServer10.equals((java.lang.Object) multipleAddresses62);
        org.junit.Assert.assertTrue("'" + learnerType9 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType9.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ":participant" + "'", str49, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType53 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType53.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer7.type = learnerType8;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        quorumServer7.clientAddr = inetSocketAddress11;
        boolean boolean13 = quorumServer7.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress15, inetSocketAddress16, learnerType17);
        boolean boolean20 = quorumServer18.equals((java.lang.Object) 35L);
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress29, inetSocketAddress30, inetSocketAddress31, learnerType32);
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress35, inetSocketAddress36, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        quorumServer38.type = learnerType39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        quorumServer33.checkAddressDuplicate(quorumServer38);
        quorumServer38.id = ' ';
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress46, inetSocketAddress47, inetSocketAddress48);
        java.lang.String str50 = quorumServer49.toString();
        quorumServer49.hostname = "hi!";
        quorumServer49.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType54 = quorumServer49.type;
        quorumServer38.type = learnerType54;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress25, inetSocketAddress26, inetSocketAddress27, learnerType54);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress22, inetSocketAddress23, learnerType54);
        quorumServer18.type = learnerType54;
        quorumServer7.type = learnerType54;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer60 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType54);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":participant" + "'", str50, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType54 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType54.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1);
        quorumServer2.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer2.addr;
        long long6 = quorumServer2.id;
        java.lang.String str7 = quorumServer2.toString();
        org.junit.Assert.assertNotNull(multipleAddresses5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":participant" + "'", str7, ":participant");
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer14.addr;
        quorumServer4.addr = multipleAddresses18;
        quorumServer4.hostname = "";
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 1, true);
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress7, inetSocketAddress8, learnerType9);
        quorumServer10.recreateSocketAddresses();
        long long12 = quorumServer10.id;
        quorumServer5.checkAddressDuplicate(quorumServer10);
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress15, inetSocketAddress16, inetSocketAddress17, learnerType18);
        quorumServer19.recreateSocketAddresses();
        quorumServer5.checkAddressDuplicate(quorumServer19);
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress30, inetSocketAddress31, inetSocketAddress32);
        java.lang.String str34 = quorumServer33.toString();
        quorumServer33.hostname = "hi!";
        quorumServer33.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = quorumServer33.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress27, inetSocketAddress28, learnerType38);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress23, inetSocketAddress24, inetSocketAddress25, learnerType38);
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress42, inetSocketAddress43, inetSocketAddress44);
        java.lang.String str46 = quorumServer45.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses47 = quorumServer45.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer45.electionAddr;
        java.lang.String str49 = quorumServer45.hostname;
        long long50 = quorumServer45.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses51 = quorumServer45.electionAddr;
        quorumServer40.electionAddr = multipleAddresses51;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses53 = quorumServer40.addr;
        boolean boolean54 = quorumServer19.equals((java.lang.Object) multipleAddresses53);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":participant" + "'", str34, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType38 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType38.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":participant" + "'", str46, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses47);
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 35L + "'", long50 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses51);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((long) (short) 0);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, false);
        workerService3.stop();
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress5, inetSocketAddress6, inetSocketAddress7);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer8.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType9);
        java.net.InetSocketAddress inetSocketAddress11 = null;
        quorumServer10.clientAddr = inetSocketAddress11;
        long long13 = quorumServer10.getId();
        org.junit.Assert.assertTrue("'" + learnerType9 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType9.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        quorumServer14.type = learnerType15;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        java.lang.String str18 = quorumServer14.toString();
        long long19 = quorumServer14.getId();
        boolean boolean20 = quorumServer14.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer14.electionAddr;
        boolean boolean22 = quorumServer4.equals((java.lang.Object) multipleAddresses21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        long long6 = quorumServer5.id;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        quorumServer11.hostname = "hi!";
        quorumServer11.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress17, inetSocketAddress18, inetSocketAddress19);
        java.lang.String str21 = quorumServer20.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer20.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer20.electionAddr;
        java.lang.String str24 = quorumServer20.hostname;
        long long25 = quorumServer20.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer20.electionAddr;
        quorumServer11.addr = multipleAddresses26;
        quorumServer5.electionAddr = multipleAddresses26;
        java.net.InetSocketAddress inetSocketAddress29 = quorumServer5.clientAddr;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNull(inetSocketAddress29);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        quorumServer5.checkAddressDuplicate(quorumServer10);
        boolean boolean15 = quorumServer5.isClientAddrFromStatic;
        quorumServer5.id = 10L;
        java.lang.String str18 = quorumServer5.hostname;
        java.lang.String str19 = quorumServer5.hostname;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2);
        java.lang.String str4 = quorumServer3.hostname;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress1, inetSocketAddress2, learnerType3);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer5.addr;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        long long16 = quorumServer14.getId();
        quorumServer14.id = 100L;
        quorumServer14.recreateSocketAddresses();
        quorumServer5.checkAddressDuplicate(quorumServer14);
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer5.clientAddr = inetSocketAddress21;
        quorumServer5.recreateSocketAddresses();
        boolean boolean24 = quorumServer5.isClientAddrFromStatic;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer4.clientAddr = inetSocketAddress10;
        org.junit.Assert.assertNull(learnerType9);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        workerService3.join((long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress19, inetSocketAddress20, learnerType21);
        quorumServer22.hostname = "hi!";
        quorumServer22.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress28);
        quorumServer22.checkAddressDuplicate(quorumServer29);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = quorumServer29.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress16, inetSocketAddress17, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress12, inetSocketAddress13, inetSocketAddress14, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress9, inetSocketAddress10, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType31);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer36.electionAddr;
        quorumServer36.hostname = "";
        org.junit.Assert.assertTrue("'" + learnerType31 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType31.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses37);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        quorumServer4.id = '#';
        boolean boolean11 = quorumServer4.isClientAddrFromStatic;
        boolean boolean12 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.getId();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = quorumServer4.type;
        java.lang.String str11 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(learnerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", 1, true);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer11.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer11.electionAddr;
        quorumServer4.addr = multipleAddresses13;
        quorumServer4.recreateSocketAddresses();
        java.lang.Class<?> wildcardClass16 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress15, inetSocketAddress16, learnerType17);
        quorumServer18.hostname = "hi!";
        quorumServer18.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress24);
        quorumServer18.checkAddressDuplicate(quorumServer25);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress5, inetSocketAddress6, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType27);
        long long32 = quorumServer31.id;
        java.net.InetSocketAddress inetSocketAddress33 = quorumServer31.clientAddr;
        org.junit.Assert.assertTrue("'" + learnerType27 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType27.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNull(inetSocketAddress33);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress5, inetSocketAddress6, inetSocketAddress7);
        java.lang.String str9 = quorumServer8.toString();
        quorumServer8.hostname = "hi!";
        quorumServer8.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.lang.String str18 = quorumServer17.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer17.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        java.lang.String str21 = quorumServer17.hostname;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        quorumServer17.clientAddr = inetSocketAddress22;
        boolean boolean24 = quorumServer8.equals((java.lang.Object) inetSocketAddress22);
        java.lang.String str25 = quorumServer8.toString();
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.lang.String str40 = quorumServer39.toString();
        quorumServer39.hostname = "hi!";
        quorumServer39.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = quorumServer39.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress33, inetSocketAddress34, learnerType44);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress30, inetSocketAddress31, learnerType44);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) -1, inetSocketAddress27, inetSocketAddress28, learnerType44);
        quorumServer8.type = learnerType44;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType44);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":participant" + "'", str9, ":participant");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ":participant" + "'", str40, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType44 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType44.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress8, inetSocketAddress9, learnerType10);
        boolean boolean12 = quorumServer11.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        quorumServer11.type = learnerType13;
        java.lang.String str15 = quorumServer11.toString();
        long long16 = quorumServer11.getId();
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        quorumServer28.hostname = "hi!";
        quorumServer28.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = quorumServer28.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress22, inetSocketAddress23, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress18, inetSocketAddress19, inetSocketAddress20, learnerType33);
        quorumServer11.type = learnerType33;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) -1, inetSocketAddress1, inetSocketAddress2, learnerType33);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress11);
        java.net.InetSocketAddress inetSocketAddress13 = null;
        quorumServer12.clientAddr = inetSocketAddress13;
        org.apache.zookeeper.server.WorkerService workerService18 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        workerService18.schedule(workRequest19);
        workerService18.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest22 = null;
        workerService18.schedule(workRequest22);
        boolean boolean24 = quorumServer12.equals((java.lang.Object) workerService18);
        boolean boolean25 = quorumServer4.equals((java.lang.Object) quorumServer12);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer5.addr;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        long long16 = quorumServer14.getId();
        quorumServer14.id = 100L;
        quorumServer14.recreateSocketAddresses();
        quorumServer5.checkAddressDuplicate(quorumServer14);
        quorumServer14.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService26 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService26.start();
        workerService26.stop();
        workerService26.stop();
        workerService26.stop();
        boolean boolean31 = quorumServer14.equals((java.lang.Object) workerService26);
        java.lang.String str32 = quorumServer14.hostname;
        quorumServer14.id = '4';
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress36, inetSocketAddress37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = quorumServer38.type;
        quorumServer14.type = learnerType39;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress42, inetSocketAddress43, learnerType44);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType46 = null;
        quorumServer45.type = learnerType46;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer45.electionAddr;
        java.lang.String str49 = quorumServer45.toString();
        long long50 = quorumServer45.id;
        long long51 = quorumServer45.id;
        org.apache.zookeeper.server.WorkerService workerService55 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        boolean boolean56 = quorumServer45.equals((java.lang.Object) workerService55);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses57 = quorumServer45.addr;
        java.net.InetSocketAddress inetSocketAddress59 = null;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer62 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress59, inetSocketAddress60, inetSocketAddress61);
        java.lang.String str63 = quorumServer62.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses64 = quorumServer62.addr;
        quorumServer45.addr = multipleAddresses64;
        quorumServer14.electionAddr = multipleAddresses64;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + learnerType39 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType39.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(multipleAddresses57);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + ":participant" + "'", str63, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses64);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer14.addr;
        quorumServer4.addr = multipleAddresses18;
        quorumServer4.hostname = "";
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        long long28 = quorumServer26.getId();
        quorumServer26.id = (short) 0;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        quorumServer26.clientAddr = inetSocketAddress31;
        quorumServer4.checkAddressDuplicate(quorumServer26);
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress39, inetSocketAddress40, learnerType41);
        boolean boolean43 = quorumServer42.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        quorumServer42.type = learnerType44;
        java.lang.String str46 = quorumServer42.toString();
        long long47 = quorumServer42.getId();
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        java.net.InetSocketAddress inetSocketAddress57 = null;
        java.net.InetSocketAddress inetSocketAddress58 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer59 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress56, inetSocketAddress57, inetSocketAddress58);
        java.lang.String str60 = quorumServer59.toString();
        quorumServer59.hostname = "hi!";
        quorumServer59.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType64 = quorumServer59.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer65 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress53, inetSocketAddress54, learnerType64);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer66 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress49, inetSocketAddress50, inetSocketAddress51, learnerType64);
        quorumServer42.type = learnerType64;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer68 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress35, inetSocketAddress36, inetSocketAddress37, learnerType64);
        java.lang.String str69 = quorumServer68.hostname;
        quorumServer4.checkAddressDuplicate(quorumServer68);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType71 = quorumServer68.type;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ":participant" + "'", str60, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType64 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType64.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + learnerType71 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType71.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", 1, false);
        workerService3.start();
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        quorumServer5.checkAddressDuplicate(quorumServer10);
        boolean boolean15 = quorumServer5.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer5.electionAddr;
        java.lang.String str17 = quorumServer5.toString();
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.join((long) '4');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 52L);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress11, inetSocketAddress12, learnerType13);
        quorumServer14.hostname = "hi!";
        quorumServer14.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress20);
        quorumServer14.checkAddressDuplicate(quorumServer21);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress8, inetSocketAddress9, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1, inetSocketAddress2, learnerType23);
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress28, inetSocketAddress29, inetSocketAddress30);
        java.lang.String str32 = quorumServer31.toString();
        long long33 = quorumServer31.getId();
        quorumServer31.id = 100L;
        quorumServer31.recreateSocketAddresses();
        quorumServer31.id = 0;
        quorumServer26.checkAddressDuplicate(quorumServer31);
        boolean boolean40 = quorumServer31.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":participant" + "'", str32, ":participant");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        quorumServer4.type = learnerType6;
        java.lang.String str8 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(learnerType9);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 1, false);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer9.type = learnerType16;
        java.lang.String str18 = quorumServer9.hostname;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress20, inetSocketAddress21, learnerType22);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = null;
        quorumServer23.type = learnerType24;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        long long27 = quorumServer23.id;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress29, inetSocketAddress30, inetSocketAddress31, learnerType32);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer33.electionAddr;
        quorumServer33.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer33.addr;
        quorumServer23.addr = multipleAddresses37;
        quorumServer23.hostname = "";
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress42, inetSocketAddress43, inetSocketAddress44);
        java.lang.String str46 = quorumServer45.toString();
        long long47 = quorumServer45.getId();
        quorumServer45.id = (short) 0;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        quorumServer45.clientAddr = inetSocketAddress50;
        quorumServer23.checkAddressDuplicate(quorumServer45);
        quorumServer9.checkAddressDuplicate(quorumServer45);
        quorumServer9.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses34);
        org.junit.Assert.assertNotNull(multipleAddresses37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":participant" + "'", str46, ":participant");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 35L + "'", long47 == 35L);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress10, inetSocketAddress11, inetSocketAddress12);
        java.lang.String str14 = quorumServer13.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer13.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        java.lang.String str17 = quorumServer13.hostname;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        quorumServer13.clientAddr = inetSocketAddress18;
        boolean boolean20 = quorumServer4.equals((java.lang.Object) inetSocketAddress18);
        java.lang.Class<?> wildcardClass21 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer7.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        java.lang.String str11 = quorumServer7.hostname;
        java.lang.String str12 = quorumServer7.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        quorumServer7.type = learnerType13;
        java.net.InetSocketAddress inetSocketAddress15 = quorumServer7.clientAddr;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress17, inetSocketAddress18, inetSocketAddress19);
        java.lang.String str21 = quorumServer20.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer20.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer20.electionAddr;
        java.lang.String str24 = quorumServer20.hostname;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        quorumServer20.clientAddr = inetSocketAddress25;
        java.lang.String str27 = quorumServer20.hostname;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress29, inetSocketAddress30, learnerType31);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = null;
        quorumServer32.type = learnerType33;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses35 = quorumServer32.electionAddr;
        long long36 = quorumServer32.id;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress38, inetSocketAddress39, inetSocketAddress40, learnerType41);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer42.electionAddr;
        quorumServer42.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses46 = quorumServer42.addr;
        quorumServer32.addr = multipleAddresses46;
        quorumServer20.electionAddr = multipleAddresses46;
        quorumServer7.addr = multipleAddresses46;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        java.net.InetSocketAddress inetSocketAddress52 = null;
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        java.net.InetSocketAddress inetSocketAddress57 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType58 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer59 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress55, inetSocketAddress56, inetSocketAddress57, learnerType58);
        java.net.InetSocketAddress inetSocketAddress61 = null;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType63 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer64 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress61, inetSocketAddress62, learnerType63);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType65 = null;
        quorumServer64.type = learnerType65;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses67 = quorumServer64.electionAddr;
        quorumServer59.checkAddressDuplicate(quorumServer64);
        java.net.InetSocketAddress inetSocketAddress70 = null;
        java.net.InetSocketAddress inetSocketAddress71 = null;
        java.net.InetSocketAddress inetSocketAddress72 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer73 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress70, inetSocketAddress71, inetSocketAddress72);
        java.lang.String str74 = quorumServer73.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses75 = quorumServer73.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses76 = quorumServer73.electionAddr;
        java.lang.String str77 = quorumServer73.hostname;
        java.lang.String str78 = quorumServer73.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType79 = null;
        quorumServer73.type = learnerType79;
        boolean boolean81 = quorumServer59.equals((java.lang.Object) quorumServer73);
        java.net.InetSocketAddress inetSocketAddress83 = null;
        java.net.InetSocketAddress inetSocketAddress84 = null;
        java.net.InetSocketAddress inetSocketAddress85 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer86 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress83, inetSocketAddress84, inetSocketAddress85);
        java.lang.String str87 = quorumServer86.toString();
        quorumServer86.hostname = "hi!";
        quorumServer86.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType91 = quorumServer86.type;
        quorumServer73.type = learnerType91;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer93 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress51, inetSocketAddress52, inetSocketAddress53, learnerType91);
        quorumServer7.type = learnerType91;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer95 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType91);
        quorumServer95.hostname = ":participant";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(inetSocketAddress15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(multipleAddresses35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses43);
        org.junit.Assert.assertNotNull(multipleAddresses46);
        org.junit.Assert.assertNotNull(multipleAddresses67);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + ":participant" + "'", str74, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses75);
        org.junit.Assert.assertNotNull(multipleAddresses76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + ":participant" + "'", str87, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType91 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType91.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        quorumServer5.electionAddr = multipleAddresses13;
        quorumServer5.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses13);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        boolean boolean8 = quorumServer7.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        quorumServer7.type = learnerType9;
        java.lang.String str11 = quorumServer7.toString();
        long long12 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress18, inetSocketAddress19, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType29);
        quorumServer7.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, learnerType29);
        java.lang.String str34 = quorumServer33.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses35 = quorumServer33.addr;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress37, inetSocketAddress38, learnerType39);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        quorumServer40.type = learnerType41;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer40.addr;
        quorumServer33.addr = multipleAddresses43;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(multipleAddresses35);
        org.junit.Assert.assertNotNull(multipleAddresses43);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress1);
        quorumServer2.hostname = "";
        java.lang.Class<?> wildcardClass5 = quorumServer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer4.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType11);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer12.electionAddr;
        quorumServer12.id = 35L;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        quorumServer12.clientAddr = inetSocketAddress16;
        boolean boolean18 = quorumServer4.equals((java.lang.Object) quorumServer12);
        org.junit.Assert.assertNotNull(multipleAddresses5);
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress6, inetSocketAddress7, learnerType8);
        quorumServer9.isClientAddrFromStatic = true;
        java.lang.String str12 = quorumServer9.hostname;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress14);
        quorumServer15.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.addr;
        quorumServer9.electionAddr = multipleAddresses18;
        long long20 = quorumServer9.id;
        quorumServer9.isClientAddrFromStatic = true;
        quorumServer9.hostname = "";
        boolean boolean25 = quorumServer4.equals((java.lang.Object) quorumServer9);
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress27, inetSocketAddress28, inetSocketAddress29);
        java.lang.String str31 = quorumServer30.toString();
        long long32 = quorumServer30.getId();
        quorumServer30.id = 100L;
        quorumServer30.recreateSocketAddresses();
        quorumServer30.id = 0;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType42 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress39, inetSocketAddress40, inetSocketAddress41, learnerType42);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses44 = quorumServer43.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses45 = quorumServer43.electionAddr;
        quorumServer30.addr = multipleAddresses45;
        quorumServer9.electionAddr = multipleAddresses45;
        java.lang.Class<?> wildcardClass48 = multipleAddresses45.getClass();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":participant" + "'", str31, ":participant");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses44);
        org.junit.Assert.assertNotNull(multipleAddresses45);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses11 = quorumServer9.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer9.electionAddr;
        boolean boolean14 = quorumServer9.equals((java.lang.Object) true);
        quorumServer9.recreateSocketAddresses();
        quorumServer9.hostname = ":participant";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer9.addr;
        quorumServer4.addr = multipleAddresses18;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = quorumServer4.type;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses11);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNull(learnerType20);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress4, inetSocketAddress5, learnerType6);
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress9, inetSocketAddress10, inetSocketAddress11);
        java.lang.String str13 = quorumServer12.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer12.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer12.electionAddr;
        boolean boolean17 = quorumServer12.equals((java.lang.Object) true);
        quorumServer12.recreateSocketAddresses();
        quorumServer12.hostname = ":participant";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer12.addr;
        quorumServer7.addr = multipleAddresses21;
        boolean boolean23 = quorumServer2.equals((java.lang.Object) quorumServer7);
        quorumServer7.id = 35L;
        quorumServer7.hostname = "";
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":participant" + "'", str13, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        quorumServer14.hostname = "hi!";
        quorumServer14.recreateSocketAddresses();
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str20 = quorumServer14.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType9 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType9.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":participant" + "'", str20, ":participant");
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.lang.String str7 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress9);
        quorumServer10.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.addr;
        quorumServer4.electionAddr = multipleAddresses13;
        boolean boolean15 = quorumServer4.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress17, inetSocketAddress18, learnerType19);
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer20.clientAddr = inetSocketAddress21;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer20.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = null;
        quorumServer20.type = learnerType24;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer20.addr;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress28, inetSocketAddress29, learnerType30);
        quorumServer31.isClientAddrFromStatic = true;
        java.lang.String str34 = quorumServer31.hostname;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress36);
        quorumServer37.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses40 = quorumServer37.addr;
        quorumServer31.electionAddr = multipleAddresses40;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        java.net.InetSocketAddress inetSocketAddress52 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        java.net.InetSocketAddress inetSocketAddress58 = null;
        java.net.InetSocketAddress inetSocketAddress59 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        java.net.InetSocketAddress inetSocketAddress63 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer64 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress61, inetSocketAddress62, inetSocketAddress63);
        java.lang.String str65 = quorumServer64.toString();
        quorumServer64.hostname = "hi!";
        quorumServer64.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType69 = quorumServer64.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer70 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress58, inetSocketAddress59, learnerType69);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer71 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress54, inetSocketAddress55, inetSocketAddress56, learnerType69);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer72 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress51, inetSocketAddress52, learnerType69);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer73 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress47, inetSocketAddress48, inetSocketAddress49, learnerType69);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer74 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress43, inetSocketAddress44, inetSocketAddress45, learnerType69);
        quorumServer31.type = learnerType69;
        quorumServer31.id = (short) 1;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses78 = quorumServer31.electionAddr;
        quorumServer20.addr = multipleAddresses78;
        java.net.InetSocketAddress inetSocketAddress81 = null;
        java.net.InetSocketAddress inetSocketAddress82 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType83 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer84 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress81, inetSocketAddress82, learnerType83);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType85 = null;
        quorumServer84.type = learnerType85;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses87 = quorumServer84.electionAddr;
        long long88 = quorumServer84.id;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses89 = quorumServer84.addr;
        quorumServer20.addr = multipleAddresses89;
        quorumServer4.addr = multipleAddresses89;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(learnerType23);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(multipleAddresses40);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + ":participant" + "'", str65, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType69 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType69.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses78);
        org.junit.Assert.assertNotNull(multipleAddresses87);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L) + "'", long88 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses89);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        long long5 = quorumServer4.id;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress5, inetSocketAddress6, learnerType7);
        quorumServer8.hostname = "hi!";
        quorumServer8.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress14);
        quorumServer8.checkAddressDuplicate(quorumServer15);
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress18, inetSocketAddress19, learnerType20);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        quorumServer21.type = learnerType22;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.electionAddr;
        java.lang.String str25 = quorumServer21.toString();
        long long26 = quorumServer21.id;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress28, inetSocketAddress29, inetSocketAddress30);
        java.lang.String str32 = quorumServer31.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer31.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer31.electionAddr;
        boolean boolean36 = quorumServer31.equals((java.lang.Object) true);
        quorumServer21.checkAddressDuplicate(quorumServer31);
        java.lang.String str38 = quorumServer31.hostname;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress40, inetSocketAddress41, inetSocketAddress42);
        java.lang.String str44 = quorumServer43.toString();
        quorumServer43.hostname = "hi!";
        quorumServer43.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType48 = quorumServer43.type;
        quorumServer31.type = learnerType48;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType50 = quorumServer31.type;
        quorumServer8.type = learnerType50;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer52 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType50);
        quorumServer52.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":participant" + "'", str32, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses33);
        org.junit.Assert.assertNotNull(multipleAddresses34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + ":participant" + "'", str44, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType48 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType48.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType50 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType50.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str21 = quorumServer14.hostname;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress23, inetSocketAddress24, learnerType25);
        java.net.InetSocketAddress inetSocketAddress27 = null;
        quorumServer26.clientAddr = inetSocketAddress27;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer26.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer26.type = learnerType30;
        quorumServer26.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress35, inetSocketAddress36, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        quorumServer38.type = learnerType39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        java.lang.String str42 = quorumServer38.toString();
        long long43 = quorumServer38.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses44 = quorumServer38.electionAddr;
        quorumServer26.addr = multipleAddresses44;
        boolean boolean46 = quorumServer14.equals((java.lang.Object) quorumServer26);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses47 = quorumServer14.addr;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType52 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress49, inetSocketAddress50, inetSocketAddress51, learnerType52);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses54 = quorumServer53.electionAddr;
        quorumServer53.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses57 = quorumServer53.addr;
        quorumServer14.checkAddressDuplicate(quorumServer53);
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType63 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer64 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress60, inetSocketAddress61, inetSocketAddress62, learnerType63);
        quorumServer64.isClientAddrFromStatic = false;
        boolean boolean67 = quorumServer64.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType68 = quorumServer64.type;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses69 = quorumServer64.electionAddr;
        quorumServer14.addr = multipleAddresses69;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(learnerType29);
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(multipleAddresses47);
        org.junit.Assert.assertNotNull(multipleAddresses54);
        org.junit.Assert.assertNotNull(multipleAddresses57);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(learnerType68);
        org.junit.Assert.assertNotNull(multipleAddresses69);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        boolean boolean16 = quorumServer15.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        quorumServer15.type = learnerType17;
        java.lang.String str19 = quorumServer15.toString();
        long long20 = quorumServer15.getId();
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress29, inetSocketAddress30, inetSocketAddress31);
        java.lang.String str33 = quorumServer32.toString();
        quorumServer32.hostname = "hi!";
        quorumServer32.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = quorumServer32.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress26, inetSocketAddress27, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress22, inetSocketAddress23, inetSocketAddress24, learnerType37);
        quorumServer15.type = learnerType37;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress9, inetSocketAddress10, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType37);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":participant" + "'", str33, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress1, inetSocketAddress2);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses4 = quorumServer3.electionAddr;
        quorumServer3.isClientAddrFromStatic = false;
        long long7 = quorumServer3.id;
        org.junit.Assert.assertNotNull(multipleAddresses4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer14.addr;
        quorumServer4.addr = multipleAddresses18;
        quorumServer4.hostname = "";
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        long long28 = quorumServer26.getId();
        quorumServer26.id = (short) 0;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        quorumServer26.clientAddr = inetSocketAddress31;
        quorumServer4.checkAddressDuplicate(quorumServer26);
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress35);
        quorumServer36.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses39 = quorumServer36.addr;
        boolean boolean40 = quorumServer26.equals((java.lang.Object) quorumServer36);
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress42, inetSocketAddress43, inetSocketAddress44, learnerType45);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses47 = quorumServer46.electionAddr;
        quorumServer46.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses50 = quorumServer46.addr;
        quorumServer46.isClientAddrFromStatic = false;
        boolean boolean53 = quorumServer26.equals((java.lang.Object) false);
        long long54 = quorumServer26.id;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(multipleAddresses47);
        org.junit.Assert.assertNotNull(multipleAddresses50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.addr;
        org.junit.Assert.assertNotNull(multipleAddresses6);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType11);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        quorumServer12.checkAddressDuplicate(quorumServer17);
        quorumServer17.id = ' ';
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        quorumServer28.hostname = "hi!";
        quorumServer28.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = quorumServer28.type;
        quorumServer17.type = learnerType33;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1, inetSocketAddress2, learnerType33);
        java.lang.String str37 = quorumServer36.toString();
        java.lang.Class<?> wildcardClass38 = quorumServer36.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":participant" + "'", str37, ":participant");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress9, inetSocketAddress10, learnerType11);
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress18, inetSocketAddress19, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType29);
        quorumServer12.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType29);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        boolean boolean8 = quorumServer7.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        quorumServer7.type = learnerType9;
        java.lang.String str11 = quorumServer7.toString();
        long long12 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        quorumServer24.hostname = "hi!";
        quorumServer24.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = quorumServer24.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress18, inetSocketAddress19, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType29);
        quorumServer7.type = learnerType29;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, learnerType29);
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress35, inetSocketAddress36, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        quorumServer38.type = learnerType39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer38.electionAddr;
        java.lang.String str42 = quorumServer38.toString();
        long long43 = quorumServer38.getId();
        boolean boolean44 = quorumServer38.isClientAddrFromStatic;
        quorumServer33.checkAddressDuplicate(quorumServer38);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses46 = quorumServer33.addr;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(multipleAddresses46);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) -1;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress10, inetSocketAddress11, learnerType12);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer13.type = learnerType14;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        quorumServer4.electionAddr = multipleAddresses16;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress19, inetSocketAddress20, learnerType21);
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        long long29 = quorumServer27.getId();
        quorumServer27.id = 100L;
        quorumServer27.recreateSocketAddresses();
        boolean boolean33 = quorumServer22.equals((java.lang.Object) quorumServer27);
        quorumServer27.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress36, inetSocketAddress37, learnerType38);
        quorumServer39.isClientAddrFromStatic = true;
        java.lang.String str42 = quorumServer39.hostname;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress44);
        quorumServer45.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer45.addr;
        quorumServer39.electionAddr = multipleAddresses48;
        quorumServer27.electionAddr = multipleAddresses48;
        quorumServer4.addr = multipleAddresses48;
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType55 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress53, inetSocketAddress54, learnerType55);
        quorumServer56.hostname = "hi!";
        quorumServer56.id = (byte) 100;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses61 = quorumServer56.addr;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        quorumServer56.clientAddr = inetSocketAddress62;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses64 = quorumServer56.electionAddr;
        quorumServer4.addr = multipleAddresses64;
        quorumServer4.isClientAddrFromStatic = false;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertNotNull(multipleAddresses61);
        org.junit.Assert.assertNotNull(multipleAddresses64);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.lang.String str9 = quorumServer4.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer4.electionAddr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(multipleAddresses10);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) -1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"this.workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        boolean boolean11 = quorumServer10.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        quorumServer10.type = learnerType12;
        java.lang.String str14 = quorumServer10.toString();
        long long15 = quorumServer10.getId();
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        quorumServer27.hostname = "hi!";
        quorumServer27.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = quorumServer27.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress21, inetSocketAddress22, learnerType32);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress17, inetSocketAddress18, inetSocketAddress19, learnerType32);
        quorumServer10.type = learnerType32;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress4, inetSocketAddress5, learnerType32);
        quorumServer2.type = learnerType32;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses38 = quorumServer2.addr;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress40, inetSocketAddress41);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer42.addr;
        quorumServer2.addr = multipleAddresses43;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType32 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType32.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses38);
        org.junit.Assert.assertNotNull(multipleAddresses43);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        quorumServer4.type = learnerType6;
        java.lang.String str8 = quorumServer4.toString();
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        boolean boolean11 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str21 = quorumServer14.hostname;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        quorumServer14.clientAddr = inetSocketAddress22;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        quorumServer4.isClientAddrFromStatic = false;
        java.lang.String str13 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        quorumServer4.clientAddr = inetSocketAddress14;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        quorumServer4.clientAddr = inetSocketAddress16;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) -1, true);
        workerService3.start();
        java.lang.Class<?> wildcardClass5 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        quorumServer4.id = (-1);
        long long11 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress16, inetSocketAddress17, inetSocketAddress18);
        java.lang.String str20 = quorumServer19.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer19.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer19.electionAddr;
        java.lang.String str23 = quorumServer19.hostname;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        quorumServer19.clientAddr = inetSocketAddress24;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = quorumServer19.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress13, inetSocketAddress14, learnerType26);
        quorumServer4.type = learnerType26;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":participant" + "'", str20, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + learnerType26 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType26.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress15, inetSocketAddress16, learnerType17);
        quorumServer18.hostname = "hi!";
        quorumServer18.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress24);
        quorumServer18.checkAddressDuplicate(quorumServer25);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress5, inetSocketAddress6, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType27);
        java.net.InetSocketAddress inetSocketAddress32 = quorumServer31.clientAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer31.electionAddr;
        org.junit.Assert.assertTrue("'" + learnerType27 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType27.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(inetSocketAddress32);
        org.junit.Assert.assertNotNull(multipleAddresses33);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.join((long) '4');
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.recreateSocketAddresses();
        long long6 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        quorumServer21.hostname = "hi!";
        quorumServer21.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress15, inetSocketAddress16, learnerType26);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress11, inetSocketAddress12, inetSocketAddress13, learnerType26);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress8, inetSocketAddress9, learnerType26);
        quorumServer4.type = learnerType26;
        long long31 = quorumServer4.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType26 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType26.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress10 = quorumServer4.clientAddr;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer4.type = learnerType11;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer17.addr;
        quorumServer4.addr = multipleAddresses21;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType9 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType9.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNotNull(multipleAddresses21);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        quorumServer4.clientAddr = inetSocketAddress9;
        quorumServer4.isClientAddrFromStatic = false;
        java.lang.String str13 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        quorumServer4.clientAddr = inetSocketAddress14;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress31, inetSocketAddress32, learnerType33);
        quorumServer34.hostname = "hi!";
        quorumServer34.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress40);
        quorumServer34.checkAddressDuplicate(quorumServer41);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = quorumServer41.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress28, inetSocketAddress29, learnerType43);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress24, inetSocketAddress25, inetSocketAddress26, learnerType43);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress21, inetSocketAddress22, learnerType43);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress17, inetSocketAddress18, inetSocketAddress19, learnerType43);
        long long48 = quorumServer47.id;
        quorumServer47.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType50 = null;
        quorumServer47.type = learnerType50;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses52 = quorumServer47.addr;
        quorumServer4.addr = multipleAddresses52;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + learnerType43 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType43.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(multipleAddresses52);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress4, inetSocketAddress5, learnerType6);
        boolean boolean9 = quorumServer7.equals((java.lang.Object) 35L);
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress18, inetSocketAddress19, inetSocketAddress20, learnerType21);
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress24, inetSocketAddress25, learnerType26);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        quorumServer27.type = learnerType28;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.electionAddr;
        quorumServer22.checkAddressDuplicate(quorumServer27);
        quorumServer27.id = ' ';
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress35, inetSocketAddress36, inetSocketAddress37);
        java.lang.String str39 = quorumServer38.toString();
        quorumServer38.hostname = "hi!";
        quorumServer38.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = quorumServer38.type;
        quorumServer27.type = learnerType43;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress14, inetSocketAddress15, inetSocketAddress16, learnerType43);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress11, inetSocketAddress12, learnerType43);
        quorumServer7.type = learnerType43;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(52L, inetSocketAddress1, inetSocketAddress2, learnerType43);
        quorumServer48.recreateSocketAddresses();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ":participant" + "'", str39, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType43 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType43.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1);
        java.lang.String str3 = quorumServer2.hostname;
        boolean boolean4 = quorumServer2.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer2.electionAddr;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(multipleAddresses5);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress3 = null;
        quorumServer2.clientAddr = inetSocketAddress3;
        java.net.InetSocketAddress inetSocketAddress5 = quorumServer2.clientAddr;
        org.junit.Assert.assertNull(inetSocketAddress5);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        quorumServer4.type = learnerType6;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, learnerType12);
        quorumServer13.isClientAddrFromStatic = true;
        java.lang.String str16 = quorumServer13.hostname;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress18);
        quorumServer19.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer19.addr;
        quorumServer13.electionAddr = multipleAddresses22;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress43, inetSocketAddress44, inetSocketAddress45);
        java.lang.String str47 = quorumServer46.toString();
        quorumServer46.hostname = "hi!";
        quorumServer46.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = quorumServer46.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer52 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress40, inetSocketAddress41, learnerType51);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress36, inetSocketAddress37, inetSocketAddress38, learnerType51);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress33, inetSocketAddress34, learnerType51);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer55 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress29, inetSocketAddress30, inetSocketAddress31, learnerType51);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress25, inetSocketAddress26, inetSocketAddress27, learnerType51);
        quorumServer13.type = learnerType51;
        quorumServer13.id = (short) 1;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses60 = quorumServer13.electionAddr;
        quorumServer4.electionAddr = multipleAddresses60;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(learnerType8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ":participant" + "'", str47, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType51 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType51.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses60);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer7.hostname = "hi!";
        quorumServer7.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = quorumServer7.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, learnerType12);
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress15, inetSocketAddress16, inetSocketAddress17);
        java.lang.String str19 = quorumServer18.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer18.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer18.electionAddr;
        java.lang.String str22 = quorumServer18.hostname;
        java.lang.String str23 = quorumServer18.hostname;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress25, inetSocketAddress26);
        quorumServer18.checkAddressDuplicate(quorumServer27);
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress30);
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress33, inetSocketAddress34, learnerType35);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        quorumServer36.type = learnerType37;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses39 = quorumServer36.electionAddr;
        java.lang.String str40 = quorumServer36.toString();
        long long41 = quorumServer36.getId();
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress43, inetSocketAddress44, learnerType45);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType47 = null;
        quorumServer46.type = learnerType47;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses49 = quorumServer46.electionAddr;
        long long50 = quorumServer46.id;
        java.lang.String str51 = quorumServer46.hostname;
        boolean boolean52 = quorumServer36.equals((java.lang.Object) str51);
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress54, inetSocketAddress55, inetSocketAddress56);
        java.lang.String str58 = quorumServer57.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses59 = quorumServer57.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses60 = quorumServer57.electionAddr;
        java.lang.String str61 = quorumServer57.hostname;
        long long62 = quorumServer57.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses63 = quorumServer57.electionAddr;
        quorumServer36.checkAddressDuplicate(quorumServer57);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses65 = quorumServer36.addr;
        quorumServer31.electionAddr = multipleAddresses65;
        quorumServer27.addr = multipleAddresses65;
        quorumServer13.electionAddr = multipleAddresses65;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType12 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType12.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":participant" + "'", str19, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(multipleAddresses39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + ":participant" + "'", str58, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses59);
        org.junit.Assert.assertNotNull(multipleAddresses60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 35L + "'", long62 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses63);
        org.junit.Assert.assertNotNull(multipleAddresses65);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        quorumServer11.hostname = "hi!";
        quorumServer11.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer11.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress5, inetSocketAddress6, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType16);
        quorumServer18.isClientAddrFromStatic = false;
        quorumServer18.id = 0L;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress27, inetSocketAddress28, learnerType29);
        boolean boolean31 = quorumServer30.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        quorumServer30.type = learnerType32;
        java.lang.String str34 = quorumServer30.toString();
        long long35 = quorumServer30.getId();
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress44, inetSocketAddress45, inetSocketAddress46);
        java.lang.String str48 = quorumServer47.toString();
        quorumServer47.hostname = "hi!";
        quorumServer47.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType52 = quorumServer47.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress41, inetSocketAddress42, learnerType52);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress37, inetSocketAddress38, inetSocketAddress39, learnerType52);
        quorumServer30.type = learnerType52;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress24, inetSocketAddress25, learnerType52);
        java.net.InetSocketAddress inetSocketAddress58 = null;
        java.net.InetSocketAddress inetSocketAddress59 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType60 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer61 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress58, inetSocketAddress59, learnerType60);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType62 = null;
        quorumServer61.type = learnerType62;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses64 = quorumServer61.electionAddr;
        java.lang.String str65 = quorumServer61.toString();
        long long66 = quorumServer61.getId();
        boolean boolean67 = quorumServer61.isClientAddrFromStatic;
        quorumServer56.checkAddressDuplicate(quorumServer61);
        quorumServer56.hostname = ":participant";
        boolean boolean71 = quorumServer18.equals((java.lang.Object) quorumServer56);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses72 = quorumServer56.addr;
        java.net.InetSocketAddress inetSocketAddress74 = null;
        java.net.InetSocketAddress inetSocketAddress75 = null;
        java.net.InetSocketAddress inetSocketAddress76 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer77 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress74, inetSocketAddress75, inetSocketAddress76);
        java.lang.String str78 = quorumServer77.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses79 = quorumServer77.addr;
        boolean boolean80 = quorumServer77.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress81 = quorumServer77.clientAddr;
        quorumServer77.hostname = "hi!";
        boolean boolean84 = quorumServer56.equals((java.lang.Object) quorumServer77);
        java.lang.String str85 = quorumServer77.hostname;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":participant" + "'", str48, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType52 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType52.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(multipleAddresses72);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + ":participant" + "'", str78, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(inetSocketAddress81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.recreateSocketAddresses();
        long long6 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        quorumServer21.hostname = "hi!";
        quorumServer21.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress15, inetSocketAddress16, learnerType26);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress11, inetSocketAddress12, inetSocketAddress13, learnerType26);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress8, inetSocketAddress9, learnerType26);
        quorumServer4.type = learnerType26;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress32, inetSocketAddress33, learnerType34);
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress37, inetSocketAddress38, inetSocketAddress39);
        java.lang.String str41 = quorumServer40.toString();
        long long42 = quorumServer40.getId();
        quorumServer40.id = 100L;
        quorumServer40.recreateSocketAddresses();
        boolean boolean46 = quorumServer35.equals((java.lang.Object) quorumServer40);
        boolean boolean47 = quorumServer35.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer35.electionAddr;
        quorumServer4.electionAddr = multipleAddresses48;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType26 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType26.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":participant" + "'", str41, ":participant");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(multipleAddresses48);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        quorumServer4.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer28.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer28.electionAddr;
        java.lang.String str32 = quorumServer28.hostname;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        quorumServer28.clientAddr = inetSocketAddress33;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = quorumServer28.type;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress37, inetSocketAddress38, inetSocketAddress39);
        java.lang.String str41 = quorumServer40.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer40.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer40.electionAddr;
        boolean boolean44 = quorumServer40.isClientAddrFromStatic;
        boolean boolean45 = quorumServer28.equals((java.lang.Object) quorumServer40);
        boolean boolean46 = quorumServer40.isClientAddrFromStatic;
        quorumServer4.checkAddressDuplicate(quorumServer40);
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer52 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress49, inetSocketAddress50, learnerType51);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType53 = null;
        quorumServer52.type = learnerType53;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer52.electionAddr;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        quorumServer52.clientAddr = inetSocketAddress56;
        quorumServer52.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer62 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress60, inetSocketAddress61);
        quorumServer52.checkAddressDuplicate(quorumServer62);
        boolean boolean64 = quorumServer4.equals((java.lang.Object) quorumServer52);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(learnerType23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + learnerType35 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType35.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":participant" + "'", str41, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertNotNull(multipleAddresses43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        java.lang.Class<?> wildcardClass13 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress11, inetSocketAddress12, learnerType13);
        quorumServer14.hostname = "hi!";
        quorumServer14.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress20);
        quorumServer14.checkAddressDuplicate(quorumServer21);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress8, inetSocketAddress9, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType26);
        quorumServer27.isClientAddrFromStatic = false;
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType26 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType26.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        java.net.InetSocketAddress inetSocketAddress16 = quorumServer4.clientAddr;
        java.lang.String str17 = quorumServer4.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inetSocketAddress16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.electionAddr;
        quorumServer14.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer14.addr;
        quorumServer4.addr = multipleAddresses18;
        java.lang.String str20 = quorumServer4.hostname;
        long long21 = quorumServer4.id;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.isClientAddrFromStatic = true;
        quorumServer4.id = 35L;
        org.junit.Assert.assertNull(learnerType5);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress12, inetSocketAddress13, inetSocketAddress14);
        java.lang.String str16 = quorumServer15.toString();
        quorumServer15.hostname = "hi!";
        quorumServer15.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = quorumServer15.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress9, inetSocketAddress10, learnerType20);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress6, inetSocketAddress7, learnerType20);
        quorumServer4.type = learnerType20;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":participant" + "'", str16, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType20 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType20.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        quorumServer11.hostname = "hi!";
        quorumServer11.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer11.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress5, inetSocketAddress6, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType16);
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress20, inetSocketAddress21, inetSocketAddress22);
        java.lang.String str24 = quorumServer23.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer23.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        java.lang.String str27 = quorumServer23.hostname;
        long long28 = quorumServer23.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer23.electionAddr;
        quorumServer18.electionAddr = multipleAddresses29;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer18.addr;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            quorumServer18.checkAddressDuplicate(quorumServer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"addr\" because \"s\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":participant" + "'", str24, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNotNull(multipleAddresses31);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress12, inetSocketAddress13, inetSocketAddress14);
        java.lang.String str16 = quorumServer15.toString();
        quorumServer15.hostname = "hi!";
        quorumServer15.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = quorumServer15.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress9, inetSocketAddress10, learnerType20);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType20);
        quorumServer22.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = quorumServer22.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType24);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":participant" + "'", str16, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType20 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType20.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType24 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType24.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress17, inetSocketAddress18, learnerType19);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        quorumServer20.type = learnerType21;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer20.electionAddr;
        long long24 = quorumServer20.id;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress26, inetSocketAddress27, inetSocketAddress28, learnerType29);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer30.electionAddr;
        quorumServer30.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer30.addr;
        quorumServer20.addr = multipleAddresses34;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress37, inetSocketAddress38, learnerType39);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        quorumServer40.type = learnerType41;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer40.electionAddr;
        quorumServer20.addr = multipleAddresses43;
        quorumServer4.checkAddressDuplicate(quorumServer20);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNotNull(multipleAddresses34);
        org.junit.Assert.assertNotNull(multipleAddresses43);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress6, inetSocketAddress7, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.toString();
        long long11 = quorumServer9.getId();
        quorumServer9.id = 100L;
        quorumServer9.recreateSocketAddresses();
        boolean boolean15 = quorumServer4.equals((java.lang.Object) quorumServer9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer9.type = learnerType16;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress22, inetSocketAddress23, inetSocketAddress24);
        java.lang.String str26 = quorumServer25.toString();
        quorumServer25.hostname = "hi!";
        quorumServer25.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = quorumServer25.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress19, inetSocketAddress20, learnerType30);
        quorumServer9.type = learnerType30;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = quorumServer9.type;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 100, true);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 100L);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', false);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer4.electionAddr;
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses10);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        quorumServer4.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer28.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer28.electionAddr;
        java.lang.String str32 = quorumServer28.hostname;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        quorumServer28.clientAddr = inetSocketAddress33;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = quorumServer28.type;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress37, inetSocketAddress38, inetSocketAddress39);
        java.lang.String str41 = quorumServer40.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer40.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer40.electionAddr;
        boolean boolean44 = quorumServer40.isClientAddrFromStatic;
        boolean boolean45 = quorumServer28.equals((java.lang.Object) quorumServer40);
        boolean boolean46 = quorumServer40.isClientAddrFromStatic;
        quorumServer4.checkAddressDuplicate(quorumServer40);
        quorumServer40.id = (short) 0;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(learnerType23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + learnerType35 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType35.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":participant" + "'", str41, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertNotNull(multipleAddresses43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        boolean boolean19 = quorumServer14.equals((java.lang.Object) true);
        quorumServer4.checkAddressDuplicate(quorumServer14);
        java.lang.String str21 = quorumServer14.hostname;
        long long22 = quorumServer14.getId();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.lang.String str7 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress9);
        quorumServer10.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.addr;
        quorumServer4.electionAddr = multipleAddresses13;
        long long15 = quorumServer4.id;
        quorumServer4.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress19, inetSocketAddress20, inetSocketAddress21);
        java.lang.String str23 = quorumServer22.toString();
        long long24 = quorumServer22.getId();
        java.net.InetSocketAddress inetSocketAddress25 = null;
        quorumServer22.clientAddr = inetSocketAddress25;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses27 = quorumServer22.addr;
        quorumServer4.checkAddressDuplicate(quorumServer22);
        org.apache.zookeeper.server.WorkerService workerService32 = new org.apache.zookeeper.server.WorkerService(":participant", (int) 'a', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest33 = null;
        workerService32.schedule(workRequest33);
        boolean boolean35 = quorumServer4.equals((java.lang.Object) workerService32);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = quorumServer4.type;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":participant" + "'", str23, ":participant");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(learnerType36);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.electionAddr;
        quorumServer4.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress13, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer17.electionAddr;
        quorumServer17.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer17.addr;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        long long28 = quorumServer26.getId();
        quorumServer26.id = 100L;
        quorumServer26.recreateSocketAddresses();
        quorumServer17.checkAddressDuplicate(quorumServer26);
        quorumServer26.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService38 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService38.start();
        workerService38.stop();
        workerService38.stop();
        workerService38.stop();
        boolean boolean43 = quorumServer26.equals((java.lang.Object) workerService38);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses44 = quorumServer26.electionAddr;
        boolean boolean45 = quorumServer4.equals((java.lang.Object) quorumServer26);
        java.net.InetSocketAddress inetSocketAddress47 = null;
        java.net.InetSocketAddress inetSocketAddress48 = null;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType50 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer51 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress47, inetSocketAddress48, inetSocketAddress49, learnerType50);
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType55 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress53, inetSocketAddress54, learnerType55);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType57 = null;
        quorumServer56.type = learnerType57;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses59 = quorumServer56.electionAddr;
        quorumServer51.checkAddressDuplicate(quorumServer56);
        java.net.InetSocketAddress inetSocketAddress62 = null;
        java.net.InetSocketAddress inetSocketAddress63 = null;
        java.net.InetSocketAddress inetSocketAddress64 = null;
        java.net.InetSocketAddress inetSocketAddress66 = null;
        java.net.InetSocketAddress inetSocketAddress67 = null;
        java.net.InetSocketAddress inetSocketAddress69 = null;
        java.net.InetSocketAddress inetSocketAddress70 = null;
        java.net.InetSocketAddress inetSocketAddress71 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer72 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress69, inetSocketAddress70, inetSocketAddress71);
        java.lang.String str73 = quorumServer72.toString();
        quorumServer72.hostname = "hi!";
        quorumServer72.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType77 = quorumServer72.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer78 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress66, inetSocketAddress67, learnerType77);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer79 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress62, inetSocketAddress63, inetSocketAddress64, learnerType77);
        quorumServer56.type = learnerType77;
        quorumServer4.checkAddressDuplicate(quorumServer56);
        java.net.InetSocketAddress inetSocketAddress83 = null;
        java.net.InetSocketAddress inetSocketAddress84 = null;
        java.net.InetSocketAddress inetSocketAddress85 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer86 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress83, inetSocketAddress84, inetSocketAddress85);
        java.lang.String str87 = quorumServer86.toString();
        long long88 = quorumServer86.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses89 = quorumServer86.addr;
        quorumServer4.electionAddr = multipleAddresses89;
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(multipleAddresses44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(multipleAddresses59);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + ":participant" + "'", str73, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType77 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType77.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + ":participant" + "'", str87, ":participant");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 35L + "'", long88 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses89);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer7.type = learnerType8;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        java.lang.String str11 = quorumServer7.toString();
        long long12 = quorumServer7.id;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.lang.String str18 = quorumServer17.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer17.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        boolean boolean22 = quorumServer17.equals((java.lang.Object) true);
        quorumServer7.checkAddressDuplicate(quorumServer17);
        java.lang.String str24 = quorumServer17.hostname;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress26, inetSocketAddress27, learnerType28);
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress31, inetSocketAddress32, inetSocketAddress33);
        java.lang.String str35 = quorumServer34.toString();
        long long36 = quorumServer34.getId();
        quorumServer34.id = 100L;
        quorumServer34.recreateSocketAddresses();
        boolean boolean40 = quorumServer29.equals((java.lang.Object) quorumServer34);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = quorumServer34.type;
        quorumServer17.type = learnerType41;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType41);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ":participant" + "'", str35, ":participant");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 35L + "'", long36 == 35L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + learnerType41 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType41.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

