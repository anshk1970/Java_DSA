package BinarySearch;

public class DescSearch {
    public static void main(String[] args) {
        int[] arr = {100,80,77,63,55,47,24,11,7,2,1};
        int low = 0,high= arr.length-1;
        int target = 47;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid]>target) low = mid+1;
            else if (arr[mid]<target) high = low-1;



        }
    }
}
