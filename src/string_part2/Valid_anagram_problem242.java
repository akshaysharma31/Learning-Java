package string_part2;
import java.util.*;
public class Valid_anagram_problem242 {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Sample input for testing
        String s = "listen";
        String t = "silent";

        // Call the isAnagram method and print the result
        if (isAnagram(s, t)) {
            System.out.println(s + " and " + t + " are anagrams.");
        } else {
            System.out.println(s + " and " + t + " are not anagrams.");
        }
    }
}
