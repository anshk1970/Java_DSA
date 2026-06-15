package SORTING;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};

        // Outer Loop: Ye loop n-1 baar chalta hai (passes ke liye)
        // Har pass ke baad, array ka sabse bada element end mein set ho jata hai
        for (int i = 0; i < arr.length - 1; i++) {

            // 'swaps' variable optimization ke liye hai
            // Agar pure pass mein koi swap nahi hua, toh array pehle hi sorted hai
            int swaps = 0;

            // Inner Loop: Ye padosi (adjacent) elements ko compare karne ke liye hai
            // 'arr.length - 1 - i' isliye hai kyunki aakhri 'i' elements pehle hi sahi jagah par hain
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Agar left wala number right wale se bada hai...
                if (arr[j] > arr[j + 1]) {

                    // ...toh unhe aapas mein badal (Swap) do
                    int temp = arr[j];       // temp mein purana number rakha
                    arr[j] = arr[j + 1];     // chhota number aage laya
                    arr[j + 1] = temp;       // bada number piche bheja

                    // Swap hua hai, isliye count badha diya
                    swaps++;
                }
            }

            // Agar ek bhi swap nahi hua (swaps == 0), toh loop se bahar nikal jao
            // Isse code ki speed badh jati hai (Optimized Bubble Sort)
            if(swaps == 0) break;
        }

        // Sorted array ko print karne ke liye for-each loop
        for (int num : arr) {
            System.out.print(num + " "); // Output: 1 2 5 5 6 9
        }
    }
}

//Time Complexity
//Avg case O(n2)
// Worst case O(n2)
// Best case O(n)