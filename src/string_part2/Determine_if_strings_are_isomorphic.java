package string_part2;

import java.util.*;
public class Determine_if_strings_are_isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        char[] a = new char[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;

            if (a[idx] == '\0') a[idx] = dh;
            else {
                if (a[idx] != dh) return false;
            }
        }

        char[] b = new char[128];
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int) ch;

            if (b[idx] == '\0') b[idx] = dh;
            else {
                if (b[idx] != dh) return false;
            }
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String s1 = "egg";
        String t1 = "add";

        String s2 = "foo";
        String t2 = "bar";

        System.out.println("Is 'egg' and 'add' isomorphic? " + isIsomorphic(s1, t1));
        System.out.println("Is 'foo' and 'bar' isomorphic? " + isIsomorphic(s2, t2));
    }
}
