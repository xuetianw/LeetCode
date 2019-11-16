import java.util.HashMap;
import java.util.Map;

public class Solution136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) map.put(nums[i], i);
            else map.put(num, -1);
        }

        for (int num : map.keySet()) {
            int val = map.get(num);
            if (val != -1) return nums[val];
        }
        return -1;
    }
}
