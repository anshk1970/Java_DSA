package ConditionalStatement;

import java.util.Scanner;
public class Check4DigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 999 && num < 10000)
            System.out.print("YeAh! Four Digit");
        else System.out.print("NOOO");
    }
}

