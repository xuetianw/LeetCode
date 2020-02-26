package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode46 {
    static List<List<Integer>> res_list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> all_set = new HashSet<>();
        for (int num :nums) {
            all_set.add(num);
        }

        List<Integer> list = new ArrayList<>();
        permuteRec(all_set, list);

        return res_list;
    }

    void permuteRec(Set<Integer> remaining_set, List<Integer> list) {
        if (remaining_set.isEmpty()) {
            res_list.add(list);
            return;
        }

        Set<Integer> all_set = new HashSet<>(remaining_set);
        for (int num : remaining_set) {
            all_set = new HashSet<>(remaining_set);
            all_set.remove(num);
            List<Integer> temp = new ArrayList<>(list);
            temp.add(num);
            permuteRec(all_set, temp);
        }
    }

    public static void main(String[] args) {
        Leetcode46 leetcode46 = new Leetcode46();
        leetcode46.permute(new int[]{1, 2, 3});
        for (List num : res_list) {
            System.out.print(num.toString());
        }
    }
}
