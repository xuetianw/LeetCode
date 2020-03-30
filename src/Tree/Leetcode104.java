package Tree;

public class Leetcode104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return 1 + Math.max(left_height, right_height);
        }
    }
}
