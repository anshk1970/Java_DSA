package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedList{    //User Defined Data Structure
    Node head;  //null
    Node tail;  //null
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);   //  naya node ban rha h
        if(tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null) tail = head= temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void deleteAtHead(){
        if(head== null){
            System.out.println("LIST is Empty");
            return;
        }
        head = head.next;
        if(head==null) tail = null;    //agr head null h to tail bhi null hi hogi
        size--;
    }

}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();   // nayi linked list ban rhi hai
        ll.addAtTail(10); ll.display();
        ll.addAtTail(20); ll.display();
        ll.addAtHead(60); ll.display();
        ll.addAtTail(40); ll.display();
        ll.addAtTail(50); ll.display();
        ll.addAtHead(70); ll.display();
        ll.deleteAtHead();    ll.display();
        System.out.println(ll.size);

    }
}
