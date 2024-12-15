package Recursion;


import java.util.*;

public class Factorial {

    public static int fact(int n){
        if(n==1 || n==0) return 1;
        int ans = n * fact(n -1 );

        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextByte();
        System.out.println(fact(n));
    }
}

// Eg --> n = 4;

//public static int fact(int 4){  return 24
//    if(n==1) return 1;
//    int ans = 4 * fact(3);
//
//    return  ans;
//}


//public static int fact(int 3){  return 6
//    if(n==1) return 1;
//    int ans = 3 * fact(2);
//
//    return  ans;
//}

//public static int fact(int 2){   return 2;
//    if(n==1) return 1;
//    int ans = 2 * fact(1);
//
//    return  ans;
//}


//public static int fact(int n){   return 1;
//    if(n==1) return 1;
//    int ans = n * fact(n -1 );
//
//    return ans  ;
//}