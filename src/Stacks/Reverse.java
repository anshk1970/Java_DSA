package Stacks;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        System.out.println(st);
        while(st.size()>0){
            st2.push(st.pop());
        }
        while(st2.size()>0){
            st3.push(st2.pop());
        }
        while(st3.size()>0){
            st.push(st3.pop());
        }
        System.out.println(st);

    }
}
