package BinarySearch;

public class MountPeak {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,5,2,1,-2,-4};
        int PeakEle = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                PeakEle = arr[i];
            }
        }
        System.out.println(PeakEle);
    }
}
