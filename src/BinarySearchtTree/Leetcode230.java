package BinarySearchtTree;

import java.util.*;

//TODO
public class Leetcode230 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    void inorder(int[] arr, TreeNode root, int k) {
        if (root == null) return;

        inorder(arr, root.left, k);

        if (arr[0]++ == k - 1) {
            arr[1] = root.val;
            return;
        }

        inorder(arr, root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        int[] arr = new int[2];
        inorder(arr, root, k);
        return arr[1];
    }


    public static void main(String[] args) {

        Leetcode230 leetcode230 = new Leetcode230();
//        leetcode230.kthSmallest()
    }
}
