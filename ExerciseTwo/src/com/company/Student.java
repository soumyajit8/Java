package com.company;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        studentMaxMinAvg();
    }

    public static String studentMaxMinAvg() {

        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        System.out.println("number of Students: ");
        int num=4;

        int arr[] = {86,65,98,77};
        int max = 0, min = 0, avg, sum = 0;
        System.out.println("Grades: ");
        for(int i=0;i<num;i++)
        {

            System.out.println("Grade of Student"+i+": "+arr[i]);

        }

        for(int i=0 , j=1; i<4 && j<4;i++,j++)
        { if(arr[i]<arr[j])
            max=arr[j];

            if(arr[i]<arr[j])
                min=arr[i];

            sum=sum+arr[i];
        }

        avg=sum/num;
        System.out.println(max+" "+min+" "+avg);
        return "max is: "+max+" min is: "+min+" avg is: "+avg;
    }
}
