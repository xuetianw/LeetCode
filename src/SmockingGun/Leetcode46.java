package SmockingGun;

import java.util.*;

public class Leetcode46 {
    private static final Long[] arr = {
            1L, 2L, 3L, 5L,
    };

    private static Set<Long> res = new HashSet<>();

    private Set<Long> letterCombinations(long digits) {
        letterCombinationsRec(digits, 1L , 0);
        return res;
    }

    private void letterCombinationsRec(long digits, Long current, int index) {
        if (index == digits) {
            res.add(current);
            return;
        }

        for (Long ch : arr) {
            letterCombinationsRec(digits, current * ch, index + 1);
        }
    }

    public static void main(String[] args) {
        Leetcode46 leetcode46 = new Leetcode46();
        int size = -1;
        long index = 2L;
        while (size < 1500) {
            size = leetcode46.letterCombinations(index).size();
            System.out.printf("starting index : %s with set size %s \n" , index, size);

            index++;
        }
    }
}
