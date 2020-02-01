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

    void append_path(TreeNode root, List<String> list, StringBuilder str) {
        if (root == null) {}
        if (root.left == null && root.right == null) {
            str.append("->").append(root.val);
            list.add(str.toString());
        } else if (root.left == null) {
            str.append("->").append(root.val);
            append_path(root.right, list, str);
        } else if (root.right == null) {
            str.append("->").append(root.val);
            append_path(root.left, list, str);
        } else {
            str.append("->").append(root.val);
            append_path(root.left, list, str);
            append_path(root.right, list, str);
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) return list;
        StringBuilder str = new StringBuilder("");
        str.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(str.toString());
            return list;
        }
        System.out.println("first str :" + str);
        append_path(root.left, list, str);
        System.out.println("second str :" + str);
        append_path(root.right, list, str);
        System.out.println("third str :" + str);
        return list;
    }
}
