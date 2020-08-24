package Array;

import java.util.HashSet;
import java.util.Set;

public class Leetocde41 {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length + 1; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return nums.length;
    }
}
