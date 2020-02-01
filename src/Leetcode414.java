public class Leetcode414 {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        Integer first_max = nums[0];
        Integer sec_max = null;
        Integer third_max = null;

        for (int num : nums) {
            if (num == first_max
                    || (sec_max != null && num == sec_max)
                    || (third_max != null && num == third_max)) continue;

            if (num > first_max) {
                third_max = sec_max;
                sec_max = first_max;
                first_max = num;
            } else if (sec_max != null && num > sec_max) {
                third_max = sec_max;
                sec_max = num;
            } else if (sec_max == null) {
                sec_max = num;
            } else if (third_max != null && num > third_max) {
                third_max = num;
            } else if (third_max == null) {
                third_max = num;
            }
        }
        return third_max == null ? first_max : third_max;
    }
    public static void main(String[] args) {
        Leetcode414 leetcode414 = new Leetcode414();
        leetcode414.thirdMax(new int[] {2,2,3,1});
    }



}
