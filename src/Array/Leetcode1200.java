package Array;

import java.util.*;

public class Leetcode1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 0 || arr.length == 1) {
            return new ArrayList<>();
        }
        int min_dif = Math.abs(arr[1] - arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            min_dif = Math.min(min_dif, Math.abs(arr[i] - arr[i + 1]));
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (min_dif == Math.abs(arr[i] - arr[i + 1])) {
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Leetcode1200 leetcode1200 = new Leetcode1200();
        leetcode1200.minimumAbsDifference(new int[] {-25,-51,-29,-23,57,-18});
    }
}
