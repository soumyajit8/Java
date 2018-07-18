package com.company;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        long number = soumyajit.nextLong();
        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }


    public static boolean isPalindrome(long number) {

        long remainder = 0, reversed = 0;
        long originalno = number;
        while (number != 0) {

            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;

        }
        if (originalno == reversed)
            return true;
        else
            return false;


    }
}
