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
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1502");
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
        workerService3.join((-1L));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1503");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) ' ', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, 0L);
        java.lang.Class<?> wildcardClass7 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1504");
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
        workerService3.start();
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1505");
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
        workerService3.start();
        workerService3.start();
        workerService3.start();
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1506");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 0, false);
        workerService3.stop();
        workerService3.stop();
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1507");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '4', true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (-1L));
        workerService3.start();
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1508");
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
        workerService3.join((long) (short) 1);
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1509");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        workerService3.stop();
        workerService3.start();
        workerService3.start();
        workerService3.start();
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1510");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        workerService3.stop();
        workerService3.stop();
        workerService3.join((long) (short) 0);
        workerService3.stop();
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest11 = null;
        workerService3.schedule(workRequest11, (long) (byte) -1);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1511");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest20, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1512");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (byte) 10, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, 100L);
        workerService3.start();
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1513");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, true);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (byte) -1);
        workerService3.start();
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1514");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.stop();
        workerService3.join(0L);
        workerService3.join((long) (short) 100);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1515");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) 'a', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6, (long) 0);
        workerService3.start();
        workerService3.stop();
        java.lang.Class<?> wildcardClass11 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1516");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 1, false);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest5 = null;
        workerService3.schedule(workRequest5, (long) (short) 0);
        workerService3.join((long) ' ');
        workerService3.start();
        workerService3.stop();
        workerService3.start();
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1517");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest18, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1518");
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
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest16 = null;
        workerService3.schedule(workRequest16);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest18 = null;
        workerService3.schedule(workRequest18, (long) 10);
        java.lang.Class<?> wildcardClass21 = workerService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1519");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) '#', false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4, (long) (byte) 100);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest7 = null;
        workerService3.schedule(workRequest7);
        workerService3.stop();
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1520");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("", (int) (short) 10, false);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest4 = null;
        workerService3.schedule(workRequest4);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        workerService3.schedule(workRequest6);
        workerService3.start();
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest9 = null;
        workerService3.schedule(workRequest9, (long) 0);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTestDelta3.test1521");
        org.apache.zookeeper.server.WorkerService workerService3 = new org.apache.zookeeper.server.WorkerService("hi!", (int) (short) 10, false);
        workerService3.join((long) 1);
        org.apache.zookeeper.server.WorkerService.WorkRequest workRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerService3.schedule(workRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

