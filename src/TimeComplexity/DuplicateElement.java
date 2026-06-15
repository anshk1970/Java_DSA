package TimeComplexity;

//   First Approach  Brute Force

//public class DuplicateElement {
//    public static void main(String[] args) {
//        int[] arr = {1,2,2,4,5,3};
//        for(int i = 0;i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                break;
//
//            }
//        }
//    }
//}


//Marking in Another Array

//public class DuplicateElement{
//    public static void main(String[] args) {
//        int[] arr = {5,1,3,4,2,4};
//        int n = arr.length-1;
//        boolean[] flag = new boolean[n+1];
//        for(int i = 0;i<arr.length;i++){
//            int ele = arr[i];
//            if(flag[ele]==true) {
//                System.out.print(ele + " IS IMPOSTER");
//            }
//
//                    flag[ele] =true;
//
//            }
//        }
//
//
//    }
//

    // Most Optimized Approach

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 4};
        int n = arr.length;

        int SumArray = 0;
        for (int i = 0; i < arr.length; i++) {
            SumArray += arr[i];
        }

        int sum1ton = ((n - 1) * n) / 2;

        int dup = SumArray - sum1ton;

        System.out.println(dup);
    }
}
