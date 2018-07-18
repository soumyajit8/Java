//package com.company;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Grades {
//
//    public static void main(String[] args) {
//
//        int content;
//
//        Scanner soumyajit = new Scanner(System.in);
//        System.out.println("Enter Number of Students: ");
//        int number = soumyajit.nextInt();
//
//        int[] arr = new int[number];
//
//        for (int i = 0; i < number; i++) {
//
//            System.out.println("Enter the grade for no - " + (i + 1) + " Students Grade:");
//            content = soumyajit.nextInt();
//
//            if (content >= 0 && content <= 100) {
//                arr[i] = content;
//            } else {
//                System.out.println("Invalid Input");
//            }
//
//        }
//
//        cal(arr);
//    }
//
//
//     static double cal(int[] arr) {
//
//        double total = 0;
//        for (int j = 0; j < arr.length; j++) {
//
//            total = total + arr[j];
//        }
//        double average = total / arr.length;
//        System.out.println("The average Number of all the Students : " + average);
//
//        Arrays.sort(arr);
////        return average;
//
//        System.out.println("Minimum Number : " + arr[0]);
//        System.out.println("Maximum Number : " + arr[arr.length - 1]);
//
//
//
//    }
//}
//
//
