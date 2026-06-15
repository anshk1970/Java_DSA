package ConditionalStatement;

import java.util.Scanner;
public class AreaOrPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double Area = length * width;
        double Perimeter = 2 *(length + width);

        if(Perimeter > Area)
            System.out.println("PERIMETER OP");
        else if(Area == Perimeter)
            System.out.println("SAME");
        else
            System.out.println("AREA OP");

    }

}
