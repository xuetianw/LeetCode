package Array;

public class Leetcode1295 {
    boolean isEvenDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (isEvenDigits(num)) {
                res++;
            }
        }
        return res;
    }
}
