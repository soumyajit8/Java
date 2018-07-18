package com.company;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import com.company.FileRead;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class FileReadTest {
    private static FileRead pal;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        pal = new FileRead();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        pal = null;

    }
    @SuppressWarnings("static-access")
    @Test
    public void testMain() {
        assertEquals(54, pal.read());
    }

}