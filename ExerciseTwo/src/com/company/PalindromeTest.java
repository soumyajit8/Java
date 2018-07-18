package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {


    public static Palindrome pal;

    @BeforeClass
    public static void setup() {

        pal = new Palindrome();
    }

    @AfterClass
    public static void teardown() {

        pal = null;
    }

    @Test
    public void isPalindrome() {
        assertEquals(true, pal.isPalindrome(121));
        assertEquals(true, pal.isPalindrome(123454321));
        assertEquals(true,pal.isPalindrome(12321));

    }

    @Test
    public void isPalindromeFailure(){

        assertNotNull("The No is not a Palindrome",pal.isPalindrome(123213));
        assertNotNull("The No is not a Palindrome",pal.isPalindrome(21345));
    }

}