package Loops;

public class EvenOddNum {
    public static void main(String[] args) {
//        for(int i = 1;i<=100;i++){ //100 bar chalega
//            if(i%2==0) System.out.print(i+" "); //EVEN NUMBERS
//        }

        for(int i = 2;i<=100;i=i+2){ //50 bar chalega
            System.out.print(i+" ");
        }

        System.out.println();
//        for(int i = 1;i<=100;i++){ //100 bar chalega
//            if(i%2==1) System.out.print(i+" ");  //ODD NUMBERS
//        }
        for(int i = 1;i<=100;i=i+2){ //50 bar chalega
             System.out.print(i+" ");
        }
    }
}
