package Tree;

public class Leetcode101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    boolean check_is_symmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;

        if ((root1 == null && root2 != null)
                || (root1 != null && root2 == null)) {
            return false;
        }

        return (root1.val == root2.val
                && check_is_symmetric(root1.left, root2.right)
                && check_is_symmetric(root1.right, root2.left));
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check_is_symmetric(root.left, root.right);
    }

}
