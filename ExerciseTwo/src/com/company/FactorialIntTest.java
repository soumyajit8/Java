package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialIntTest {

    private static FactorialInt pet;
    @BeforeClass
    public static void setup(){
        pet = new FactorialInt();}

    @AfterClass
    public static void teardown(){
        pet = null;
    }
    @SuppressWarnings("static-access")
    @Test
    public void testIsFactorial(){

        assertEquals(120,pet.Factorial(5));
        assertEquals(5040,pet.Factorial(7));
        assertEquals(40320,pet.Factorial(8));
        assertEquals(0,pet.Factorial(21));

    }
}