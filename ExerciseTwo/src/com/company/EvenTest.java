package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {

    private static Even pal;

    @BeforeClass
    public static void setup() {

        pal = new Even();

    }

    @AfterClass
    public static void teardown() {

        pal = null;

    }

    @SuppressWarnings("static-access")
    @Test
    public void testIsEven() {
        assertEquals(true, pal.isEven(226));
        assertEquals(true, pal.isEven(24));
        assertEquals(true, pal.isEven(22034));
    }

    @Test
    public void testIsEvenFailure(){

        assertNotNull("The No is an Odd number",pal.isEven(123213));
        assertNotNull("The No is an Odd number",pal.isEven(21345));
    }
}