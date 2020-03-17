package BinarySearch;

public class Leetcode35 {
    private int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
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
        return binarySearch(nums, target);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        Leetcode35 leetcode35 = new Leetcode35();
        leetcode35.searchInsert(arr, 2);

    }
}
