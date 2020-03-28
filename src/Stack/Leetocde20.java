package Stack;

import java.util.Stack;

public class Leetocde20 {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : arr) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (stack.size() == 0) return false;
            char pre_char = stack.pop();
            if (!((ch == ')' && pre_char == '(')
                    || (ch == ']' && pre_char == '[')
                    || (ch == '}' && pre_char == '{')))
                return false;
        }
        return (stack.size() == 0) ? true : false;
    }
}
