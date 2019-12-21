import java.util.ArrayList;
import java.util.List;

public class Leetcode49 {

    boolean is_anagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char base = 'a';
        int[] arr = new int['z' - base];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - base]++;
            arr[str2.charAt(i) - base]--;
        }

        for (int el : arr) {
            if (el != 0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ana_list = new ArrayList<>();
        for (String str : strs) {
            if (ana_list.size() == 0) {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                ana_list.add(temp);
                continue;
            }

            boolean is_inlist = false;
            for (List<String> list : ana_list) {
                if (is_anagram(list.get(0), str)) {
                    list.add(str);
                    is_inlist = true;
                }
            }
            if (!is_inlist) {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                ana_list.add(temp);
            }

        }
        return ana_list;
    }

    public static void main(String[] args) {
        Leetcode49 leetcode49 = new Leetcode49();
        leetcode49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
}
