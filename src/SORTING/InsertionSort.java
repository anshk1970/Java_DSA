package SORTING;
// isme array ke 2 part hote hai sorted aur unsorted , unsorted ka pehla element sorted part me sahi jagah insert karna hota hai
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 1, 7, 4,5};

// Outer loop: Index 1 se end tak chalega
        for (int i = 1; i < arr.length; i++) { //Hum maante hain ki pehla element (index 0) pehle se sorted hai.

            // 'j' mein current index store kiya taaki ise piche compare kar sakein
            int j = i;

            // Jab tak j zero se bada hai AUR current element apne piche waale se chota hai
            while (j > 0 && arr[j] < arr[j - 1]) {

                // Dono elements ko swap (exchange) kar do
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                // j ko ek step piche le jao agla comparison karne ke liye
                j--;
            }
        }
         for(int ele : arr) System.out.print(ele+" ");
    }
}

//Time Complexity

//        Best Case = O(n),Array pehle se sorted hai.
//        Average Case = O(n2),Elements random hain.
//        Worst Case = O(n2),Array reverse sorted hai.
//        Space Complexity = O(1),Extra space nahi chahiye.