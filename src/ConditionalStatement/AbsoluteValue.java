package ConditionalStatement;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        if(num>=0) System.out.println(num);
//        else System.out.println(-num);

        if(num<0) num = -num;   // -(-6) = +6
        System.out.println(num);



    }
}
