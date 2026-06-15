package Basics;
import java.util.Scanner;


public class simpleInterest {
    public static void main(String[] args) {
        Scanner ansh = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double P = ansh.nextDouble();
        System.out.print("Enter Rate: ");
        double R = ansh.nextDouble();
        System.out.print("Enter Time: ");
        double T = ansh.nextDouble();

        double SI = (P*R*T)/100;
        System.out.println("Simple Interest: "+ SI);

    }
}
