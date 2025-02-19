package Stack;

import java.util.Stack;

public class Postfix_to_Prefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        // Expected Output: -9/*+5346
        Stack<String> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ch + "");
            } else {
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                String t = op + v2 + v1;
                val.push(t);
            }
        }
        System.out.print(val.pop());
    }
}

