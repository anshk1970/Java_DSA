package Methods;

public class BuiltIn {
    public static void main(String[] args) {

        // power and roots
        System.out.println(Math.pow(2,6));  //2^6
        System.out.println( Math.sqrt(64));  // Square root
        System.out.println(Math.cbrt(27));   // Cube root

        //Rounding
        System.out.println(Math.floor(6.8));  // ye num 6 aur 7 ke beech hai isliye iska floor 6 hoga
        System.out.println(Math.ceil(7.3));  // ye num 7 aur 8 ke beech hai isliye iska ceiling 8 hoga
        System.out.println(Math.round(7.4));  //  agar .5 se jyda hai to aage jayega agr kam hai to peeche aayega

        //Built-in Constant
        System.out.println(Math.PI);  //3.14159...

        //Absolute value and min/Max
        System.out.println(Math.abs(-67));  //Absolute/Positive Val
        System.out.println(Math.min(7,3)); // min val return kar dega
        System.out.println(Math.max(13,6));  //max val return kar dega



         // 3 numbers ka Maximum
         int a = 9, b = 6, c = 7;
         System.out.println(Math.max(Math.max(a,b),c));

//        // 4 numbers ka Maximum
//        int a = 9, b = 6, c = 7,d = 2;
//        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));

    }

}
