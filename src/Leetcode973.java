import java.util.Arrays;

public class Leetcode973 {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, (point1, point2) -> {
            return ((point1[0] * point1[0] + point1[1] * point1[1]) -
                    - (point2[0] * point2[0] +  point2[1] * point2[1]));
        });

        // while (points.length > k) points.remove();

        int[][] res = new int [K][2];
        for (int i = 0; i < K; i++) res[i] = points[i];
        return res;
    }


    public void test(int[] point) {
        point = new int[] {1};
    }

    public static void main(String[] args) {
        Leetcode973 leetcode973 = new Leetcode973();
//        leetcode973.kClosest(new int[][] {{1,3},{-2,2}}, 1);
        int[] arr = new int[]{1, 2, 3};
        leetcode973.test(arr);

        System.out.println(arr);
    }
}
