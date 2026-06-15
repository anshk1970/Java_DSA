package Recursion;
import java.util.Scanner;
public class Decreasing_Increasing {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);

    }

    //Standard Recursive Code
    public static void print(int n ){
        if(n==0) return ;
        System.out.println(n+" ");
        print(n-1);
        // do bar 1 ko print hone se rokne ke liye "if" cdn ka use kiya
        if(n!= 1) System.out.println(n+" ");
    }
}
