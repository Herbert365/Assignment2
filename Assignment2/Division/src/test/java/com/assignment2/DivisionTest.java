package com.assignment2;

import junit.framework.TestCase;

public class DivisionTest extends TestCase {

    Division div;

    public void setUp() throws Exception {
        System.out.println("Before class");
    }

    public void testSetNum1() {
        div = new Division();
        div.setNum1(4.0);
        assertTrue(4.0 == div.getNum1());
    }

    public void testSetNum2() {
        div = new Division();
        div.setNum2(4.0);
        assertTrue(4.0 == div.getNum2());
    }

    public void testGetNum1() {
        div = new Division(4.0,2.0);
        assertEquals(4.0, div.getNum1(),0);
    }

    public void testGetNum2() {
        div = new Division(4.0,2.0);
        assertEquals(2.0, div.getNum2(),0);
    }

    public void testCalculate() {
        div = new Division(4.0,2.0);
        assertEquals(2.0, div.calculate(),0);
    }
}