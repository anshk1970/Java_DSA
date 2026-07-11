package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(6);
        System.out.println(s.length()+" "+s.capacity());  // 0  6   //default capacity 16 hoti hai
        s.append("Ansh");
        System.out.println(s.length()+" "+s.capacity());  // 4  6
        s.setCharAt(0,'V');
        System.out.println(s);  // Vnsh
        String t = s.toString();
        System.out.println(t);
        s.append("jvnvojrnvirg9ivnrgvinrognvrnbrnubub");
        System.out.println(s.length()+" "+s.capacity());
        s.append("t");
        System.out.println(s.length()+" "+s.capacity());
        s.append("vktmgoimgitmgimt");
        System.out.println(s.length()+" "+s.capacity());





    }
}
