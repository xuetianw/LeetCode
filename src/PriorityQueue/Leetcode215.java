package PriorityQueue;

import java.util.PriorityQueue;

public class Leetcode215 {

//    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>((num1, num2) -> {return num1 - num2;} );
//        for (int num : nums) {
//            pq.add(num);
//        }
//
////        while (pq.size() > 5) pq.remove();
////        pq.remove();
//
//        return pq.poll();
//    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
    //https://www.geeksforgeeks.org/min-heap-in-java/
    /*
    Complexity Ajava6nalysis
        Time complexity : \mathcal{O}(N \log k)O(Nlogk).
        Space complexity : \mathcal{O}(k)O(k) to store the heap elements.
     */

    public static void main(String[] args) {
        Leetcode215 leetcode215 = new Leetcode215();
        System.out.println(leetcode215.findKthLargest(new int []{30,2,1,5,6,4,2,4,9,10}, 4));;

    }
}
