package Stacks;

import java.util.Stack;

public class PeekAddRemove {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        //get element(2)
//        while(st.size()>2+1){
//            st2.push(st.pop());
//        }
//        System.out.println(st);
//        System.out.println(st.peek()); // 30
//        while(st2.size()>0){
//            st.push(st2.pop());
//        }
//        System.out.println(st);

//        // add element at specific index
//        while(st.size()>2){
//            st2.push(st.pop());
//        }
//        st.push(77);
//        while(st2.size()>0){
//            st.push(st2.pop());
//        }
//        System.out.println(st); //[10, 20, 77, 30, 40, 50]

        // remove element at specific index
        while(st.size()>2+1){
            st2.push(st.pop());

        }
        st.pop();
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);  //[10, 20, 40, 50]


    }
}
