import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode784 {
    List<String> list = new ArrayList<>();
    private void dfs(char[] chars, int i) {
        if (chars.length == i) {
            list.add(new String(chars));
        } else {
            char ch = chars[i];
            if ('a' <= ch && ch <= 'z') {
                dfs(chars, i + 1);
                chars[i] -= 'a' - 'A';
                dfs(chars, i + 1);
            } else if ('A' <= ch && ch <= 'Z') {
                dfs(chars, i + 1);
                chars[i] += 'a' - 'A';
                dfs(chars, i + 1);
            } else {
                dfs(chars, i + 1);
            }
        }
    }

    public List<String> letterCasePermutation(String S) {
        dfs(S.toCharArray(), 0);
        return list;

    }


    public static void main(String[] args) {
        Leetcode784 leetcode784 = new Leetcode784();
        System.out.println(leetcode784.letterCasePermutation("a1b2").toString());
    }
}
