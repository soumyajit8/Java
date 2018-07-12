import java.util.Random;
import java.util.Scanner;

public class Guessgame {

    public static void main(String[] args) {
        Scanner soumyajit = new Scanner(System.in);
        int gues;
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;



        while (true) {

            System.out.println("Enter any No between 1 to 100 : ");
            gues = soumyajit.nextInt();

            if (gues == n) {
                System.out.println("Guess is correct.");
                break;
            } else if (gues < n)
                System.out.println("Enter a Higher Number.");
            else if (gues > n)
                System.out.println("Enter a Lesser Number.");

        }
    }
}

