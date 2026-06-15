package SORTING;

public class BubbleSortReverse {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        for (int i = 0; i < arr.length - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Yahan change hai: '>' ki jagah '<' use kiya hai
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }

            if(swaps == 0) break;
        }

        // Final sorted array print karne ke liye
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
