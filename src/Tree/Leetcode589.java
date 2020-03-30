package Tree;

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

    private List<Integer> res_list = new ArrayList<>();


    void preorder_rec(Node node) {
        res_list.add(node.val);
        List<Node> children = node.children;
        for (Node node1 : children) {
            preorder_rec(node1);
        }
    }

    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList<>();
        preorder_rec(root);
        return res_list;
    }
}
