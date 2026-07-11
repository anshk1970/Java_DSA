package Strings;

public class InterningNew {
    public static boolean equals(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "Ansh";
//        s.charAt(0) = 'N';   //Not Possible
//        s = "Aman";  // ab s "Aman" ko point kar rha hai "Ansh" ko nhi kar payega
//        System.out.println(s);

//        String  x = "Roman";
//        String  y = "Roman";
//        //isse nayi string nhi banegi. x aur y dono Roman ko point kr rhe hai
//
//        String  a = new String("Roman"); // isse nayi string banegi
//        System.out.println(a);


//        String s1 = new String("Ansh");
//        String s2 = new String("Ansh");
//        System.out.println(s1==s2);   //false kyoki inke adress alag hai aur inki location compare ho rhi hai

        String s1 = "Ansh";
        String s2 = "Ansh";
//        System.out.println(s1==s2);  //true  isme s1 aur s2 dono ek hi string "Ansh" ko point kr rhe hai

        System.out.println(equals(s1,s2));
    }
}
