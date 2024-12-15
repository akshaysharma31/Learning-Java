package Recursion;

import java.util.Scanner;

public class Calculate_power_a_b_and_logarithmic_power {

//     public static int  power(int n , int a ){
//
//         if (a==0) return 1;
//
//
//         return n *  power(n , a-1);
//    }

    public static int  power(int n , int a ){

        if (a==0) return 1;

        int ans = power(n,a/2);

        if (a%2==0) return ans * ans;
        else return  ans * ans * n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.print("Enter Power : ");
        int a = sc.nextInt();
        System.out.println(power(n,a));

    }
}
