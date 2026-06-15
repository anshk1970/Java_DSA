package Arrays;

public class Ques1 {
    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            if(i%2==0) System.out.print(arr[i]+10+" ");
            else System.out.print(arr[i]*2+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,7,5,4};
        print(arr);

    }

}
