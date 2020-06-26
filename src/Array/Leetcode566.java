package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || nums[0].length == 0){
            return new int[][]{};
        }
        List<Integer> list = new ArrayList<>();
        for (int[] arr : nums) {
            for (int num : arr) {
                list.add(num);
            }
        }

        int[][] res_arr = new int[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res_arr[i][j] = list.get(count++);
            }
        }
        return res_arr;
    }

    public static void main(String[] args) {
        Leetcode566 leetcode566 = new Leetcode566();
        leetcode566.matrixReshape(new int[][] {
                                {1,2},
                                {3,4}
                                },
                2, 4);
    }


}
