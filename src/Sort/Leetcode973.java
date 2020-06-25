package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode973 {
//
//    this is the first way
//

//    public int[][] kClosest(int[][] points, int K) {
//        Arrays.sort(points, getComparator());
//
//        // while (points.length > k) points.remove();
//
//        int[][] res = new int [K][2];
//        for (int i = 0; i < K; i++) res[i] = points[i];
//        return res;
//    }



    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((point1, point2) ->
                (point2[0] * point2[0] + point2[1] * point2[1]) - (point1[0] * point1[0] + point1[1] * point1[1]));

        for (int[] point : points) {
            pq.add(point);
            if (pq.size() > K) {
                pq.poll();
            }
        }

        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            res[i] = pq.poll();
        }

        return res;
    }

    public void test(int[] point) {
        point = new int[] {1};
    }

    public static void main(String[] args) {
        Leetcode973 leetcode973 = new Leetcode973();
        leetcode973.kClosest(new int[][] {{3,3}, {5, -1}, {-2,4}}, 2);

    }
}
