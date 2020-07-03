package Tree;

public class Leetcode404 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int sum = 0;

    private void recursition(TreeNode root) {
        if (root == null) return;

        TreeNode leftNode = root.left;
        if (leftNode == null) {
            recursition(root.right);
            return;
        }

        if (leftNode.left == null && leftNode.right == null) {
            sum += leftNode.val;
        }

        recursition(root.left);
        recursition(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        recursition(root);
        return sum;
    }
}
