package Methods;

public class PassByValPassByReference {
    public static void change(int a ){  //ye x alag hai
        System.out.println(a);  //  6
        a = 10;
        System.out.println(a);  //  10
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);   //6
        change(x);    //iska mtlb x nhi gaya x ki copied value gai
        System.out.println(x);   //6

    }
}

//Java is strictly pass-by-value.
// This means whenever you pass an argument to a method, Java makes a copy of the variable's value and passes that copy into the method.
// It never passes the actual variable or a true memory reference to the variable itself