import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution572 {
    /**
     * Definition for a binary tree node.
     */
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    void pre_order(TreeNode s, List<Integer> list) {
        if (s == null) { }
        else {
            pre_order(s.left, list);
            list.add(s.val);
            pre_order(s.right, list);
        }
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        List<Integer> s_list = new ArrayList<>();
        List<Integer> t_list = new ArrayList<>();
        pre_order(s, s_list);
        pre_order(t, t_list);

        return test(s_list, t_list);
    }

    private boolean test(List<Integer> s_list, List<Integer> t_list) {
        int start_index = -1;
        int starting_num = s_list.get(0);


        for (int i = 0; i < t_list.size(); i++) {
            if (starting_num == t_list.get(i)) {
                start_index = i;
                break;
            }
        }

        if (start_index == -1) return false;
        if ((t_list.size() - 1 - start_index + 1) < s_list.size()) {
            return false;
        }
        for (int i = 0; i < s_list.size(); i++) {
            if (s_list.get(i) != t_list.get(start_index + i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
          Solution572 solution572 = new Solution572();
          List<Integer> s_list = new ArrayList<>(Arrays.asList(2,3,4));
          List<Integer> t_list = new ArrayList<>(Arrays.asList(6,1,4,2,3,4,5));
          System.out.println(solution572.test(s_list, t_list));

    }
}
