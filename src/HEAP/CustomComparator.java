package HEAP;
import java.util.Arrays;
class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name,int rno,double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }


    public int compareTo(Student s) {
        return Integer.compare(s.rno,this.rno);
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Ansh",34,9.1);
        Student s2 = new Student("Muskan",19,7.6);
        Student s3 = new Student("Pranjul",51,8.9);
        Student s4 = new Student("Monu",45,6.4);
        Student s5 = new Student("Ayush",38,6.7);
        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);
        for(Student s : arr){
            System.out.println(s.name+" "+s.rno+" "+s.cgpa);
        }


    }

}
