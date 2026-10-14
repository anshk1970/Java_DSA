package BitManipulation;

public class BitwiseAndOrXor {
    public static void main(String[] args) {
        System.out.println(51&42); //34
        System.out.println(51|42); //59

        int x = 5;
        System.out.println(~x); // 1s Complement
        System.out.println(-x-1); //1s Complement
        System.out.println(~x+1); // 2s Complement
        System.out.println(-x); // 2s Complement

    }
}
