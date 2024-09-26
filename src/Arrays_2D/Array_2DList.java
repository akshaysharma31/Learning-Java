//2D ArrayList
//List<List<Integer>> v = new ArrayList<>();
// List<List<Integer>> v = new ArrayList<>(m);


//List<List<Integer>> v = new ArrayList<>(m);
// for (int i= 0;i < m; i++){
// v.add(new ArrayList<>(n);
//}

// Basic of function in array list

// add()
// remove()
// get()
// size()
// clear()
// isEmpty()
// contains()
// indexOf()
// toArray()




package Arrays_2D;

import java.util.*;

public class Array_2DList {
    public static void main (String []args){
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        List<Integer> b= new ArrayList<>();
        b.add(40);
        b.add(50);
        List<Integer> c = new ArrayList<>();

        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> v = new ArrayList<>();
        v.add(a);
        v.add(b);
        v.add(c);
        v.add(d);


//        for(int i = 0;i<v.size() ; i++ ){
//            System.out.println(v.get(i) + " ");
//        }

        for(int i =0 ;i<v.size();i++){
            List<Integer> x = v.get(i);
            for(int j = 0 ; j<x.size();j++){
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
    }
}
