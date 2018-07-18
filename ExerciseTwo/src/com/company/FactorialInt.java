package com.company;

import java.util.Scanner;

public class FactorialInt {

    public static void main(String[] args) {
        long fact = 1;
        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        long number = soumyajit.nextLong();
        fact = Factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    public static long Factorial(long n) {

        if (n == 0)
            return 1;
        else if (n >= 21)
            System.out.println("Out Of Bound.");
        else
            return (n * Factorial(n - 1));

    return 0;
    }
}
