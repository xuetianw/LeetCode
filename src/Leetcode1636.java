import java.util.*;
import java.util.stream.IntStream;

public class Leetcode1636 {

    TreeMap<Integer, Integer> funcSort(HashMap<Integer, Integer> map) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>((i1, i2) -> {
            int fq1 = map.get(i1);
            int fq2 = map.get(i2);
            if (fq1 == fq2) {
                return -Integer.compare(i1, i2);
            }
            return Integer.compare(fq1, fq2);
        });
        treeMap.putAll(map);
        return treeMap;
    }

    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.stream(nums).forEach(x -> hashMap.put(x, hashMap.getOrDefault(x, 0) + 1));
        TreeMap<Integer, Integer> treeMap =  funcSort(hashMap);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            int num = entry.getKey();
            int freqcy = entry.getValue();


            IntStream.range(0, freqcy).forEach(x -> arrayList.add(num));
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Leetcode1636 leetcode1636 = new Leetcode1636();
        leetcode1636.frequencySort(new int[]{1,1,2,2,2,3});
    }
}
