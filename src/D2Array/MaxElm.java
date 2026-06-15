package D2Array;

public class MaxElm {
    public static void main(String[] args) {
        int[][] arr = {{16,24,34,46,53},{12,35,21,67,33}};
        int max = arr[0][0];
        int row = -1;
        for(int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                }
            }
        }
        System.out.println(row +" "+max);

//        int[][] arr = {{16,24,34,46,53},{12,35,21,67,33}};
//        int max = arr[0][0];
//        int row = -1;
//        for(int i = 0;i<arr.length;i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (arr[i][j] < max) {
//                    max = arr[i][j];
//                    row = i;                                    //Min NUM
//                }
//            }
//        }
//        System.out.println(row +" "+max);
    }
}
