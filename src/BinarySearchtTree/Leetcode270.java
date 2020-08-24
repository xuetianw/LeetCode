package BinarySearchtTree;

public class Leetcode270 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int res;
    void inOrder(TreeNode root, double target) {
        if (root == null) { return; }
        inOrder(root.left, target);
        if (root.val < target) {
            res = root.val;
        } else {
            if (Math.abs(root.val - target) < Math.abs(res - target)) {
                res = root.val;
            }
        }
        inOrder(root.right, target);
    }

    public int closestValue(TreeNode root, double target) {
        res = root.val;
        inOrder(root, target);
        return res;
    }

    public static void main(String[] args) {
        int a = 2147483647;
        System.out.println(a);
    }
}
