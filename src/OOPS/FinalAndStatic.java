package OOPS;
class Cricketer{
    final String country ="India";  // FINAL= CONSTANT
    static int runs;   // static Same for All
    String name;
    double avg;
    void print(){
        System.out.println(runs+" "+avg+" "+name);
    }
    static void greet(){    //static method
        System.out.println("ANSH");
    }


}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
       // c1.country = "England";  //ERROR BCZ COUNTRY IS CONST
        System.out.println(c1.country);  //INDIA
        c1.runs = 7000;
        Cricketer c2 = new Cricketer();
        System.out.println(c2.runs);  //7000
        Cricketer.greet();  // ANSH




    }
}
