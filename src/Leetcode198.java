public class Leetcode198 {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;

        if (nums.length == 1) return nums[0];

        int[] max_arr = new int[nums.length];
        max_arr[0] = nums[0];
        max_arr[1] = Math.max(nums[0], nums[1]);
        // max_arr[2] = Math.max(nums[0] + nums[2], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            max_arr[i] = Math.max(max_arr[i - 2] + nums[i], max_arr[i - 1]);
        }
        return max_arr[nums.length - 1];
    }
    public static void main(String[] args) {
        Leetcode198 leetcode198 = new Leetcode198();
        System.out.println(leetcode198.rob(new int[] {1,2,3,1}));
    }
}
