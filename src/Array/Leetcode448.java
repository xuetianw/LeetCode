package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i + 1, 1);
        }

        for (int num : nums) {
            map.put(num, 2);
        }


        List<Integer> list = new ArrayList<>();

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                list.add(num);
            }
        }
        return list;
    }
}
