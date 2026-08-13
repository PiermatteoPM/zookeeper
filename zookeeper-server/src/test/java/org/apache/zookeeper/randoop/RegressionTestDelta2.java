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
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 10, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) 1);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1002");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1003");
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1004");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) 1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1005");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1006");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        workerService3.stop();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1007");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1008");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1009");
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1010");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        workerService3.stop();
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1012");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1013");
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
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1014");
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1015");
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1016");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, false);
        workerService3.start();
        workerService3.start();
        workerService3.start();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1017");
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1018");
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1019");
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1020");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        workerService3.stop();
        workerService3.start();
        workerService3.join(100L);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1021");
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1022");
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1023");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        workerService3.join(1L);
        workerService3.join(100L);
        workerService3.start();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1024");
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1025");
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1026");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.join((long) '#');
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1027");
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
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1028");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
        workerService3.stop();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1029");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1030");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.join((long) 100);
        workerService3.join((long) (byte) 10);
        workerService3.join((long) 100);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1031");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.join((long) 1);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (-1));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1032");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, true);
        workerService3.stop();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1033");
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1034");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 0);
        workerService3.join((long) 1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1035");
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1036");
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1037");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join(10L);
        workerService3.join((long) 100);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1038");
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1039");
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1040");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 1, false);
        workerService3.join((long) ' ');
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1041");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        workerService3.start();
        workerService3.start();
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1042");
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1043");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', true);
        java.lang.Class<?> wildcardClass4 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1044");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1045");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (byte) -1);
        java.lang.Class<?> wildcardClass8 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1047");
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1048");
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1049");
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1050");
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1051");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1052");
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1053");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        workerService3.join((long) (byte) 1);
        java.lang.Class<?> wildcardClass9 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1054");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1055");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 100, true);
        workerService3.join(1L);
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1057");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 100);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1058");
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1059");
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1060");
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1061");
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1062");
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1063");
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1064");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 1L);
        workerService3.start();
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1065");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 100, false);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1066");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (-1), false);
        workerService3.start();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.join((long) (byte) 10);
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1067");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1068");
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1069");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1070");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, false);
        workerService3.join(10L);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1071");
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1072");
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1073");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1074");
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1075");
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
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1076");
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1077");
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1078");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
        workerService3.join(100L);
        workerService3.start();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1079");
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1080");
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1081");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 100);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1082");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', true);
        workerService3.stop();
        workerService3.join((long) (byte) 0);
        workerService3.start();
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1083");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1084");
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1085");
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1086");
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1087");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        java.lang.Class<?> wildcardClass8 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1089");
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1090");
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1091");
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1092");
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1093");
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1094");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1095");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1096");
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
        java.lang.Class<?> wildcardClass20 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1097");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.join((long) 100);
        workerService3.join((long) (byte) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1098");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 10);
        workerService3.join((long) 1);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1099");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 0);
        workerService3.start();
        workerService3.join((long) 1);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1100");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.join(0L);
        workerService3.start();
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join(100L);
        workerService3.join((long) 1);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1102");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        workerService3.join((long) 0);
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1103");
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
        java.lang.Class<?> wildcardClass15 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1104");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        workerService3.stop();
        workerService3.join(1L);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1105");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.join(1L);
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1106");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) (short) 100);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1107");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass12 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1108");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        workerService3.start();
        workerService3.start();
        workerService3.join(10L);
        workerService3.start();
        workerService3.join((long) 'a');
        workerService3.stop();
        workerService3.join(0L);
        workerService3.stop();
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1109");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1110");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        workerService3.schedule(workRequest17);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1111");
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
        workerService3.start();
        java.lang.Class<?> wildcardClass21 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1112");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) -1);
        workerService3.join((long) (byte) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1113");
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
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1114");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) ' ');
        workerService3.join((long) 1);
        workerService3.join((long) (short) 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1115");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) 0);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1116");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 10);
        workerService3.stop();
        workerService3.stop();
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1117");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1118");
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
        workerService3.join(10L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1119");
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
        workerService3.join((long) '#');
        workerService3.join((long) (short) -1);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1120");
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
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1121");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((-1L));
        workerService3.join((long) (byte) 100);
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1122");
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
            workerService3.schedule(workRequest13);
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
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) 100);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1124");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1125");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, false);
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.stop();
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1126");
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
            workerService3.schedule(workRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1127");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1128");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1129");
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
        workerService3.start();
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1130");
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
        workerService3.start();
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1131");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        workerService3.start();
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
        workerService3.join((long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest17, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1133");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 'a');
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1134");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) -1, true);
        workerService3.join((long) 100);
        workerService3.start();
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
        workerService3.schedule(workRequest11, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18);
        workerService3.stop();
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1136");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1137");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest19, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1138");
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
        workerService3.stop();
        workerService3.start();
        java.lang.Class<?> wildcardClass17 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1139");
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
        workerService3.schedule(workRequest16);
        workerService3.stop();
        workerService3.join((long) (byte) 100);
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1140");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', true);
        workerService3.join(10L);
        workerService3.stop();
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1141");
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
        workerService3.join((long) (byte) -1);
        workerService3.stop();
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1142");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1143");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', false);
        workerService3.start();
        java.lang.Class<?> wildcardClass5 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1144");
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
        workerService3.join((long) '4');
        java.lang.Class<?> wildcardClass19 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1145");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1146");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) 10);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1147");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 1);
        workerService3.join(1L);
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
        workerService3.join((long) (short) 1);
        workerService3.join(100L);
        workerService3.join((long) (byte) 1);
        workerService3.stop();
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1149");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, false);
        workerService3.join((long) 1);
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1150");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (-1L));
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1151");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) (short) 100);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1152");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', false);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1153");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
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
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        workerService3.stop();
        workerService3.join((long) 0);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1155");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        workerService3.join(0L);
        workerService3.stop();
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1156");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 0);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1157");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1158");
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
        workerService3.stop();
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1159");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1160");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 0);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) 'a');
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.start();
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1161");
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
        workerService3.join((long) (byte) 1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1162");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.join((long) '4');
        workerService3.join((-1L));
        java.lang.Class<?> wildcardClass8 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1163");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 0);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) 'a');
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.start();
        workerService3.join(1L);
        java.lang.Class<?> wildcardClass19 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1164");
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
        workerService3.join(1L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest21 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest21, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1165");
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
        workerService3.stop();
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
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1167");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) -1, true);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1168");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 1);
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1169");
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
        workerService3.stop();
        workerService3.join((long) (short) -1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1170");
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
        workerService3.stop();
        workerService3.join((long) 'a');
        workerService3.join((long) 100);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1171");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        workerService3.start();
        java.lang.Class<?> wildcardClass8 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1172");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 0, true);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1173");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        workerService3.join((long) 1);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1174");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, 1L);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1175");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        workerService3.start();
        workerService3.join(0L);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1176");
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
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1177");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 1, false);
        workerService3.start();
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1178");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join(10L);
        workerService3.stop();
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1179");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        workerService3.start();
        workerService3.start();
        workerService3.join(10L);
        workerService3.start();
        workerService3.join((long) 'a');
        workerService3.stop();
        java.lang.Class<?> wildcardClass12 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1180");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.join((long) (byte) -1);
        workerService3.stop();
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1181");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.stop();
        workerService3.start();
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1182");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, false);
        workerService3.start();
        workerService3.join((long) (short) 1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1183");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        workerService3.join((long) 10);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.join((long) (byte) 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1184");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1185");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) (short) -1);
        workerService3.start();
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1186");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1187");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) 0);
        workerService3.join((long) (byte) 1);
        workerService3.start();
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1188");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) ' ');
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.start();
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1189");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) 'a');
        workerService3.join((long) (byte) 100);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1190");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1191");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.start();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1192");
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
        workerService3.join(10L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1193");
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
        workerService3.join((long) '#');
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1194");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1195");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', true);
        workerService3.join((long) '#');
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1196");
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
            workerService3.schedule(workRequest12, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1197");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.stop();
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, 0L);
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.stop();
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1199");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) -1);
        java.lang.Class<?> wildcardClass9 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
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
        workerService3.schedule(workRequest11, 1L);
        workerService3.start();
        workerService3.join(0L);
        workerService3.start();
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1201");
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
        workerService3.stop();
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1202");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        workerService3.stop();
        workerService3.join((long) 1);
        workerService3.stop();
        workerService3.join(0L);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1203");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        workerService3.join((long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1204");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1205");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.join((long) '4');
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1206");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.join((long) (byte) 100);
        workerService3.start();
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1207");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, false);
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1208");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.join((long) 1);
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1209");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.join((long) (short) 1);
        workerService3.join((long) (short) 10);
        workerService3.start();
        workerService3.join((long) 1);
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1210");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.join((long) 'a');
        workerService3.join((long) (short) 100);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1211");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        workerService3.start();
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1212");
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
        java.lang.Class<?> wildcardClass15 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1213");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1214");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.stop();
        workerService3.join((long) 1);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1215");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) '4');
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1216");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) -1, false);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1217");
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
        workerService3.start();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest16, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1218");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((long) ' ');
        workerService3.stop();
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1219");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) (byte) -1);
        workerService3.join((long) '#');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1220");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (byte) 10);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1221");
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
        workerService3.stop();
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1222");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) ' ');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest16, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1223");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.join((long) 100);
        workerService3.start();
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1224");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.join((long) 1);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1225");
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
        workerService3.stop();
        java.lang.Class<?> wildcardClass20 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1226");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.start();
        workerService3.stop();
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1227");
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
        workerService3.join((long) 'a');
        workerService3.stop();
        workerService3.join((-1L));
        workerService3.start();
        workerService3.start();
        workerService3.join((long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest24 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1228");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (-1));
        workerService3.join((-1L));
        java.lang.Class<?> wildcardClass16 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (short) 0);
        workerService3.join((long) (byte) 0);
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.join((long) 100);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1230");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest19, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1231");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) 0);
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1232");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1233");
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
        workerService3.start();
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1234");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 1, false);
        workerService3.stop();
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1235");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 100, false);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1236");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest22 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest22, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1237");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1238");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (short) 100);
        workerService3.join((long) '#');
        java.lang.Class<?> wildcardClass11 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1239");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (-1), false);
        workerService3.start();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.start();
        workerService3.join((long) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1240");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) '#');
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1241");
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
        workerService3.start();
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1242");
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
        workerService3.join((long) 'a');
        java.lang.Class<?> wildcardClass17 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1243");
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
        workerService3.stop();
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
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1244");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16, (-1L));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        workerService3.schedule(workRequest19);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1245");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, false);
        workerService3.join((long) '#');
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1246");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join((long) 10);
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1247");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) 0);
        workerService3.start();
        java.lang.Class<?> wildcardClass12 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1248");
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1249");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        workerService3.join(1L);
        workerService3.join(100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1250");
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
        workerService3.join((long) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest16, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1251");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.join((long) '4');
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1252");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) ' ');
        workerService3.join((long) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1253");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 1);
        workerService3.stop();
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1254");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1255");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (-1), false);
        workerService3.start();
        workerService3.stop();
        workerService3.join(0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1256");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (-1));
        workerService3.stop();
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1257");
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
        java.lang.Class<?> wildcardClass14 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1258");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 100);
        workerService3.stop();
        workerService3.join((long) 1);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1259");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        workerService3.join(0L);
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1260");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.join((long) (short) 1);
        workerService3.join((long) (-1));
        workerService3.join((long) (short) 100);
        workerService3.join((long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1261");
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
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.stop();
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1262");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1263");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        java.lang.Class<?> wildcardClass14 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1264");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
        workerService3.join((long) (-1));
        workerService3.start();
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1265");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 0);
        java.lang.Class<?> wildcardClass14 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1266");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.join((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1267");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 0);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1268");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 100, true);
        workerService3.stop();
        workerService3.join((long) (short) 1);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1269");
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
        workerService3.stop();
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1270");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        workerService3.schedule(workRequest19);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1271");
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
        workerService3.join(10L);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1272");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        workerService3.join((long) (short) 10);
        workerService3.join((long) (short) -1);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1273");
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
        workerService3.schedule(workRequest17, (long) (byte) 10);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1274");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) (byte) -1);
        workerService3.join((long) '#');
        workerService3.join((long) (byte) 10);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1275");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1276");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (short) 0);
        workerService3.join((long) (byte) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1277");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 0);
        workerService3.start();
        workerService3.join((long) '4');
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1278");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 0);
        workerService3.join((long) '4');
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1279");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) 0);
        workerService3.join((long) (byte) 0);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1280");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) ' ', true);
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.start();
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1281");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        workerService3.join((long) 100);
        workerService3.stop();
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1282");
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
            workerService3.schedule(workRequest13, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1283");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1284");
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
        java.lang.Class<?> wildcardClass20 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1285");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join((long) '#');
        workerService3.start();
        workerService3.start();
        workerService3.start();
        workerService3.join(100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1286");
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
        workerService3.join(100L);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1287");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.join((long) (short) 1);
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1288");
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
        java.lang.Class<?> wildcardClass15 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1289");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.join((long) (short) 1);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1290");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 0, false);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1291");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (short) 100);
        workerService3.join((-1L));
        workerService3.join((long) (byte) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1292");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1293");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.join(100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1294");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.join((long) ' ');
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1295");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.join((long) (byte) 0);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1296");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        workerService3.join(1L);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1297");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) '#');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1298");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) '#');
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1299");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 0);
        workerService3.join((long) (byte) 100);
        workerService3.start();
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1300");
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
        java.lang.Class<?> wildcardClass20 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1301");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '#', false);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (-1L));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1302");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 0);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.join((long) (-1));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1303");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (-1), false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (short) -1);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1304");
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
        workerService3.schedule(workRequest14, 0L);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest18, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1305");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', true);
        workerService3.join((long) '#');
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1306");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) '4');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
        workerService3.stop();
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1307");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1308");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) ' ');
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1309");
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1310");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) 10);
        workerService3.join((long) '4');
        java.lang.Class<?> wildcardClass16 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1311");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        workerService3.start();
        workerService3.start();
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1312");
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
        workerService3.start();
        workerService3.join((long) (short) 1);
        java.lang.Class<?> wildcardClass19 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1313");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join((long) 10);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1314");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.join(0L);
        workerService3.start();
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1315");
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
        workerService3.join((long) ' ');
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1316");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 0, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest4, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1317");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '4', false);
        workerService3.join((long) 'a');
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
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1318");
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
        workerService3.schedule(workRequest15, 100L);
        workerService3.stop();
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1319");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, false);
        workerService3.stop();
        workerService3.join((long) 1);
        workerService3.stop();
        java.lang.Class<?> wildcardClass8 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1320");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1321");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) 10);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16, (long) '4');
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1322");
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
        workerService3.join((long) (byte) 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1323");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.start();
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1324");
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
        workerService3.join((long) ' ');
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest20, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1325");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1326");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.join((long) 1);
        workerService3.stop();
        workerService3.join((long) (byte) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1327");
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
            workerService3.schedule(workRequest22, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1328");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 10, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) 10);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1329");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) 'a');
        workerService3.join((long) (byte) 100);
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1330");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        workerService3.join((long) '#');
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1331");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 0);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) 'a');
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.start();
        workerService3.join(1L);
        workerService3.stop();
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1332");
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
        workerService3.start();
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1333");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, false);
        workerService3.start();
        workerService3.start();
        workerService3.start();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1334");
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
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) ' ');
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1335");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.join((long) 1);
        workerService3.stop();
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1336");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
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
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1337");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 10);
        workerService3.start();
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1338");
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
        workerService3.schedule(workRequest16, (long) (short) 100);
        workerService3.start();
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1339");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        workerService3.join(10L);
        workerService3.stop();
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1340");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (-1), false);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1341");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, true);
        workerService3.join((long) '4');
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1342");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 1);
        workerService3.join((long) (byte) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1343");
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
        workerService3.join((-1L));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest19, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1344");
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
        workerService3.stop();
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1345");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.start();
        workerService3.join((long) 0);
        workerService3.join((long) '4');
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1346");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) 10);
        workerService3.stop();
        java.lang.Class<?> wildcardClass16 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1347");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1348");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1349");
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
        java.lang.Class<?> wildcardClass18 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1350");
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
        workerService3.start();
        java.lang.Class<?> wildcardClass20 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1351");
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
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest24 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1352");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, true);
        workerService3.join((long) (byte) 0);
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1353");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) (byte) -1);
        java.lang.Class<?> wildcardClass12 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1354");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 1);
        workerService3.stop();
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1355");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest18, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1356");
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1357");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1358");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (byte) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) '4');
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1359");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.join((long) '#');
        workerService3.start();
        workerService3.start();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1360");
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
            workerService3.schedule(workRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1361");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1362");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        workerService3.schedule(workRequest19, (long) (byte) 10);
        workerService3.start();
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1363");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1364");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        workerService3.schedule(workRequest17);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1365");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest7, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1366");
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
        workerService3.schedule(workRequest14, 0L);
        workerService3.stop();
        workerService3.join((long) (short) -1);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1367");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 100);
        workerService3.join(10L);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1368");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 0, true);
        workerService3.start();
        java.lang.Class<?> wildcardClass5 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1369");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) (byte) 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1370");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((long) 10);
        workerService3.start();
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1371");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) ' ');
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1372");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        workerService3.schedule(workRequest17, (long) (short) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        workerService3.schedule(workRequest20);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1373");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest9, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1374");
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
        workerService3.join((long) '4');
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1375");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        workerService3.stop();
        workerService3.join((long) 10);
        workerService3.stop();
        java.lang.Class<?> wildcardClass13 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1376");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.stop();
        workerService3.join((long) (byte) 10);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1377");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, 0L);
        workerService3.start();
        workerService3.join((long) 0);
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1378");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 0, true);
        workerService3.join((long) '4');
        workerService3.join(1L);
        workerService3.start();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1379");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        workerService3.join((-1L));
        workerService3.start();
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1380");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        workerService3.schedule(workRequest19, (long) (byte) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest22 = null;
        workerService3.schedule(workRequest22, (long) 100);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1381");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        workerService3.stop();
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1382");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 100, true);
        workerService3.join((long) (short) 0);
        workerService3.stop();
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1383");
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1384");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.join(0L);
        workerService3.join((long) (byte) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1385");
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
        workerService3.schedule(workRequest14);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
        workerService3.join((long) 0);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1386");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) ' ', true);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1387");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) -1, false);
        workerService3.stop();
        java.lang.Class<?> wildcardClass5 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1388");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        java.lang.Class<?> wildcardClass15 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1389");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, 0L);
        workerService3.start();
        workerService3.join((long) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest16, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1390");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, true);
        workerService3.join((long) 0);
        workerService3.start();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1391");
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
        workerService3.join((long) '4');
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1392");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12, (long) 10);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1393");
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
        workerService3.schedule(workRequest14, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        workerService3.schedule(workRequest17, (long) 10);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1394");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) -1, false);
        workerService3.start();
        workerService3.join((long) 10);
        workerService3.join((long) 100);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1395");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', true);
        workerService3.join((long) '#');
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1396");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1397");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1398");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.start();
        workerService3.join((long) 100);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1399");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (byte) -1);
        workerService3.stop();
        java.lang.Class<?> wildcardClass14 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1400");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        workerService3.join((long) 10);
        workerService3.join((long) (short) 10);
        workerService3.start();
        workerService3.join((long) 0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1401");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) ' ', true);
        workerService3.join((long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1402");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', true);
        workerService3.join((long) '#');
        workerService3.start();
        workerService3.join((long) 100);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1403");
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
        workerService3.join((long) ' ');
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1404");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1405");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.join((long) 'a');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest11, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1406");
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
            workerService3.schedule(workRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1407");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) 10, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        workerService3.stop();
        workerService3.stop();
        workerService3.join(100L);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1408");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1409");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        workerService3.join(0L);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1410");
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
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest18, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1411");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1412");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest5, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1413");
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
        workerService3.stop();
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1414");
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
        workerService3.join((long) 'a');
        workerService3.stop();
        workerService3.join((long) (byte) 100);
        workerService3.join((long) (byte) 1);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1415");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8);
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1416");
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
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1417");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (-1), true);
        workerService3.join((long) 10);
        workerService3.join((long) (short) 1);
        workerService3.stop();
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1418");
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
        workerService3.schedule(workRequest13);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        workerService3.schedule(workRequest15);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1419");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) -1);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1420");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, false);
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.start();
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1421");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1422");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) 1);
        workerService3.start();
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1423");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
        workerService3.join((long) (byte) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1424");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.join((long) '4');
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1425");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) 0);
        workerService3.stop();
        java.lang.Class<?> wildcardClass13 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1426");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 0);
        workerService3.start();
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1427");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 100, true);
        workerService3.start();
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1428");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.start();
        workerService3.join((long) 100);
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1429");
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
        workerService3.join((long) (short) 10);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1430");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.join((long) (short) 1);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.join((long) (short) -1);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1431");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.join(10L);
        workerService3.stop();
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1432");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.stop();
        workerService3.join(10L);
        workerService3.join(100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1433");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1434");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.join((long) 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1435");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((long) ' ');
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) -1);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1436");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) (short) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) 1);
        workerService3.stop();
        workerService3.join((long) 100);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1437");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16, (-1L));
        workerService3.stop();
        workerService3.stop();
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1438");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        workerService3.join((long) ' ');
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass12 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1439");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1440");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 1, true);
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1441");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.join(0L);
        java.lang.Class<?> wildcardClass16 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1442");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) ' ', true);
        workerService3.stop();
        workerService3.stop();
        java.lang.Class<?> wildcardClass6 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1443");
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
        workerService3.start();
        workerService3.join((long) '#');
        workerService3.join((long) (short) 10);
        workerService3.stop();
        workerService3.join((long) (-1));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1444");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((long) ' ');
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) '#');
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1445");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) 'a');
        workerService3.join((long) (byte) 100);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1446");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1447");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (-1), false);
        workerService3.start();
        workerService3.stop();
        workerService3.join(0L);
        workerService3.join((long) (byte) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1448");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        workerService3.join((long) (byte) 1);
        workerService3.join((long) (short) 1);
        workerService3.join((long) (short) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1449");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (byte) -1);
        workerService3.join((long) (-1));
        workerService3.start();
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1450");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 10L);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.join(0L);
        workerService3.join((long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest17, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1451");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.start();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1452");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) ' ');
        workerService3.join((long) 'a');
        workerService3.start();
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1453");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        java.lang.Class<?> wildcardClass9 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1454");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.join((-1L));
        workerService3.start();
        workerService3.stop();
        workerService3.join((-1L));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1455");
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
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1456");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 1);
        workerService3.stop();
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1457");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 0, true);
        workerService3.join((long) 0);
        workerService3.start();
        workerService3.join((long) (byte) 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1458");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) ' ');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, 1L);
        workerService3.stop();
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1459");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        workerService3.schedule(workRequest8, (long) 'a');
        workerService3.start();
        workerService3.start();
        workerService3.stop();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1460");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        workerService3.schedule(workRequest12);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        workerService3.schedule(workRequest14);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1461");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 1L);
        workerService3.join((long) 1);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1462");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.stop();
        workerService3.join(100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1463");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
        workerService3.start();
        workerService3.stop();
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
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1464");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 0, true);
        workerService3.start();
        workerService3.stop();
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
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1465");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", 1, true);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1466");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) 0);
        workerService3.join((long) (byte) 1);
        java.lang.Class<?> wildcardClass14 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1467");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((-1L));
        java.lang.Class<?> wildcardClass10 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1468");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 100L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 0L);
        workerService3.join((long) (byte) 10);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1469");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10, (long) (short) 0);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest13 = null;
        workerService3.schedule(workRequest13, (long) (byte) 0);
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1470");
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
        workerService3.start();
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1471");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', true);
        workerService3.join(10L);
        workerService3.join(0L);
        workerService3.stop();
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1472");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 100, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (short) 100);
        workerService3.join((long) '#');
        workerService3.stop();
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1473");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) '#');
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, 0L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1474");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1475");
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
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1476");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        workerService3.start();
        workerService3.start();
        workerService3.join(10L);
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (byte) -1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest12, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1477");
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
        workerService3.stop();
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1478");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 0, false);
        workerService3.join(0L);
        workerService3.join((long) (byte) 10);
        java.lang.Class<?> wildcardClass8 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1479");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1480");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (short) 0);
        workerService3.start();
        workerService3.join((long) 0);
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1481");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        workerService3.join(1L);
        workerService3.stop();
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1482");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", 10, true);
        workerService3.join(0L);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1483");
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
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18, (long) (-1));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1484");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.stop();
        workerService3.start();
        workerService3.join((long) (short) 0);
        workerService3.stop();
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1485");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 10L);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (byte) 1);
        workerService3.stop();
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1486");
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
        workerService3.start();
        java.lang.Class<?> wildcardClass23 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1487");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1488");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.start();
        workerService3.start();
        workerService3.join((long) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1489");
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
        java.lang.Class<?> wildcardClass18 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1490");
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
        workerService3.stop();
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1491");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (byte) -1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1492");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1493");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (-1));
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest10 = null;
        workerService3.schedule(workRequest10);
        workerService3.stop();
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1494");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.join((long) (short) -1);
        workerService3.stop();
        workerService3.join((long) (short) 10);
        workerService3.start();
        workerService3.join((long) (short) 1);
        workerService3.join((long) (short) 10);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1495");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, true);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1496");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 100, true);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1497");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest19 = null;
        workerService3.schedule(workRequest19, 10L);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1498");
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
        workerService3.join((long) (short) 0);
        workerService3.stop();
        workerService3.join(100L);
        workerService3.join(0L);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1499");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 100, false);
        workerService3.start();
        workerService3.stop();
        workerService3.join((long) (byte) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta2.test1500");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7, (long) (short) 1);
        workerService3.join((long) '4');
        workerService3.start();
        workerService3.join((long) (short) 1);
    }
}

