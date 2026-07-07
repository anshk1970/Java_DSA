package Strings;
import java.util.Scanner;
public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        String s = "";  // Empty String
//        s+=x;
        String s = Integer.toString(x);
        System.out.println(s);


        //String to Integer

        String str = "84984875";
        int n = Integer.parseInt(str);
        System.out.println(n+1);  //84984876



    }
}
