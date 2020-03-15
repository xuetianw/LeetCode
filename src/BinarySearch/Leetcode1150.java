package BinarySearch;

public class Leetcode1150 {
    public boolean isMajorityElement(int[] nums, int target) {
        int size = nums.length;
        int left = 0;
        int right = size -1;
        int mid_copy = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                mid_copy = mid;
                break;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else  {
                right = mid - 1;
            }
        }

        if (mid_copy == -1) {
            return false;
        }

        left = right = mid_copy;
        while (left >= 0 && nums[left] == target ) {
            left--;
        }
        left++;

        while (right < size && nums[right] == target ) {
            right++;
        }
        right--;

        int total_count = right - left + 1;
        return total_count > nums.length / 2;
    }
    public static void main(String[] args) {
        Leetcode1150 leetcode1150 = new Leetcode1150();
        leetcode1150.isMajorityElement(new int[]{2,4,5,5,5,5,5,6,6}
        ,5);
    }
}
