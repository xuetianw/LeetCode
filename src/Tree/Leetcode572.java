package Tree;

public class Leetcode572 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    boolean is_same_tree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && is_same_tree(t1.left, t2.left)
                && is_same_tree(t1.right, t2.right);
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (s.left == null) return is_same_tree(s, t) || isSubtree(s.right, t);
        if (s.right == null) return is_same_tree(s, t) || isSubtree(s.left, t);

        else {
            boolean leftsub_is_same = isSubtree(s.left, t);
            boolean rightsub_is_same = isSubtree(s.right, t);
            return is_same_tree(s, t) || leftsub_is_same || rightsub_is_same;
        }

    }
}
