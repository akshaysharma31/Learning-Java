package Queue;

public class Linkedlist_implementation_of_queue {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size;

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
                int ans = head.val;
                head = head.next;
                size--;
                return ans;



        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
            }
            return head.val;
        }


    boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }

}

    public static void main(String[] args) {
        queueLL que = new queueLL();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.display();
        System.out.println(que.remove());
        que.display();
        System.out.println(que.remove());
        que.display();
        System.out.println(que.peek());
        System.out.println(que.size);

    }
}
