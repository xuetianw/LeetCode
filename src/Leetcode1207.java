import java.util.*;

public class Leetcode1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int count : map.values()) {
            if (set.contains(count)) {
                return false;
            } else {
                set.add(count);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Leetcode1207 leetcode1207 = new Leetcode1207();
        leetcode1207.uniqueOccurrences(new int [] {1,2,2,1,1,3});
    }
}
