import java.util.ArrayList;
import java.util.List;

public class Leetcode257 {
    /**
     * Definition for a binary tree node.
     * */
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    void append_path(TreeNode root, List<String> list, String str) {
        if (root == null) {return;}
        if (root.left == null && root.right == null) {
            str += ("->" + root.val);
            list.add(str);
        } else if (root.left == null) {
            str += ("->" + root.val);
            append_path(root.right, list, str);
        } else if (root.right == null) {
            str += ("->" + root.val);
            append_path(root.left, list, str);
        } else {
            str += ("->" + root.val);
            append_path(root.left, list, str);
            append_path(root.right, list, str);
        }

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) return list;
        String str = "";
        str += root.val;
        if (root.left == null && root.right == null) {
            list.add(str);
            return list;
        }
        // System.out.printf("first str %s :", str);
        append_path(root.left, list, str);
        // System.out.printf("second str %s :", str);
        append_path(root.right, list, str);
        // System.out.printf("third str %s :", str);
        return list;
    }
}
