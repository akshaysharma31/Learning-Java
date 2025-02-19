package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Print_element_in_Queue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        Queue<Integer> helper  = new LinkedList<>();
        while(!que.isEmpty()){
            System.out.print(que.peek() + " ");
            helper.add(que.remove());
        }
        System.out.println();
        while(helper.size() > 0){
            que.add(helper.remove());
        }
        System.out.println(que);
    }
}
