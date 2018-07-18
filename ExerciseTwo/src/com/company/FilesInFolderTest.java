package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilesInFolderTest {

    private static FilesInFolder pal;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        pal = new FilesInFolder();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        pal = null;

    }
    @SuppressWarnings("static-access")
    @Test
   public void testFindFile() {
        assertEquals("hi.txt" , pal.findFile());
    }

    @SuppressWarnings("static-access")
    @Test
    public void testRead() {
        assertEquals("Hello Hello World Hello Hello World Hello Hello World" , pal.read());
    }

}