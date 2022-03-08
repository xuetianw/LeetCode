package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Leetcode445 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] l1_arr = new int[1000];
        int[] l2_arr = new int[1000];
        int count_l1 = 0;
        int count_l2 = 0;
        while (l1 != null) {
            l1_arr[count_l1++] = l1.val;
            l1 = l1.next;
        }

        while (l2 != null) {
            l2_arr[count_l2++] = l2.val;
            l2 = l2.next;
        }

        List<Integer> list = new ArrayList<>();
        int carry = 0;
        int index1 = count_l1 -1;
        int index2 = count_l2 -1;
        while (index1 >= 0 || index2 >= 0) {
            int sum;
            if (index1 < 0) {
                sum = l2_arr[index2--];
            } else if (index2 < 0) {
                sum = l1_arr[index1--];
            } else {
                sum = l1_arr[index1--] + l2_arr[index2--];
            }
            list.add((sum + carry) % 10);
            carry = (sum + carry) / 10;
        }
        if (carry == 1) {
            list.add(1);
        }

        ListNode dummy_head = new ListNode(-1);
        ListNode head = dummy_head;
        for (int i = list.size() - 1; i >= 0; i--) {
            dummy_head.next = new ListNode(list.get(i));
            dummy_head = dummy_head.next;
        }
        return head.next;
    }
}
