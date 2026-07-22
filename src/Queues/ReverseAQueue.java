package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {  // A.S. = O(n)  T.C. = O(n)

    public Queue<Integer> reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        return q;
    }


    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);

    }
}
