package string_part2;
import java.util.*;
public class string_of_even_length_and_reverse_the_second_half_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a string of even length : ");
        StringBuilder sb =  new StringBuilder(sc.nextLine());
        if (sb.length() % 2 != 0) {
            System.out.println("The input string is not of even length.");
            return;
        }
        reverse(sb);
        System.out.println(sb);

    }
    public static void reverse (StringBuilder s){
         int i =s.length()/2;
         int j  = s.length()-1;

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
