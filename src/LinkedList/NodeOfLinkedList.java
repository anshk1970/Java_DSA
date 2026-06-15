package LinkedList;

public class NodeOfLinkedList {
    public static void main(String[] args) {
       // 10 -> 20 -> 30 -> 40
       Node a = new Node(10);   // head Node  (head node hi puri linked list hoti hai)
       Node b = new Node(20);
       Node c = new Node(30);
       Node d = new Node(40);

          System.out.println(b.val);    // 20
          System.out.println(b.next);   // null

       //Ab ham Link karenge
        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(c);             //LinkedList.Node@8efb846
        System.out.println(b.next);        //LinkedList.Node@8efb846
        System.out.println(a.next.next);   //LinkedList.Node@8efb846
        System.out.println(a.next.next.next.val);  // 40
    }
}
