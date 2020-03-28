package BinarySearch;

public class Leetcode1351 {
    int get_zero_index(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == 0) {
                return mid;
            } if (arr[mid] < 0) {
                r = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
    private int binarySearch(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == 0) {
                return mid;
            } if (0 < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;;
            }
        }
        return l;
    }

    public int countNegatives(int[][] grid) {
        int count = 0;
        int num_of_column = grid[0].length;
        for (int[] ints : grid) {
            //[-2, -2, 0]
            count += num_of_column - binarySearch(ints);
        }
        return count;
    }
    public static void main(String[] args) {
        Leetcode1351 leetcode1351 = new Leetcode1351();
        leetcode1351.get_zero_index(new int[]{3, 2, 1, -1});
    }
}
