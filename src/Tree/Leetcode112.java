package Tree;

public class Leetcode112 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean checkPathSum(TreeNode root, int add_up, int sum) {
        if (root.left == null && root.right == null) {
            add_up += root.val;
            return add_up == sum;
        } else if (root.left == null) {
            return checkPathSum(root.right, add_up + root.val, sum);
        } else if (root.right == null) {
            return checkPathSum(root.left, add_up + root.val, sum);
        } else {
            return checkPathSum(root.left, add_up + root.val, sum)
                    || checkPathSum(root.right, add_up + root.val, sum);
        }
    }


    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return checkPathSum(root, 0, sum);
    }
}
