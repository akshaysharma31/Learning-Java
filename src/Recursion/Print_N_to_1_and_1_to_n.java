package Recursion;

import java.util.Scanner;

public class Print_N_to_1_and_1_to_n {


    // Print n to 1 code
//    public static void printnto1(int n){
//       if (n==0) return;
//       System.out.println(n);
//       print1ton(n - 1);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number : ");
//        int n = sc.nextInt();
//       printnto1(n);
//
//    }




    // Print 1 to n code

    public static void print1ton(int x , int n){
        if (x>n) return;
        System.out.println(x);
        print1ton(x+1 , n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        print1ton(1,n);

    }
}
