package Arrays;
import java.util.Arrays;


public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};


        //Shallow Copy
        int[] x = arr;  // x is shallow copy of arr
        x[0] = 77;
        System.out.println(arr[0]);  // 77   The original array is mutated!

        //Deep Copy
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 100;
        System.out.println(y[0]);  // 100
        System.out.println(arr[0]);  //10  (Original remains untouched)


//        int[] brr = new int[arr.length];
//        for(int i = 0;i<arr.length;i++){
//           brr[i] = arr[i];
//        }                        //brr is deep copy

    }
}
