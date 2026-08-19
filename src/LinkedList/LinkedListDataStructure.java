package LinkedList;


class LinkedList{    //User Defined Data Structure
    Node head;  //null
    Node tail;  //null
    int size;

    int search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp!=null){
            if(temp.val==val) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;

    }

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

    void insertAtIdx(int val , int idx){
        if(idx<0 || idx>size) System.out.println("Invaid index");
    else if(idx==0) addAtHead(val);
    else if(idx==size) addAtTail(val);
    else {
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }

    }

    void deleteAtIdx(int idx){
        if(idx<0|| idx>=size) {
            System.out.println("invalid index ");
            return;
        }
        if(idx==0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i =1;i<=idx-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;    // absolute cinema
       if(idx == size-1) tail = temp;  // hm tail delete kar rhe hai aur temp ko tail bana dete hai
        size--;
    }

    int get(int idx){
        Node temp = head;
        for(int i = 1; i<= idx; i++){
            temp= temp.next;
        }
        return temp.val;
    }

}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();   // nayi linked list ban rhi hai
        ll.addAtTail(10); ll.display();  //10
        ll.addAtTail(20); ll.display();  //10 20
        ll.addAtHead(30); ll.display();  //30 10 20
        ll.addAtTail(40); ll.display();  //30 10 20 40
        ll.addAtHead(50); ll.display();  //50 10 20 40 50
        ll.addAtTail(60); ll.display();  //50 30 10 20 40 60
        ll.deleteAtHead();    ll.display();  //30 10 20 40 60
        ll.insertAtIdx(77,3); ll.display();  //30 10 20 77 40 60
        ll.deleteAtIdx(2); ll.display();      //30 10 77 40 60
        System.out.println(ll.get(4));        //60
        System.out.println(ll.search(10)); //1

    }
}
