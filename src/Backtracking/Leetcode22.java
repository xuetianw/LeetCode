package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {
    private List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helperRec(n, 0, 0, "");
        return list;
    }

    void helperRec(int target_left, int left, int right, String res) {
        if (res.length() ==  target_left * 2) {
            list.add(res);
            return;
        };
        if (left < target_left) {
            helperRec(target_left, left + 1, right, res + "(");
        }
        if (left > right) {
            helperRec(target_left, left, right + 1, res + ")");
        }
    }


    public static void main(String[] args) {
        Leetcode22 leetcode22 = new Leetcode22();
        System.out.println(leetcode22.generateParenthesis(5));
    }
}
