package Methods;

public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(ansh(3));
    }

    public static int ansh(int a) {
        if (a < 5) {
            return a;  // kisi bhi int ReturnType func me return hit hona mandatory h
        }
        else  return -1;  // isliye if ke sath else laga kar return karna hi padega
    }

}
