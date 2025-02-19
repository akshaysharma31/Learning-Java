package Queue;
import java.util.*;
public class Introduction_to_queue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        System.out.println(que.isEmpty());
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());

    }
}
