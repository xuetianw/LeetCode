package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode113 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        } else {
//            helper(root, sum, list);
        }
        return res;
    }


    public int sum(List<Integer> list) {
        int sum = 0;

        for (int i : list)
            sum = sum + i;

        return sum;
    }
//    private void helper(TreeNode root, int sum, List<Integer> list) {
//        if (root == null) {
//            if (sum(list) == sum) {
//                res.add((list));
//            }
//        } else {
//            list.add(list)
//        }
//    }
}
