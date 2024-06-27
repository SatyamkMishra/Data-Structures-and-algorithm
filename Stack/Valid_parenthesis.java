import java.util.*;

class Valid_parenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if ((c == ')' && st.peek() == '(') || (c == ']' && st.peek() == '[') || (c == '}' && st.peek() == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }
}
