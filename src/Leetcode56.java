import java.util.*;

public class Leetcode56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return null;

        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                if (t1[0] != t2[0]) {
                    return Integer.compare(t1[0], t2[0]);
                } else {
                    return Integer.compare(t1[1], t2[1]);
                }
            }
        };


        /*
           Arrays.sort(intervals, (t1, t2) ->
                Integer.compare(t1[0], t2[0]));
            the same way of sorting
         */



        Arrays.sort(intervals, comparator);

        List<int[]> list = new LinkedList<>();

        int[] cur = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < cur[1]) {
                cur[1] = Math.max(intervals[i][1], cur[1]);
            } else {
                list.add(cur);
                cur = intervals[i];
            }
        }
        list.add(cur);

        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        Leetcode56 leetcode56 = new Leetcode56();
        int[][] arr  = new int[][]
                {{2,6}
                ,{1,3}
                ,{8,10}
                ,{15,18}};

        arr = leetcode56.merge(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }



//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        int[] arr2 = {1,2,3};
//        System.out.println(list);
//        System.out.println(arr2);
    }

}
