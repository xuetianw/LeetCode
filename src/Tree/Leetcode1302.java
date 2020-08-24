package Tree;

public class Leetcode1302 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int sum_of_leaves = 0;
    void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);

        if (node.left == null && node.right == null) {
            sum_of_leaves += node.val;
        }
        inOrder(node.right);
    }

    public int deepestLeavesSum(TreeNode root) {
        inOrder(root);
        return sum_of_leaves;
    }
}
