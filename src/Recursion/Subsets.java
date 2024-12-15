package Recursion;

import java.util.ArrayList;

public class Subsets {

    static  ArrayList<String> arr = new ArrayList<>();
public static  void printsubset(int i ,String s , String ans ){

    if(i == s.length()){
        arr.add(ans);
        return;
    }
        char ch = s.charAt(i);
    printsubset(i+1,s,ans);
     ans += ch;

    printsubset(i+1,s,ans);

}

    public static void main(String[] args) {
       String s = "ab";
       printsubset(0,s,"");
        System.out.println(arr);
    }
}
