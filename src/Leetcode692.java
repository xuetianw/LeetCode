import java.util.*;

public class Leetcode692 {
    public List<String> topKFrequent(String[] words, int k) {
        int[] arr = new int ['z' - 'a'];

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int max_count = 0;
        for (int count : map.values()) {
            max_count = Math.max(max_count, count);
        }

        List<String> list = new ArrayList<>();
        while (k > 0) {
            List<String> temp_list = new ArrayList<>();
            for (String word : map.keySet()) {
                if (map.get(word) == max_count) {
                    temp_list.add(word);
                    k--;
                }
                if (k == 0) {
                    break;
                }
            }
            Collections.sort(temp_list, (str1, str2)-> str1.toLowerCase().compareTo(str2.toLowerCase()));
            for (String str : temp_list) list.add(str);
            max_count--;
        }
        return list;
    }

    public static void main(String[] args) {
        Leetcode692 leetcode692 = new Leetcode692();
        leetcode692.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 1);
    }
}
