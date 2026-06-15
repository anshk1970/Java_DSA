package PatternPrinting.SPECIAL;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();  //Num is Odd
        for(int i = 1;i<=num;i++) {
            for (int j = 1; j<=num; j++) {
                int mid = num/2+1;
                if(i==mid || j ==mid) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
