package Strings;

public class passingStringToMethod {
    public static void change(String str){
        str = "muskan";
    }
    public static void main(String[] args) {
        String str = "Ansh";
        System.out.println(str);
        change(str);
        System.out.println(str);

    }
}
