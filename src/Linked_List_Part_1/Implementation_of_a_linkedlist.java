package Linked_List_Part_1;
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
public class Implementation_of_a_linkedlist {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(30);
        Node c = new Node(50);
        Node d = new Node(70);
        Node e = new Node(90);

        a.next = b; // 10->30
        b.next = c; // 10->30->50
        c.next = d; // 10->30->50->70
        d.next = e;  // 10->30->50->70->90
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);


    }
}
