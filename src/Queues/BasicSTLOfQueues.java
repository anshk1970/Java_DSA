package Queues;

//import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;



public class BasicSTLOfQueues {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
//      Queue<Integer> q = new ArrayDeque<>();
        q.add(10); q.add(20);q.add(30); q.add(40);
        System.out.println(q); // fake Printing [10, 20, 30, 40]
        q.remove();  // remove 10
        System.out.println(q+" "+q.size());   //[20, 30, 40] 3
        System.out.println(q.remove()+" "+q);  // 20 [30, 40]

    }
}
