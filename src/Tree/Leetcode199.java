package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode199 {
    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (!list.isEmpty()) {
            int list_size = list.size();
            for (int i = 0; i < list_size; i++) {
                TreeNode node = list.remove(0);
                if (i == list_size - 1) {
                    res.add(node.val);
                }
                if (node.left != null && node.right != null) {
                    list.add(node.left);
                    list.add(node.right);
                } else if (node.left == null && node.right != null) {
                    list.add(node.right);
                } else if (node.left != null && node.right == null) {
                    list.add(node.left);
                }
            }
        }
        return res;
    }
}
