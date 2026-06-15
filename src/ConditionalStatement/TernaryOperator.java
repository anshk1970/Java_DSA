package ConditionalStatement;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();

       // (Condition) ? sach : jhoot     //Basic Syntax


        int ansh = (num>=0)? 100: 0;
        System.out.println(ansh);

        //ODD_EVEN
      System.out.print((num%2==0) ? "Even" : "Odd");












    }
}
