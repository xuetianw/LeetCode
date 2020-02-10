import java.util.ArrayList;
import java.util.List;

public class Leetcode589 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    class Solution {
        List<Integer> res_list = new ArrayList<>();

        public void preorder_rec(Node root) {
            res_list.add(root.val);
            List<Node> children_list = root.children;
            int children_list_size = children_list.size();
            if (children_list_size == 0) {
            } else {
                for (int i = 0; i < children_list_size; i++) {
                    Node node = children_list.remove(0);
                    preorder_rec(node);
                }

            }
        }

        public List<Integer> preorder(Node root) {
            if (root == null) return new ArrayList<>();
            preorder_rec(root);
            return res_list;
        }
    }
}
