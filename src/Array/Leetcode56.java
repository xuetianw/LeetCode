package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][0];

        Arrays.sort(intervals, (t1, t2) ->
                t1[0] - t2[0]);
        List<int[]> list = new ArrayList<>();

        int[] cur = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= cur[1]) {
                cur[1] = Math.max(intervals[i][1], cur[1]);
            } else {
                list.add(cur);
                cur = intervals[i];
            }
        }
        list.add(cur);

        return list.toArray(new int[list.size()][2]);
    }
}
