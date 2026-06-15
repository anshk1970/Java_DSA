package Basics;

public class CharDataType {
    public static void main(String[] args) {
        char ch = 'A';
        int x = ch;  // implicit typecasting
        System.out.println(x); //ASCII VALUE

        char ansh = '#';
        int y = (int)ansh;  // explicit typecasting
        System.out.println(y); //ASCII VALUE

        char nandu = '7';
        System.out.println((int)nandu); //ASCII VALUE


        // HACK OF  ASCII
        char m = 'M';
        System.out.println(m*1);  //ASCII VALUE

        //Integer to Character
        int a = 77;
        char b = (char)a;  // yahan implicit typecasting nhi hoti
        System.out.println(b); // CHARACTER

    }
}
