package Array;

import java.util.*;

public class Leetcode1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr2) {
            map.put(num, 0);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : arr1) {
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                queue.add(num);
            }
        }

        int loc = 0;
        int[] res_arr = new int[arr1.length];
        for (int num : arr2) {
            int num_occ = map.get(num);
            for (int i = 0; i < num_occ; i++) {
                res_arr[loc++] = num;
            }
        }

        while (queue.size() != 0) {
            res_arr[loc++] = queue.remove();
        }
        return res_arr;
    }
    public static void main(String[] args) {
        Leetcode1122 leetcode1122 = new Leetcode1122();
        leetcode1122.relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19},  new int[] {2,1,4,3,9,6});
    }
}
