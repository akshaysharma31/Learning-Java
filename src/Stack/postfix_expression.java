package Stack;

import java.util.Stack;

public class postfix_expression {


    public static void main(String[] args) {
        String st = "9-(5+3)*4/6";
        // 953+4*6/-
        Stack<String>  val = new Stack<>();
        Stack<Character>  op = new Stack<>();
        for(int i = 0 ; i<st.length() ; i++) {
            char ch = st.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                String t = "" + ch;
                val.push(t);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);

            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String s =  v1 + v2 + o;
                    val.push(s);

                }
                op.pop();
            } else {


                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String s = v1 + v2 + o;
                    val.push(s);
                    // push
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String s = v1 + v2 + o;
                        val.push(s);
                        // push
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size() > 1){
            // work
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String s =  v1 + v2 + o;
            val.push(s);

        }
        String  ans = val.pop();
        System.out.println(ans);
    }

}
