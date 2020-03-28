package LInkedList;

public class Leetcode21 {

    /**
     * Definition for singly-linked list.
     */
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummy_head = new ListNode(0);
            ListNode cur = dummy_head;
            while (l1 != null && l2 != null) {
                int val;
                if (l1.val > l2.val) {
                    val = l2.val;
                    l2 = l2.next;
                } else {
                    val = l1.val;
                    l1 = l1.next;
                }
                cur.next = new ListNode(val);
                cur = cur.next;
            }

            cur.next = (l1 == null) ? l2 : l1;
            return dummy_head.next;
        }
    }

    public static void main(String[] args) {

    }
}