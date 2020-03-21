package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    public int expand(String s, int i) {
        Set<Character> hashset = new HashSet();
        while (i < s.length() && !hashset.contains(s.charAt(i))) {
            hashset.add(s.charAt(i));
            i++;
        }
        return hashset.size();
    }

    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i ++) {
            int temp_len = expand(s, i);
            // System.out.println(temp_len);

            if (temp_len > length) {
                length = temp_len;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        Leetcode3 leetcode3 = new Leetcode3();
        System.out.println(leetcode3.lengthOfLongestSubstring("abcabcbb"));
    }
}
