package Stack;

import java.util.*;
public class Element_at_bottom_and_any_index {

    public static void main(String[] args) {
       Stack<Integer> st_orignal = new Stack<>();
        st_orignal.push(10);
        st_orignal.push(20);
        st_orignal.push(30);
        st_orignal.push(40);

      //  System.out.println(st_orignal);
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter element");
        int new_element = sc.nextInt();
        System.out.println("Enter Pogition of  element");
        int pos = sc.nextInt();


        // add Element in any index

        Stack<Integer> st_temp = new Stack<>();

        while(st_orignal.size() >= pos){
            st_temp.push(st_orignal.pop());
        }


        st_orignal.push(new_element);
        while(st_temp.size() > 0){
            st_orignal.push(st_temp.pop());
        }

        System.out.println(st_orignal);


    }
}
