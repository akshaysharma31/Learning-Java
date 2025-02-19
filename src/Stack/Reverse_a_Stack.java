package Stack;
import java.util.*;
public class Reverse_a_Stack {

    public static void main(String[] args) {
        Stack<Integer> st_orignal = new Stack<>();
        st_orignal.push(10);
        st_orignal.push(20);
        st_orignal.push(30);
        st_orignal.push(40);
        st_orignal.push(50);

        System.out.println(st_orignal);

        Stack<Integer> st_reverse = new Stack<>();

        while(!st_orignal.isEmpty()){
//            int ele = st_orignal.pop();
//            st_reverse.push(ele);

            st_reverse.push(st_orignal.pop());
        }

        System.out.println(st_reverse);
    }
}
