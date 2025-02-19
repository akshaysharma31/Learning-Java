package Stack;

import java.util.*;
public class Reverse_Stack_recursively {

    public static void display_reverse(Stack<Integer> st) {

        if (st.isEmpty()) return;

        int top = st.pop();
        System.out.println(top);
        display_reverse(st);

        st.push(top);
        System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

       display_reverse(st);
    }
}
