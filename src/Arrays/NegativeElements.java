package Arrays;
import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        //Input of Array Elements
        System.out.print("Enter Array Elements: ");
        for(int i = 0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        // Print Negative values
        for(int i = 0;i<num;i++){
            if(arr[i]<0)
                System.out.print(arr[i]+" ");         }
    }
}
