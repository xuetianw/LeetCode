package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetocde17 {
    Map<Character, String> map = new HashMap<>();
    static List<String> list;

    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if (digits.length() == 0) {
            return list;
        }
        letterCombinationsRec(digits, "", 0);
        return list;
    }

    void letterCombinationsRec(String digits, String cur, int index) {
        if (index == digits.length()) {
            list.add(cur);
            return;
        }

        char[] arr = map.get(digits.charAt(index)).toCharArray();
        for (char ch : arr) {
            letterCombinationsRec(digits, cur + ch, index + 1);
        }
    }

    void changeString(StringBuilder string) {
        string.append("sssssss");
        String as = "dsfsdf";
    }

    public static void main(String[] args) {
        Leetocde17 leetocde17= new Leetocde17();
        System.out.println(leetocde17.letterCombinations(""));
        System.out.println(leetocde17.letterCombinations("23"));
//        System.out.println(leetocde17.letterCombinations("23"));
        StringBuilder temp = new StringBuilder("asdf");
        leetocde17.changeString(temp);
        System.out.println(temp);
    }

}
