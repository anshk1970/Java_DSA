package Basics;

public class ArithmeticOperation {
    public static void main(String[] args) {
        int x = 5 , y = 2;  // Integer  4bytes
        System.out.println(x+y); //7
        System.out.println(x-y); //3
        System.out.println(x*y); //10
        System.out.println(x/y); //2 decimal part hat jayega

        double a = 6.7 ;  //double  8bytes
        double b = 4.7;   // 15 to 17 digits
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        float i = 5.4F;  //float  4bytes    agar decimal val ho to F suffix lgana pdega
        float j = 27;  // #7 digits
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);

    }
}
