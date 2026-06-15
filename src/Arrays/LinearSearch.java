package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {13,45,91,77,23,36};
        int target = 77;
        boolean flag = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target) {
                System.out.println("Found At Index "+i);
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("Not Exist");

    }
}
