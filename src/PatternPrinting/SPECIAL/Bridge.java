package PatternPrinting.SPECIAL;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=2*num-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp =1;
        for(int i = 1;i<=num-1;i++){
            for(int j = 1;j<=num-i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k = 1;k<=num-i;k++){
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }

    }
}
