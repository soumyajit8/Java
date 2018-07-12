import java.util.Scanner;

public class Wordcheck {

    public static void main(String[] args) {

        String check;
        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any text:");
        check = soumyajit.nextLine();

        for (int i = 0; i < check.length(); i++) {
            char c = check.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

                switch (c) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        System.out.print(c + "--Vowel");
                        break;
                    default:
                        System.out.print(c + "--Consonant");
                }
//
//                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
//                    System.out.println(c + " -- vowel");
//                else
//                    System.out.println(c + " -- consonant");


            } else
                System.out.println(c+ "--Input is not a letter.");

        }

    }
}
