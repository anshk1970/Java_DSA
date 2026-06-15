package Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 11};
        int[] brr = {1, 3, 4, 5, 7, 8};
        int[] crr = new int[arr.length + brr.length];  // 0 0 0 0 0 0 0 0 0 0 0

        MERGE(crr, arr, brr);

        for(int ele : crr) {
            System.out.print(ele + " ");
        }
    }

    public static void MERGE(int[] crr, int[] arr, int[] brr) {

        int i = 0, j = 0, k = 0;

        // Yeh loop tab tak chalega jab tak DONO arrays mein compare karne ke liye elements hain
        while(i < arr.length && j < brr.length) {
            // Agar arr ka element chota hai, toh usko crr mein dalo aur i ko aage badhao
            if(arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            }
            // Agar brr ka element chota ya barabar hai, toh usko crr mein dalo aur j ko aage badhao
            else {
                crr[k] = brr[j];
                j++;
            }
            // Har comparison ke baad final array ka index 'k' toh aage badhega hi
            k++;
        }

        // Agar brr khatam ho gaya par arr mein abhi bhi elements bache hain,
        // toh unhe bina kisi comparison ke seedhe crr mein copy kar do
        while(i < arr.length) {
            crr[k++] = arr[i++];
        }

        // Agar arr khatam ho gaya par brr mein abhi bhi elements bache hain,
        // toh unhe seedhe crr mein copy kar do
        while(j < brr.length) {
            crr[k++] = brr[j++];
        }
    }

}
