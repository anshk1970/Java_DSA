package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);  // peeche se add ho raha hai
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(7);

        System.out.println(arr.get(2));   // get ele of arr[2]
        arr.set(3,10);   // arr[3] = 10

        System.out.println(arr);  // print all elem of arr but not traversing the array by ourselves

        int n = arr.size();   //arr.length
        for(int i =0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }

        //25 21 18 10 7

        arr.add(78);  //25 21 18 10 7 78
        arr.add(1,77); // 25 77 21 18 10 7 78
        arr.remove(arr.size()-1);
        System.out.println(arr);
        //reverse           Collections.reverse(arr);

        // reverse manually
        int i = 0, j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);



    }
}
