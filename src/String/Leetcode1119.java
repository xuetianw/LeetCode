package String;

import java.util.HashSet;
import java.util.Set;

public class Leetcode1119 {
    Set<Character> set = new HashSet<>();
    public String removeVowels(String S) {
        String vowels = "aeiou";
        for (char ch : vowels.toCharArray()) {
            set.add(ch);
        }

        String res = "";

        for (char ch : S.toCharArray()) {
            if (!set.contains(ch)) {
                res += ch;
            }
        }
        return res;
    }
}
