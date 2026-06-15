package Arrays;

public class ArrOfOtherDatatypes {
    public static void main(String[] args) {
       char[] arr = new char[5];  // Char Array
       for(int i =0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();

       String[] brr = new String[5];  //String Array
        for(int i =0;i<brr.length;i++){
            System.out.print(brr[i]+" "); // null null null null null
        }
    }
}
