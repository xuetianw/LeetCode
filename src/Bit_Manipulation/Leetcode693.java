package Bit_Manipulation;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode693 {

    private int bit_one_num(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }


    public int[] sortByBits(int[] arr) {
        Integer[] copy_arr = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++) {
            copy_arr[i] = arr[i];
        }
        Arrays.sort(copy_arr, (t1, t2) -> {
            int count1 = bit_one_num(t1);
            int count2 = bit_one_num(t2);
            if (count1 == count2) {
                return t1 - t2;
            }
            return count1 - count2;
        });

        for(int i = 0; i < arr.length; i++) {
            arr[i] = copy_arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
