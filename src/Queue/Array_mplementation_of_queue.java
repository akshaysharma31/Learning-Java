package Queue;

import java.util.Queue;

public class Array_mplementation_of_queue {

    public static class queueA{
         int f = -1;
         int r = -1;
         int size;
         int[]  arr = new int[6];
         void add(int val){
             if (r== arr.length - 1) {
                 System.out.println("Queue is full!");
                 return;
             }
             if (f == -1) {
                 f = r = 0;
                 arr[0] = val;
             } else {
                 r++;
                 arr[r] = val;
                 size++;

             }
         }

         int remove(){
             if(size == 0){
                 System.out.println("Queue is Empty!");
                 return 0;
             }
             f++;
             return arr[f-1];
         }

         int peek(){
             if(size == 0){
                 System.out.println("Queue is Empty!");
                 return 0;
             }
             return arr[f];
         }
         void display(){
             for(int i = f ; i<=r ; i++){
                 System.out.print(arr[i] + " ");
             }
             System.out.println();
         }
    }
    public static void main(String[] args) {
        queueA que = new queueA();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.display();
        System.out.println(que.remove());
        System.out.println(que.remove());
        que.display();
        System.out.println(que.peek());


    }
}
