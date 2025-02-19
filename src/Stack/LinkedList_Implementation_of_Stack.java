package Stack;

public class LinkedList_Implementation_of_Stack {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static class stack{
        Node head = null;
        int size;

        void push(int x ){

            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;



        }

        int peek(){
            if(head == null){
                System.out.println("stack is empty");
                return -1;
            }

            return head.val;

        }

        void display(){
          displayrec(head);
        }

        void  displayrec( Node head){

            if(head == null){
                return;
            }
            displayrec(head.next);
            System.out.print(head.val + " ");

        }

        int size(){
            return size;
        }


        boolean isEmpty(){
            if(size  == 0 ) {
                return true;
            }

            return false;
        }

        int pop(){

            if(head == null){
                System.out.println("stack is empty");
                return -1;
            }
           int ele = head.val;
            head = head.next;
             size--;

            return  ele;
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        System.out.println();

        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.pop());


    }
}
