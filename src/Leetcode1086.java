import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Leetcode1086 {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> t_map = new TreeMap<>();
        for (int[] arr : items) {
            if (!t_map.containsKey(arr[0])) {
                PriorityQueue<Integer> pq= new PriorityQueue<>();
                pq.add(arr[1]);
                t_map.put(arr[0], pq);
            } else {
                PriorityQueue<Integer> pq = t_map.get(arr[0]);
                pq.add(arr[1]);
                if (pq.size() > 5) pq.remove();
            }
        }
        int[][] arr = new int[t_map.size()][2];
        for (int key : t_map.keySet()) {
            arr[key - 1] [0] = key;
            PriorityQueue<Integer> pq = t_map.get(key);
            int sum = 0;
            while (pq.size() != 0) {
                sum += pq.remove();
            }
            arr[key - 1] [1] = sum / 5;
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
