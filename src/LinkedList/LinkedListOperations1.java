package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class LinkedListOperations1 {
    public static int length(Node head){
        int len = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        return len;
    }
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
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;

    }
    public static int firstNodeOfLoop(Node head){
        if (head == null || head.next == null) {
            return head.val;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step forward
            fast = fast.next.next;     // 2 steps forward

            // Agar dono meet karte hain, matlab cycle pakdi gayi!r set karo
                if (slow == fast) {
                    // Phase 2: Cycle ka entry point dhundo
                    fast = head; // fast ko wapas head pa
                while (slow != fast) {
                    slow = slow.next; // ab dono ko 1-1 step chalao
                    fast = fast.next;
                }
                return slow.val; // Dono ab cycle ke start node par hain
            }
        }
        return head.val;
    }
    public static void removeDuplicates(Node head){
        Node i = head;
        Node j = head;
        while(j!=null){
            if(i.val==j.val){
                j= j.next;
            }
            else {
                i.next = j;
                i=j;
            }
        }
        i.next = j;
    }
    public static void removeDuplicates2(Node head){
        Node dummy = new Node(-1);
        Node t = dummy;
        Node i = head;   // i will travel linked list
        while(i!=null){
            if(i.next ==null || i.val !=i.next.val){
                t.next = i;
                t = i;
                i = i.next;
            }
            else{ // i.val == i.next.val
                Node j = i.next;
                while(j!=null && j.val == i.val){
                    j = j.next;
                }
                i =j;
            }
        }
        t.next = i;   // null se jodne ke liye
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(20);
        Node d = new Node(40);
        Node e = new Node(40);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        e.next = c;   // for detect loop

          // agr odd hai to middle
          // agr even hai to right middle
//        System.out.println(middle(a));
//        System.out.println(middleSlowFast(a));
//        deleteMiddle(a);
//        System.out.println(kthFromEnd(a,2));
//        removeNthFromEnd(a,2);
//        swap(a,2);
//        System.out.println(detectLoop(a));
//        System.out.println(firstNodeOfLoop(a));
//        removeDuplicates(a);
//        removeDuplicates2(a);
        display(a);
    }

}
