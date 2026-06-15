package Arrays;

public class PassingArrayToMethod {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};  // Reference Variable
        System.out.println(arr[3]);  // 40
        change(arr);
        System.out.println(arr[3]);  // 99
    }
    public static void change(int[] x){  // Pass By Reference
        x[3]  = 99;
    }

}
