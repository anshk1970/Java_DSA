package Loops;

import java.util.Scanner;

public class DecreasingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = num;i>=1;i--){
            System.out.println(i);
        }

        //Print this Series - 99,95,91,87... upto all terms which are positive

        for(int i = 99;i>=1;i-=4){
            System.out.println(i);
        }
    }
}
