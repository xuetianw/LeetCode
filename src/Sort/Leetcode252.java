package Sort;

import java.util.Arrays;

public class Leetcode252 {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length == 0) return true;
        Arrays.sort(intervals, (arr1, arr2) ->
                {
                    if (arr1[0] != arr2[0]) {
                        return (Integer.compare(arr1[0], arr2[0]));
                    } else {
                        return (arr1[1] - arr2[1]);
                    }
                }
        );

        int prev_end_time = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int next_start_time = intervals[i][0];
            if (next_start_time < prev_end_time) return false;
            else {
                prev_end_time = intervals[i][1];
            }
        }
        return true;
    }
}
