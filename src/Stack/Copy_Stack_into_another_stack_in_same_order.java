package Stack;

import java.util.*;
public class Copy_Stack_into_another_stack_in_same_order {
    public static void main(String[] args) {
        Stack<Integer> st_orignal = new Stack<>();
        st_orignal.push(10);
        st_orignal.push(20);
        st_orignal.push(30);
        st_orignal.push(40);
        st_orignal.push(50);

        System.out.println(st_orignal);

        Stack<Integer> st_temp = new Stack<>();

        while(!st_orignal.isEmpty()){
//            int ele = st_orignal.pop();
//            st_reverse.push(ele);

            st_temp.push(st_orignal.pop());
        }
        System.out.println(st_temp);
        Stack<Integer> st_final = new Stack<>();
        while(!st_temp.isEmpty()){
//            int ele = st_orignal.pop();
//            st_reverse.push(ele);

            st_final.push(st_temp.pop());
        }

        System.out.println(st_final);
    }
}

