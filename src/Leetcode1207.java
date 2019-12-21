import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0));
        }
        List<Integer> occur_list = (List<Integer>) map.values();
        Collections.sort(occur_list);
        for (int i = 0; i < occur_list.size() - 1; i++) {
            if (occur_list.get(i).equals(occur_list.get(i + 1))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Leetcode1207 leetcode1207 = new Leetcode1207();
        leetcode1207.uniqueOccurrences(new int [] {1,2,2,1,1,3});
    }
}
