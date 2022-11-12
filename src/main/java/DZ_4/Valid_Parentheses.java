package DZ_4;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else if (st.isEmpty()) {
                return false;
            } else if ((s.charAt(i) == ')' && st.peek() == '(') ||
                      (s.charAt(i) == ']' && st.peek() == '[') ||
                      (s.charAt(i) == '}' && st.peek() == '{')) {
                st.pop();
            } else return false;
        }
        return st.isEmpty();
    }
}
