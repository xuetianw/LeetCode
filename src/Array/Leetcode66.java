package Array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            int digit = sum % 10;
            list.add(digit);
            carry = sum / 10;
        }
        if (carry == 1) list.add(1);
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(arr.length - 1 - i);
        }
        return arr;
    }

    public static void main (String[] args) {
        Leetcode66 leetcode66 = new Leetcode66();
        leetcode66.plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
    }
}
