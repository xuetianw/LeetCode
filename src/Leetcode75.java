public class Leetcode75 {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        while (index <= right) {
            int current = nums[index];
            if (current == 2) {
                nums[index++] = nums[right];
                nums[right--] = 2;
            } else if (current == 0) {
                nums[index++] = nums[left];
                nums[left++] = 0;
            } else {
                index++;
            }
        }
    }
    public static void main(String[] args) {
        Leetcode75 leetcode75 = new Leetcode75();
        leetcode75.sortColors(new int[] {1,2,0});
    }
}
