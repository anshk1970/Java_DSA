package PatternPrinting.FLIPPED_TRIANGLE;

import java.util.Scanner;

public class HzFlpStarTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        //MAIN METHOD

//        for(int i = 1;i<=num;i++) {
//            for (int j = 1; j<=num+1-i; j++) {  //i + jmax = num + 1    jmax = n+1-i
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//


        //Without Maths Op Method

        int a = num;  //no of stars to be printed
        for(int i = 1;i<=num;i++) {
            for (int j = 1; j<=a; j++) {
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }















        System.out.println();

        //2nd method
//        for(int i = 1;i<=num;i++) {
//            for (int j = num; j>=i; j--) {  //i + jmax = num + 1    jmax = n+1-i
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
