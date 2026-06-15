package Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int []arr = {7,2,-3,8,5};
        int sum = 0;

        //Normal For Loop
//        for(int i = 0;i<arr.length;i++){
//            sum+= arr[i];
//        }

        //Enhanced For Loop (best for Arrays)
        for(int ele : arr){
            sum+= ele;
        }
        System.out.println("Sum : "+ sum);
    }
}
