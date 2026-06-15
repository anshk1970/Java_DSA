package Arrays;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0};
        segregate(arr);


        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

         // 2 pointer Approach
//    public static void Segregate(int[] arr){
//        int n = arr.length;
//        int i = 0, j = n-1;
//        while(i<j){
//            if(arr[i]==0) i++;
//            else if(arr[j]==1) j--;
//            else if(arr[i]==1 && arr[j]==0){
//                arr[i] =0;
//                arr[j] =1;
//                i++;
//                j--;
//            }
//        }
//    }
//


      //Normal Method
    public static void segregate(int[] arr) {
        int numOfZeros = 0;

        // Count the zeros
        for (int ele : arr) {
            if (ele == 0) numOfZeros++;
        }

        // Fill the array with 0s up to the count, then 1s for the rest
        for (int i = 0; i < arr.length; i++) {
            if (i < numOfZeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }
}
