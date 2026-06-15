package OOPS;
import java.util.Scanner;
class Students {
    String name;  //null (default value)
    private int rno = 87;  //0
    double cgpa;  //0.0
    void print() {
        System.out.println(name + " " + cgpa + " " + rno);
    }
    int getRno(){    //getter
      return rno;
    }
    void setRno(int num){   //setter
        rno = num;
    }
//    public void p() {  //private function ko chalane ke liye
//        print();
//    }

}
public class PrivateKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Students s1 = new Students();
       s1.cgpa = 9.7;
       s1.name = "ANSH";
      // s1.rno = 34;
        s1.setRno(22);
        System.out.println(s1.getRno());


        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

    }
}
