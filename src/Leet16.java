public class Leet16 {
    public int threeSumClosest(int[] nums, int target) {
        int result = Math.abs(nums[0] + nums[1] + nums[2] - target);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    result = Math.min(Math.abs(sum - target), result);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}