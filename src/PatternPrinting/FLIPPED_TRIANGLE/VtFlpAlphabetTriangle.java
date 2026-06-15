package PatternPrinting.FLIPPED_TRIANGLE;

import java.util.Scanner;

public class VtFlpAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++){
            for(int k = 1;k<=num-i;k++){  //Spaces Walla Loop
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                if(i%2==0) System.out.print((char)(i+64)+" ");
               else System.out.print((char)(i+96)+" ");
            }

            System.out.println();
        }

    }
}
