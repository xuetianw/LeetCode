package Array;

import java.util.HashMap;
import java.util.Map;

public class Leetcode260 {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[2];
        int count = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                res[count++] = num;
            }
        }
        return res;
    }
}
