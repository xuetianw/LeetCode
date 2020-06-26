package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode429 {
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


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        List<Node> list = new ArrayList<>();
        list.add(root);
        while (list.size() != 0) {
            List<Integer> level_list = new ArrayList<>();
            for (Node node : list) {
                level_list.add(node.val);
            }
            res.add(level_list);

            int list_size = list.size();
            for (int i = 0; i < list_size; i++) {
                Node node = list.remove(0);
                List<Node> children_list = node.children;
                for (Node child_node: children_list) {
                    list.add(child_node);
                }
            }
        }
        return res;
    }
}
