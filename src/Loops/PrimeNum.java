package Loops;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koi bhi number enter karein: ");
        int num = sc.nextInt();

        // Ek flag variable liya, shuruat mein ise 'true' mana (yani number prime hai)
        boolean isPrime = true;

        // Agar number 1 ya usse chota hai, to wo prime nahi hota
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop ko 2 se shuru kiya aur number ke aadhe (num/2) tak chalaya
            for (int i = 2; i <= num / 2; i++) {

                // Agar number 'i' se poora divide ho jata hai
                if (num % i == 0) {
                    isPrime = false; // Iska matlab factor mil gaya, toh prime nahi hai
                    break;           // Aage check karne ki zaroorat nahi, loop se bahar niklo
                }
            }
        }


        // Agar isPrime ki value 'true' hi rahi, toh number Prime hai
        if (isPrime) {
            System.out.println(num + " ek Prime Number hai.");
        }
        // Agar isPrime 'false' ho gaya, toh number Prime nahi hai
        else {
            System.out.println(num + " ek Prime Number NAHI hai.");
        }
    }
}
