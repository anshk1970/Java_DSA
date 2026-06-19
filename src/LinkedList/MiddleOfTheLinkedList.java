package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class MiddleOfTheLinkedList {
    public static void display(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val + " ");
        }
    }
    public static int middle(Node head){
        //Not a One pass Solution
        int length = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        temp = head;
        for(int i = 1;i<=length/2;i++){
            temp = temp.next;
        }
          return temp.val;

    }
    public static int middleSlowFast(Node head){
       Node slow = head;
       Node fast = head;
       while(fast!= null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow.val;

    }
    public static void deleteMiddle(Node head){
        Node slow = head;
        Node fast =  head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;
    }
    public static int kthFromEnd(Node head, int k){
        Node slow = head;
        Node fast = head;
        for(int i = 1;i<=k;i++){
            if(fast==null)  return -1 ;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;

    }
    public static void removeNthFromEnd(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1;i<=n;i++){
            if(fast==null)  return ;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.val =slow.next.val;
        slow.next = slow.next.next;

    }
    public static void swap(Node head,int k){
        Node slow = head;
        Node fast = head;
        for(int i =1;i<=k;i++){
            fast = fast.next;
        }
        while(fast!=null){
           slow= slow.next;
           fast = fast.next;
        }
        fast = head;
        for(int i =1;i<=k-1;i++){
            fast = fast.next;
        }
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;
    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

          // agr odd hai to middle
          // agr even hai to right middle
//        System.out.println(middle(a));
//        System.out.println(middleSlowFast(a));
//        deleteMiddle(a);
//        System.out.println(kthFromEnd(a,2));
//        removeNthFromEnd(a,2);
        swap(a,2);
        display(a);
    }

}
