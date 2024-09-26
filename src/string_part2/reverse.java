package string_part2;
import java.util.*;
public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        int i = 0;
        int j = 0;
        int n = s.length()-1;
        while (j < n) {
            if (s.charAt(j) != ' ') {
                j++;
            } else {
                reverse(s, i, j - 1);
                i = j + 1;
                j = i;
            }

        }
        reverse(s, i, j - 1);
        System.out.println(s);

    }

    public static void reverse(StringBuilder s,int i , int j ){

        while(i<j){
            char temp = s.charAt(i);

            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;

        }
    }
}
