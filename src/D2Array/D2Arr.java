package D2Array;
import java.util.Scanner;
public class D2Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1,2,3,7,8},{4,5,6,11,23}};
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j] = sc.nextInt();
            }
            System.out.println( );
        }
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                sum+=a[i][j];
            }
            System.out.println( );
        }
        System.out.print(sum+" ");
    }

}
