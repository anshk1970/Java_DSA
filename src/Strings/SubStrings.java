package Strings;

public class SubStrings {   //Continous Part
    public static void main(String[] args) {
//        String x = "Ansh";
//        System.out.println(x);  //Ansh
////        x.charAt(0) = 'M'   Immutability
//        x = "Muskan";
//        System.out.println(x);  //Muskan

        String s =  "Ansh";
//        System.out.println(s.substring(3)); //hwaha (3 se lekar end tak)
//        System.out.println(s.substring(1,6));  // 1 to 5
//        System.out.println(s.substring(2,s.length()-1)); // s to h


        //print all substrings
        for(int i = 0;i<s.length();i++){
        for(int j = i+1;j<=s.length();j++){
           System.out.print(s.substring(i,j)+" ");
        }
            System.out.println();
        }


        //Sum of all substrings of a number
        String  x = "726294";
        int sum = 0;
        for(int i = 0;i<x.length();i++){
            for(int j = i+1;j<=x.length();j++){
                String sub = x.substring(i,j);
                sum+= Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}
