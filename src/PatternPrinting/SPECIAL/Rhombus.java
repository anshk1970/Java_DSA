package PatternPrinting.SPECIAL;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        // consider this as a TriangleOfSpaces + Square
        for(int i = 1;i<=num;i++){
            for(int j = 1;j<=num-i;j++){
                System.out.print("  ");
            }
            for(int k =1;k<=num;k++){
                System.out.print("* ");
            }

            System.out.println();
        }



    }
}
