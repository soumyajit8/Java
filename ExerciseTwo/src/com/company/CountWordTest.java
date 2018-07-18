package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountWordTest {

    private static CountWord pal;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        pal = new CountWord();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        pal = null;

    }

    @SuppressWarnings("static-access")
    @Test
    public void testCountEachWords() {

        assertEquals("{Hello=6, World=3}" ,pal.output());
    }

}