package Recursion;

import java.util.Scanner;

public class Fibonacci_number {

    public static int Fibonacci(int n ){
        if(n==0 || n==1)  return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }
}

