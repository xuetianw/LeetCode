import java.util.*;
import java.util.stream.IntStream;

public class Leetcode347 {


    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1));

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());

        priorityQueue.addAll(map.entrySet());
//        map.forEach((x, y) -> priorityQueue.add(new AbstractMap.SimpleEntry<>(x, y)));

//        int[] arr = priorityQueue.stream().mapToInt(i -> i.getKey()).limit(k).toArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        IntStream.range(0, k).forEach(x -> arrayList.add(priorityQueue.poll().getKey()));

        return arrayList.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        Leetcode347 leetcode347 = new Leetcode347();
        leetcode347.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);
    }
}
