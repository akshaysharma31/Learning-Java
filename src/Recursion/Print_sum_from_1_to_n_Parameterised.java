package Recursion;

import java.util.Scanner;

public class Print_sum_from_1_to_n_Parameterised {



    //  Parameterised -->
//    public static void  print1tonsum(int n , int s){
//
//        if (n==0) {
//
//            System.out.println(s);
//            return;
//        }
//        print1tonsum(n-1,s+n);
//
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number : ");
//        int n = sc.nextInt();
//        print1tonsum(n,0);
//
//    }



    // return type -->

    public static int   print1tonsum(int n){

        if (n==0 || n==1) return n;


       return n +  print1tonsum(n-1);


    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
            System.out.println(print1tonsum(n));

    }


}
