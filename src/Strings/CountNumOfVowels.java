package Strings;

public class CountNumOfVowels {
    public static void main(String[] args) {
        String x = "ansh kushwaha";
        int count =0;
        for(int i = 0;i<x.length();i++){
            char ch = x.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
