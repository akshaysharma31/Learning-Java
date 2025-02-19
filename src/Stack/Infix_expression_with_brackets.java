package Stack;

import java.util.Stack;

public class Infix_expression_with_brackets {
    public static void main(String[] args) {
        String st = "9-(5+3)*4/6";
        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0 ; i<st.length() ; i++){
            char ch = st.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57)  num.push(ascii-48);
            else if (op.size() == 0 || ch == '(' || op.peek() == '(')  op.push(ch);
            else if(ch == ')') {
                while(op.peek() != '('){
                    // work
                    int v2 = num.pop();
                    int v1 = num.pop();
                    if (op.peek() == '-') num.push(v1 - v2);
                    if (op.peek() == '+') num.push(v1 + v2);
                    if (op.peek() == '*') num.push(v1 * v2);
                    if (op.peek() == '/') num.push(v1 / v2);
                    op.pop();
                    // push

                }
                op.pop();

            }
            else {
                if(ch == '+' || ch =='-') {
                    // work
                    int v2 = num.pop();
                    int v1 = num.pop();
                    if (op.peek() == '-') num.push(v1 - v2);
                    if (op.peek() == '+') num.push(v1 + v2);
                    if (op.peek() == '*') num.push(v1 * v2);
                    if (op.peek() == '/') num.push(v1 / v2);
                    op.pop();
                    // push
                    op.push(ch);
                }
                if(ch == '*' || ch=='/' ){
                    if(op.peek() == '*' || op.peek() == '/') {
                        // work
                        int v2 = num.pop();
                        int  v1 = num.pop();
                        if(op.peek() == '*') num.push(v1*v2);
                        if(op.peek() == '/') num.push(v1/v2);
                        op.pop();
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);

                }
            }
        }
        while(num.size() > 1){
            int v2 = num.pop();
            int v1 = num.pop();
            if(op.peek() == '-') num.push(v1-v2);
            if(op.peek() == '+') num.push(v1+v2);
            if(op.peek() == '*') num.push(v1*v2);
            if(op.peek() == '/') num.push(v1/v2);
            op.pop();
        }

        System.out.println(num.peek());
    }
}
