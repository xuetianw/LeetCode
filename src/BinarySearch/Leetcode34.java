package BinarySearch;

public class Leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == nums[middle]) {
                index = middle;
                break;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (index == -1) {
            return new int[] {-1, -1};
        }
        int left_index = index;
        int right_index = index;
        while (left_index >= 0 && nums[left_index] == target) left_index--;
        left_index++;

        while (right_index <= nums.length - 1 && nums[right_index] == target) right_index++;
        right_index--;

        return new int[] {left_index, right_index};
    }
}
