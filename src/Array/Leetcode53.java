package Array;

class Leetcode53 {
    public int maxSubArray(int[] nums) {
        int max_num = nums[0];
        int temp_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp_sum <= 0) temp_sum = 0;
            temp_sum += nums[i];
            max_num = Math.max(temp_sum, max_num);
        }
        return max_num;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 8, 2, -1};

        Leetcode53 leetcode53 = new Leetcode53();
        System.out.println(leetcode53.maxSubArray(arr));
    }
}