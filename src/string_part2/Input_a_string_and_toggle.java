package string_part2;
import java.util.*;
public class Input_a_string_and_toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){ // capital
                ascii +=32;
                ch = (char)ascii;
                s.setCharAt(i,ch);
            }
            else if(ascii>=97 && ascii<=122){ // small
                ascii -=32;
                ch = (char)ascii;
                s.setCharAt(i,ch);
            }


        }
        System.out.println(s);
    }
}
