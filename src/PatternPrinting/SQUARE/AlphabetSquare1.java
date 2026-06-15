package PatternPrinting.SQUARE;

import java.util.Scanner;

public class AlphabetSquare1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++) {
            for (int j = 1; j<=num; j++) {
                System.out.print((char)(j+64)+" ");  //TypeCasting OP
            }
            System.out.println();
        }
    }
}
