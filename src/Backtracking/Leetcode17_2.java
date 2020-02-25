package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17_2 {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<String>();

        String[] d = new String[]{" ",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"};
        List<String> ans = new ArrayList<>();
        ans.add("");
        for (char digit : digits.toCharArray()) {
            List<String> tmp = new ArrayList<>();
            for (String t : ans) {
                String s = d[digit - '0'];
                for (char ch : s.toCharArray()) {
                    tmp.add(t + ch);
                }
            }
            ans = tmp;
        }

        return ans;
    }
    public static void main(String[] args) {
        Leetcode17_2 leetcode17_2= new Leetcode17_2();
//        System.out.println(leetcode17_2.letterCombinations(""));
        System.out.println(leetcode17_2.letterCombinations("23"));
        System.out.println(leetcode17_2.letterCombinations("23"));
    }
}
