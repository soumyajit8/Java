import java.util.Scanner;

public class sorting {


    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i <10 ; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(arr[i]);
        }


    }

//    String line1 = Scanner.nextLine();
//    String[] numbers1 = line1.split(" ");
//    for(int i = 0;i<numbers1.length;i++)
//
//    {
//        int array[i] = Integer.parseInt(numbers1[i]);
//    }

//    for(int step =0;step<array.length-1;++step)
//            for(i=0;i<array.length-step-1;++i)
//
//    {
//        if (data[i] < data[i + 1]) {
//            temp = data[i];
//            data[i] = data[i + 1]
//            data[i + 1] = temp
//        }
//    }

}
