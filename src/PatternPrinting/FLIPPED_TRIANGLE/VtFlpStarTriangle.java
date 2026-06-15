package PatternPrinting.FLIPPED_TRIANGLE;

import java.util.Scanner;

public class VtFlpStarTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        //Best Method    consider this as 2 triangles

        for(int i = 1;i<=num;i++){
            for(int k = 1;k<=num-i;k++){  //Spaces Walla Loop
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){  //Stars ka loop
                System.out.print("* ");
            }

            System.out.println();
        }


        //Nsp Method BEST

//
//        int nsp = num-1;
//        for(int i = 1;i<=num;i++) {
//            for (int j = 1; j<=nsp; j++) {
//                System.out.print("  ");
//            }
//            nsp--;
//
//            for (int j = 1; j<=i; j++) {
//                System.out.print(j+" ");
//            }
//
//            System.out.println();
//        }
//



        //Method 3  consider this as square

//        for(int i = 1;i<=num;i++){
//            for(int j= 1;j<=num;j++){
//                if(i+j>num) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }


    }
}
