package BinarySearch;

public class Leetcode35 {
    private int binarySearch(int[] arr, int l, int r, int x) {
        while (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            } if (x < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;;
            }
        }
        return l;
    }
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        Leetcode35 leetcode35 = new Leetcode35();
        leetcode35.searchInsert(arr, 2);

    }
}
