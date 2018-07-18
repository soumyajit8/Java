package com.company;

import static org.junit.Assert.assertEquals;

import com.company.MemberVariable;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Test;

class MemberTest {


    private static MemberVariable pal;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        pal = new MemberVariable();

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
        assertEquals("Members Name: Harry Potter Members Age: 30 Members Salary: 2500.3" ,pal.main(null ));

    }



}