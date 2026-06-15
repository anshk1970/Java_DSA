package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // indexing
        System.out.println(arr);  //address of the First Element arr[0]
        // Updating Elements  = Mutability
        arr[5] = 10;
        System.out.println(arr[5]);  //10  //access


        int[] brr = new int[4]; // 4 size ka array 0 to 3
        brr[0] = 1; brr[1] = 2; brr[2] = 3; brr[3] = 4;


        //Default Values
        int[] ansh = new int[7];
        for(int i = 0;i<ansh.length;i++){
            System.out.print(ansh[i]+" "); // 0 0 0 0 0 0 0
        }


    }
}
