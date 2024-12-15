package Recursion;

public class Generate_all_string_without_Consecutive_1s {

    public static void printstring(String s ,int n){
        int m = s.length();

        if(m==n){
            System.out.println(s);
            return;
        }
         if(m==0 || s.charAt(m-1) == '0'){
             printstring(s+0,n);
             printstring(s+1,n);
         }
         else printstring(s+0,n);
    }
    public static void main(String[] args) {
       printstring("" , 3);
    }
}

