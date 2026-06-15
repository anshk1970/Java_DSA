package Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int i = 0, j =arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
