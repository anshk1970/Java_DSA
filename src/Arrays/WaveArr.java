package Arrays;

public class WaveArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 0;
        int n = arr.length-1;
        while (i < n) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i += 2;

        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}