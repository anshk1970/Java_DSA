package Loops;
import java.util.Scanner;

public class DisplayAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i = 2;i<=3*n-1;i+=3){  // upto nth term
//            // 2,5,8,11,14...  //With formula
//            System.out.print(i+" ");
//        }
//        System.out.println();


        //without Formula Op Method

        int a = 4 , d = 6;  //4,10,16.....  // yaha a starting point hai aur d difference
        for(int i = 1;i<=n;i++){
            System.out.print(a+" ");
            a += d;
        }

    }
}
