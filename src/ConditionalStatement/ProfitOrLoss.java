package ConditionalStatement;

import java.util.Scanner;
public class ProfitOrLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER CostPrice: ");
        int CP = sc.nextInt();
        System.out.println("ENTER SellingPrice: ");
        int SP = sc.nextInt();
        if(SP > CP) System.out.print("PROFIT: "+(SP-CP));
        else if (SP==CP) System.out.print("NO PROFIT NO LOSS");
        else System.out.print("LOSS: "+(CP-SP));



    }

}
