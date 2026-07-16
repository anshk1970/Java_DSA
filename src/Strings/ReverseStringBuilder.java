package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Ansh";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);


//        sb.deleteCharAt(1);
//        sb.insert(1, 'M');
//        System.out.println(sb);
//        sb.reverse();   //hsnA
//        System.out.println(sb);

        //reverse method
//        int i = 0, j = sb.length()-1;
//        while(i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i,temp1);
//            sb.setCharAt(j,temp2);
//            i++;
//            j--;
//        }
//        System.out.println(sb);
    }
}
