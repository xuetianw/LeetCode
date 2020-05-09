package BinarySearchtTree;

import Tree.Leetcode671;

public class Leetcode897 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    TreeNode treeNode = new TreeNode(0);
    TreeNode temp = treeNode;
    public TreeNode increasingBST(TreeNode root) {
        if (root != null) {
            increasingBST(root.left);
            temp.right = new TreeNode(root.val);
            temp = temp.right;
            increasingBST(root.right);
        }
        return treeNode.right;
    }
}
