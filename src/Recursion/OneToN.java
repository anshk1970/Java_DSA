
package Recursion;

import java.util.Scanner;

public class OneToN {

    static int n;  // Global Variable
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
         n = Sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if (n==0) return ;
        print(n-1);  //Callback Method
        System.out.println(n+" ");
    }
}
