package Queues;

public class ImplementationOfLL {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10); q.add(20); q.add(30);q.add(40);
        q.display();  //10 20 30 40
        System.out.println(q.remove());  //10
        q.display(); //20 30 40
        System.out.println(q.peek());  //20


    }
}
