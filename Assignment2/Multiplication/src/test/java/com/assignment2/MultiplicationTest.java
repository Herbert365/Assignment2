package com.assignment2;

import junit.framework.TestCase;

public class MultiplicationTest extends TestCase {

    Multiplication mul;

    public void setUp() throws Exception {
        System.out.println("Before class");
    }

    public void testSetNum1() {
        mul = new Multiplication();
        mul.setNum1(4.0);
        assertTrue(4.0 == mul.getNum1());
    }

    public void testSetNum2() {
        mul = new Multiplication();
        mul.setNum2(2.0);
        assertTrue(2.0 == mul.getNum2());
    }

    public void testGetNum1() {
        mul = new Multiplication(4.0,2.0);
        assertEquals(4.0, mul.getNum1(),0);
    }

    public void testGetNum2() {
        mul = new Multiplication(4.0,2.0);
        assertEquals(2.0, mul.getNum2(),0);
    }

    public void testCalculate() {
        mul = new Multiplication(4.0,2.0);
        assertEquals(8.0, mul.calculate(),0);
    }
}