package Array;

public class Leetcode1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            res[i] = nums[index[i]];
        }
        return res;
    }
}
