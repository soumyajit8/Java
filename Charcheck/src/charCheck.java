import java.util.Scanner;

public class charCheck {

    public static void main(String[] args) {

        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any Character:");
        char c = soumyajit.next().charAt(0);

        if (Character.isUpperCase(c)) {
            System.out.println("Capital Letter");
        } else if (Character.isLowerCase(c)) {
            System.out.println("Small letter");
        } else if (Character.isDigit(c)) {
            System.out.println("Number");
        } else {
            System.out.println("Special character");
        }


        /*if (c >= 'A' && c <= 'Z') {
            System.out.println("This is Capital Letter.");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("This is Small Case Letter.");
        } else if (c >= 48 && c <= 57) {
            System.out.println("This is a Number.");
        } else {
            System.out.println("This is a Special Character.");
        }*/

    }

}
