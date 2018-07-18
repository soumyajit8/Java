package com.company;

public class Power {

    public static void main(String[] args) {
        int no = 256;
        if (isPowerOfFour(no) == 1)
            System.out.println(no + " is a power of 4");
        else
            System.out.println(no + "is not a power of 4");
    }

    static int isPowerOfFour(int n) {
        if (n == 0)
            return 0;
        while (n != 1) {
            if (n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;
    }
}
