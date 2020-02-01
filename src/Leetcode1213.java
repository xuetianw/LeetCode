import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Leetcode1213 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr3) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : map.keySet()) {
            if (map.get(num) == 3) {
                list.add(num);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Leetcode1213 leetcode1213 = new Leetcode1213();
//        leetcode1213.arraysIntersection();
    }
}
