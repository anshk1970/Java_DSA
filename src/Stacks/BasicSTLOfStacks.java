package Stacks;

import java.util.Stack;

public class BasicSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
//        System.out.println(st.isEmpty());   //true
//        System.out.println(st.peek()); // EmptyStackException
        st.push("Ansh");
        st.push("Muskan");
        st.push("Nandu");
        st.push("Ash");
        st.push("OTC");
        System.out.println(st.size());  //5
        System.out.println(st);   // prints all elements   A.S. = O(n)
        st.pop();  // remove OTC
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());  // Ash
        System.out.println(st.pop());   // it returns the topmost element and then removes it

    }
}
