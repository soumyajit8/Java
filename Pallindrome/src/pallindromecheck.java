import java.util.Scanner;

public class pallindromecheck {

    public static void main(String[] args) {

        long n, originalno, reversed = 0, remainder;

        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        originalno = soumyajit.nextLong();

        n = originalno;
        while (n != 0) {

            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;

        }


        if (originalno == reversed) {

            System.out.println("The no is palindrome");
            long val1 = 0, n2;
            n2 = originalno;
            while (n2 > 0) {

                remainder = n2 % 10;
                if ((remainder % 2) == 0) {
                    val1 = val1 + remainder;
                }
                n2 = n2 / 10;
            }
            if (val1 > 25)
                System.out.println("The sum of the even no is more than 25.");

            else
                System.out.println("The sum of the even no is less than 25.");
        } else
            System.out.println("The no is not a pallindrome.");
    }
}
