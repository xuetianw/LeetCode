import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class Leetcode102 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if  (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        res.add(Arrays.asList(root.val));
        list.add(root);

        while(list.size() != 0) {
            TreeNode node = list.remove(0);
            TreeNode left_node = node.left;
            TreeNode right_node = node.right;
            if (node.left == null && node.right == null) {
            } else if (left_node != null && right_node != null) {
                res.add(Arrays.asList(left_node.val, right_node.val));
                list.add(left_node);
                list.add(right_node);
            } else if (left_node == null) {
                res.add(Arrays.asList(right_node.val));
                list.add(right_node);
            } else if (right_node == null) {
                res.add(Arrays.asList(left_node.val));
                list.add(left_node);
            }
        }
        return res;
    }

    public static void main(String args[]) {

    }
}
