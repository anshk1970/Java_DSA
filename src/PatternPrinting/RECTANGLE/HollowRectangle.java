package PatternPrinting.RECTANGLE;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1;i<=row;i++) {
            for (int j = 1; j <= col  ; j++) {
                if(i==1 || i==row || j==1 || j==col) System.out.print(i+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

//Column:    j=1   j=2   j=3   j=4   j=5
//        +-----+-----+-----+-----+-----+
//i = 1 -> |  1  |  1  |  1  |  1  |  1  |  <-- Boundary (i==1)
//         +-----+-----+-----+-----+-----+
//i = 2 -> |  2  |     |     |     |  2  |  <-- Sirf j==1 aur j==5 par print hua
//         +-----+-----+-----+-----+-----+
//i = 3 -> |  3  |     |     |     |  3  |  <-- Sirf j==1 aur j==5 par print hua
//         +-----+-----+-----+-----+-----+
//i = 4 -> |  4  |  4  |  4  |  4  |  4  |  <-- Boundary (i==row)
//         +-----+-----+-----+-----+-----+