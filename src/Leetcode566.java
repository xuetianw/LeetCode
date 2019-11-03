import java.util.ArrayList;
import java.util.List;

public class Leetcode566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int MULTIPLICATION = nums.length * nums[0].length;
        if (r < 0 || c < 0 || r * c != MULTIPLICATION) {
            return nums;
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    list.add(nums[i][j]);
                }
            }

            int[][] result = new int[r][c]; {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        result [i][j] = list.get(i * c + j);
                    }
                }
                return result;
            }
        }
    }


    public static void main(String[] args) {

    }

}
