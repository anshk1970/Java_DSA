package ConditionalStatement;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x+y>z && x+z>y && y+z>x )
            System.out.print("VALID TRIANGLE");
        else System.out.print("INVALID TRIANGLE");



    }
}
