package Loops;

import java.util.Scanner;

public class SumOfDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        if(num<0) num =-num;
        while(num!=0){
            int lastDigit = num%10;
            sum+=lastDigit;
            num/=10;
        }
        System.out.println(sum);
    }
}
