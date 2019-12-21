import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        int end_row = matrix.length - 1;
        int start_row = 0;
        int end_width = matrix[0].length - 1;
        int start_width = 0;
        while (start_row <= end_row && start_width <= end_width) {
            for(int i = start_width; i <= end_width; i++) {
                list.add(matrix[start_row][i]);
            }
            start_row++;

            if (start_row <= end_row && start_width <= end_width) {
                for(int i = start_row; i <= end_row; i++) {
                    list.add(matrix[i][end_width]);
                }
                end_width--;
            }

            if (start_row <= end_row && start_width <= end_width) {
                for(int i = end_width; i >= start_width; i--) {
                    list.add(matrix[end_row][i]);
                }
                end_row--;
            }
            if (start_row <= end_row && start_width <= end_width) {
                for(int i = end_row; i >= start_row; i--) {
                    list.add(matrix[i][start_width]);
                }
                start_width++;
            }
        }
        // list.add(matrix[finish_height][start_width]);

        return list;
    }

    public static void main(String[] args) {
        Leetcode54 leetcode54 = new Leetcode54();
        System.out.println(leetcode54.spiralOrder(
                new int[][]
                        {
                                {1,2,3,4},
                                {5,6,7,8},
                                {9,10,11,12}
                        }));
    }
}
