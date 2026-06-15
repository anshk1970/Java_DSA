package Basics;

public class IncrementDecrement {
    public static void main(String[] args) {
        // ++x,x++  , --x,x--

        int A = 7;
        System.out.println(++A); // 8 //pre Increment
        System.out.println(A++); // 8  //post Increment
        System.out.println(++A); // 10



        int x = 10;
        int y = x++;
        System.out.println(x+" "+y);  //x= 11 , y= 10

        int a = 10;
        int b = ++a;
        System.out.println(a+" "+b); // x = 11 , y =11
    }
}
