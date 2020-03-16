package BinarySearch;

public class Leetcode153 {
    private int find_rotate_index(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int pivot = left + (right - left) / 2;
            if (nums[pivot] > nums[right]) {
                left = pivot + 1;
            } else {
                right = pivot;
            }
        }
        return left;
    }
    public int findMin(int[] nums) {
        return nums[find_rotate_index(nums)];
    }
}
