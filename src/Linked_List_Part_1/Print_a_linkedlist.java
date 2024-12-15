package Linked_List_Part_1;

public class Print_a_linkedlist {
    public static void print(Node head ){
        Node temp  = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void printRecursively(Node head){
        if(head == null) return;
        System.out.println(head.val);
        printRecursively(head.next);
    }
    public static void main(String[] args) {
//        Node a = new Node(90);
//        Node temp = a; // Shallow copy
//        System.out.println(temp.val);


        Node a = new Node(10);
        Node b = new Node(30);
        Node c = new Node(50);
        Node d = new Node(70);
        Node e = new Node(90);

        a.next = b; // 10->30
        b.next = c; // 10->30->50
        c.next = d; // 10->30->50->70
        d.next = e;  // 10->30->50->70->90

      // print(a);
        printRecursively(a);
    }
}
