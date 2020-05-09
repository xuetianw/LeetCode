package Mock_interview;

import java.util.HashMap;
import java.util.Map;

public class UP {
    Map<Integer, Integer> map = new HashMap<>();
    public boolean isStrobogrammatic(String num) {
        map.put(6,9);
        map.put(9,6);
        map.put(8,8);
        map.put(1,1);
        map.put(0,0);
        for (int i = 0; i <= num.length() / 2; i++) {
            int expected_num;
            int number = num.charAt(i) - '0';
            if (!map.containsKey(number)) {
                return false;
            }
            expected_num = map.get(number);

            int actual_num = num.charAt(num.length() - 1 - i) - '0';
            if (!(expected_num == actual_num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UP up = new UP();
        up.isStrobogrammatic("101");
    }

}
