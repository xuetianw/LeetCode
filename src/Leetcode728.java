import java.util.ArrayList;
import java.util.List;

public class Leetcode728 {
    boolean check_self_dividing(int num) {
        int num_copy = num;
        while (num != 0) {
            int digit = (num % 10);
            if (digit == 0) return false;

            if (num_copy % digit != 0) {
                return false;
            }
            num = (num / 10);
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check_self_dividing(i)) {
                list.add(i);
            }
        }
        return list;
    }

}
