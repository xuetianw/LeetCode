import java.util.HashMap;
import java.util.Map;

public class Leetcode325 {
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0, 0);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum += num;
            if (map.containsKey(sum - k)) {
                res = Math.max(i - map.get(sum - k), res);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }
        return res;
    }
    public static void main(String[] args) {
        Leetcode325 leetcode325 = new Leetcode325();
        leetcode325.maxSubArrayLen(new int[]{1,-1,5,-2,3}, 3);
    }
}
