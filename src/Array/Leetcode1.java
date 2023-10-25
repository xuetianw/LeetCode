package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leetcode1 {
    Map<Integer, Integer> map = new HashMap<>();
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])) {
//                return new int[] {i ,map.get(target - nums[i])};
//            }
//            map.put(nums[i], i);
//        }
//        return null;
//    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i  < nums.length; i++) {
            int num = nums[i];
            if (hashMap.containsKey(target - num)) {
                return new int[]{hashMap.get(target - num), i};
            } else {
                hashMap.put(num, i);
            }
        }
        return null;
    }

    
    public static void main(String[] args) {


        final int k = 17;
        int []arr = {10, 15, 3, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr [j] == k) {
//                    System.out.println("found\n");
                    return;
                }
            }
        }

    }
}
