package Strings;

public class Plus {
    public static void main(String[] args) {
        String s = "Ansh";
        s+=" Java"; //string
        s+= 10;   //int
        s+='K';  //char
        s+='\n';  //next line
        s+='x';
        System.out.println(s);  // Ansh Java10K
                                // x

        //guess the output
        System.out.println(7+10+"Ansh");  // 17Ansh
        System.out.println("Ansh"+7+10);   //Ansh710
        System.out.println(7+"Ansh"+10);   //7Ansh10
        System.out.println("Ansh"+(7+10));  //Ansh17
        System.out.println('A'+"Ansh");  //AAnsh
        System.out.println('A'+7+"Ansh"); // 72Ansh

    }
}
