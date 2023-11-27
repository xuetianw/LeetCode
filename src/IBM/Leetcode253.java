package  IBM;

import Interface.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Leetcode253 {
    public int minMeetingRooms(int[][] intervals) {
//        PriorityQueue<Integer[]> pq = new PriorityQueue<>((int1, int2) -> int1[0] - int2[0]);
//        Arrays.stream(intervals).map(ints -> new Integer[]{ints[0], ints[1]}).collect(Collectors.toList());
//        for (int[] interval : intervals) {
//            pq.add(interval);
//        }
//        Arrays.stream(intervals).forEach(ints -> pq.add(new Integer[]{ints[0], ints[1]}));

//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        List<Integer> list = new ArrayList<>();
        int[] starts =  new int[intervals.length];
        int[] ends =  new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int si = 0;
        int ei = 0;

        int count = 0;

        int res = 0;
        while (si < intervals.length ) {
            if (starts[si] < ends[ei]) {
                si++;
                count++;
                res = Math.max(res, count);
            } else {
                count--;
                ei++;
            }
        }


        return count;

    }
}
