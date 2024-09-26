package Arrays;

import java.util.ArrayList;
public class basic_of_arrays_List {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(5);
        al.add(0,10); // initialize
        al.add(1,20);
        al.add(2,30);
        al.add(3,40);
        al.add(4,50);
        System.out.println(al.size());
//
        System.out.println(al);

        System.out.println();
        al.set(2,300); // Modify
        for(int i =0;i<al.size();i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println(al);
        System.out.println();
        al.add(5,90); // push back
        System.out.println(al);
        System.out.println(al.size());
    }
}
