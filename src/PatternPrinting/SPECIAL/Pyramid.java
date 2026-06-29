package PatternPrinting.SPECIAL;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        //Nsp-Nst Method

//        int nsp = num-1;
//        int nst = 1;
//
//        for(int i = 1;i<=num;i++) {
//            for(int j = 1;j<=nsp;j++){
//                System.out.print("  ");
//            }
//            for(int k =1;k<=nst;k++){
//                System.out.print("* ");
//
//            }
//            nsp--;
//            nst+=2;
//
//            System.out.println();
//        }

        //Ise add karne se Diamond ban jayega

//        int a =2*num-3;
//        for(int i = 1;i<=num;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("  ");
//            }
//            for(int j = 1;j<=a;j++){
//                System.out.print("* ");
//            }
//            a-=2;
//            System.out.println();
//        }






        // With Maths

        for(int i = 1;i<=num;i++) {
            for(int j = 1;j<=num-i;j++){
                System.out.print("  ");
            }
            for(int k =1;k<=2*i-1;k++){  //odd case
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
