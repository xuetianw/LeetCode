import java.util.*;

public class Leetcode692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : words) {
            map.put(string, map.getOrDefault(string, 0) + 1 );
        }
        int max_count = 0;
        for (int num : map.values()) {
            max_count = Math.max(num, max_count);
        }


        List<String> res_list = new ArrayList<>();
        int max_count_copy = max_count;


        for (int i = max_count_copy; i >= 0; i--) {
            List<String> temp_list = new ArrayList<>();
            for (String str : map.keySet()) {
                if (map.get(str) == i) {
                    temp_list.add(str);
                }
            }
            Collections.sort(temp_list,
                    (str1, str2) -> (str1.compareTo(str2))
            );
            if (res_list.size() + temp_list.size() <= k) {
                for (String string : temp_list) {
                    res_list.add(string);
                }
            } else {
                int res_size_copy = res_list.size();
                for (int j = 0; j < k - res_size_copy; j++) {
                    res_list.add(temp_list.get(j));
                }
                break;
            }
        }

        return res_list;
    }

    public static void main(String[] args) {
        Leetcode692 leetcode692 = new Leetcode692();
        leetcode692.topKFrequent(new String[]{"a", "aa", "aaa"}, 2);
    }
}
