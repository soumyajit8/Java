import java.util.Random;
import java.util.Scanner;

public class Rand {

    public static void main(String args[]){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rand = random.nextInt(100);
//        System.out.println(random.nextInt(50));

//        double my = Math.random();
//        System.out.println((10* my)+1);
//
//        int val = (int) (10* my)+1;
//        System.out.println(val);

        while (true){
            System.out.println("Pick a number between 1-100");
            int guess = scanner.nextInt();
            if (guess==rand){
                System.out.println("Found");
                break;
            }else if(rand<guess){
                System.out.println("Random Number is Lesser");
            }else {
                System.out.println("Random number is Higher");
            }
        }


    }
}
