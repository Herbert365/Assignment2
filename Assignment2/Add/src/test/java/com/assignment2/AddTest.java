package com.assignment2;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AddTest extends TestCase {

    Add add;

    public void setUp() throws Exception {
        System.out.println("Before class");
    }

    public void testSetNum1() {
        add = new Add();
        add.setNum1(4.0);
        Assert.assertTrue(4.0 == add.getNum1());
    }

    public void testSetNum2() {
        add = new Add();
        add.setNum2(2.0);
        Assert.assertTrue(2.0 == add.getNum2());
    }

    public void testGetNum1() {
        add = new Add(4.0,2.0);
        Assert.assertEquals(4.0, add.getNum1(),0);
    }

    public void testGetNum2() {
        add = new Add(4.0,2.0);
        Assert.assertEquals(2.0, add.getNum2(),0);
    }

    public void testCalculate() {
        add = new Add(4.0,2.0);
        Assert.assertEquals(6.0, add.calculate(),0);
    }
}