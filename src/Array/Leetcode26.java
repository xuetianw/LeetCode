package Array;

public class Leetcode26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int prev_index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[prev_index] != nums[i]) {
                prev_index++;
                nums[prev_index] = nums[i];
            }
        }
        return prev_index + 1;
    }
}
