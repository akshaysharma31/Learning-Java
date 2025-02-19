package Queue;

import java.util.*;
public class reverse_queue_using_stack {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        Stack<Integer> st = new Stack<>();
        while(que.size() !=0 ){
            st.push(que.remove());
        }

        while(!st.isEmpty()){
            que.add(st.pop());
        }
        System.out.println(que);
    }
}
