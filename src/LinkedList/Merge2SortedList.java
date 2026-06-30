package LinkedList;

public class Merge2SortedList {

    public static void display(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val + " ");
        }
    }
    public static Node MergeSort(Node head){
        if(head==null || head.next ==null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head =MergeSort(head);
        head2 = MergeSort(head2);
        return MergeSortedList(head, head2);

    }
    public static Node MergeSortedList(Node head1, Node head2) {
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (i != null && j != null) {
            if (i.val <= j.val) {
                temp.next = i;
                i = i.next;
            } else {
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }
        if (i == null) temp.next = j;
        else temp.next = i;
        return dummy.next;

    }
    public static void main(String[] args) {
        //First List
        Node a = new Node(30);
        Node b = new Node(10);
        Node c = new Node(40);
        Node d = new Node(55);

        a.next = b;
        b.next = c;
        c.next = d;

        //Second List
        Node A = new Node(20);
        Node B = new Node(50);
        Node C = new Node(70);
        Node D = new Node(80);
        Node E = new Node(90);

        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;

//MergeSortedList(a,A);
        display(MergeSort(a));

    }
}
