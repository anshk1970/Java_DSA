package ConditionalStatement;

import java.util.Scanner;

public class MagnitudeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take positive integer input
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

    if (num < 69) {
        System.out.println("The magnitude is smaller than 69.");
    } else if (num == 69) {
        System.out.println("The magnitude is equal to 69.");
    } else {
        System.out.println("The magnitude is greater than 69.");
    }


        sc.close();
    }
}
