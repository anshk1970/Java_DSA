package SORTING;
import java.util.Arrays;

public class TwoSum {
    public static boolean twoSum(int arr[], int target) {
        // 1. Array ko sort karenge (Chote se bada)
        // Two-pointer approach ke liye sorting zaroori hai
        Arrays.sort(arr);

        int i = 0;               // 'i' pehla element (sabse chota)
        int j = arr.length - 1;  // 'j' aakhri element (sabse bada)

        // Jab tak pointers ek dusre ko cross nahi karte
        while (i < j) {
            int sum = arr[i] + arr[j]; // Dono numbers ka jod (sum) nikaalo

            // Case 1: Agar sum target ke barabar hai
            if (sum == target) {
                return true; // Pair mil gaya!
            }
            // Case 2: Agar sum target se bada hai
            else if (sum > target) {
                j--; // Sum kam karne ke liye bade number waale pointer (j) ko piche lao
            }
            // Case 3: Agar sum target se chota hai
            else {
                i++; // Sum badhane ke liye chote number waale pointer (i) ko aage badhao
            }
        }

        // Agar loop khatam ho gaya aur koi pair nahi mila
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,4,7,11,2};
        int target = 18;
        System.out.println(twoSum(arr,target));
    }
}
