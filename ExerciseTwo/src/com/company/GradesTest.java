//package com.company;
//
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class GradesTest {
//
//    public static Grades pal;
//
//    @BeforeClass
//    public static void setup() {
//
//        pal = new Grades();
//    }
//
//    @AfterClass
//    public static void teardown() {
//
//        pal = null;
//    }
//
//    @Before
//    public static void input(){
//
//        int[] arr = new int[]{55,55,55,65,55};
//    }
//
//    @Test
//    public void iscal(){
//
//        assertArrayEquals(57, pal.cal());
//    }
//}