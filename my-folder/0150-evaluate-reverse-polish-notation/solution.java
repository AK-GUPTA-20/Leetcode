import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String ch : tokens) {
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                int b = st.pop(); 
                int a = st.pop();  
                int res = 0;

                switch (ch) {
                    case "+": res = a + b; break;
                    case "-": res = a - b; break;
                    case "*": res = a * b; break;
                    case "/": res = a / b; break;
                }
                st.push(res);
            } else {
                st.push(Integer.parseInt(ch));  
            }
        }
        return st.pop();
    }
}

