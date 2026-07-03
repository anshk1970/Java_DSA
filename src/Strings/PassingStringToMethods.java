package Strings;

public class PassingStringToMethods {
    public static void change(String x){ //passed by value
        x = "Muskan";  // isse x ki value nhi badlegi
    }
    public static void main(String[] args) {
        String x = "Ansh";
        change(x);
        x = "ANSHU"; // isse badal jaayegi
        System.out.println(x);  //ANSHU
    }
}
