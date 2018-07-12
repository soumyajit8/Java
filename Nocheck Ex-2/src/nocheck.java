import java.util.Scanner;

public class nocheck {

    public static void main(String[] args) {

        int n;
        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        n = soumyajit.nextInt();
        if (n > 20 && n < 30) {
            if (n % 2 != 0)
                System.out.println("Tom");
            else
                System.out.println("Jerry");
        }
    }
}
