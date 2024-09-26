package strings;

import java.util.*;
public class plus_Operator {
    public static void main(String[] args) {
       String s = "abc";
       String t = "xyz";
        s = s+t;// abcxyz
        s = 10 + s;//   10abcxyz
        System.out.println(s);
        System.out.println("abc"+10+20);//  abc1020
        System.out.println(10+20+"abc"); // 30abc
    }
}