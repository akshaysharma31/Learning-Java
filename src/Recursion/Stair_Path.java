package Recursion;

import java.util.Scanner;

public class Stair_Path {


    public static int Stair(int n ){
        if(n==1 || n==2)  return n;
        return Stair(n-1) + Stair(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.println(Stair(n));
    }


}
