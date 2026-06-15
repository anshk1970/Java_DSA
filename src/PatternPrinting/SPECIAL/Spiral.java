package PatternPrinting.SPECIAL;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=2*num-1;i++){
            for(int j=1;j<=2*num-1;j++){
                int a = i, b = j;
                if(i>num) a = 2*num-i;
                if(j>num) b = 2*num-j;
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
