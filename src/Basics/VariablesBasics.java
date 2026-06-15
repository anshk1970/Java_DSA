package Basics;

public class VariablesBasics {
    public static void main(String[] args) {
        int x;  // declaration
        x = 7;  // initialization
        System.out.println(x);  //7
        x = 77; // variable update (Re-initialization)
        System.out.println(x);  //77

        //Modifying Values
        x = x + 5;  // x += 5
        System.out.println(x);  //82
        x /= 2;
        System.out.println(x);  //41

    }
}
