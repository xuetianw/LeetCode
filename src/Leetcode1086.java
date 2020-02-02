import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Leetcode1086 {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> t_map = new TreeMap<>();
        for (int[] arr : items) {
            int student_num = arr[0];
            if (t_map.containsKey(student_num)) {
                PriorityQueue PQ = t_map.get(student_num);
                PQ.add(arr[1]);
                if (PQ.size() > 5) {
                    PQ.remove();
                }
                t_map.put(student_num, PQ);
            } else {
                PriorityQueue<Integer> PQ = new PriorityQueue<>();
                PQ.add(arr[1]);
                t_map.put(student_num, PQ);
            }
        }
        int[][] res = new int[t_map.size()][2];
        for (int key : t_map.keySet()) {
            res[key - 1][0] = key;
            PriorityQueue<Integer> PQ = t_map.get(key);
            int PQ_size = PQ.size();
            int sum = 0;
            while (PQ.size() != 0) {
                sum += PQ.remove();
            }

            int ave_score = sum / PQ_size;
            res[key - 1][1] = ave_score;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
