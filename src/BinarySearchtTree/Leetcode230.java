package BinarySearchtTree;

import java.util.PriorityQueue;

//TODO
public class Leetcode230 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    void inorder(PriorityQueue pq, TreeNode root, int k) {
        if (root == null) return;

        if (pq.size() < k) {
            inorder(pq, root.left, k);
            pq.add(root.val);
            inorder(pq, root.right, k);
        }



    }

    PriorityQueue<Integer> pq = new PriorityQueue<>((num1 ,num2) -> (num2 - num1));
    public int kthSmallest(TreeNode root, int k) {

        inorder(pq, root, k);
        return pq.poll();
    }

    public static void main(String[] args) {
        Leetcode230 leetcode230 = new Leetcode230();
//        leetcode230.kthSmallest()
    }
}
