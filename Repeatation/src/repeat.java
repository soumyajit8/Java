import java.util.Scanner;


public class repeat {


    public static void main(String[] args) {
//        @SuppressWarnings("resource")
        Scanner soumyajit=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=soumyajit.next( );

        System.out.println("Enter the number: ");
        int n=soumyajit.nextInt( );
        int fnum=n;
        char ch[]=str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            System.out.print(ch[i]);

        }
        while(fnum>0) {
            for(int i=str.length()-n;i<str.length();i++)
                System.out.print(ch[i]);

            fnum--;
        }

    }
}
