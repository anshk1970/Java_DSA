   // package D2Array;
//
//public class ColumnWisePrint {
//    public static void main(String[] args) {
//        int[][] arr = {{1,2,4,5},{8,4,2,8},{9,7,4,2}};
//        for(int j = 0;j<arr[0].length;j++)  {
//            for(int i = 0;i<arr.length;i++) {
//                System.out.print(arr[i][j]+" ");
//
//            }
//            System.out.println();
//        }
//    }
//}

        //For Each Loop
//
//package D2Array;
//
//public class ColumnWisePrint {
//    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 4, 5}, {8, 4, 2, 8}, {9, 7, 4, 2}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int ele : arr[i]) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//    }
//}

package D2Array;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4, 5}, {8, 4, 2, 8}, {9, 7, 4, 2}};
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}