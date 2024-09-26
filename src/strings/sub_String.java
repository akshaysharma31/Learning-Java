package strings;

import java.util.*;
public class sub_String {

    public static void main(String[] args) {
    String s = ""; // Empty String
        System.out.println(s.length());
                   // 12345
                   // ^^^^^
        String str = "abcde";
//        System.out.println(str.substring(1));
//        System.out.println(str.substring(0,3)); // this gets part of string from i to j-1

        for(int i = 0;i<=str.length();i++){
            for(int j = i+1;j<=str.length();j++) {
                System.out.print(str.substring(i, j) + " ");

            }
            System.out.println();
        }


    }
}
// substring
//a ab abc abcd abcde
//b bc bcd bcde
//c cd cde
//d de
//e