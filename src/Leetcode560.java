import java.util.HashMap;

public class Leetcode560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Leetcode560 leetcode560 = new Leetcode560();
        leetcode560.subarraySum(new int[]{3,2,3,2,3,2,3,2,3,2,3,2,3,2,3,2,2}, 8);
    }
}
