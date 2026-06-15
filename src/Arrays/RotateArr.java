package Arrays;

public class RotateArr {
    public static void rev(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){

        int[] arr = {4,1,7,3,8,5};
        int n = arr.length;
        int d = 2;
        d %= n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }




    }
}
