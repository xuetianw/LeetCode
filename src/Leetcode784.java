import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode784 {
    private List<String> res;

    public List<String> letterCasePermutation(String S) {
        res = new ArrayList<>();
        letterCasePermutationRec(S, 0, "");
        return res;
    }

    void letterCasePermutationRec(String S, int index, String s) {
        if (index == S.length()) {
            res.add(s);
            return;
        }

        char ch = S.charAt(index);

        if (ch >= 'a' && ch <= 'z') {
            letterCasePermutationRec(S, index + 1, s + ch);
            ch -= 'a' - 'A';
            letterCasePermutationRec(S, index + 1, s + ch);
        }
        else if (ch >= 'A' && ch <= 'Z') {
            letterCasePermutationRec(S, index + 1, s + ch);
            ch += 'a' - 'A';
            letterCasePermutationRec(S, index + 1, s + ch);
        }
        else {
            letterCasePermutationRec(S, index + 1, s + ch);
        }

    }


    public static void main(String[] args) {
        Leetcode784 leetcode784 = new Leetcode784();
        System.out.println(leetcode784.letterCasePermutation("a1b2").toString());
    }
}
