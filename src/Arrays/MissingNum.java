package Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int n = arr.length+1;
        int sum = n*(n+1)/2; //maths formula for sum of 1 to n natural numbers
        int arrSum = 0;
        for(int ele : arr){
            arrSum+= ele;
        }
        System.out.println(sum-arrSum);  //6

    }
}
