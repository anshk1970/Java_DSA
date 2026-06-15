package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {7,3,5,9,11,6};
        int max = arr[0];  //Integer.MIN_VALUE
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
