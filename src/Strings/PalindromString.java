package Strings;

public class PalindromString {
    public static boolean isPalindrom(String x){
        int i = 0; int j = x.length()-1;
        while(i<=j){
            if(x.charAt(i)!=x.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
           String x = "MOM";
        System.out.println(isPalindrom(x));




    }
}
