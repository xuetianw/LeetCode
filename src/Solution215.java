import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution215 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }

//        while (pq.size() > 5) pq.remove();
        pq.remove();

        return pq.poll();
    }

    public static void main(String[] args) {
        Solution215 solution215 = new Solution215();
        solution215.findKthLargest(new int []{30,2,1,5,6,4,2,4,9,10}, 4);

    }
}
