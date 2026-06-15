package Basics;
import java.util.Scanner;

public class TotalSurfaceAreaOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double TSA = 2*(l*w + w*h + h*l);
        System.out.println(TSA);


    }
}
