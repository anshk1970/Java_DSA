package ConditionalStatement;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER: ");
        int num = sc.nextInt();
        if(num%2==0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
}
