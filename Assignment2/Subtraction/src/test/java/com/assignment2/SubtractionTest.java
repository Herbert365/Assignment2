package com.assignment2;

import junit.framework.TestCase;

public class SubtractionTest extends TestCase {

    Subtraction sub;


    public void setUp() throws Exception {
        System.out.println("Before class");
    }

    public void testSetNum1() {
        sub = new Subtraction();
        sub.setNum1(4.0);
        assertTrue(4.0 == sub.getNum1());
    }

    public void testSetNum2() {
        sub = new Subtraction();
        sub.setNum2(2.0);
        assertTrue(2.0 == sub.getNum2());
    }

    public void testGetNum1() {
        sub = new Subtraction(4.0,2.0);
        assertEquals(4.0, sub.getNum1(),0);
    }

    public void testGetNum2() {
        sub = new Subtraction(4.0,2.0);
        assertEquals(2.0, sub.getNum2(),0);
    }

    public void testCalculate() {
        sub = new Subtraction(4.0,2.0);
        assertEquals(2.0, sub.calculate(),0);
    }
}