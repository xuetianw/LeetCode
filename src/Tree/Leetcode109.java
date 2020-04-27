package Tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode109 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int[] nums;

    public TreeNode helper(int left, int right) {
        if (left > right) return null;

        // always choose left middle node as a root
        int p = (left + right) / 2;

        // inorder traversal: left -> node -> right
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }


    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int[] loc_nums = new int[list.size()];
        int count = 0;
        for (int num : list) {
            loc_nums[count++] = num;
        }
        this.nums = loc_nums;
        return helper(0, nums.length - 1);
    }
}
