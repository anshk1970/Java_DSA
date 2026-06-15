package OOPS;
import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    double cgpa;
    void print(){   //Method inside class
        System.out.println(name+" "+rollNo+" "+cgpa);
    }

}

public class UserDefinedDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student S1 = new Student(); //Declaration
        S1.name = "ANSH";
        S1.rollNo = 34;
        S1.cgpa = 8.5;

        Student S2 = new Student();
        S2.name = "NAVYA";
        S2.rollNo = 33;
        S2.cgpa = 7.5;

        Student S3 = new Student();
        S3.name = "NANDU";
        S3.rollNo = 34;
        S3.cgpa = 8.1;

        S1.print();   //Class methods
        S2.print();
        S3.print();

        print(S1);
        print(S2);  // Normal Method
        print(S3);

    }
    public static void print(Student S){
        System.out.println(S.name+" "+S.rollNo+" "+S.cgpa);
    }
}
