package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {3,6,1,8,5};
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>Smax && arr[i]!=max) Smax = arr[i];
        }
        System.out.println(max);
        System.out.println(Smax);

    }
}
