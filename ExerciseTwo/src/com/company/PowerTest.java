package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

    private static Power pet;
    @BeforeClass
    public static void setup(){
    pet = new Power();}

    @AfterClass
    public static void teardown(){
        pet = null;
    }
    @SuppressWarnings("static-access")
    @Test
    public void testIsPower(){

        assertEquals(1,pet.isPowerOfFour(256));
    }
}