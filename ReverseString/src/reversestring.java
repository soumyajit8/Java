
import java.util.Scanner;


public class reversestring {

    public static void main(String[] args) {

        String str, reverse = "";
        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any text:");
        str = soumyajit.next();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reverse Text is :" + reverse);
    }

}
