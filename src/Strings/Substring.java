package Strings;

public class Substring {
    public static void main(String[] args) {
        String s = "Ansh";
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}
