package Loops;
import java.util.Scanner;

public class CountDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0) num = 1;
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
