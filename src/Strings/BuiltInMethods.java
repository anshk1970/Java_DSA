package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "Ansh Kushwaha";
        System.out.println(s.indexOf('s'));  //2
        System.out.println(s.indexOf(' '));   //4
        System.out.println(s.indexOf('h'));  // 3     agr 2 elements h to ye phle wale ka index return karega
        System.out.println(s.lastIndexOf('h')); //11     ye element ka last occurence wala index return karega    }
        System.out.println(s.toLowerCase());  //ansh kushwaha
        System.out.println(s.toUpperCase());  //ANSH KUSHWAHA

        if(s.contains("wah"))  System.out.println("OTC");  //OTC


    }
}
