package com.company;

import java.util.Scanner;

public class Even {

    public static void main(String[] args) {

        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        long number = soumyajit.nextLong();
        if (isEven(number)) {
            System.out.println("Even no.");
        } else {
            System.out.println("Odd no");
        }
    }

    public static boolean isEven(long number) {
        if((number%2)==0)
        {
            return true;
        }
        else
            return false;
    }
}
