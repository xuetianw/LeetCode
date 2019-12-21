import java.util.PriorityQueue;

public class Leetcode230 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    void inorder(PriorityQueue pq, TreeNode root) {
        if (root == null) return;

        inorder(pq, root.left);

        pq.add(root.val);

        inorder(pq, root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((num1 ,num2) -> num2 - num1);
        inorder(pq, root);

        while (pq.size() > 5) {
            pq.remove();
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        Leetcode230 leetcode230 = new Leetcode230();
//        leetcode230.kthSmallest()
    }
}
