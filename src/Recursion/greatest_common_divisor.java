package Recursion;

import java.util.*;
public class greatest_common_divisor {
    public static int gcd(int a, int b) {
        if (b % a == 0) return a;
       return  gcd(b % a, a);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
    }
}
