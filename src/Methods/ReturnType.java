package Methods;

public class ReturnType {
    public static int ansh(int a){
        System.out.println("ANSH");
        if(a>0) return 7;   //khatam  // ye is function ki integer val hai
        else return 10;
    }

    public static void main(String[] args) {
        int x = ansh(7);
        System.out.println(3+x);      //ANSH
                                       // 10

    }
}
