package Linked_List_Part_1;


import java.sql.SQLOutput;

class SLL{
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
        size++;
    }

    void Insert( int idx ,int val){
        if(idx == 0){
            InsertAthead(val);
            return;
        }
        if(idx == size){
            InsertAtail(val);
            return;

        }
        if(idx>size || idx<0){
            System.out.println("Invalid IDX!!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i = 1; i<=idx-1;i++){
            x = x.next;
        }

        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int get(int idx) throws Error{
       if(idx == size){
           return tail.val;
       }
       if(idx<0 || idx>size){
           throw new Error("Invalid idx hai !!");
       }
        Node temp = head;
        for(int i = 1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx , int val ){
        if(idx == size){
            tail.val = val;
        }
        if(idx<0 || idx>size){
            throw new Error("Invalid idx hai !!");
        }
        Node temp = head;
        for(int i = 1 ; i<=idx ; i++){
          temp = temp.next;
        }
        temp.val = val;
    }
    void deleteATHead() throws Error{
        if(head == null ){
            throw new Error ("head is empty");
        }
        head = head.next;
        size--;
    }
    void delectAtidx(int idx) throws Error{
        if(idx == 0){
            deleteATHead();
            return;
        }
        if(head == null ){
            throw new Error ("head is empty");
        }
        if(idx<0 || idx>size){
            throw new Error("Invalid idx hai !!");
        }
      Node temp = head;
      for(int i = 1 ; i<=idx-1 ; i++){
          temp = temp.next;
      }
      if(temp.next == tail) tail =temp;
      temp.next = temp.next.next;
      size--;
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
        System.out.println("size " + size);
    }
}



public class Insert_Method_get_Method_Set_Method_delete_Method {


    public static void main(String[] args) {

        SLL list = new SLL();
        list.InsertAtail(10);
        list.InsertAtail(20);
        list.InsertAtail(30);
        list.InsertAtail(40);
        list.InsertAtail(50);
        list.InsertAtail(60);
        list.display();
        list.Insert(3,80);
        list.Insert(0,89);
        list.Insert(7,9);
        list.display();
        System.out.println( list.get(3));
        list.set(2,45);
        list.display();
        list.deleteATHead();
        list.display();
        list.size();
        list.delectAtidx(2);
        list.display();
        list.size();
        System.out.println(list.tail.val);
        list.InsertAthead(45);
        list.InsertAthead(5);
        list.InsertAthead(4);
        list.display();
        list.size();
        list.delectAtidx(2);
        list.display();
        list.size();

    }
}
