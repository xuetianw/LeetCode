package Alba;

import java.util.*;

public class Leetcode11111 {

    Set<Integer> set = new HashSet<>();
    int getdifferentNumber(int[] arr) {
        int res = arr.length + 1;
        for (int num : arr) {
            set.add(num);
        }
        for (int i = res; i > 0; i--) {
            if (!set.contains(i)) {
                res = i;
            }
        }
        return res;
    }


    public static void main (String[] args) {

        Leetcode11111 leetcode11111 = new Leetcode11111();
        System.out.println(leetcode11111.getdifferentNumber(new int[] {0,1,2,3}));

    }
}
