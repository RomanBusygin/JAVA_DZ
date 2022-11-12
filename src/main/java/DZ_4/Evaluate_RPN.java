package DZ_4;

import java.util.Stack;

public class Evaluate_RPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (Character.isDigit(token.charAt(token.length() - 1))) {
                st.push(Integer.valueOf(token));
            }
            else {
                switch (token) {
                    case "+" -> {
                        st.push(st.pop() + st.pop());
                    }
                    case "-" -> {
                        st.push(- st.pop() + st.pop());
                    }
                    case "*" -> {
                        st.push(st.pop() * st.pop());
                    }
                    case "/" -> {
                        int b = st.pop();
                        int a = st.pop();
                        st.push(a / b);
                    }
                }
            }
        }
        return st.pop();
    }
}
