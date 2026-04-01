import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = st.pop();  // second operand
                int a = st.pop();  // first operand

                int result = apply(a, b, token);
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.peek();
    }

    public boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || 
               s.equals("*") || s.equals("/");
    }

    public int apply(int a, int b, String op) {
        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        if (op.equals("*")) return a * b;
        return a / b; // division
    }
}