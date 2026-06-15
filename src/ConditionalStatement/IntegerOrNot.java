package ConditionalStatement;
import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double num = sc.nextDouble();
        int x = (int)num;
        if(num == x) System.out.println("IS AN INTEGER");  //Java automatic tarike se comparison ke waat x ko temporary double bana deta hai taaki dono ka format same ho sake.
        else System.out.println("NOT AN INTEGER");

    }
}
