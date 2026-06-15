package ConditionalStatement;

import java.util.Scanner;
public class DivisibleBy5_3 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    if(x%5==0 && x%3==0)
        System.out.print("BOTH");
    else if(x%5!=0 && x%3!=0)
        System.out.print("NO BOTH");
else if(x%5==0)
        System.out.print("ONLY BY 5");
    else {
        System.out.print("ONLY BY 3");
    }




    }
}
