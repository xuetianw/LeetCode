package Math;

public class Leetcode287 {
    public int findDuplicate(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(num, max);
        }

        int total = ((1 + max) * (nums.length - 1)) / 2;
        int total2 = 0;
        for (int num : nums) {
            total2 += num;
        }
        return total2 - total;
    }
    public static void main(String[] args) {
        Leetcode287 leetcode287 = new Leetcode287();
        leetcode287.findDuplicate(new int[]{1,3,4,2,2});
    }
}
