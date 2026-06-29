package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,7,2,8,10};
        int target = 18;
        boolean flag = false;

        for(int i = 0;i<arr.length  && !flag ;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    flag = true;
                    System.out.println("EXISTS");
                    break;
                }
            }
        }
        if(!flag) System.out.println("NOT EXISTS");

    }
}
