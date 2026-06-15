package LinkedList;



class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class DisplayList {
    public static void display(Node head){
       for(Node temp = head; temp != null; temp= temp.next){
           System.out.print(temp.val+" ");
       }

//        WHILE LOOP

//      Node temp = head;
//      while(temp != null){
//          System.out.print(temp.val+" ");
//          temp = temp.next;      // Very Important
//      }
//        System.out.println();
    }

    public static void displayRecursively(Node head){
       if(head ==  null) return ;
        System.out.print(head.val+" ");
        displayRecursively(head.next);
    }

    public static void displayReverse(Node head){
        if(head ==  null) return ;
        displayReverse(head.next);
        System.out.print(head.val+" ");
//    Pehle aage badhte jao bina print kiye, aur jab rasta khatam ho jaye toh wapas aate-aate print karte jao!
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; b.next = c;
        c.next = d; d.next = e;
        display(a);   // passing the head of the linkedList ( head == entire linked list)
        displayRecursively(a);   //prints the linked list using recursion
        displayReverse(a);  // Reverses the linked list with recursion
    }
}
