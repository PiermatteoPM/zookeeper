package org.apache.zookeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer.delimitedHostString(inetSocketAddress0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.InetSocketAddress.getHostString()\" because \"addr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            quorumServer4.checkAddressDuplicate(quorumServer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"addr\" because \"s\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) -1;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            quorumServer4.checkAddressDuplicate(quorumServer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"addr\" because \"s\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        java.lang.String str9 = quorumServer5.toString();
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.Class<?> wildcardClass5 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        java.lang.String str6 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        quorumServer5.clientAddr = inetSocketAddress6;
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.lang.String str9 = quorumServer4.hostname;
        java.lang.Class<?> wildcardClass10 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1);
        java.lang.Class<?> wildcardClass3 = quorumServer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join((long) '#');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.Class<?> wildcardClass8 = multipleAddresses7.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.recreateSocketAddresses();
        quorumServer4.id = (short) -1;
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.recreateSocketAddresses();
        java.lang.Class<?> wildcardClass7 = quorumServer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
        java.lang.Class<?> wildcardClass11 = quorumServer4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join((long) '#');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress13, inetSocketAddress14, learnerType15);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        quorumServer16.type = learnerType17;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        long long20 = quorumServer16.id;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress22, inetSocketAddress23, inetSocketAddress24, learnerType25);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses27 = quorumServer26.electionAddr;
        quorumServer26.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer26.addr;
        quorumServer16.addr = multipleAddresses30;
        quorumServer4.electionAddr = multipleAddresses30;
        java.lang.Class<?> wildcardClass33 = multipleAddresses30.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1);
        java.lang.String str3 = quorumServer2.hostname;
        boolean boolean4 = quorumServer2.isClientAddrFromStatic;
        quorumServer2.hostname = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
        java.lang.String str13 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join((long) '#');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress6, inetSocketAddress7, inetSocketAddress8, learnerType9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer15.type = learnerType16;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        quorumServer10.checkAddressDuplicate(quorumServer15);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer10.electionAddr;
        quorumServer4.electionAddr = multipleAddresses20;
        quorumServer4.id = (byte) 10;
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses20);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        quorumServer4.clientAddr = inetSocketAddress8;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = quorumServer4.type;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(learnerType10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress6, inetSocketAddress7, inetSocketAddress8, learnerType9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer15.type = learnerType16;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        quorumServer10.checkAddressDuplicate(quorumServer15);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer10.electionAddr;
        quorumServer4.electionAddr = multipleAddresses20;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress23, inetSocketAddress24, learnerType25);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = null;
        quorumServer26.type = learnerType27;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer26.electionAddr;
        quorumServer4.addr = multipleAddresses29;
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNotNull(multipleAddresses29);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.Class<?> wildcardClass5 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = quorumServer5.type;
        org.junit.Assert.assertNull(learnerType6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) -1;
        long long9 = quorumServer4.getId();
        java.lang.Class<?> wildcardClass10 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer4.addr;
        quorumServer4.id = 1L;
        org.junit.Assert.assertNotNull(multipleAddresses5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress5, inetSocketAddress6);
        quorumServer7.hostname = ":participant";
        boolean boolean10 = quorumServer3.equals((java.lang.Object) ":participant");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) 0;
        java.lang.Class<?> wildcardClass9 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
        java.lang.String str22 = quorumServer4.hostname;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.lang.String str9 = quorumServer4.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        quorumServer4.type = learnerType10;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
        quorumServer13.id = 1;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType12 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType12.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        quorumServer34.id = 0L;
        java.lang.Class<?> wildcardClass38 = quorumServer34.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.addr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType11);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer12.electionAddr;
        quorumServer12.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer12.addr;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        long long23 = quorumServer21.getId();
        quorumServer21.id = 100L;
        quorumServer21.recreateSocketAddresses();
        quorumServer12.checkAddressDuplicate(quorumServer21);
        java.net.InetSocketAddress inetSocketAddress28 = null;
        quorumServer12.clientAddr = inetSocketAddress28;
        boolean boolean30 = quorumServer5.equals((java.lang.Object) inetSocketAddress28);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        long long9 = quorumServer4.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer4.electionAddr;
        boolean boolean11 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress10, inetSocketAddress11, learnerType12);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer13.type = learnerType14;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        long long17 = quorumServer13.id;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer13.addr;
        quorumServer4.addr = multipleAddresses18;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        quorumServer4.clientAddr = inetSocketAddress20;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass10 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
        quorumServer14.id = (byte) 0;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer4.type = learnerType8;
        quorumServer4.hostname = ":participant";
        java.lang.Class<?> wildcardClass12 = quorumServer4.getClass();
        org.junit.Assert.assertNull(learnerType7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer11.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer11.electionAddr;
        boolean boolean16 = quorumServer11.equals((java.lang.Object) true);
        quorumServer11.recreateSocketAddresses();
        quorumServer11.hostname = ":participant";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer11.addr;
        quorumServer4.addr = multipleAddresses20;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multipleAddresses20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        org.junit.Assert.assertNotNull(multipleAddresses9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer11.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer11.electionAddr;
        java.lang.String str15 = quorumServer11.hostname;
        quorumServer4.checkAddressDuplicate(quorumServer11);
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress18, inetSocketAddress19, learnerType20);
        java.net.InetSocketAddress inetSocketAddress22 = null;
        quorumServer21.clientAddr = inetSocketAddress22;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        quorumServer21.type = learnerType25;
        quorumServer21.hostname = ":participant";
        boolean boolean30 = quorumServer21.equals((java.lang.Object) (-1.0f));
        boolean boolean31 = quorumServer4.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(learnerType24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses59 = quorumServer4.addr;
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
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
        java.lang.Class<?> wildcardClass9 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.join((long) 0);
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
        java.lang.String str13 = quorumServer4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":participant" + "'", str13, ":participant");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer4.type = learnerType8;
        quorumServer4.hostname = ":participant";
        boolean boolean13 = quorumServer4.equals((java.lang.Object) (-1.0f));
        long long14 = quorumServer4.getId();
        org.junit.Assert.assertNull(learnerType7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        java.lang.Class<?> wildcardClass9 = quorumServer5.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        long long14 = quorumServer10.id;
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.isClientAddrFromStatic = false;
        long long8 = quorumServer5.id;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress7, inetSocketAddress8, inetSocketAddress9);
        java.lang.String str11 = quorumServer10.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer10.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        boolean boolean15 = quorumServer10.equals((java.lang.Object) true);
        quorumServer10.recreateSocketAddresses();
        quorumServer10.hostname = ":participant";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer10.addr;
        quorumServer5.electionAddr = multipleAddresses19;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":participant" + "'", str11, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multipleAddresses19);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = 100L;
        quorumServer4.recreateSocketAddresses();
        quorumServer4.id = 0;
        long long12 = quorumServer4.id;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = quorumServer14.type;
        java.lang.String str34 = quorumServer14.hostname;
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
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        long long9 = quorumServer4.getId();
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1);
        java.lang.Class<?> wildcardClass3 = quorumServer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) "hi!");
        java.net.InetSocketAddress inetSocketAddress10 = quorumServer4.clientAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inetSocketAddress10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress10);
        quorumServer4.checkAddressDuplicate(quorumServer11);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = quorumServer11.type;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress15, inetSocketAddress16, inetSocketAddress17);
        java.lang.String str19 = quorumServer18.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer18.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer18.electionAddr;
        quorumServer11.electionAddr = multipleAddresses21;
        org.junit.Assert.assertTrue("'" + learnerType13 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType13.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":participant" + "'", str19, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNotNull(multipleAddresses21);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress9);
        quorumServer10.isClientAddrFromStatic = false;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress17, inetSocketAddress18, learnerType19);
        boolean boolean21 = quorumServer20.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        quorumServer20.type = learnerType22;
        java.lang.String str24 = quorumServer20.toString();
        long long25 = quorumServer20.getId();
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress34, inetSocketAddress35, inetSocketAddress36);
        java.lang.String str38 = quorumServer37.toString();
        quorumServer37.hostname = "hi!";
        quorumServer37.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType42 = quorumServer37.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress31, inetSocketAddress32, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress27, inetSocketAddress28, inetSocketAddress29, learnerType42);
        quorumServer20.type = learnerType42;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress14, inetSocketAddress15, learnerType42);
        java.net.InetSocketAddress inetSocketAddress48 = null;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType50 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer51 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress48, inetSocketAddress49, learnerType50);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType52 = null;
        quorumServer51.type = learnerType52;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses54 = quorumServer51.electionAddr;
        java.lang.String str55 = quorumServer51.toString();
        long long56 = quorumServer51.getId();
        boolean boolean57 = quorumServer51.isClientAddrFromStatic;
        quorumServer46.checkAddressDuplicate(quorumServer51);
        java.lang.String str59 = quorumServer46.hostname;
        java.net.InetSocketAddress inetSocketAddress60 = quorumServer46.clientAddr;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType61 = quorumServer46.type;
        quorumServer10.type = learnerType61;
        quorumServer4.type = learnerType61;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ":participant" + "'", str38, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType42 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType42.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(inetSocketAddress60);
        org.junit.Assert.assertTrue("'" + learnerType61 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType61.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        java.net.InetSocketAddress inetSocketAddress13 = quorumServer4.clientAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNull(inetSocketAddress13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        workerService3.join((long) (short) 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress7, inetSocketAddress8, inetSocketAddress9, learnerType10);
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress13, inetSocketAddress14, learnerType15);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        quorumServer16.type = learnerType17;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        quorumServer11.checkAddressDuplicate(quorumServer16);
        quorumServer16.id = ' ';
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        quorumServer27.hostname = "hi!";
        quorumServer27.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = quorumServer27.type;
        quorumServer16.type = learnerType32;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, learnerType32);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2, learnerType32);
        java.lang.String str36 = quorumServer35.toString();
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType32 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType32.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ":participant" + "'", str36, ":participant");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress6, inetSocketAddress7, inetSocketAddress8, learnerType9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer15.type = learnerType16;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        quorumServer10.checkAddressDuplicate(quorumServer15);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer10.electionAddr;
        quorumServer4.electionAddr = multipleAddresses20;
        java.lang.String str22 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        quorumServer4.type = learnerType6;
        java.lang.String str8 = quorumServer4.toString();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress10, inetSocketAddress11, learnerType12);
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress15, inetSocketAddress16, inetSocketAddress17);
        java.lang.String str19 = quorumServer18.toString();
        long long20 = quorumServer18.getId();
        quorumServer18.id = 100L;
        quorumServer18.recreateSocketAddresses();
        boolean boolean24 = quorumServer13.equals((java.lang.Object) quorumServer18);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer13.addr;
        boolean boolean26 = quorumServer4.equals((java.lang.Object) multipleAddresses25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":participant" + "'", str19, ":participant");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
        quorumServer4.hostname = "";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        java.lang.String str10 = quorumServer4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        workerService26.stop();
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.start();
        workerService3.join(100L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.join((long) '4');
        workerService3.start();
        workerService3.join((-1L));
        workerService3.start();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        quorumServer14.isClientAddrFromStatic = false;
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
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress53);
        boolean boolean55 = quorumServer4.equals((java.lang.Object) inetSocketAddress53);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        java.lang.Class<?> wildcardClass4 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        quorumServer4.hostname = ":participant";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        java.lang.Class<?> wildcardClass16 = quorumServer10.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer4.type = learnerType8;
        java.lang.Class<?> wildcardClass10 = quorumServer4.getClass();
        org.junit.Assert.assertNull(learnerType7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress10, inetSocketAddress11, learnerType12);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer13.type = learnerType14;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        long long17 = quorumServer13.id;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer13.addr;
        quorumServer4.addr = multipleAddresses18;
        java.lang.Class<?> wildcardClass20 = multipleAddresses18.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress1, inetSocketAddress2, learnerType33);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress5, inetSocketAddress6, learnerType7);
        quorumServer8.recreateSocketAddresses();
        long long10 = quorumServer8.id;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress12, inetSocketAddress13, learnerType30);
        quorumServer8.type = learnerType30;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType30);
        java.lang.Class<?> wildcardClass36 = learnerType30.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join((long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.isClientAddrFromStatic = false;
        quorumServer5.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        quorumServer14.hostname = "hi!";
        quorumServer14.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress20, inetSocketAddress21, inetSocketAddress22);
        java.lang.String str24 = quorumServer23.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer23.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        java.lang.String str27 = quorumServer23.hostname;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        quorumServer23.clientAddr = inetSocketAddress28;
        boolean boolean30 = quorumServer14.equals((java.lang.Object) inetSocketAddress28);
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress32, inetSocketAddress33, inetSocketAddress34, learnerType35);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer36.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses38 = quorumServer36.electionAddr;
        quorumServer14.addr = multipleAddresses38;
        quorumServer5.electionAddr = multipleAddresses38;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":participant" + "'", str24, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(multipleAddresses37);
        org.junit.Assert.assertNotNull(multipleAddresses38);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
        quorumServer10.isClientAddrFromStatic = true;
        quorumServer10.id = 0L;
        org.junit.Assert.assertNotNull(multipleAddresses13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
        boolean boolean20 = quorumServer4.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress22, inetSocketAddress23, learnerType24);
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress27, inetSocketAddress28, inetSocketAddress29);
        java.lang.String str31 = quorumServer30.toString();
        long long32 = quorumServer30.getId();
        quorumServer30.id = 100L;
        quorumServer30.recreateSocketAddresses();
        boolean boolean36 = quorumServer25.equals((java.lang.Object) quorumServer30);
        quorumServer30.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress39, inetSocketAddress40, learnerType41);
        quorumServer42.isClientAddrFromStatic = true;
        java.lang.String str45 = quorumServer42.hostname;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress47);
        quorumServer48.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses51 = quorumServer48.addr;
        quorumServer42.electionAddr = multipleAddresses51;
        quorumServer30.electionAddr = multipleAddresses51;
        quorumServer4.electionAddr = multipleAddresses51;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":participant" + "'", str31, ":participant");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(multipleAddresses51);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer4.clientAddr = inetSocketAddress10;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress13, inetSocketAddress14, inetSocketAddress15);
        java.lang.String str17 = quorumServer16.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer16.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        java.lang.String str20 = quorumServer16.hostname;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer16.clientAddr = inetSocketAddress21;
        quorumServer16.id = (byte) -1;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress26, inetSocketAddress27, learnerType28);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer29.type = learnerType30;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer29.addr;
        quorumServer16.electionAddr = multipleAddresses32;
        boolean boolean34 = quorumServer4.equals((java.lang.Object) multipleAddresses32);
        java.net.InetSocketAddress inetSocketAddress35 = quorumServer4.clientAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":participant" + "'", str17, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inetSocketAddress35);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        java.lang.String str14 = quorumServer13.hostname;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType12 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType12.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 0, false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer7.hostname = "hi!";
        quorumServer7.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress13, inetSocketAddress14, inetSocketAddress15);
        java.lang.String str17 = quorumServer16.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer16.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        java.lang.String str20 = quorumServer16.hostname;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer16.clientAddr = inetSocketAddress21;
        boolean boolean23 = quorumServer7.equals((java.lang.Object) inetSocketAddress21);
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress25, inetSocketAddress26, inetSocketAddress27, learnerType28);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer29.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer29.electionAddr;
        quorumServer7.addr = multipleAddresses31;
        quorumServer2.addr = multipleAddresses31;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":participant" + "'", str17, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(multipleAddresses31);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.stop();
        workerService3.join((long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress9, inetSocketAddress10, inetSocketAddress11, learnerType38);
        quorumServer7.type = learnerType38;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType38);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":participant" + "'", str34, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType38 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType38.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        boolean boolean7 = quorumServer4.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress8 = quorumServer4.clientAddr;
        quorumServer4.hostname = "";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inetSocketAddress8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        quorumServer18.isClientAddrFromStatic = false;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = 100L;
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        long long16 = quorumServer14.getId();
        java.net.InetSocketAddress inetSocketAddress17 = null;
        quorumServer14.clientAddr = inetSocketAddress17;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer14.addr;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        quorumServer14.clientAddr = inetSocketAddress20;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.lang.String str27 = quorumServer26.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses28 = quorumServer26.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer26.electionAddr;
        java.lang.String str30 = quorumServer26.hostname;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        quorumServer26.clientAddr = inetSocketAddress31;
        quorumServer26.id = (byte) -1;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress36, inetSocketAddress37, learnerType38);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = null;
        quorumServer39.type = learnerType40;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer39.addr;
        quorumServer26.electionAddr = multipleAddresses42;
        boolean boolean44 = quorumServer14.equals((java.lang.Object) multipleAddresses42);
        quorumServer4.addr = multipleAddresses42;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        boolean boolean47 = quorumServer33.isClientAddrFromStatic;
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2);
        long long4 = quorumServer3.id;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.isClientAddrFromStatic = false;
        boolean boolean8 = quorumServer5.isClientAddrFromStatic;
        quorumServer5.id = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 100, true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer4.addr;
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
        org.junit.Assert.assertNotNull(multipleAddresses34);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer11.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer11.electionAddr;
        java.lang.String str15 = quorumServer11.hostname;
        quorumServer4.checkAddressDuplicate(quorumServer11);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer4.addr;
        java.lang.Class<?> wildcardClass18 = quorumServer4.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean6 = quorumServer4.equals((java.lang.Object) 35L);
        long long7 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        quorumServer4.clientAddr = inetSocketAddress8;
        java.lang.Class<?> wildcardClass10 = quorumServer4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = 100L;
        quorumServer4.recreateSocketAddresses();
        quorumServer4.id = 0;
        java.lang.String str12 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) -1, false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = 100L;
        quorumServer4.recreateSocketAddresses();
        long long10 = quorumServer4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        quorumServer18.id = (byte) 10;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        workerService3.start();
        workerService3.join(35L);
        workerService3.start();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        workerService3.start();
        workerService3.join(35L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        long long6 = quorumServer5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        boolean boolean6 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(learnerType7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        quorumServer33.isClientAddrFromStatic = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = 100L;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.electionAddr;
        quorumServer4.hostname = ":participant";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress8, inetSocketAddress9, inetSocketAddress10);
        java.lang.String str12 = quorumServer11.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer11.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer11.electionAddr;
        java.lang.String str15 = quorumServer11.hostname;
        quorumServer4.checkAddressDuplicate(quorumServer11);
        quorumServer11.isClientAddrFromStatic = true;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        java.lang.String str23 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        boolean boolean27 = quorumServer26.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 1, false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1, inetSocketAddress2);
        quorumServer3.id = 0;
        long long6 = quorumServer3.id;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress10, inetSocketAddress11, learnerType12);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer13.type = learnerType14;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        long long17 = quorumServer13.id;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer13.addr;
        quorumServer4.addr = multipleAddresses18;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress21, inetSocketAddress22, inetSocketAddress23);
        java.lang.String str25 = quorumServer24.toString();
        long long26 = quorumServer24.getId();
        quorumServer24.id = (short) -1;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress30, inetSocketAddress31, learnerType32);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = null;
        quorumServer33.type = learnerType34;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses36 = quorumServer33.electionAddr;
        quorumServer24.electionAddr = multipleAddresses36;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress39, inetSocketAddress40, learnerType41);
        java.net.InetSocketAddress inetSocketAddress44 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress44, inetSocketAddress45, inetSocketAddress46);
        java.lang.String str48 = quorumServer47.toString();
        long long49 = quorumServer47.getId();
        quorumServer47.id = 100L;
        quorumServer47.recreateSocketAddresses();
        boolean boolean53 = quorumServer42.equals((java.lang.Object) quorumServer47);
        quorumServer47.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress56 = null;
        java.net.InetSocketAddress inetSocketAddress57 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType58 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer59 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress56, inetSocketAddress57, learnerType58);
        quorumServer59.isClientAddrFromStatic = true;
        java.lang.String str62 = quorumServer59.hostname;
        java.net.InetSocketAddress inetSocketAddress64 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer65 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress64);
        quorumServer65.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses68 = quorumServer65.addr;
        quorumServer59.electionAddr = multipleAddresses68;
        quorumServer47.electionAddr = multipleAddresses68;
        quorumServer24.addr = multipleAddresses68;
        quorumServer4.addr = multipleAddresses68;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses36);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":participant" + "'", str48, ":participant");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 35L + "'", long49 == 35L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(multipleAddresses68);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        java.lang.Object obj18 = null;
        boolean boolean19 = quorumServer17.equals(obj18);
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress21, inetSocketAddress22, inetSocketAddress23, learnerType24);
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress27, inetSocketAddress28, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        quorumServer30.type = learnerType31;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses33 = quorumServer30.electionAddr;
        quorumServer25.checkAddressDuplicate(quorumServer30);
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.lang.String str40 = quorumServer39.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer39.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer39.electionAddr;
        java.lang.String str43 = quorumServer39.hostname;
        java.lang.String str44 = quorumServer39.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = null;
        quorumServer39.type = learnerType45;
        boolean boolean47 = quorumServer25.equals((java.lang.Object) quorumServer39);
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer52 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress49, inetSocketAddress50, inetSocketAddress51);
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType57 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer58 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress54, inetSocketAddress55, inetSocketAddress56, learnerType57);
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer63 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress60, inetSocketAddress61, learnerType62);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType64 = null;
        quorumServer63.type = learnerType64;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses66 = quorumServer63.electionAddr;
        quorumServer58.checkAddressDuplicate(quorumServer63);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses68 = quorumServer58.electionAddr;
        quorumServer52.electionAddr = multipleAddresses68;
        quorumServer39.addr = multipleAddresses68;
        boolean boolean71 = quorumServer17.equals((java.lang.Object) quorumServer39);
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(multipleAddresses33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ":participant" + "'", str40, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(multipleAddresses66);
        org.junit.Assert.assertNotNull(multipleAddresses68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType33 = quorumServer14.type;
        java.lang.Class<?> wildcardClass34 = quorumServer14.getClass();
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
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
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
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress16, inetSocketAddress17, inetSocketAddress18);
        java.lang.String str20 = quorumServer19.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses21 = quorumServer19.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer19.electionAddr;
        boolean boolean24 = quorumServer19.equals((java.lang.Object) "hi!");
        boolean boolean25 = quorumServer19.isClientAddrFromStatic;
        quorumServer5.checkAddressDuplicate(quorumServer19);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":participant" + "'", str20, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) 'a', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        org.apache.zookeeper.server.WorkerService workerService18 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        boolean boolean19 = quorumServer10.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        java.net.InetSocketAddress inetSocketAddress21 = quorumServer4.clientAddr;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            quorumServer4.checkAddressDuplicate(quorumServer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"addr\" because \"s\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNull(inetSocketAddress21);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1, inetSocketAddress2);
        quorumServer3.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        java.lang.String str14 = quorumServer10.toString();
        long long15 = quorumServer10.id;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress17, inetSocketAddress18, inetSocketAddress19);
        java.lang.String str21 = quorumServer20.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer20.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer20.electionAddr;
        boolean boolean25 = quorumServer20.equals((java.lang.Object) true);
        quorumServer10.checkAddressDuplicate(quorumServer20);
        java.lang.String str27 = quorumServer20.hostname;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress29, inetSocketAddress30, inetSocketAddress31);
        java.lang.String str33 = quorumServer32.toString();
        quorumServer32.hostname = "hi!";
        quorumServer32.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = quorumServer32.type;
        quorumServer20.type = learnerType37;
        long long39 = quorumServer20.id;
        java.net.InetSocketAddress inetSocketAddress40 = quorumServer20.clientAddr;
        quorumServer3.checkAddressDuplicate(quorumServer20);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":participant" + "'", str33, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35L + "'", long39 == 35L);
        org.junit.Assert.assertNull(inetSocketAddress40);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.junit.Assert.assertNull(learnerType5);
        org.junit.Assert.assertNull(learnerType7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.isClientAddrFromStatic = true;
        quorumServer4.hostname = "hi!";
        org.junit.Assert.assertNull(learnerType5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, true);
        workerService3.stop();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(52L, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        quorumServer5.isClientAddrFromStatic = false;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":participant" + "'", str20, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
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
        quorumServer13.type = learnerType30;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType12 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType12.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer4.clientAddr = inetSocketAddress10;
        java.net.InetSocketAddress inetSocketAddress12 = quorumServer4.clientAddr;
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNull(inetSocketAddress12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        java.net.InetSocketAddress inetSocketAddress31 = quorumServer4.clientAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inetSocketAddress31);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        java.net.InetSocketAddress inetSocketAddress29 = quorumServer4.clientAddr;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":participant" + "'", str23, ":participant");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertNull(inetSocketAddress29);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        quorumServer4.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        org.junit.Assert.assertNull(learnerType9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        java.lang.String str9 = quorumServer4.hostname;
        quorumServer4.isClientAddrFromStatic = true;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        workerService3.join((long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2);
        quorumServer3.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress5 = quorumServer3.clientAddr;
        org.junit.Assert.assertNull(inetSocketAddress5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) '4');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        long long46 = quorumServer38.id;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        java.lang.String str35 = quorumServer4.toString();
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress1);
        quorumServer2.recreateSocketAddresses();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        long long47 = quorumServer4.id;
        org.junit.Assert.assertNull(learnerType5);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":participant" + "'", str37, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType41 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType41.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer19 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, learnerType17);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":participant" + "'", str11, ":participant");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType17 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType17.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress29, inetSocketAddress30, inetSocketAddress31);
        java.lang.String str33 = quorumServer32.toString();
        quorumServer32.hostname = "hi!";
        quorumServer32.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = quorumServer32.type;
        quorumServer19.type = learnerType37;
        java.lang.Class<?> wildcardClass39 = quorumServer19.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":participant" + "'", str20, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":participant" + "'", str33, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 10, false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.addr;
        quorumServer4.electionAddr = multipleAddresses20;
        quorumServer4.id = 10L;
        java.net.InetSocketAddress inetSocketAddress24 = quorumServer4.clientAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNull(inetSocketAddress24);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2);
        boolean boolean4 = quorumServer3.isClientAddrFromStatic;
        java.lang.Class<?> wildcardClass5 = quorumServer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2);
        quorumServer3.recreateSocketAddresses();
        long long5 = quorumServer3.id;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer3.electionAddr;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType7);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer8.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer8.electionAddr;
        java.lang.String str11 = quorumServer8.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = quorumServer8.type;
        quorumServer2.checkAddressDuplicate(quorumServer8);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(learnerType12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress4, inetSocketAddress5, learnerType29);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType29);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        java.lang.String str34 = quorumServer33.toString();
        java.net.InetSocketAddress inetSocketAddress35 = null;
        quorumServer33.clientAddr = inetSocketAddress35;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":participant" + "'", str34, ":participant");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2);
        boolean boolean4 = quorumServer3.isClientAddrFromStatic;
        quorumServer3.hostname = ":participant";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        java.lang.Class<?> wildcardClass7 = multipleAddresses6.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, learnerType23);
        java.lang.Class<?> wildcardClass27 = quorumServer26.getClass();
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":participant" + "'", str23, ":participant");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses27);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses11 = quorumServer4.electionAddr;
        java.lang.String str12 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multipleAddresses11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType55 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress52, inetSocketAddress53, inetSocketAddress54, learnerType55);
        java.net.InetSocketAddress inetSocketAddress58 = null;
        java.net.InetSocketAddress inetSocketAddress59 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType60 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer61 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress58, inetSocketAddress59, learnerType60);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType62 = null;
        quorumServer61.type = learnerType62;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses64 = quorumServer61.electionAddr;
        quorumServer56.electionAddr = multipleAddresses64;
        quorumServer33.electionAddr = multipleAddresses64;
        java.lang.String str67 = quorumServer33.toString();
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
        org.junit.Assert.assertNotNull(multipleAddresses64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + ":participant" + "'", str67, ":participant");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) 0);
        workerService3.join(0L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses8 = quorumServer7.electionAddr;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress17, inetSocketAddress18, learnerType19);
        boolean boolean21 = quorumServer20.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = null;
        quorumServer20.type = learnerType22;
        java.lang.String str24 = quorumServer20.toString();
        long long25 = quorumServer20.getId();
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress34, inetSocketAddress35, inetSocketAddress36);
        java.lang.String str38 = quorumServer37.toString();
        quorumServer37.hostname = "hi!";
        quorumServer37.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType42 = quorumServer37.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress31, inetSocketAddress32, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress27, inetSocketAddress28, inetSocketAddress29, learnerType42);
        quorumServer20.type = learnerType42;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress14, inetSocketAddress15, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress10, inetSocketAddress11, inetSocketAddress12, learnerType42);
        quorumServer7.type = learnerType42;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1, inetSocketAddress2, learnerType42);
        org.junit.Assert.assertNotNull(multipleAddresses8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ":participant" + "'", str38, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType42 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType42.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (-1L));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (-1));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        quorumServer21.hostname = "hi!";
        quorumServer21.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType26 = quorumServer21.type;
        quorumServer10.type = learnerType26;
        quorumServer10.recreateSocketAddresses();
        quorumServer10.isClientAddrFromStatic = false;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType26 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType26.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.start();
        workerService3.join((long) '4');
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        long long14 = quorumServer13.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType12 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType12.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        long long12 = quorumServer4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress9, inetSocketAddress10, learnerType11);
        boolean boolean13 = quorumServer12.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer12.type = learnerType14;
        java.lang.String str16 = quorumServer12.toString();
        quorumServer4.checkAddressDuplicate(quorumServer12);
        java.net.InetSocketAddress inetSocketAddress18 = null;
        quorumServer12.clientAddr = inetSocketAddress18;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress10);
        quorumServer4.checkAddressDuplicate(quorumServer11);
        quorumServer11.recreateSocketAddresses();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 1);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress6, inetSocketAddress7, inetSocketAddress8, learnerType9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer15.type = learnerType16;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        quorumServer10.checkAddressDuplicate(quorumServer15);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer10.electionAddr;
        quorumServer4.electionAddr = multipleAddresses20;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress28, inetSocketAddress29, inetSocketAddress30, learnerType31);
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress34, inetSocketAddress35, learnerType36);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        quorumServer37.type = learnerType38;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses40 = quorumServer37.electionAddr;
        quorumServer32.checkAddressDuplicate(quorumServer37);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer32.electionAddr;
        quorumServer26.electionAddr = multipleAddresses42;
        quorumServer4.addr = multipleAddresses42;
        java.net.InetSocketAddress inetSocketAddress45 = quorumServer4.clientAddr;
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNotNull(multipleAddresses40);
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertNull(inetSocketAddress45);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        long long8 = quorumServer4.id;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        quorumServer4.recreateSocketAddresses();
        quorumServer4.hostname = "";
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress3 = null;
        quorumServer2.clientAddr = inetSocketAddress3;
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress8, inetSocketAddress9, learnerType10);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        quorumServer11.type = learnerType12;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer11.electionAddr;
        java.lang.String str15 = quorumServer11.toString();
        long long16 = quorumServer11.id;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer21.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.electionAddr;
        boolean boolean26 = quorumServer21.equals((java.lang.Object) true);
        quorumServer11.checkAddressDuplicate(quorumServer21);
        java.lang.String str28 = quorumServer21.hostname;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress30, inetSocketAddress31, inetSocketAddress32);
        java.lang.String str34 = quorumServer33.toString();
        quorumServer33.hostname = "hi!";
        quorumServer33.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = quorumServer33.type;
        quorumServer21.type = learnerType38;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType40);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1, inetSocketAddress2, learnerType40);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses43 = quorumServer42.addr;
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":participant" + "'", str34, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType38 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType38.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType40 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType40.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses43);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.Class<?> wildcardClass5 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer63 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress60, inetSocketAddress61, learnerType62);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType64 = null;
        quorumServer63.type = learnerType64;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses66 = quorumServer63.electionAddr;
        long long67 = quorumServer63.id;
        java.net.InetSocketAddress inetSocketAddress69 = null;
        java.net.InetSocketAddress inetSocketAddress70 = null;
        java.net.InetSocketAddress inetSocketAddress71 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType72 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer73 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress69, inetSocketAddress70, inetSocketAddress71, learnerType72);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses74 = quorumServer73.electionAddr;
        quorumServer73.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses77 = quorumServer73.addr;
        quorumServer63.addr = multipleAddresses77;
        quorumServer63.isClientAddrFromStatic = true;
        long long81 = quorumServer63.id;
        java.net.InetSocketAddress inetSocketAddress83 = null;
        java.net.InetSocketAddress inetSocketAddress84 = null;
        java.net.InetSocketAddress inetSocketAddress85 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer86 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress83, inetSocketAddress84, inetSocketAddress85);
        java.lang.String str87 = quorumServer86.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses88 = quorumServer86.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses89 = quorumServer86.electionAddr;
        java.lang.String str90 = quorumServer86.hostname;
        long long91 = quorumServer86.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses92 = quorumServer86.electionAddr;
        quorumServer63.electionAddr = multipleAddresses92;
        boolean boolean94 = quorumServer26.equals((java.lang.Object) multipleAddresses92);
        java.lang.Class<?> wildcardClass95 = quorumServer26.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertNotNull(multipleAddresses66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses74);
        org.junit.Assert.assertNotNull(multipleAddresses77);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + ":participant" + "'", str87, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses88);
        org.junit.Assert.assertNotNull(multipleAddresses89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 35L + "'", long91 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join(52L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.start();
        workerService3.stop();
        workerService3.join(52L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer4.clientAddr = inetSocketAddress10;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress13, inetSocketAddress14, inetSocketAddress15);
        java.lang.String str17 = quorumServer16.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer16.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        java.lang.String str20 = quorumServer16.hostname;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer16.clientAddr = inetSocketAddress21;
        quorumServer16.id = (byte) -1;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress26, inetSocketAddress27, learnerType28);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer29.type = learnerType30;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer29.addr;
        quorumServer16.electionAddr = multipleAddresses32;
        boolean boolean34 = quorumServer4.equals((java.lang.Object) multipleAddresses32);
        quorumServer4.hostname = "";
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = quorumServer4.type;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":participant" + "'", str17, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        java.lang.Class<?> wildcardClass40 = quorumServer31.getClass();
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":participant" + "'", str32, ":participant");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "";
        quorumServer4.isClientAddrFromStatic = false;
        quorumServer4.recreateSocketAddresses();
        long long10 = quorumServer4.id;
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer28.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer28.electionAddr;
        boolean boolean33 = quorumServer28.equals((java.lang.Object) true);
        quorumServer28.recreateSocketAddresses();
        quorumServer28.hostname = ":participant";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer28.addr;
        quorumServer7.addr = multipleAddresses37;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":participant" + "'", str13, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(multipleAddresses37);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        long long5 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress6 = quorumServer4.clientAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        quorumServer4.id = (byte) 0;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        quorumServer34.id = 0L;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer40 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress39);
        java.net.InetSocketAddress inetSocketAddress42 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress42, inetSocketAddress43, learnerType44);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType46 = null;
        quorumServer45.type = learnerType46;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer45.electionAddr;
        java.lang.String str49 = quorumServer45.toString();
        long long50 = quorumServer45.getId();
        java.net.InetSocketAddress inetSocketAddress52 = null;
        java.net.InetSocketAddress inetSocketAddress53 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType54 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer55 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress52, inetSocketAddress53, learnerType54);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType56 = null;
        quorumServer55.type = learnerType56;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses58 = quorumServer55.electionAddr;
        long long59 = quorumServer55.id;
        java.lang.String str60 = quorumServer55.hostname;
        boolean boolean61 = quorumServer45.equals((java.lang.Object) str60);
        java.net.InetSocketAddress inetSocketAddress63 = null;
        java.net.InetSocketAddress inetSocketAddress64 = null;
        java.net.InetSocketAddress inetSocketAddress65 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer66 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress63, inetSocketAddress64, inetSocketAddress65);
        java.lang.String str67 = quorumServer66.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses68 = quorumServer66.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses69 = quorumServer66.electionAddr;
        java.lang.String str70 = quorumServer66.hostname;
        long long71 = quorumServer66.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses72 = quorumServer66.electionAddr;
        quorumServer45.checkAddressDuplicate(quorumServer66);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses74 = quorumServer45.addr;
        quorumServer40.electionAddr = multipleAddresses74;
        quorumServer34.addr = multipleAddresses74;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + ":participant" + "'", str67, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses68);
        org.junit.Assert.assertNotNull(multipleAddresses69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 35L + "'", long71 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses72);
        org.junit.Assert.assertNotNull(multipleAddresses74);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        java.net.InetSocketAddress inetSocketAddress47 = null;
        quorumServer33.clientAddr = inetSocketAddress47;
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
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        quorumServer4.clientAddr = inetSocketAddress8;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer4.addr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNotNull(multipleAddresses10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(52L, inetSocketAddress1);
        quorumServer2.hostname = ":participant";
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, true);
        workerService3.start();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (byte) 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer4.addr;
        quorumServer4.id = (short) 100;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multipleAddresses16);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.isClientAddrFromStatic = false;
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        java.lang.Class<?> wildcardClass34 = quorumServer33.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress1);
        java.lang.Class<?> wildcardClass3 = quorumServer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        long long5 = quorumServer4.id;
        long long6 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        boolean boolean12 = quorumServer4.isClientAddrFromStatic;
        quorumServer4.id = 10L;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress10);
        quorumServer4.checkAddressDuplicate(quorumServer11);
        long long13 = quorumServer4.getId();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 1, false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 10, false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress13, inetSocketAddress14, inetSocketAddress15);
        java.lang.String str17 = quorumServer16.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer16.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        boolean boolean21 = quorumServer16.equals((java.lang.Object) "hi!");
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer16.electionAddr;
        quorumServer4.addr = multipleAddresses22;
        java.net.InetSocketAddress inetSocketAddress24 = quorumServer4.clientAddr;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":participant" + "'", str17, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNull(inetSocketAddress24);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress5, inetSocketAddress6, inetSocketAddress7);
        java.lang.String str9 = quorumServer8.toString();
        long long10 = quorumServer8.getId();
        java.net.InetSocketAddress inetSocketAddress11 = null;
        quorumServer8.clientAddr = inetSocketAddress11;
        quorumServer8.id = (-1);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = quorumServer8.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType15);
        java.lang.String str17 = quorumServer16.hostname;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":participant" + "'", str9, ":participant");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType15 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType15.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
        quorumServer4.hostname = "hi!";
        long long15 = quorumServer4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer4.clientAddr = inetSocketAddress10;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress13, inetSocketAddress14, inetSocketAddress15);
        java.lang.String str17 = quorumServer16.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer16.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        java.lang.String str20 = quorumServer16.hostname;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer16.clientAddr = inetSocketAddress21;
        quorumServer16.id = (byte) -1;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress26, inetSocketAddress27, learnerType28);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = null;
        quorumServer29.type = learnerType30;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer29.addr;
        quorumServer16.electionAddr = multipleAddresses32;
        boolean boolean34 = quorumServer4.equals((java.lang.Object) multipleAddresses32);
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        java.net.InetSocketAddress inetSocketAddress38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress36, inetSocketAddress37, inetSocketAddress38);
        java.lang.String str40 = quorumServer39.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer39.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer39.electionAddr;
        boolean boolean44 = quorumServer39.equals((java.lang.Object) true);
        quorumServer39.recreateSocketAddresses();
        quorumServer39.hostname = ":participant";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer39.addr;
        quorumServer4.electionAddr = multipleAddresses48;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses50 = quorumServer4.addr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":participant" + "'", str17, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ":participant" + "'", str40, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(multipleAddresses48);
        org.junit.Assert.assertNotNull(multipleAddresses50);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer5.addr;
        quorumServer5.id = 1;
        quorumServer5.id = (short) 0;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multipleAddresses16);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
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
        java.lang.String str18 = quorumServer16.toString();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        boolean boolean6 = quorumServer4.isClientAddrFromStatic;
        long long7 = quorumServer4.getId();
        java.lang.String str8 = quorumServer4.hostname;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress10, inetSocketAddress11, learnerType12);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer13.type = learnerType14;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer13.electionAddr;
        java.lang.String str17 = quorumServer13.toString();
        long long18 = quorumServer13.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer13.electionAddr;
        quorumServer4.addr = multipleAddresses19;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses19);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        long long6 = quorumServer4.id;
        org.junit.Assert.assertTrue("'" + learnerType5 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType5.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress10);
        quorumServer4.checkAddressDuplicate(quorumServer11);
        java.lang.Class<?> wildcardClass13 = quorumServer11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 100L);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer4.clientAddr = inetSocketAddress10;
        quorumServer4.isClientAddrFromStatic = false;
        org.junit.Assert.assertNotNull(multipleAddresses9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2);
        quorumServer3.isClientAddrFromStatic = false;
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses36 = quorumServer33.addr;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(multipleAddresses35);
        org.junit.Assert.assertNotNull(multipleAddresses36);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        quorumServer38.id = (-1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress5, inetSocketAddress6, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = quorumServer35.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType36);
        long long38 = quorumServer37.getId();
        java.lang.Class<?> wildcardClass39 = quorumServer37.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType36 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType36.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress26, inetSocketAddress27, inetSocketAddress28);
        java.lang.String str30 = quorumServer29.toString();
        quorumServer29.hostname = "hi!";
        quorumServer29.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = quorumServer29.type;
        quorumServer17.type = learnerType34;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = quorumServer17.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1, inetSocketAddress2, learnerType36);
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ":participant" + "'", str30, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType34 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType34.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType36 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType36.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses48 = quorumServer4.electionAddr;
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
        org.junit.Assert.assertNotNull(multipleAddresses48);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
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
        quorumServer26.isClientAddrFromStatic = true;
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":participant" + "'", str32, ":participant");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 1, false);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        java.lang.String str19 = quorumServer18.hostname;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress6, inetSocketAddress7, inetSocketAddress8, learnerType9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer15.type = learnerType16;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        quorumServer10.checkAddressDuplicate(quorumServer15);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer10.electionAddr;
        quorumServer4.electionAddr = multipleAddresses20;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress28, inetSocketAddress29, inetSocketAddress30, learnerType31);
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress34, inetSocketAddress35, learnerType36);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        quorumServer37.type = learnerType38;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses40 = quorumServer37.electionAddr;
        quorumServer32.checkAddressDuplicate(quorumServer37);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer32.electionAddr;
        quorumServer26.electionAddr = multipleAddresses42;
        quorumServer4.addr = multipleAddresses42;
        java.lang.Class<?> wildcardClass45 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNotNull(multipleAddresses40);
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer7.hostname = "hi!";
        quorumServer2.checkAddressDuplicate(quorumServer7);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        quorumServer7.clientAddr = inetSocketAddress12;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress5, inetSocketAddress6, learnerType33);
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress39, inetSocketAddress40, learnerType41);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = null;
        quorumServer42.type = learnerType43;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses45 = quorumServer42.electionAddr;
        java.lang.String str46 = quorumServer42.toString();
        long long47 = quorumServer42.getId();
        boolean boolean48 = quorumServer42.isClientAddrFromStatic;
        quorumServer37.checkAddressDuplicate(quorumServer42);
        java.lang.String str50 = quorumServer37.hostname;
        java.net.InetSocketAddress inetSocketAddress51 = quorumServer37.clientAddr;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType52 = quorumServer37.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(inetSocketAddress51);
        org.junit.Assert.assertTrue("'" + learnerType52 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType52.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        workerService3.start();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (-1), true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
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
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress41, inetSocketAddress42, learnerType43);
        quorumServer44.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        quorumServer44.clientAddr = inetSocketAddress47;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses49 = quorumServer44.electionAddr;
        quorumServer39.addr = multipleAddresses49;
        java.net.InetSocketAddress inetSocketAddress51 = null;
        quorumServer39.clientAddr = inetSocketAddress51;
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":participant" + "'", str31, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType35 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType35.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses49);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
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
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress33, inetSocketAddress34, learnerType35);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = null;
        quorumServer36.type = learnerType37;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses39 = quorumServer36.electionAddr;
        java.lang.String str40 = quorumServer36.toString();
        long long41 = quorumServer36.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer36.electionAddr;
        quorumServer31.addr = multipleAddresses42;
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses42);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
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
        long long40 = quorumServer26.id;
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":participant" + "'", str32, ":participant");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress8, inetSocketAddress9, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType30);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress1, inetSocketAddress2, learnerType30);
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        quorumServer4.id = 10L;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multipleAddresses12);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '4', true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress8, inetSocketAddress9, learnerType10);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        quorumServer11.type = learnerType12;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer11.electionAddr;
        java.lang.String str15 = quorumServer11.toString();
        long long16 = quorumServer11.id;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer21.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.electionAddr;
        boolean boolean26 = quorumServer21.equals((java.lang.Object) true);
        quorumServer11.checkAddressDuplicate(quorumServer21);
        java.lang.String str28 = quorumServer21.hostname;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress30, inetSocketAddress31, inetSocketAddress32);
        java.lang.String str34 = quorumServer33.toString();
        quorumServer33.hostname = "hi!";
        quorumServer33.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = quorumServer33.type;
        quorumServer21.type = learnerType38;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType40);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1, inetSocketAddress2, learnerType40);
        java.net.InetSocketAddress inetSocketAddress44 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress44, inetSocketAddress45, inetSocketAddress46, learnerType47);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses49 = quorumServer48.electionAddr;
        quorumServer48.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses52 = quorumServer48.addr;
        quorumServer48.isClientAddrFromStatic = false;
        quorumServer42.checkAddressDuplicate(quorumServer48);
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":participant" + "'", str34, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType38 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType38.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType40 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType40.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses49);
        org.junit.Assert.assertNotNull(multipleAddresses52);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.hostname;
        quorumServer4.checkAddressDuplicate(quorumServer9);
        java.lang.Class<?> wildcardClass12 = quorumServer9.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(32L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress6, inetSocketAddress7, inetSocketAddress8, learnerType9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer15.type = learnerType16;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        quorumServer10.checkAddressDuplicate(quorumServer15);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer10.electionAddr;
        quorumServer4.electionAddr = multipleAddresses20;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses20);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        java.lang.String str21 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        quorumServer4.recreateSocketAddresses();
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
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.start();
        workerService3.join((long) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
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
        java.net.InetSocketAddress inetSocketAddress22 = null;
        quorumServer4.clientAddr = inetSocketAddress22;
        quorumServer4.id = ' ';
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertNotNull(multipleAddresses20);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.start();
        workerService3.join((long) (short) 10);
        workerService3.stop();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        java.net.InetSocketAddress inetSocketAddress46 = quorumServer38.clientAddr;
        long long47 = quorumServer38.id;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(inetSocketAddress46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        quorumServer14.hostname = "hi!";
        quorumServer14.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = quorumServer14.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress8, inetSocketAddress9, learnerType19);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType19);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType19);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType19 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType19.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        quorumServer5.clientAddr = inetSocketAddress6;
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        workerService26.join(10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest34 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService26.schedule(workRequest34, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        java.lang.String str9 = quorumServer4.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        quorumServer4.type = learnerType10;
        java.net.InetSocketAddress inetSocketAddress12 = quorumServer4.clientAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer4.electionAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(multipleAddresses13);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) 'a', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) '#');
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer36.electionAddr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(multipleAddresses41);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer4.addr;
        java.lang.String str6 = quorumServer4.toString();
        org.junit.Assert.assertNotNull(multipleAddresses5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.lang.String str7 = quorumServer4.hostname;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        quorumServer4.id = 10L;
        java.lang.String str11 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(52L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        long long5 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress6 = quorumServer4.clientAddr;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(inetSocketAddress6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress8, inetSocketAddress9, learnerType10);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = quorumServer11.type;
        quorumServer11.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, inetSocketAddress15, inetSocketAddress16, inetSocketAddress17);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer18.addr;
        quorumServer11.electionAddr = multipleAddresses19;
        quorumServer4.electionAddr = multipleAddresses19;
        org.junit.Assert.assertNull(learnerType12);
        org.junit.Assert.assertNotNull(multipleAddresses19);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.id = 35L;
        long long9 = quorumServer5.getId();
        java.lang.Class<?> wildcardClass10 = quorumServer5.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.toString();
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
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer28.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer28.electionAddr;
        java.lang.String str32 = quorumServer28.hostname;
        java.lang.String str33 = quorumServer28.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = null;
        quorumServer28.type = learnerType34;
        boolean boolean36 = quorumServer14.equals((java.lang.Object) quorumServer28);
        java.net.InetSocketAddress inetSocketAddress38 = null;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress38, inetSocketAddress39, inetSocketAddress40);
        java.lang.String str42 = quorumServer41.toString();
        quorumServer41.hostname = "hi!";
        quorumServer41.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType46 = quorumServer41.type;
        quorumServer28.type = learnerType46;
        quorumServer4.checkAddressDuplicate(quorumServer28);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + ":participant" + "'", str42, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType46 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType46.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = quorumServer3.type;
        long long5 = quorumServer3.getId();
        java.lang.String str6 = quorumServer3.toString();
        org.junit.Assert.assertTrue("'" + learnerType4 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType4.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":participant" + "'", str6, ":participant");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1);
        quorumServer2.hostname = "hi!";
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.join((long) 0);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
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
        workerService14.stop();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) -1, true);
        workerService3.stop();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2);
        quorumServer3.recreateSocketAddresses();
        quorumServer3.hostname = ":participant";
        boolean boolean7 = quorumServer3.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        long long59 = quorumServer26.id;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses60 = quorumServer26.addr;
        boolean boolean61 = quorumServer26.isClientAddrFromStatic;
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":participant" + "'", str27, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 35L + "'", long59 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) -1;
        java.lang.String str9 = quorumServer4.hostname;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(32L, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.start();
        workerService3.join((long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress3 = quorumServer2.clientAddr;
        org.junit.Assert.assertNull(inetSocketAddress3);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = quorumServer11.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, inetSocketAddress5, inetSocketAddress6, learnerType15);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":participant" + "'", str12, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType15 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType15.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        java.net.InetSocketAddress inetSocketAddress6 = quorumServer5.clientAddr;
        boolean boolean7 = quorumServer5.isClientAddrFromStatic;
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        quorumServer4.hostname = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType41);
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress45, inetSocketAddress46, inetSocketAddress47);
        java.lang.String str49 = quorumServer48.toString();
        quorumServer48.hostname = "hi!";
        quorumServer48.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer57 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress54, inetSocketAddress55, inetSocketAddress56);
        java.lang.String str58 = quorumServer57.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses59 = quorumServer57.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses60 = quorumServer57.electionAddr;
        java.lang.String str61 = quorumServer57.hostname;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        quorumServer57.clientAddr = inetSocketAddress62;
        boolean boolean64 = quorumServer48.equals((java.lang.Object) inetSocketAddress62);
        java.net.InetSocketAddress inetSocketAddress66 = null;
        java.net.InetSocketAddress inetSocketAddress67 = null;
        java.net.InetSocketAddress inetSocketAddress68 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType69 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer70 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress66, inetSocketAddress67, inetSocketAddress68, learnerType69);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses71 = quorumServer70.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses72 = quorumServer70.electionAddr;
        quorumServer48.addr = multipleAddresses72;
        boolean boolean74 = quorumServer48.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress76 = null;
        java.net.InetSocketAddress inetSocketAddress77 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType78 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer79 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress76, inetSocketAddress77, learnerType78);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType80 = null;
        quorumServer79.type = learnerType80;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses82 = quorumServer79.addr;
        quorumServer48.electionAddr = multipleAddresses82;
        quorumServer43.electionAddr = multipleAddresses82;
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":participant" + "'", str24, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":participant" + "'", str37, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType41 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType41.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ":participant" + "'", str49, ":participant");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + ":participant" + "'", str58, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses59);
        org.junit.Assert.assertNotNull(multipleAddresses60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(multipleAddresses71);
        org.junit.Assert.assertNotNull(multipleAddresses72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(multipleAddresses82);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.id = 35L;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer13 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress10, inetSocketAddress11, learnerType12);
        boolean boolean14 = quorumServer13.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        quorumServer13.type = learnerType15;
        java.lang.String str17 = quorumServer13.toString();
        long long18 = quorumServer13.getId();
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress27, inetSocketAddress28, inetSocketAddress29);
        java.lang.String str31 = quorumServer30.toString();
        quorumServer30.hostname = "hi!";
        quorumServer30.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = quorumServer30.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress24, inetSocketAddress25, learnerType35);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress20, inetSocketAddress21, inetSocketAddress22, learnerType35);
        quorumServer13.type = learnerType35;
        quorumServer5.type = learnerType35;
        java.net.InetSocketAddress inetSocketAddress40 = quorumServer5.clientAddr;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":participant" + "'", str31, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType35 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType35.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(inetSocketAddress40);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2);
        quorumServer3.recreateSocketAddresses();
        quorumServer3.recreateSocketAddresses();
        java.lang.String str6 = quorumServer3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":participant" + "'", str6, ":participant");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.join(1L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.hostname = "hi!";
        quorumServer4.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        java.lang.Class<?> wildcardClass10 = learnerType9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType9 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType9.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer22 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType20);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer22.type;
        java.lang.String str24 = quorumServer22.toString();
        org.junit.Assert.assertTrue("'" + learnerType20 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType20.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":participant" + "'", str24, ":participant");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType55 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress52, inetSocketAddress53, inetSocketAddress54, learnerType55);
        java.net.InetSocketAddress inetSocketAddress58 = null;
        java.net.InetSocketAddress inetSocketAddress59 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType60 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer61 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress58, inetSocketAddress59, learnerType60);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType62 = null;
        quorumServer61.type = learnerType62;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses64 = quorumServer61.electionAddr;
        quorumServer56.electionAddr = multipleAddresses64;
        quorumServer33.electionAddr = multipleAddresses64;
        java.net.InetSocketAddress inetSocketAddress68 = null;
        java.net.InetSocketAddress inetSocketAddress69 = null;
        java.net.InetSocketAddress inetSocketAddress71 = null;
        java.net.InetSocketAddress inetSocketAddress72 = null;
        java.net.InetSocketAddress inetSocketAddress73 = null;
        java.net.InetSocketAddress inetSocketAddress75 = null;
        java.net.InetSocketAddress inetSocketAddress76 = null;
        java.net.InetSocketAddress inetSocketAddress78 = null;
        java.net.InetSocketAddress inetSocketAddress79 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType80 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer81 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress78, inetSocketAddress79, learnerType80);
        quorumServer81.hostname = "hi!";
        quorumServer81.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress87 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer88 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress87);
        quorumServer81.checkAddressDuplicate(quorumServer88);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType90 = quorumServer88.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer91 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress75, inetSocketAddress76, learnerType90);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer92 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress71, inetSocketAddress72, inetSocketAddress73, learnerType90);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer93 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress68, inetSocketAddress69, learnerType90);
        quorumServer33.type = learnerType90;
        quorumServer33.id = '4';
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
        org.junit.Assert.assertNotNull(multipleAddresses64);
        org.junit.Assert.assertTrue("'" + learnerType90 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType90.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress5, inetSocketAddress6, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType33);
        java.lang.Class<?> wildcardClass37 = quorumServer36.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = null;
        quorumServer4.type = learnerType5;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses8 = quorumServer4.addr;
        long long9 = quorumServer4.getId();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNotNull(multipleAddresses8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
        boolean boolean33 = quorumServer9.isClientAddrFromStatic;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":participant" + "'", str26, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: hi! does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        long long33 = quorumServer4.id;
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress4, inetSocketAddress5, learnerType6);
        quorumServer7.hostname = "";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        quorumServer2.electionAddr = multipleAddresses10;
        quorumServer2.isClientAddrFromStatic = true;
        org.junit.Assert.assertNotNull(multipleAddresses10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress1, inetSocketAddress2, learnerType14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType14 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType14.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress1);
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
        java.net.InetSocketAddress inetSocketAddress50 = quorumServer7.clientAddr;
        java.net.InetSocketAddress inetSocketAddress52 = null;
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer55 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress52, inetSocketAddress53, inetSocketAddress54);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses56 = quorumServer55.electionAddr;
        quorumServer7.electionAddr = multipleAddresses56;
        quorumServer2.electionAddr = multipleAddresses56;
        java.lang.String str59 = quorumServer2.toString();
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
        org.junit.Assert.assertNull(inetSocketAddress50);
        org.junit.Assert.assertNotNull(multipleAddresses56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ":participant" + "'", str59, ":participant");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1);
        quorumServer2.isClientAddrFromStatic = false;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer12 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress9, inetSocketAddress10, learnerType11);
        boolean boolean13 = quorumServer12.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        quorumServer12.type = learnerType14;
        java.lang.String str16 = quorumServer12.toString();
        long long17 = quorumServer12.getId();
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress26, inetSocketAddress27, inetSocketAddress28);
        java.lang.String str30 = quorumServer29.toString();
        quorumServer29.hostname = "hi!";
        quorumServer29.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = quorumServer29.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress23, inetSocketAddress24, learnerType34);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress19, inetSocketAddress20, inetSocketAddress21, learnerType34);
        quorumServer12.type = learnerType34;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer38 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress6, inetSocketAddress7, learnerType34);
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType42 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress40, inetSocketAddress41, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType44 = null;
        quorumServer43.type = learnerType44;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses46 = quorumServer43.electionAddr;
        java.lang.String str47 = quorumServer43.toString();
        long long48 = quorumServer43.getId();
        boolean boolean49 = quorumServer43.isClientAddrFromStatic;
        quorumServer38.checkAddressDuplicate(quorumServer43);
        java.lang.String str51 = quorumServer38.hostname;
        java.net.InetSocketAddress inetSocketAddress52 = quorumServer38.clientAddr;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType53 = quorumServer38.type;
        quorumServer2.type = learnerType53;
        java.lang.Class<?> wildcardClass55 = quorumServer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ":participant" + "'", str30, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType34 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType34.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(inetSocketAddress52);
        org.junit.Assert.assertTrue("'" + learnerType53 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType53.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        boolean boolean34 = quorumServer33.isClientAddrFromStatic;
        java.lang.String str35 = quorumServer33.hostname;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', false);
        workerService3.join((long) (byte) 100);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(52L, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6);
        java.lang.String str8 = quorumServer7.toString();
        quorumServer2.checkAddressDuplicate(quorumServer7);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer2.electionAddr;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses10);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.recreateSocketAddresses();
        quorumServer4.id = 52L;
        org.apache.zookeeper.server.WorkerService workerService12 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        boolean boolean13 = quorumServer4.equals((java.lang.Object) false);
        org.junit.Assert.assertNull(learnerType5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress10);
        quorumServer4.checkAddressDuplicate(quorumServer11);
        quorumServer11.hostname = "";
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer11.addr;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress17, inetSocketAddress18, learnerType19);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType21 = null;
        quorumServer20.type = learnerType21;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer20.electionAddr;
        quorumServer11.addr = multipleAddresses23;
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses23);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, inetSocketAddress1);
        quorumServer2.isClientAddrFromStatic = true;
        boolean boolean5 = quorumServer2.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(32L, inetSocketAddress1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
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
        java.net.InetSocketAddress inetSocketAddress29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress27, inetSocketAddress28, inetSocketAddress29);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = quorumServer30.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress23, inetSocketAddress24, inetSocketAddress25, learnerType31);
        quorumServer19.type = learnerType31;
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + learnerType31 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType31.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.addr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.Class<?> wildcardClass5 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress32, inetSocketAddress33, learnerType34);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = null;
        quorumServer35.type = learnerType36;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses38 = quorumServer35.addr;
        quorumServer4.electionAddr = multipleAddresses38;
        boolean boolean40 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertNotNull(multipleAddresses28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(multipleAddresses38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', false);
        workerService3.start();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        quorumServer10.isClientAddrFromStatic = true;
        quorumServer10.recreateSocketAddresses();
        java.lang.String str18 = quorumServer10.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer10.addr;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(multipleAddresses19);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        java.net.InetSocketAddress inetSocketAddress40 = null;
        quorumServer31.clientAddr = inetSocketAddress40;
        quorumServer31.id = 0;
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":participant" + "'", str32, ":participant");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        workerService3.join(1L);
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
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress12, inetSocketAddress13, inetSocketAddress14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = quorumServer15.type;
        quorumServer4.checkAddressDuplicate(quorumServer15);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertTrue("'" + learnerType16 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType16.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = 100L;
        quorumServer4.recreateSocketAddresses();
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
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress26, inetSocketAddress27, inetSocketAddress28);
        java.lang.String str30 = quorumServer29.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer29.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses32 = quorumServer29.electionAddr;
        java.lang.String str33 = quorumServer29.hostname;
        java.lang.String str34 = quorumServer29.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        quorumServer29.type = learnerType35;
        boolean boolean37 = quorumServer15.equals((java.lang.Object) quorumServer29);
        long long38 = quorumServer15.getId();
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress43, inetSocketAddress44, learnerType45);
        boolean boolean47 = quorumServer46.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType48 = null;
        quorumServer46.type = learnerType48;
        java.lang.String str50 = quorumServer46.toString();
        long long51 = quorumServer46.getId();
        java.net.InetSocketAddress inetSocketAddress53 = null;
        java.net.InetSocketAddress inetSocketAddress54 = null;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress57 = null;
        java.net.InetSocketAddress inetSocketAddress58 = null;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer63 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress60, inetSocketAddress61, inetSocketAddress62);
        java.lang.String str64 = quorumServer63.toString();
        quorumServer63.hostname = "hi!";
        quorumServer63.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType68 = quorumServer63.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer69 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress57, inetSocketAddress58, learnerType68);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer70 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress53, inetSocketAddress54, inetSocketAddress55, learnerType68);
        quorumServer46.type = learnerType68;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer72 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress40, inetSocketAddress41, learnerType68);
        java.lang.String str73 = quorumServer72.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses74 = quorumServer72.addr;
        quorumServer15.electionAddr = multipleAddresses74;
        boolean boolean76 = quorumServer4.equals((java.lang.Object) quorumServer15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ":participant" + "'", str30, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNotNull(multipleAddresses32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + ":participant" + "'", str64, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType68 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType68.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(multipleAddresses74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        org.apache.zookeeper.server.WorkerService workerService12 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService12.schedule(workRequest13, (long) 1);
        boolean boolean16 = quorumServer4.equals((java.lang.Object) workRequest13);
        long long17 = quorumServer4.id;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress33, inetSocketAddress34, learnerType35);
        quorumServer36.hostname = "hi!";
        quorumServer36.id = (byte) 100;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress42);
        quorumServer36.checkAddressDuplicate(quorumServer43);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = quorumServer43.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress30, inetSocketAddress31, learnerType45);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress26, inetSocketAddress27, inetSocketAddress28, learnerType45);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress23, inetSocketAddress24, learnerType45);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress19, inetSocketAddress20, inetSocketAddress21, learnerType45);
        long long50 = quorumServer49.id;
        quorumServer49.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses52 = quorumServer49.addr;
        quorumServer4.addr = multipleAddresses52;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType45 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType45.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertNotNull(multipleAddresses52);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.isClientAddrFromStatic = false;
        org.junit.Assert.assertNull(learnerType5);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) -1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"this.workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) '4');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.join((-1L));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        quorumServer10.id = (byte) -1;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress4, inetSocketAddress5, learnerType6);
        java.net.InetSocketAddress inetSocketAddress8 = null;
        quorumServer7.clientAddr = inetSocketAddress8;
        boolean boolean10 = quorumServer2.equals((java.lang.Object) inetSocketAddress8);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses11 = quorumServer2.electionAddr;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multipleAddresses11);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
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
        java.lang.Class<?> wildcardClass11 = quorumServer4.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.electionAddr;
        long long10 = quorumServer4.id;
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
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
        quorumServer33.hostname = ":participant";
        java.lang.Class<?> wildcardClass48 = quorumServer33.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        quorumServer4.id = (-1);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = quorumServer4.type;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress13, inetSocketAddress14);
        boolean boolean16 = quorumServer15.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        quorumServer15.clientAddr = inetSocketAddress17;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer15.electionAddr;
        quorumServer4.addr = multipleAddresses19;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + learnerType11 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType11.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multipleAddresses19);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 1, false);
        workerService3.join((long) (byte) 1);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) '4');
        workerService3.join((long) ' ');
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest13, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        workerService14.start();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) 0);
        workerService3.start();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) -1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        java.net.InetSocketAddress inetSocketAddress17 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer18 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress15, inetSocketAddress16, inetSocketAddress17);
        java.lang.String str19 = quorumServer18.toString();
        quorumServer18.hostname = "hi!";
        quorumServer18.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType23 = quorumServer18.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress12, inetSocketAddress13, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress5, inetSocketAddress6, learnerType23);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 10, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType23);
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress29, inetSocketAddress30, learnerType31);
        quorumServer32.hostname = "hi!";
        quorumServer32.id = (byte) 100;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses37 = quorumServer32.addr;
        quorumServer27.addr = multipleAddresses37;
        java.lang.String str39 = quorumServer27.toString();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":participant" + "'", str19, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType23 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType23.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ":participant" + "'", str39, ":participant");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.hostname = ":participant";
        org.junit.Assert.assertTrue("'" + learnerType5 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType5.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.hostname;
        boolean boolean6 = quorumServer4.isClientAddrFromStatic;
        long long7 = quorumServer4.getId();
        java.lang.String str8 = quorumServer4.hostname;
        quorumServer4.isClientAddrFromStatic = false;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        quorumServer4.isClientAddrFromStatic = true;
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) -1, false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
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
        quorumServer56.isClientAddrFromStatic = true;
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
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        java.lang.String str15 = quorumServer10.toString();
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress3 = quorumServer2.clientAddr;
        org.junit.Assert.assertNull(inetSocketAddress3);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
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
        quorumServer56.recreateSocketAddresses();
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
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        quorumServer4.isClientAddrFromStatic = true;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) true);
        java.lang.String str10 = quorumServer4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", 1, false);
        workerService3.stop();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        quorumServer4.isClientAddrFromStatic = true;
        quorumServer4.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer4.type;
        org.junit.Assert.assertTrue("'" + learnerType9 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType9.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.start();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer4.clientAddr = inetSocketAddress10;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses12 = quorumServer4.electionAddr;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer4.type;
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNull(learnerType13);
        org.junit.Assert.assertNull(learnerType14);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType30 = quorumServer22.type;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":participant" + "'", str23, ":participant");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertTrue("'" + learnerType30 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType30.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses11 = quorumServer4.addr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multipleAddresses11);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType10 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer11 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress8, inetSocketAddress9, learnerType10);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType12 = null;
        quorumServer11.type = learnerType12;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses14 = quorumServer11.electionAddr;
        java.lang.String str15 = quorumServer11.toString();
        long long16 = quorumServer11.id;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress18, inetSocketAddress19, inetSocketAddress20);
        java.lang.String str22 = quorumServer21.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer21.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer21.electionAddr;
        boolean boolean26 = quorumServer21.equals((java.lang.Object) true);
        quorumServer11.checkAddressDuplicate(quorumServer21);
        java.lang.String str28 = quorumServer21.hostname;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer33 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress30, inetSocketAddress31, inetSocketAddress32);
        java.lang.String str34 = quorumServer33.toString();
        quorumServer33.hostname = "hi!";
        quorumServer33.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = quorumServer33.type;
        quorumServer21.type = learnerType38;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = quorumServer21.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType40);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1, inetSocketAddress2, learnerType40);
        quorumServer42.id = (short) 100;
        boolean boolean45 = quorumServer42.isClientAddrFromStatic;
        org.junit.Assert.assertNotNull(multipleAddresses14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertNotNull(multipleAddresses24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":participant" + "'", str34, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType38 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType38.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType40 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType40.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress5, inetSocketAddress6, learnerType33);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType33);
        long long37 = quorumServer36.id;
        quorumServer36.isClientAddrFromStatic = false;
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType33 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType33.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", 100, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = 100L;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.electionAddr;
        boolean boolean10 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
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
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        boolean boolean16 = quorumServer15.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        quorumServer15.type = learnerType17;
        java.lang.String str19 = quorumServer15.toString();
        boolean boolean20 = quorumServer4.equals((java.lang.Object) str19);
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress26, inetSocketAddress27, learnerType28);
        boolean boolean30 = quorumServer29.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        quorumServer29.type = learnerType31;
        java.lang.String str33 = quorumServer29.toString();
        long long34 = quorumServer29.getId();
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
        quorumServer29.type = learnerType51;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer55 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress22, inetSocketAddress23, inetSocketAddress24, learnerType51);
        java.lang.String str56 = quorumServer55.hostname;
        quorumServer55.id = 0L;
        java.net.InetSocketAddress inetSocketAddress60 = null;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer63 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress60, inetSocketAddress61, learnerType62);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses64 = quorumServer63.electionAddr;
        quorumServer55.electionAddr = multipleAddresses64;
        quorumServer4.addr = multipleAddresses64;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ":participant" + "'", str47, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType51 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType51.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(multipleAddresses64);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((long) (short) 0);
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
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        quorumServer4.id = (byte) 1;
        quorumServer4.isClientAddrFromStatic = true;
        org.junit.Assert.assertNull(learnerType7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress1, inetSocketAddress2);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        quorumServer3.clientAddr = inetSocketAddress4;
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        java.net.InetSocketAddress inetSocketAddress39 = null;
        java.net.InetSocketAddress inetSocketAddress40 = null;
        java.net.InetSocketAddress inetSocketAddress41 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress39, inetSocketAddress40, inetSocketAddress41);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = quorumServer42.type;
        quorumServer2.type = learnerType43;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType32 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType32.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType43 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType43.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (-1L));
        workerService3.stop();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        quorumServer7.hostname = "hi!";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":participant" + "'", str8, ":participant");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.net.InetSocketAddress inetSocketAddress5 = null;
        quorumServer4.clientAddr = inetSocketAddress5;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType7 = quorumServer4.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer4.type = learnerType8;
        quorumServer4.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress13, inetSocketAddress14, learnerType15);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        quorumServer16.type = learnerType17;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        java.lang.String str20 = quorumServer16.toString();
        long long21 = quorumServer16.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer16.electionAddr;
        quorumServer4.addr = multipleAddresses22;
        quorumServer4.hostname = "hi!";
        quorumServer4.isClientAddrFromStatic = false;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNull(learnerType7);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses22);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest36 = null;
        workerService32.schedule(workRequest36);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":participant" + "'", str23, ":participant");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress17, inetSocketAddress18, inetSocketAddress19);
        java.lang.String str21 = quorumServer20.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer20.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer20.electionAddr;
        boolean boolean25 = quorumServer20.equals((java.lang.Object) true);
        quorumServer20.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress27 = quorumServer20.clientAddr;
        boolean boolean28 = quorumServer5.equals((java.lang.Object) inetSocketAddress27);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(inetSocketAddress27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        quorumServer4.hostname = "";
        quorumServer4.recreateSocketAddresses();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType3);
        boolean boolean5 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        quorumServer4.type = learnerType6;
        java.lang.String str8 = quorumServer4.toString();
        long long9 = quorumServer4.getId();
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
        quorumServer4.type = learnerType26;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 'a', inetSocketAddress31, inetSocketAddress32, inetSocketAddress33);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = quorumServer34.type;
        boolean boolean36 = quorumServer4.equals((java.lang.Object) quorumServer34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":participant" + "'", str22, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType26 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType26.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + learnerType35 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType35.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        java.lang.Class<?> wildcardClass35 = quorumServer33.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        quorumServer4.id = 10L;
        java.net.InetSocketAddress inetSocketAddress11 = quorumServer4.clientAddr;
        long long12 = quorumServer4.getId();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType13 = quorumServer4.type;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNull(inetSocketAddress11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + learnerType13 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType13.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
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
        java.lang.String str62 = quorumServer4.toString();
        quorumServer4.id = (short) 0;
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        quorumServer5.hostname = ":participant";
        org.junit.Assert.assertNotNull(multipleAddresses6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, false);
        workerService3.start();
        workerService3.join((long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"this.workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
        quorumServer4.type = learnerType16;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, inetSocketAddress1);
        quorumServer2.hostname = "hi!";
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) "hi!");
        long long10 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress11 = null;
        quorumServer4.clientAddr = inetSocketAddress11;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1, inetSocketAddress2);
        quorumServer3.hostname = ":participant";
        long long6 = quorumServer3.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) -1, true);
        workerService3.stop();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        java.lang.String str8 = quorumServer4.hostname;
        long long9 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        java.lang.String str15 = quorumServer14.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses16 = quorumServer14.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer14.electionAddr;
        java.lang.String str18 = quorumServer14.hostname;
        java.lang.String str19 = quorumServer14.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        quorumServer14.type = learnerType20;
        java.net.InetSocketAddress inetSocketAddress22 = quorumServer14.clientAddr;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer27 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress24, inetSocketAddress25, inetSocketAddress26);
        java.lang.String str28 = quorumServer27.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer27.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer27.electionAddr;
        java.lang.String str31 = quorumServer27.hostname;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        quorumServer27.clientAddr = inetSocketAddress32;
        java.lang.String str34 = quorumServer27.hostname;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        java.net.InetSocketAddress inetSocketAddress37 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer39 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress36, inetSocketAddress37, learnerType38);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = null;
        quorumServer39.type = learnerType40;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer39.electionAddr;
        long long43 = quorumServer39.id;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress45, inetSocketAddress46, inetSocketAddress47, learnerType48);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses50 = quorumServer49.electionAddr;
        quorumServer49.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses53 = quorumServer49.addr;
        quorumServer39.addr = multipleAddresses53;
        quorumServer27.electionAddr = multipleAddresses53;
        quorumServer14.addr = multipleAddresses53;
        java.net.InetSocketAddress inetSocketAddress57 = quorumServer14.clientAddr;
        quorumServer4.checkAddressDuplicate(quorumServer14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(inetSocketAddress22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":participant" + "'", str28, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses50);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertNull(inetSocketAddress57);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        boolean boolean20 = quorumServer4.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer4.clientAddr = inetSocketAddress21;
        java.net.InetSocketAddress inetSocketAddress23 = quorumServer4.clientAddr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inetSocketAddress23);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        boolean boolean16 = quorumServer4.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses17 = quorumServer4.electionAddr;
        quorumServer4.isClientAddrFromStatic = false;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multipleAddresses17);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
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
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress1, inetSocketAddress2);
        quorumServer3.hostname = "";
        long long6 = quorumServer3.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, false);
        workerService3.start();
        workerService3.join((long) (short) 0);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        quorumServer4.id = (short) -1;
        quorumServer4.recreateSocketAddresses();
        java.lang.String str10 = quorumServer4.hostname;
        quorumServer4.id = 1L;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.join((long) 'a');
        java.lang.Class<?> wildcardClass12 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        quorumServer4.type = learnerType16;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer4.electionAddr;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":participant" + "'", str10, ":participant");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multipleAddresses18);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress9 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress14, inetSocketAddress15, inetSocketAddress16);
        java.lang.String str18 = quorumServer17.toString();
        quorumServer17.hostname = "hi!";
        quorumServer17.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType22 = quorumServer17.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress11, inetSocketAddress12, learnerType22);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer24 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress7, inetSocketAddress8, inetSocketAddress9, learnerType22);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer25 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress4, inetSocketAddress5, learnerType22);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(32L, inetSocketAddress1, inetSocketAddress2, learnerType22);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType22 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType22.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        quorumServer10.isClientAddrFromStatic = true;
        quorumServer10.recreateSocketAddresses();
        java.lang.String str18 = quorumServer10.toString();
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer23 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress20, inetSocketAddress21, inetSocketAddress22);
        java.lang.String str24 = quorumServer23.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses25 = quorumServer23.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses26 = quorumServer23.electionAddr;
        java.lang.String str27 = quorumServer23.hostname;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        quorumServer23.clientAddr = inetSocketAddress28;
        quorumServer23.id = (byte) -1;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress33, inetSocketAddress34, learnerType35);
        quorumServer36.isClientAddrFromStatic = true;
        java.net.InetSocketAddress inetSocketAddress39 = null;
        quorumServer36.clientAddr = inetSocketAddress39;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses41 = quorumServer36.electionAddr;
        quorumServer36.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress45 = null;
        java.net.InetSocketAddress inetSocketAddress46 = null;
        java.net.InetSocketAddress inetSocketAddress47 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType48 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress45, inetSocketAddress46, inetSocketAddress47, learnerType48);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses50 = quorumServer49.electionAddr;
        quorumServer49.isClientAddrFromStatic = false;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses53 = quorumServer49.addr;
        java.net.InetSocketAddress inetSocketAddress55 = null;
        java.net.InetSocketAddress inetSocketAddress56 = null;
        java.net.InetSocketAddress inetSocketAddress57 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer58 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress55, inetSocketAddress56, inetSocketAddress57);
        java.lang.String str59 = quorumServer58.toString();
        long long60 = quorumServer58.getId();
        quorumServer58.id = 100L;
        quorumServer58.recreateSocketAddresses();
        quorumServer49.checkAddressDuplicate(quorumServer58);
        quorumServer58.id = (-1L);
        org.apache.zookeeper.server.WorkerService workerService70 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        workerService70.start();
        workerService70.stop();
        workerService70.stop();
        workerService70.stop();
        boolean boolean75 = quorumServer58.equals((java.lang.Object) workerService70);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses76 = quorumServer58.electionAddr;
        boolean boolean77 = quorumServer36.equals((java.lang.Object) quorumServer58);
        quorumServer23.checkAddressDuplicate(quorumServer58);
        quorumServer10.checkAddressDuplicate(quorumServer58);
        java.net.InetSocketAddress inetSocketAddress81 = null;
        java.net.InetSocketAddress inetSocketAddress82 = null;
        java.net.InetSocketAddress inetSocketAddress83 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer84 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress81, inetSocketAddress82, inetSocketAddress83);
        java.lang.String str85 = quorumServer84.toString();
        long long86 = quorumServer84.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses87 = quorumServer84.addr;
        quorumServer10.checkAddressDuplicate(quorumServer84);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":participant" + "'", str24, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses25);
        org.junit.Assert.assertNotNull(multipleAddresses26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(multipleAddresses41);
        org.junit.Assert.assertNotNull(multipleAddresses50);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ":participant" + "'", str59, ":participant");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 35L + "'", long60 == 35L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(multipleAddresses76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + ":participant" + "'", str85, ":participant");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 35L + "'", long86 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses87);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) ' ', false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.join((long) '4');
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress1);
        quorumServer2.id = (short) 10;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType20 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer21 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress17, inetSocketAddress18, inetSocketAddress19, learnerType20);
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress23, inetSocketAddress24, learnerType25);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType27 = null;
        quorumServer26.type = learnerType27;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses29 = quorumServer26.electionAddr;
        quorumServer21.checkAddressDuplicate(quorumServer26);
        quorumServer26.id = ' ';
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress34, inetSocketAddress35, inetSocketAddress36);
        java.lang.String str38 = quorumServer37.toString();
        quorumServer37.hostname = "hi!";
        quorumServer37.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType42 = quorumServer37.type;
        quorumServer26.type = learnerType42;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress13, inetSocketAddress14, inetSocketAddress15, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress10, inetSocketAddress11, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 100, inetSocketAddress6, inetSocketAddress7, inetSocketAddress8, learnerType42);
        quorumServer2.type = learnerType42;
        java.net.InetSocketAddress inetSocketAddress49 = null;
        java.net.InetSocketAddress inetSocketAddress50 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer52 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress49, inetSocketAddress50, learnerType51);
        long long53 = quorumServer52.id;
        java.net.InetSocketAddress inetSocketAddress54 = quorumServer52.clientAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer52.electionAddr;
        quorumServer2.electionAddr = multipleAddresses55;
        java.lang.String str57 = quorumServer2.hostname;
        org.junit.Assert.assertNotNull(multipleAddresses29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ":participant" + "'", str38, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType42 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType42.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNull(inetSocketAddress54);
        org.junit.Assert.assertNotNull(multipleAddresses55);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer34 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress1, inetSocketAddress2, learnerType29);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":participant" + "'", str25, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType29 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType29.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
        quorumServer4.id = (byte) -1;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress1, inetSocketAddress2, learnerType3);
        quorumServer4.hostname = "hi!";
        quorumServer4.id = (byte) 100;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        boolean boolean10 = quorumServer4.isClientAddrFromStatic;
        quorumServer4.hostname = ":participant";
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1, inetSocketAddress2);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.join((long) '4');
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", 10, false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer8 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress5, inetSocketAddress6, inetSocketAddress7);
        java.lang.String str9 = quorumServer8.toString();
        long long10 = quorumServer8.getId();
        quorumServer8.id = (short) -1;
        long long13 = quorumServer8.getId();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer8.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType14);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":participant" + "'", str9, ":participant");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + learnerType14 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType14.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer48 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType45);
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        quorumServer4.clientAddr = inetSocketAddress7;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses9 = quorumServer4.addr;
        java.net.InetSocketAddress inetSocketAddress10 = null;
        quorumServer4.clientAddr = inetSocketAddress10;
        quorumServer4.recreateSocketAddresses();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress14, inetSocketAddress15);
        boolean boolean17 = quorumServer4.equals((java.lang.Object) inetSocketAddress15);
        boolean boolean18 = quorumServer4.isClientAddrFromStatic;
        long long19 = quorumServer4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
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
        workerService14.join((long) '#');
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType24 = quorumServer5.type;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":participant" + "'", str15, ":participant");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(learnerType24);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress12, inetSocketAddress13, learnerType14);
        boolean boolean17 = quorumServer15.equals((java.lang.Object) 35L);
        java.net.InetSocketAddress inetSocketAddress19 = null;
        java.net.InetSocketAddress inetSocketAddress20 = null;
        java.net.InetSocketAddress inetSocketAddress22 = null;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType29 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress26, inetSocketAddress27, inetSocketAddress28, learnerType29);
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress32, inetSocketAddress33, learnerType34);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = null;
        quorumServer35.type = learnerType36;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses38 = quorumServer35.electionAddr;
        quorumServer30.checkAddressDuplicate(quorumServer35);
        quorumServer35.id = ' ';
        java.net.InetSocketAddress inetSocketAddress43 = null;
        java.net.InetSocketAddress inetSocketAddress44 = null;
        java.net.InetSocketAddress inetSocketAddress45 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer46 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress43, inetSocketAddress44, inetSocketAddress45);
        java.lang.String str47 = quorumServer46.toString();
        quorumServer46.hostname = "hi!";
        quorumServer46.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType51 = quorumServer46.type;
        quorumServer35.type = learnerType51;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer53 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress22, inetSocketAddress23, inetSocketAddress24, learnerType51);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer54 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(10L, inetSocketAddress19, inetSocketAddress20, learnerType51);
        quorumServer15.type = learnerType51;
        quorumServer4.type = learnerType51;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses57 = quorumServer4.electionAddr;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(multipleAddresses38);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ":participant" + "'", str47, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType51 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType51.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(multipleAddresses57);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
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
        quorumServer10.isClientAddrFromStatic = true;
        quorumServer10.recreateSocketAddresses();
        java.lang.String str18 = quorumServer10.toString();
        quorumServer10.id = (short) 1;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        java.lang.String str21 = quorumServer4.toString();
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress33 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer35 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress32, inetSocketAddress33, inetSocketAddress34);
        java.lang.String str36 = quorumServer35.toString();
        quorumServer35.hostname = "hi!";
        quorumServer35.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType40 = quorumServer35.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress29, inetSocketAddress30, learnerType40);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress26, inetSocketAddress27, learnerType40);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) -1, inetSocketAddress23, inetSocketAddress24, learnerType40);
        quorumServer4.type = learnerType40;
        quorumServer4.id = 0L;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":participant" + "'", str14, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ":participant" + "'", str36, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType40 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType40.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        quorumServer5.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer5.electionAddr;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = quorumServer5.type;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(learnerType8);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        long long6 = quorumServer4.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses7);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) -1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"this.workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress29, inetSocketAddress30, inetSocketAddress31);
        java.lang.String str33 = quorumServer32.toString();
        quorumServer32.hostname = "hi!";
        quorumServer32.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType37 = quorumServer32.type;
        quorumServer19.type = learnerType37;
        boolean boolean39 = quorumServer19.isClientAddrFromStatic;
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":participant" + "'", str20, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":participant" + "'", str33, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer9 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress8);
        java.lang.String str10 = quorumServer9.hostname;
        boolean boolean11 = quorumServer9.isClientAddrFromStatic;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((-1L), inetSocketAddress17, inetSocketAddress18, learnerType19);
        quorumServer20.recreateSocketAddresses();
        long long22 = quorumServer20.id;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress31 = null;
        java.net.InetSocketAddress inetSocketAddress32 = null;
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        java.net.InetSocketAddress inetSocketAddress36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress34, inetSocketAddress35, inetSocketAddress36);
        java.lang.String str38 = quorumServer37.toString();
        quorumServer37.hostname = "hi!";
        quorumServer37.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType42 = quorumServer37.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 100, inetSocketAddress31, inetSocketAddress32, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, inetSocketAddress27, inetSocketAddress28, inetSocketAddress29, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer45 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress24, inetSocketAddress25, learnerType42);
        quorumServer20.type = learnerType42;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer47 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress13, inetSocketAddress14, inetSocketAddress15, learnerType42);
        quorumServer9.type = learnerType42;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer49 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress5, inetSocketAddress6, learnerType42);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer50 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType42);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ":participant" + "'", str38, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType42 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType42.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (byte) 0, true);
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
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer4.electionAddr;
        boolean boolean6 = quorumServer4.isClientAddrFromStatic;
        org.junit.Assert.assertNotNull(multipleAddresses5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        quorumServer18.id = ' ';
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        java.net.InetSocketAddress inetSocketAddress28 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer29 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress26, inetSocketAddress27, inetSocketAddress28);
        java.lang.String str30 = quorumServer29.toString();
        quorumServer29.hostname = "hi!";
        quorumServer29.recreateSocketAddresses();
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType34 = quorumServer29.type;
        quorumServer18.type = learnerType34;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer36 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress5, inetSocketAddress6, inetSocketAddress7, learnerType34);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType34);
        long long38 = quorumServer37.getId();
        org.junit.Assert.assertNotNull(multipleAddresses21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ":participant" + "'", str30, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType34 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType34.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
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
        quorumServer17.id = 100;
        java.net.InetSocketAddress inetSocketAddress23 = null;
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer56 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress23, inetSocketAddress24, inetSocketAddress25, learnerType52);
        java.lang.String str57 = quorumServer56.hostname;
        quorumServer56.id = 0L;
        java.net.InetSocketAddress inetSocketAddress61 = null;
        java.net.InetSocketAddress inetSocketAddress62 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType63 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer64 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress61, inetSocketAddress62, learnerType63);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses65 = quorumServer64.electionAddr;
        quorumServer56.electionAddr = multipleAddresses65;
        java.net.InetSocketAddress inetSocketAddress67 = quorumServer56.clientAddr;
        boolean boolean68 = quorumServer17.equals((java.lang.Object) inetSocketAddress67);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":participant" + "'", str18, ":participant");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":participant" + "'", str48, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType52 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType52.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(multipleAddresses65);
        org.junit.Assert.assertNull(inetSocketAddress67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.net.InetSocketAddress inetSocketAddress6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress6, inetSocketAddress7, inetSocketAddress8, learnerType9);
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        quorumServer15.type = learnerType16;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer15.electionAddr;
        quorumServer10.checkAddressDuplicate(quorumServer15);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer10.electionAddr;
        quorumServer4.electionAddr = multipleAddresses20;
        java.net.InetSocketAddress inetSocketAddress23 = null;
        java.net.InetSocketAddress inetSocketAddress24 = null;
        java.net.InetSocketAddress inetSocketAddress25 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer26 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress23, inetSocketAddress24, inetSocketAddress25);
        java.net.InetSocketAddress inetSocketAddress28 = null;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 0, inetSocketAddress28, inetSocketAddress29, inetSocketAddress30, learnerType31);
        java.net.InetSocketAddress inetSocketAddress34 = null;
        java.net.InetSocketAddress inetSocketAddress35 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer37 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress34, inetSocketAddress35, learnerType36);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType38 = null;
        quorumServer37.type = learnerType38;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses40 = quorumServer37.electionAddr;
        quorumServer32.checkAddressDuplicate(quorumServer37);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses42 = quorumServer32.electionAddr;
        quorumServer26.electionAddr = multipleAddresses42;
        quorumServer4.addr = multipleAddresses42;
        long long45 = quorumServer4.id;
        quorumServer4.recreateSocketAddresses();
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertNotNull(multipleAddresses40);
        org.junit.Assert.assertNotNull(multipleAddresses42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 35L + "'", long45 == 35L);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = quorumServer10.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 1, inetSocketAddress4, inetSocketAddress5, learnerType14);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 0, inetSocketAddress1, inetSocketAddress2, learnerType14);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":participant" + "'", str11, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType14 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType14.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        quorumServer4.recreateSocketAddresses();
        java.lang.String str7 = quorumServer4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":participant" + "'", str7, ":participant");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType3);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType5 = quorumServer4.type;
        quorumServer4.recreateSocketAddresses();
        long long7 = quorumServer4.id;
        org.junit.Assert.assertNull(learnerType5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService(":participant", (int) (short) 10, true);
        workerService3.join((long) '4');
        workerService3.join(1L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.zookeeper.server.WorkerService$WorkRequest.cleanup()\" because \"workRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1);
        quorumServer2.id = (byte) -1;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses5 = quorumServer2.electionAddr;
        org.junit.Assert.assertNotNull(multipleAddresses5);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer30 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 10, inetSocketAddress5, inetSocketAddress6, learnerType27);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer31 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) ' ', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType27);
        java.lang.Class<?> wildcardClass32 = learnerType27.getClass();
        org.junit.Assert.assertTrue("'" + learnerType27 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType27.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2);
        boolean boolean4 = quorumServer3.isClientAddrFromStatic;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) '4');
        workerService3.stop();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
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
        long long23 = quorumServer4.id;
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses15);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 0, inetSocketAddress1, inetSocketAddress2, learnerType41);
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
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        quorumServer10.id = '#';
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":participant" + "'", str11, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses12);
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(100L, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message:  does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer5.electionAddr;
        quorumServer5.id = (byte) 1;
        quorumServer5.id = 0L;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer16 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress13, inetSocketAddress14, inetSocketAddress15);
        java.lang.String str17 = quorumServer16.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer16.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses19 = quorumServer16.electionAddr;
        java.lang.String str20 = quorumServer16.hostname;
        java.net.InetSocketAddress inetSocketAddress21 = null;
        quorumServer16.clientAddr = inetSocketAddress21;
        java.lang.String str23 = quorumServer16.hostname;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses24 = quorumServer16.electionAddr;
        quorumServer5.electionAddr = multipleAddresses24;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":participant" + "'", str17, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertNotNull(multipleAddresses19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(multipleAddresses24);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress1, inetSocketAddress2, learnerType3);
        java.lang.String str5 = quorumServer4.toString();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        java.net.InetSocketAddress inetSocketAddress8 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer10 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress7, inetSocketAddress8, learnerType9);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType11 = null;
        quorumServer10.type = learnerType11;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses13 = quorumServer10.electionAddr;
        java.lang.String str14 = quorumServer10.toString();
        long long15 = quorumServer10.id;
        java.net.InetSocketAddress inetSocketAddress17 = null;
        java.net.InetSocketAddress inetSocketAddress18 = null;
        java.net.InetSocketAddress inetSocketAddress19 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer20 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress17, inetSocketAddress18, inetSocketAddress19);
        java.lang.String str21 = quorumServer20.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses22 = quorumServer20.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses23 = quorumServer20.electionAddr;
        boolean boolean25 = quorumServer20.equals((java.lang.Object) true);
        quorumServer10.checkAddressDuplicate(quorumServer20);
        java.lang.String str27 = quorumServer20.hostname;
        java.net.InetSocketAddress inetSocketAddress29 = null;
        java.net.InetSocketAddress inetSocketAddress30 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType31 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer32 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) 100, inetSocketAddress29, inetSocketAddress30, learnerType31);
        java.net.InetSocketAddress inetSocketAddress33 = null;
        quorumServer32.clientAddr = inetSocketAddress33;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType35 = quorumServer32.type;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType36 = null;
        quorumServer32.type = learnerType36;
        quorumServer32.hostname = ":participant";
        java.net.InetSocketAddress inetSocketAddress41 = null;
        java.net.InetSocketAddress inetSocketAddress42 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType43 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer44 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress41, inetSocketAddress42, learnerType43);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType45 = null;
        quorumServer44.type = learnerType45;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses47 = quorumServer44.electionAddr;
        java.lang.String str48 = quorumServer44.toString();
        long long49 = quorumServer44.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses50 = quorumServer44.electionAddr;
        quorumServer32.addr = multipleAddresses50;
        boolean boolean52 = quorumServer20.equals((java.lang.Object) quorumServer32);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses53 = quorumServer20.addr;
        quorumServer4.electionAddr = multipleAddresses53;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses55 = quorumServer4.addr;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(multipleAddresses13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":participant" + "'", str21, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses22);
        org.junit.Assert.assertNotNull(multipleAddresses23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(learnerType35);
        org.junit.Assert.assertNotNull(multipleAddresses47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(multipleAddresses53);
        org.junit.Assert.assertNotNull(multipleAddresses55);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (-1), inetSocketAddress1);
        java.lang.String str3 = quorumServer2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":participant" + "'", str3, ":participant");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1);
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
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses18 = quorumServer8.electionAddr;
        boolean boolean19 = quorumServer2.equals((java.lang.Object) multipleAddresses18);
        long long20 = quorumServer2.id;
        org.junit.Assert.assertNotNull(multipleAddresses16);
        org.junit.Assert.assertNotNull(multipleAddresses18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(32L, ":participant");
            org.junit.Assert.fail("Expected exception of type org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException; message: :participant does not have the form server_config or server_config;client_config where server_config is the pipe separated list of host:port:port or host:port:port:type and client_config is port or host:port");
        } catch (org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(1L, inetSocketAddress1);
        java.net.InetSocketAddress inetSocketAddress4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType6 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer7 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress4, inetSocketAddress5, learnerType6);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType8 = null;
        quorumServer7.type = learnerType8;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses10 = quorumServer7.electionAddr;
        java.lang.String str11 = quorumServer7.toString();
        long long12 = quorumServer7.getId();
        java.net.InetSocketAddress inetSocketAddress14 = null;
        java.net.InetSocketAddress inetSocketAddress15 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType16 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer17 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress14, inetSocketAddress15, learnerType16);
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType18 = null;
        quorumServer17.type = learnerType18;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses20 = quorumServer17.electionAddr;
        long long21 = quorumServer17.id;
        java.lang.String str22 = quorumServer17.hostname;
        boolean boolean23 = quorumServer7.equals((java.lang.Object) str22);
        java.net.InetSocketAddress inetSocketAddress25 = null;
        java.net.InetSocketAddress inetSocketAddress26 = null;
        java.net.InetSocketAddress inetSocketAddress27 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer28 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress25, inetSocketAddress26, inetSocketAddress27);
        java.lang.String str29 = quorumServer28.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses30 = quorumServer28.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses31 = quorumServer28.electionAddr;
        java.lang.String str32 = quorumServer28.hostname;
        long long33 = quorumServer28.getId();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses34 = quorumServer28.electionAddr;
        quorumServer7.checkAddressDuplicate(quorumServer28);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses36 = quorumServer7.addr;
        quorumServer2.electionAddr = multipleAddresses36;
        java.lang.Class<?> wildcardClass38 = multipleAddresses36.getClass();
        org.junit.Assert.assertNotNull(multipleAddresses10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(multipleAddresses20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":participant" + "'", str29, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses30);
        org.junit.Assert.assertNotNull(multipleAddresses31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertNotNull(multipleAddresses34);
        org.junit.Assert.assertNotNull(multipleAddresses36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType4 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer5 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, inetSocketAddress3, learnerType4);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer5.electionAddr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer5.electionAddr;
        java.lang.String str8 = quorumServer5.hostname;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType9 = quorumServer5.type;
        java.net.InetSocketAddress inetSocketAddress11 = null;
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer14 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (byte) 1, inetSocketAddress11, inetSocketAddress12, inetSocketAddress13);
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses15 = quorumServer14.addr;
        quorumServer5.addr = multipleAddresses15;
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(learnerType9);
        org.junit.Assert.assertNotNull(multipleAddresses15);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer3 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(35L, inetSocketAddress1, inetSocketAddress2);
        quorumServer3.hostname = "hi!";
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer4 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1, inetSocketAddress2, inetSocketAddress3);
        java.lang.String str5 = quorumServer4.toString();
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses6 = quorumServer4.addr;
        org.apache.zookeeper.server.quorum.MultipleAddresses multipleAddresses7 = quorumServer4.electionAddr;
        boolean boolean9 = quorumServer4.equals((java.lang.Object) "hi!");
        long long10 = quorumServer4.getId();
        quorumServer4.id = 'a';
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer41 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) 1, inetSocketAddress8, inetSocketAddress9, inetSocketAddress10, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer42 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '4', inetSocketAddress4, inetSocketAddress5, inetSocketAddress6, learnerType37);
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer43 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer(0L, inetSocketAddress1, inetSocketAddress2, learnerType37);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":participant" + "'", str33, ":participant");
        org.junit.Assert.assertTrue("'" + learnerType37 + "' != '" + org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT + "'", learnerType37.equals(org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType.PARTICIPANT));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer2 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) '#', inetSocketAddress1);
        long long3 = quorumServer2.id;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
        java.net.InetSocketAddress inetSocketAddress12 = null;
        java.net.InetSocketAddress inetSocketAddress13 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType14 = null;
        org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer quorumServer15 = new org.apache.zookeeper.server.quorum.QuorumPeer.QuorumServer((long) (short) -1, inetSocketAddress12, inetSocketAddress13, learnerType14);
        boolean boolean16 = quorumServer15.isClientAddrFromStatic;
        org.apache.zookeeper.server.quorum.QuorumPeer.LearnerType learnerType17 = null;
        quorumServer15.type = learnerType17;
        java.lang.String str19 = quorumServer15.toString();
        boolean boolean20 = quorumServer4.equals((java.lang.Object) str19);
        quorumServer4.id = 'a';
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":participant" + "'", str5, ":participant");
        org.junit.Assert.assertNotNull(multipleAddresses6);
        org.junit.Assert.assertNotNull(multipleAddresses7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}

