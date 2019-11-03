class Leetcode53 {
    public int crossSum(int[] nums, int left, int right, int p) {
        if (left == right) return nums[left];

        int leftSubsum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = p; i > left - 1; --i) {
            currSum += nums[i];
            leftSubsum = Math.max(leftSubsum, currSum);
        }

        int rightSubsum = Integer.MIN_VALUE;
        currSum = 0;
        for (int i = p + 1; i < right + 1; ++i) {
            currSum += nums[i];
            rightSubsum = Math.max(rightSubsum, currSum);
        }

        return leftSubsum + rightSubsum;
    }

    public int helper(int[] nums, int left, int right) {
        if (left == right) return nums[left];

        int p = (left + right) / 2;

        int leftSum = helper(nums, left, p);
        int rightSum = helper(nums, p + 1, right);
        int crossSum = crossSum(nums, left, right, p);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

//    public int maxSubArray(int[] nums) {
//        return helper(nums, 0, nums.length - 1);
//    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];

        for (int i = 1; i < n; ++i) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int i = 0;
        System.out.println("" + --i);
//        char arr[][] =
//                {{'1','1','0','0','0'},
//                        {'1','1','0','0','0'},
//                        {'0','0','1','0','0'},
//                        {'0','0','0','1','1'}};

        int[] arr = {-1, 2, 8, 2, -1};

        Leetcode53 leetcode53 = new Leetcode53();
        System.out.println(leetcode53.maxSubArray(arr));
    }
}