package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode102 {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        List<TreeNode> current_level_list = new ArrayList<>();
        current_level_list.add(root);

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        res.add(list);

        while (current_level_list.size() != 0) {
            List<TreeNode> temp_list = new ArrayList<>();
            for (TreeNode node : current_level_list) {
                if (node.left == null && node.right == null) {
                    continue;
                } else if (node.left == null) {
                    temp_list.add(node.right);
                } else if (node.right == null) {
                    temp_list.add(node.left);
                } else {
                    temp_list.add(node.left);
                    temp_list.add(node.right);
                }
            }
            current_level_list = temp_list;

            List<Integer> cur_list = new ArrayList<>();
            for (TreeNode treeNode : temp_list) {
                cur_list.add(treeNode.val);
            }
            if (temp_list.size() == 0) {
                return res;
            }
            res.add(cur_list);
        }
        return res;
    }
}