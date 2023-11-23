import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Leetcode2491 {
    public long dividePlayers(int[] skill) {
        int arrSum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < skill.length; i++) {
            arrSum  += skill[i];
            map.put(skill[i], map.getOrDefault(skill[i], 0) + 1);
        }

        if (arrSum % (skill.length / 2) != 0) {
            return -1;
        }

        int sum = arrSum/(skill.length / 2);


        ArrayList<Integer[]> arrayList = new ArrayList<>();
        // int[] res = new int[skill.length / 2];

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == -1) continue;

            int k = entry.getKey();
            // 2 ks in the array
            if (sum - k == k){
                int occ = map.get(k);
                if (occ % 2 != 0) {
                    return-1;
                } else {
                    Integer[] arr = {k, k};
                    for (int i = 0; i < occ / 2; i++) {
                        arrayList.add(arr);
                    }
                    map.put(k, - 1);
                }
            }

            // k and another value in map's another Key
            int v2 = sum - k;
            if (!map.containsKey(v2)) {
                return -1;
            }

            // occ for two vals needs to be the same
            if(!Objects.equals(map.get(k), map.get(v2))) {
                return -1;
            }


            for (int i = 0; i < map.get(k); i++) {
                arrayList.add(new Integer[]{k, v2});
            }
            map.put(k, -1);
            map.put(v2, -1);
        }

        long res = 0;
        for (Integer[] integers : arrayList) {
            res += integers[0] * integers[1];
        }


        return res;
    }

    public static void main(String[] args) {
        Leetcode2491 leetcode2491 = new Leetcode2491();
        leetcode2491.dividePlayers(new int[]{3, 4});
    }
}
