package string_part2;
import java.util.*;

// Check whether the given string is palindrome or not.
public class Q_palindrome_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        StringBuilder s = new StringBuilder(sc.nextLine());


       String t = s.toString();
        palindrome(s,0,s.length());
        // Compare the original and reversed strings
        if (t.equals(s.toString())){
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }


    public static void palindrome(StringBuilder s , int i,int j){
         i = 0;
         j = s.length() - 1;

        // Reverse the string using two-pointer technique
        while (i < j) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}

