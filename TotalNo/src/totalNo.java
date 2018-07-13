import java.util.Scanner;
import java.util.*;

public class totalNo {
    public static void main(String[] args) {




        int n,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values");
        n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter"+" "+ n+ "array values");

        for(int i=0;i<n;i++) {
            if(input.next().matches("\\d+")) {
                a[i] = input.nextInt();
            } else {
                System.out.println("ERROR");
            }

            sum=sum+a[i];


        }
        input.close();


        System.out.println(sum);

    }
}
