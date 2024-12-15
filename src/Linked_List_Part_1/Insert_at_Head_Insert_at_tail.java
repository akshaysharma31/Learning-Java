package Linked_List_Part_1;
class SSL{
    Node head;
    Node tail;
    int size;
   void InsertAtail(int val){
     Node temp = new Node(val);
     if(head == null){
         head =  temp;
         tail = temp;
     } else {
          tail.next = temp;
          tail = temp;
     }
     size++;
   }
   void InsertAthead(int val){
       Node temp = new Node(val);
       if(head == null){
           head =  temp;
           tail = temp;
       } else {
           temp.next = head;
           head = temp;
       }
   }
   void display(){
       Node temp = head;
       while(temp !=null){
           System.out.print(temp.val + " ");
           temp  =  temp.next;
       }
       System.out.println();
   }
   void size(){
       System.out.println(size);
   }
}


public class Insert_at_Head_Insert_at_tail {
    public static void main(String[] args) {
         SSL list = new SSL();
          list.InsertAtail(10);
          list.InsertAtail(20);
          list.InsertAtail(30);
          list.InsertAtail(40);
          list.InsertAtail(50);
          list.InsertAtail(60);
          list.display();
        //  list.size();
        list.InsertAthead(9);
        list.display();

    }
}
