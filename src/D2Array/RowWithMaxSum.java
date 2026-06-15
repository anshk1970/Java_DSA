 package D2Array;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1,22 ,3},{4,5,6},{7,8,9}};
        int MaxSum = Integer.MIN_VALUE;
        int row = -1;
        for(int i = 0;i<arr.length;i++){
          int sum  = 0;
           for(int j = 0;j<arr[0].length;j++){
             sum+=arr[i][j];
          }
           if(sum> MaxSum){
               MaxSum  = sum;
               row = i;
           }
        }
        System.out.println(row +" "+ MaxSum);
    }
}
