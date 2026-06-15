package Basics;
import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.print("Sum: "+ sum);
    }

}
