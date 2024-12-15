package Recursion;

import java.util.*;
public class Print_1_to_n_after_recursive_call {
        public static void print1ton(int n){
       if (n==0) return;
       print1ton(n - 1);
       System.out.println(n);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
       print1ton(n);

    }
}
