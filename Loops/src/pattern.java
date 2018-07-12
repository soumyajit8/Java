import java.util.Scanner;

public class pattern {

    public static void main(String[] args){


        Scanner soumyajit = new Scanner(System.in);
        System.out.println("Enter any No:");
        int no= soumyajit.nextInt();

        for(int i = 0;i<=no;i++)
            for(int j=1;j<=i;j++){

                System.out.print(i + " ");

        }
    }
}
