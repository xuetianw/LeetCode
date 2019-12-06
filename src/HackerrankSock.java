import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HackerrankSock {
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : ar) {
            if (!map.containsKey(num)) map.put(num, 1);
            else {map.put(num, map.get(num) + 1);}
        }

        int res = 0;
        for (Integer count : map.values()) {
            res += count / 2;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
