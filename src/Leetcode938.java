import java.util.ArrayList;
import java.util.List;

public class Leetcode938 {

    //     Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int rangeSumBST(TreeNode root, int L, int R) {
            List<Integer> list = new ArrayList<>();
            inorder(root, L, R, list);
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        }

        void inorder(TreeNode node, int l, int r, List<Integer> list) {
            if (node != null) {
                inorder(node.left, l, r, list);
                if (node.val >= l && node.val <= r) {
                    list.add(node.val);
                }
                inorder(node.right, l, r, list);
            }
        }
    }

    public static void main(String[] args) {

    }
}
