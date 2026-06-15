package Methods;

public class SwapTwoNum {
    public static void swap(int x , int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x+" "+y); //yahan swap ho jayega

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        swap(a,b);  // pass by value
        System.out.println(a+" "+b); // yahan swap nhi hoga


//        //Swapping
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);

    }
}
