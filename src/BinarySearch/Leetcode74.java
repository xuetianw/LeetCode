package BinarySearch;

public class Leetcode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;

        int numOfCols = matrix[0].length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = matrix[mid / numOfCols][mid % numOfCols];
            if (val == target) {
                return true;
            } else if (val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode74 leetcode74 = new Leetcode74();
        leetcode74.searchMatrix(
                new int[][]{
                        {1},
                }
                , 2
        );
    }
}
