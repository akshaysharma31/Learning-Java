package Queue;

import java.util.*;
public class remove_evenQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> ansque = new LinkedList<>();

        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);

        System.out.println(que);

        while(!que.isEmpty()){
            que.remove();
            if(!que.isEmpty()){
                ansque.add(que.remove());
            }
        }

        System.out.println(ansque);

    }
}
