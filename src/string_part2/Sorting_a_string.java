package string_part2;
import java.util.*;
public class Sorting_a_string {
    public static void main(String[] args) {
        // we connot short String directly
        // we short string with the help of char[] arr

        String s = "gfedcba";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        System.out.println();




        // in StringBuilder
        StringBuilder sb = new StringBuilder("gfedcba");
        char[] c = sb.toString().toCharArray();
        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }

    }
}
