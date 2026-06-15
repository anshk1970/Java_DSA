package OOPS;
import java.util.Arrays;

public class Marks {
    public static class StudentData{
        String name ;
        int rno;
        int[] marks ;
        StudentData(int x){
            marks = new int[x];

        }
        StudentData(int[] x){
            marks = x;
            marks = Arrays.copyOf(x,x.length); //Deep copy
        }


    }
    public static void main(String[] args) {
        int[] arr = {7,17,77,37,27};
        StudentData s1 = new StudentData(arr);
        StudentData s2 = new StudentData(2);
        s1.marks[2] = 40;  //shallow copy
        System.out.println(arr[2]);

    }
}
