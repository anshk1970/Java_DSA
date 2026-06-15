package PatternPrinting.FLIPPED_TRIANGLE;

import java.util.Scanner;

public class HzFlpNumTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++) {
            for (int j = 1; j<=num+1-i; j++) {  //i + jmax = num + 1    jmax = n+1-i
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
