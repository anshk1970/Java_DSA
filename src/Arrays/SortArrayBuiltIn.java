package Arrays;
import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,7,5,4};
        print(arr);
        Arrays.sort(arr);   // Sort in Ascending Order
        print(arr);
    }
}
