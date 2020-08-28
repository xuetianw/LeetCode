package Stack;

import java.util.*;

public class Leetcode1249 {
//    public String minRemoveToMakeValid(String s) {
//        Set<Integer> indexesToRemove = new HashSet<>();
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                stack.push(i);
//            } if (s.charAt(i) == ')') {
//                if (stack.isEmpty()) {
//                    indexesToRemove.add(i);
//                } else {
//                    stack.pop();
//                }
//            }
//        }
//        // Put any indexes remaining on stack into the set.
//        while (!stack.isEmpty()) indexesToRemove.add(stack.pop());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (!indexesToRemove.contains(i)) {
//                sb.append(s.charAt(i));
//            }
//        }
//        return sb.toString();
//    }

    public String minRemoveToMakeValid(String s) {
        Stack<Integer> indexStack = new Stack<>();
        List<Integer> indexList = new ArrayList<>();

        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == '(') {
                indexStack.push(i);
            } else if (arr[i] == ')') {
                if (indexStack.size() == 0) {
                    indexList.add(i);
                } else {
                    indexStack.pop();
                }
            }
        }


        Set<Integer> set = new HashSet<>(indexStack);
        set.addAll(indexList);

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                res.append(s.charAt(i));
            }
        }
        return new String(res);
    }

    public static void main(String[] args) {
        Leetcode1249 leetcode1249 = new Leetcode1249();
        leetcode1249.minRemoveToMakeValid("lee(t(c)o)de)");
    }
}
