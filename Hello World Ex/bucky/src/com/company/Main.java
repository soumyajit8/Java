package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tuna;
        tuna = 5.28;
        System.out.print("I Want ");
        System.out.print(tuna);
        System.out.println("Movies");
        System.out.print("Append");


        Scanner bucky = new Scanner(System.in);
        System.out.println("Enter any text:");
        System.out.println(bucky.nextLine());


        Scanner soumyajit = new Scanner(System.in);
        double fnum , snum , answer;
        System.out.println("Enter First Num: ");
        fnum = soumyajit.nextDouble();
        System.out.println("Enter Second Num: ");
        snum = soumyajit.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);


        double first = 20;
        double second = 80;
        double third = (first+second)*25;
        System.out.println("Result of step3 is : " +third);
        double fourth = third % 40;
        System.out.println("Result of step4 is :" +fourth);
        if(fourth <= 20)
            System.out.println("Total was overthe limit.");


    }
}
