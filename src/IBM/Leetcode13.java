package IBM;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode13 {



    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        Set<String> set = new HashSet<>();

        set.add("IV");
        set.add("IX");
        set.add("XL");
        set.add("XC");
        set.add("CD");
        set.add("CM");


        int total = 0;
        int i = 0;
        while (i < s.length()) {

            // if the last one is 2 letters
            if (i == s.length() - 2){
                if (set.contains(s.substring(i, s.length()))) {
                    total += (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
                    i += 2;
                } else {
                    total += map.get(s.charAt(i));
                    i++;
                    total += map.get(s.charAt(i));
                    i++;
                }
            } else if (i == s.length() - 1) {
                total += map.get(s.charAt(i));
                i++;
            } else {
                if (set.contains(s.substring(i, i + 2))) {
                    total += (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
                    i += 2;
                } else {
                    total += map.get(s.charAt(i));
                    i++;
                }
            }


        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(new Leetcode13().romanToInt("MDCXCV"));
    }
}
