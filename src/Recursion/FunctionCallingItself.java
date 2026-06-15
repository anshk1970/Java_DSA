package Recursion;

import java.util.Scanner;

public class FunctionCallingItself {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Print(n);

    }
    // 2. Recursive function jo n se lekar 1 tak ke numbers print karega
    public static void Print(int n) {
        // [BASE CASE]: Agar n ki value kam hote-hote 0 tak pahunch jaye, toh ruk jao
        if (n == 0) {
            return; // Function se bahar nikal jao aur peeche laut jao
        }

        // [SELF WORK]: Jo current number n hai, usko screen par print karo
        System.out.println(n);

        // [RECURSIVE CALL]: Function ne khud ko fir se call kiya, lekin is baar value ko ek kam (n-1) kar diya
        Print(n - 1); // it will take care of rest
    }

}
