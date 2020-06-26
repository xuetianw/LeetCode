package Bit_Manipulation;

public class Leetcode338 {
    private int calculate_bit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 2;
        }
        return count;
    }

    public int[] countBits(int num) {
        int[] res_arr = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res_arr[i] = calculate_bit(i);
        }
        return res_arr;
    }
}
