package SORTING;

public class Move0toEnd {
        public static void main(String[] args) {
            int[] arr = {1, 0, -2, 3, 0, 4, 8, 0, 10, 12};
            int n = arr.length;

            // Bubble Sort variation to move zeros
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    // Agar current element 0 hai aur agla non-zero, toh swap karo
                    if (arr[j] == 0 && arr[j + 1] != 0) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            // Final array print karna
            for (int val : arr) {
                System.out.print(val + " ");
            }

        }

}
