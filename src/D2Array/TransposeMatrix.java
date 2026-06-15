package D2Array;

public class TransposeMatrix   {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4,5}, {8,4,2,8}, {9,7,4,2},{3,6,2,7}};
         print(arr);
         //transpose
        for(int i = 1;i<arr.length;i++){
            for(int j = 0;j<i;j++){
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        } print(arr);
    }
    public static void print(int[][] arr ) {
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
