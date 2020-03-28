package Math;

import java.util.HashSet;
import java.util.Set;

public class Leetcode202 {
    public boolean isHappy(int n) {
        int sum  = 0;
        Set<Integer> set = new HashSet<>();

        while (sum != 1) {
            if (set.contains(sum)) return false;
            else set.add(sum);

            sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }
}
