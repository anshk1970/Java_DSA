package PatternPrinting.TRIANGLE;

import java.util.Scanner;

public class OddNumTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        //WITHOUT MATHS OP

        for(int i = 1;i<=num;i++) {
            int a = 1;
            for (int j = 1; j<=i; j++) {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }


//        //WITH MATHS
//        for(int i = 1;i<=num;i++) {
//            for (int j = 1; j<=i; j++) {
//                System.out.print(2*j-1+" ");  //ODD Condition
//            }
//            System.out.println();
//        }
    }
}
