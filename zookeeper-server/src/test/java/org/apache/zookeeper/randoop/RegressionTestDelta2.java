package org.apache.zookeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestDelta2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1001");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 10, true);
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1002");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        workerService3.join((long) (byte) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        workerService3.schedule(workRequest19, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest22 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1003");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) 100);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1004");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass13 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1005");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) 0);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1006");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        workerService3.stop();
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1007");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.join((long) (byte) 1);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1008");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 1);
        workerService3.join(100L);
        workerService3.stop();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1009");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        workerService3.join((long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest17, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1010");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) -1, true);
        workerService3.join((long) 100);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1011");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        workerService3.join((long) (byte) 1);
        java.lang.Class<?> wildcardClass18 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1012");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        workerService3.stop();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1013");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (short) 100);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (-1));
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1014");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) 'a');
        workerService3.start();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1015");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1016");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) '4');
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1017");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 1, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) '4');
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1018");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.join((long) (short) 1);
        workerService3.join((long) (short) 10);
        workerService3.start();
        workerService3.join((long) 1);
        java.lang.Class<?> wildcardClass15 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1019");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1020");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) '4');
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest17, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1021");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 1L);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1022");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1023");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        workerService3.join((long) 10);
        workerService3.start();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1024");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) (byte) 1);
        workerService3.join((long) 10);
        workerService3.stop();
        java.lang.Class<?> wildcardClass20 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1025");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.join(100L);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1026");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.join((long) (short) 1);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) ' ');
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1027");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (-1));
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1028");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, 0L);
        workerService3.start();
        workerService3.join((long) (byte) -1);
        workerService3.join((long) (short) 10);
        workerService3.stop();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1029");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.stop();
        workerService3.join((long) (byte) 10);
        workerService3.start();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1030");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', false);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1031");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, 1L);
        workerService3.start();
        workerService3.join(0L);
        workerService3.join((long) (byte) 100);
        java.lang.Class<?> wildcardClass19 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1032");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass4 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1033");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, 0L);
        workerService3.start();
        workerService3.join((long) (byte) 10);
        workerService3.start();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1034");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass4 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1035");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1036");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1037");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.join((long) (short) 1);
        workerService3.join((long) (short) 10);
        workerService3.join(0L);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1038");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) '4');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15);
        workerService3.stop();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1039");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) 'a');
        workerService3.join((long) (byte) 100);
        workerService3.start();
        workerService3.join((-1L));
        java.lang.Class<?> wildcardClass16 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1040");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) (byte) -1);
        java.lang.Class<?> wildcardClass15 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1041");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1042");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 10, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) 1);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1043");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.start();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1044");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        java.lang.Class<?> wildcardClass13 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1045");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 0);
        workerService3.start();
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1046");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 100L);
        workerService3.start();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1047");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.start();
        workerService3.join((long) 'a');
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1048");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, true);
        workerService3.join((long) 0);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1049");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, true);
        workerService3.join((long) '4');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1050");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) ' ', true);
        workerService3.stop();
        java.lang.Class<?> wildcardClass5 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1051");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.stop();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1052");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1053");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1054");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) 100);
        workerService3.stop();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1055");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) '#');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1056");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1057");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1058");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) 10);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1059");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1060");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.join((long) '4');
        workerService3.start();
        workerService3.join(0L);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1061");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        workerService3.start();
        workerService3.start();
        workerService3.join(10L);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1062");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.join((long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1063");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) '4');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1064");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        workerService3.join((long) 1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1065");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 10, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.stop();
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1066");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1067");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.join(0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest13, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1068");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.join((long) '4');
        workerService3.start();
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1069");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.join((long) '4');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest21 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1070");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.start();
        workerService3.join((-1L));
        workerService3.join((long) (-1));
        workerService3.start();
        workerService3.join((long) (short) -1);
        workerService3.join((long) 100);
        workerService3.start();
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1071");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.start();
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1072");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1073");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join(100L);
        workerService3.join((long) 1);
        workerService3.join((long) (byte) 0);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1074");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) -1, false);
        workerService3.join((long) (short) -1);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1075");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        workerService3.start();
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1076");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.stop();
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1077");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.stop();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1078");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        workerService3.schedule(workRequest20);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1079");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (short) 0);
        workerService3.join((long) (short) 1);
        workerService3.join((-1L));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1080");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1081");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1082");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1083");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1084");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) '4');
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1085");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 1);
        workerService3.join((long) 'a');
        workerService3.join((long) (short) 100);
        java.lang.Class<?> wildcardClass26 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1086");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 10, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 100L);
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1087");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1088");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 100);
        workerService3.start();
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1089");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) -1, false);
        workerService3.start();
        workerService3.join((long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1090");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        java.lang.Class<?> wildcardClass14 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1091");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16, (long) (short) 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1092");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) ' ');
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1093");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        workerService3.join(10L);
        workerService3.start();
        workerService3.join((-1L));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest20, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1094");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) ' ');
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1095");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        workerService3.join((long) (byte) 1);
        workerService3.join((long) (byte) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest13, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1096");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (byte) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) (short) 10);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1097");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        workerService3.join((long) 0);
        workerService3.stop();
        workerService3.join(100L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1098");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1099");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 'a');
        workerService3.start();
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1100");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 1);
        workerService3.join(100L);
        workerService3.join((long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest18, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1101");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1102");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.join((long) (byte) -1);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1103");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) (byte) 1);
        workerService3.join((long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1104");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
        workerService3.join(100L);
        workerService3.join((long) (short) -1);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1105");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) -1);
        workerService3.join((long) (byte) 10);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1106");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join((long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1107");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) 'a');
        workerService3.join((long) (byte) 100);
        workerService3.stop();
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1108");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.join((long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1109");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 0);
        workerService3.start();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1110");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) 100);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1111");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        workerService3.join((long) (byte) 1);
        workerService3.join((long) (short) 1);
        workerService3.join((long) (byte) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1112");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 0);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1113");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.join((long) 1);
        workerService3.stop();
        workerService3.stop();
        java.lang.Class<?> wildcardClass12 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1114");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        workerService3.join((long) (byte) 1);
        workerService3.stop();
        workerService3.join((long) (byte) 0);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest22 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest22, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1115");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        workerService3.start();
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1116");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '4', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1117");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join(100L);
        workerService3.join((long) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1118");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        workerService3.start();
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1119");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (short) 100);
        java.lang.Class<?> wildcardClass14 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1120");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) -1, true);
        java.lang.Class<?> wildcardClass4 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1121");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1122");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1123");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, 100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        workerService3.schedule(workRequest17, (long) '#');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        workerService3.schedule(workRequest20);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest23 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1124");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1125");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1126");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) '4');
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1127");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 0L);
        workerService3.join((long) (byte) 10);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1128");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        workerService3.join((long) (short) -1);
        workerService3.join((long) (byte) 0);
        workerService3.stop();
        java.lang.Class<?> wildcardClass20 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1129");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13);
        workerService3.stop();
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1130");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 1L);
        workerService3.join((long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest13, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1131");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) (byte) -1);
        workerService3.join((long) '#');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1132");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) 0);
        workerService3.join((long) (byte) 0);
        workerService3.stop();
        workerService3.join((long) (short) 1);
        workerService3.start();
        workerService3.join((long) (short) 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1133");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1134");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1135");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.start();
        workerService3.join(0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest16, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1136");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 10, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) 1);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1137");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1138");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        workerService3.schedule(workRequest17, (long) (byte) 100);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1139");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) 1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1140");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) (byte) 0);
        workerService3.start();
        workerService3.join((long) (short) 10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1141");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.join((long) 1);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1142");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16, 0L);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1143");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        workerService3.stop();
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1144");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1145");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1146");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (short) 1);
        workerService3.start();
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1147");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        workerService3.stop();
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1148");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) (-1));
        workerService3.stop();
        workerService3.join((long) 'a');
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest21 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest21, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1149");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1150");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1151");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.join((long) 1);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1152");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join(0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1153");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, false);
        workerService3.start();
        workerService3.start();
        workerService3.start();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1154");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) '4');
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest17, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1155");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 100);
        workerService3.stop();
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1156");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1157");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.start();
        workerService3.join((-1L));
        workerService3.join((long) (-1));
        workerService3.join((long) (short) -1);
        workerService3.join((long) 100);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1158");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        workerService3.stop();
        workerService3.start();
        workerService3.join(100L);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1159");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) (byte) 0);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18, (long) (byte) 100);
        workerService3.join((long) 100);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1160");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        java.lang.Class<?> wildcardClass9 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1161");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join(100L);
        workerService3.join((long) 1);
        workerService3.join((long) (byte) 0);
        workerService3.join((long) '4');
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1162");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        workerService3.join(1L);
        workerService3.join(100L);
        workerService3.start();
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1163");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest13, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1164");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, false);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1165");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.join((long) '#');
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1166");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.join((long) '4');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (byte) -1);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest19, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1167");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
        workerService3.stop();
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1168");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1169");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.join((long) 100);
        workerService3.join((long) (byte) 10);
        workerService3.join((long) 100);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1170");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.join((long) 1);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (-1));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1171");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, 1L);
        workerService3.start();
        workerService3.join((long) (short) 10);
        workerService3.start();
        workerService3.join((long) '4');
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1172");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, true);
        workerService3.stop();
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1173");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        workerService3.schedule(workRequest20, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest23 = null;
        workerService3.schedule(workRequest23);
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest27 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest27, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1174");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 0);
        workerService3.join((long) 1);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1175");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (short) 100);
        workerService3.join((long) 10);
        workerService3.join(10L);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1176");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join((long) '#');
        workerService3.start();
        workerService3.start();
        workerService3.start();
        workerService3.join(100L);
        workerService3.start();
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1177");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join(10L);
        workerService3.join((long) 100);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1178");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        workerService3.start();
        workerService3.join((long) '#');
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1179");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1180");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
        workerService3.join((long) (byte) 1);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1181");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1182");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 1, false);
        workerService3.join((long) ' ');
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1183");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        workerService3.start();
        workerService3.start();
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1184");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) 'a');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1185");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', true);
        java.lang.Class<?> wildcardClass4 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1186");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1187");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (byte) -1);
        java.lang.Class<?> wildcardClass8 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1188");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.start();
        workerService3.join((-1L));
        workerService3.join((long) (-1));
        workerService3.start();
        workerService3.join((long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest23 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest23, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1189");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (short) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) '4');
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1190");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1191");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) -1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1192");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 10L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1193");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1194");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) 10);
        workerService3.join((long) (-1));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1195");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        workerService3.join((long) (byte) 1);
        java.lang.Class<?> wildcardClass9 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1196");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1197");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 100, true);
        workerService3.join(1L);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1198");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) (byte) 0);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        workerService3.schedule(workRequest20, (long) (short) -1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1199");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 100);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1200");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1201");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 0);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1202");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        workerService3.join((long) (short) -1);
        workerService3.join((long) (byte) 0);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1203");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.join((long) '4');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (byte) -1);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1204");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.stop();
        workerService3.stop();
        java.lang.Class<?> wildcardClass17 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1205");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 1);
        workerService3.stop();
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1206");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 1L);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1207");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) (short) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        workerService3.schedule(workRequest17);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1208");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 1L);
        workerService3.start();
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1209");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 100, false);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (-1));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1210");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (-1), false);
        workerService3.start();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.join((long) (byte) 10);
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1211");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1212");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1213");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 1, true);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1214");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1215");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, false);
        workerService3.join(10L);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1216");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) 10);
        workerService3.join((long) ' ');
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1217");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 10, true);
        workerService3.start();
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1218");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) (byte) -1);
        workerService3.join((long) (short) 1);
        workerService3.stop();
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1219");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (-1));
        workerService3.start();
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1220");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) 10);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1221");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1222");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((-1L));
        workerService3.join((long) (byte) 100);
        workerService3.join((long) (byte) 100);
        java.lang.Class<?> wildcardClass14 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1223");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((-1L));
        workerService3.join((long) (byte) 100);
        workerService3.join((long) (byte) 100);
        workerService3.start();
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1224");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1225");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        workerService3.stop();
        workerService3.join((long) 'a');
        java.lang.Class<?> wildcardClass12 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1226");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) 1);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        workerService3.schedule(workRequest19);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1227");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
        workerService3.join(100L);
        workerService3.start();
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1228");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) (byte) -1);
        workerService3.join((long) '#');
        workerService3.stop();
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1229");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (short) 100);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18);
        workerService3.stop();
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1230");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 100);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1231");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', true);
        workerService3.stop();
        workerService3.join((long) (byte) 0);
        workerService3.start();
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1232");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1233");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.join(100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1234");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest19, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1235");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (short) 0);
        workerService3.join((long) (short) 1);
        workerService3.join((long) (-1));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1236");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 1);
        workerService3.join(100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest16, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1237");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        java.lang.Class<?> wildcardClass8 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1238");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1239");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18);
        workerService3.join((long) (byte) 10);
        workerService3.join((long) (short) 100);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest25 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest25, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1240");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) '4');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16, (long) 100);
        workerService3.join((long) ' ');
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1241");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.join(100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1242");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, 0L);
        workerService3.start();
        workerService3.join((long) (byte) 10);
        workerService3.join((long) '#');
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1243");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        workerService3.join(0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1244");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, 0L);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join(1L);
    }
}

