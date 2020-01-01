import java.util.ArrayList;
import java.util.List;

public class Leetcode784 {
    List<String> list = new ArrayList<>();
    void dfs(String s, int i) {
        if (s.length() == i) {
            list.add(s);
        } else {
            char ch = s.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                ch -= 'a' - 'A';
                dfs(s.substring(0, i) + ch + s.substring(i + 1, s.length()), i + 1);
                dfs(s, i + 1);
            } else if ('A' <= ch && ch <= 'Z') {
                ch += 'A' - 'a';
                dfs(s.substring(0, i) + ch + s.substring(i + 1, s.length()), i + 1);
                dfs(s, i + 1);
            } else {
                dfs(s, i + 1);
            }
        }
    }

    public List<String> letterCasePermutation(String S) {
        dfs(S, 0);
        return list;

    }

//    public void test(StringBuilder string) {
//        string.append("aaaa") ;
//    }

    public static void main(String[] args) {
        Leetcode784 leetcode784 = new Leetcode784();
//        StringBuilder a = new StringBuilder("bbb");
//        leetcode784.test(a);
//        System.out.println(a);
        System.out.println(leetcode784.letterCasePermutation("C").toString());
    }
}
