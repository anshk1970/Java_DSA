package Stacks;
import java.util.Stack;
public class PushAtBottomRecursive {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);  //bottom
        st.push(20);
        st.push(30);
        st.push(40);  // top
        int ele = 50;
        System.out.println(st);  //[10, 20, 30, 40]
        pushAtBottom(st,ele);
        System.out.println(st);  //[50, 10, 20, 30, 40]




    }

    private static void pushAtBottom(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }

}
