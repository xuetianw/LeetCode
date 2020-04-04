package Array;

public class Leetcode283 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
    public static void main(String[] args) {
        Leetcode283 leetcode283 = new Leetcode283();
        leetcode283.moveZeroes(new int[] {});
    }
}
