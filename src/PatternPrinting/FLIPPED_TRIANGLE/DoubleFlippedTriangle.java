package PatternPrinting.FLIPPED_TRIANGLE;
import java.util.Scanner;

public class DoubleFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        //nst nsp Method
        int nst = num;
        int nsp = 1;
        for(int i = 1;i<=num;i++){
            for(int k = 2;k<=nsp;k++){
                System.out.print("  ");
            }
            nsp++;
            for(int j = 1;j<=nst;j++){
                System.out.print("* ");
            }
            nst--;
            System.out.println();
        }


        // 2nd Method

//        for(int i = 1;i<=num;i++) {
//            for(int j = 2;j<=i;j++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j<=num+1-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        // 3rd Method

//        int a = num;
//        for(int i = 1;i<=num;i++){
//            for(int k = 2;k<=i;k++){
//                System.out.print("  ");
//            }
//            for(int j = 1;j<=a;j++){
//                System.out.print("* ");
//            }
//            a--;
//            System.out.println();
//        }

    }
}
