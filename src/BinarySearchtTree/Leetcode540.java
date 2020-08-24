package BinarySearchtTree;

public class Leetcode540 {
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

//    public int singleNonDuplicate(int[] nums) {
//
//    }
}
