package Tree;

import BinarySearchtTree.Leetcode230;

import java.util.PriorityQueue;

public class Leetcode671 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    public int findSecondMinimumValue(TreeNode root) {
        traversal(root);
        return priorityQueue.peek();
    }
    void traversal(TreeNode root) {
        if (root != null) {
            priorityQueue.add(root.val);
            if (priorityQueue.size() > 2) {
                priorityQueue.poll();
            }

            traversal(root.left);
            traversal(root.right);
        }
    }
}
