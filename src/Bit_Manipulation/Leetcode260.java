package Bit_Manipulation;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Leetcode260 {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for(int num : map.keySet()) {
            if (map.get(num) == 1) {
                res[count++] = num;
            }
        }

        return res;
    }
    public static void main(String[] args) {

    }
}
