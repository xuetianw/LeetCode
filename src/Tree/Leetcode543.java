package Tree;

public class Leetcode543 {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    int height_r(TreeNode root) {
        if (root == null) return -1;

        return 1 + Math.max(height_r(root.left), height_r(root.right));
    }

    int max_diameter = 0;

    void in_order(TreeNode root) {
        if (root != null) {
            max_diameter = Math.max(max_diameter, 2 + (height_r(root.left) + height_r(root.right)));
            in_order(root.left);
            in_order(root.right);
        }
    }


    public int diameterOfBinaryTree(TreeNode root) {
        in_order(root);
        return max_diameter;
    }
}
