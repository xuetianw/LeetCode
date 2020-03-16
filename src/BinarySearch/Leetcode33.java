package BinarySearch;

public class Leetcode33 {
    private int find_rotate_index(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] < nums[right])
            return 0;

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
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) {
            return (nums[0] == target) ? 0 : -1;
        }
        int start_index = find_rotate_index(nums);

        //if the target is on the right side of the sorted array
        int left, right;
        if (target >= nums[start_index] && target <= nums[nums.length - 1]) {
            left = start_index;
            right = nums.length - 1;
        } else {
            left = 0;
            right = start_index - 1;
        }

        while (left <= right) {
            int middle = left + (right- left) / 2;
            // System.out.println("middle:" + middle);

            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
