package Loops;
import java.util.Scanner;

public class CompositeAndPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUM:");
        int num = sc.nextInt();
        boolean flag = true;  // ham manke chalte h ki num prime hai

        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num%i ==0){ // i to n ka ek factor nikla
                flag = false; // false means Composite
                break;
            }
        }
        if(num==1) System.out.println("Neither Prime Nor Composite");
        else if(!flag) System.out.println("composite Number");
        else System.out.println("prime Number");

    }
}
//i <= Math.sqrt(num) (Sabse Important Step)Aapne loop ko poore num tak chalane ki jagah sirf uske square root tak chalaya.
// Aisa kyun? Kyunki kisi bhi number ke factors hamesha uske square root se pehle hi mil jate hain (agar koi factor exist karta ho to).

