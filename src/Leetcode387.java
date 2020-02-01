import java.util.HashMap;
import java.util.Map;

public class Leetcode387 {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr_char = s.charAt(i);
            if (!map.containsKey(curr_char)) {
                map.put(curr_char, i);
            } else {
                map.put(curr_char, -1);
            }
        }

        int min = Integer.MIN_VALUE;
        boolean loop_triggered = false;
        for (char a : map.keySet()) {
            if (map.get(a) != -1) {
                loop_triggered = true;
                min = Math.min(min, map.get(a));
            }
        }
        return loop_triggered?  min: -1;
//        if (loop_triggered) {
//            return min;
//        } else return -1;

    }

    public static void main(String[] args) {

    }
}
//"leetcode"
//[0,1,-1,3]