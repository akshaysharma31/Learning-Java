package string_part2;

import java.util.*;

public class string_builder {
    public static void main(String[] args) {
        // StringBuilder is mutable
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("Akshay");

        System.out.println(str);
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());// default 16
        StringBuilder a = new StringBuilder(10);
        System.out.println(a.capacity());//10



        System.out.println(str.reverse()); // yahskA

     // Input in StringBuilder



        // First Way
//        String b = sc.nextLine();
//        StringBuilder sb = new StringBuilder(b);
//        System.out.println(sb);


        // Second way
        StringBuilder sb = new StringBuilder( sc.nextLine());
        System.out.println(sb);

        sb.setCharAt(1,'x');
        System.out.println(sb);

       // abcd
        // axcd
    }
}
