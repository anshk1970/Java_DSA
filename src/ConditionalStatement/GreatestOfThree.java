package ConditionalStatement;

import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER 1st: ");
        int x = sc.nextInt();
        System.out.print("ENTER 2nd: ");
        int y = sc.nextInt();
        System.out.print("ENTER 3rd:");
        int z = sc.nextInt();

//        if(x>=y && x>=z){
//            System.out.println(x);
//        }
//        else{  // ab y ya z me se hoga
//            if(y>=z && y>=x) System.out.println(y);
//            else System.out.println(z);
//        }

        //Without && Operator  (Nesting)

        if (x >= y) {  // y to max nahi hai
            if (x >= z) System.out.println(x);
            else  //z > x
                System.out.println(z);
        } else {  // y > x
            if (y >= z) System.out.println(y);
            else  //z > y
                System.out.println(z);
        }


       // WITH TERNARY OPERATOR
       // System.out.print((x>y) ?((x>z)? "X OP" : "Z OP") :((y>z)? "Y OP":"Z OP"));

    }
}