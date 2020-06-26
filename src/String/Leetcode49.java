package String;

import java.util.ArrayList;
import java.util.List;

public class Leetcode49 {
    boolean is_anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] base = new int['z' - 'a' + 1];
        for (int i = 0; i < str1.length(); i++) {
            base[str1.charAt(i) - 'a']++;
            base[str2.charAt(i) - 'a']--;
        }

        for (int el : base) {
            if (el != 0) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res_list = new ArrayList<>();
        for (String str : strs) {
            boolean is_in_list = false;
            for (List<String> list : res_list) {
                if (is_anagram(list.get(0), str)) {
                    list.add(str);
                    is_in_list = true;
                    break;
                }
            }
            if (!is_in_list) {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                res_list.add(temp);
            }

        }
        return res_list;
    }

    public static void main(String[] args) {
        Leetcode49 leetcode49 = new Leetcode49();
        leetcode49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
}
