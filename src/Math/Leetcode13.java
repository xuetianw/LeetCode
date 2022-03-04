package Math;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode13 {
    Map<Character, Integer> map = new HashMap<>();
    Set<String> set = new HashSet<>();

    public int romanToInt(String s) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        set.add("IV");
        set.add("IX");
        set.add("XL");
        set.add("XC");
        set.add("CD");
        set.add("CM");


        int total = 0;
        int i = 0;
        while (i < s.length() - 1) {
            String two = s.substring(i, i + 2);
            if (set.contains(two)) {
                total += (map.get(two.charAt(1)) - map.get(two.charAt(0)));
                i += 2;
            } else {
                total += map.get(s.charAt(i++));
            }
        }
        if (i == s.length() - 1) {
            total += map.get(s.charAt(i));
        }
        return total;
    }
}
