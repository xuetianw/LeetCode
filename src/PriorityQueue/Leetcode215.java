package PriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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



//    class Comprator implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return 0;
//        }
//    }

//    public int findKthLargest(int[] nums, int k) {
////         Arrays.stream(nums).boxed().sorted(Collections.reverseOrder()).mapToInt(x -> x).forEach(x -> System.out.println(x));
////        return Arrays.stream(nums).limit(k).boxed().sorted(Collections.reverseOrder()).mapToInt(x -> x).toArray()[k - 1];
////        Arrays.sort(nums, Collections.reverseOrder());
////        return Arrays.stream(nums).limit(k).sorted().toArray()[k];
////        Arrays.stream(nums).boxed().sorted(Collections.reverseOrder()).limit(5).forEach(System.out::println);
////        return Arrays.stream(nums).boxed().sorted(Collections.reverseOrder()).limit(k).mapToInt(x -> x).toArray()[k - 1];
//        return Arrays.stream(nums).limit(k).boxed().sorted(Collections.reverseOrder()).mapToInt(x -> x).toArray()[k - 1];

//        return 1;
//    }

    public static void main(String[] args) {
        Leetcode215 leetcode215 = new Leetcode215();
//        System.out.println(leetcode215.findKthLargest(new int []{30,2,1,5,6,4,2,4,9,10}, 2));;
        System.out.println(leetcode215.findKthLargest(new int []{30,2,1,5,6,4,2,4,9,10}, 2));
    }
}
