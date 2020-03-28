package String;

import java.util.HashMap;
import java.util.Map;

public class Leetcode387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr_char = s.charAt(i);
            map.put(curr_char, map.getOrDefault(curr_char, 0) + 1);
        }

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
