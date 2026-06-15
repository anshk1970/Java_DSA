package SORTING;

public class SelectionSort {  //Select the smallest And Swap with the first
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 0, 8, 2};
        int n = arr.length;

// Outer loop: Ye har element ko uski sahi sorted jagah par fit karne ke liye hai
        for (int i = 0; i < n - 1; i++) {

            // Sabse chota element dhoondhne ke liye variables initialize karein
            int min = Integer.MAX_VALUE;
            int mindx = i; // Current index ko starting minimum index maan lo

            // Inner loop: Unsorted part mein se sabse chota number dhoondhta hai
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];    // Naya minimum value update karo
                    mindx = j;       // Us chote number ki index save kar lo
                }
            }

            // Swapping: Jo sabse chota element mila (mindx par),
            // use current position (i) wale element se badal do
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

// Final Step: Sorted array ko print karne ke liye loop
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
