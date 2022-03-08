package LinkedList;

public class Leetcode21 {

    /**
     * Definition for singly-linked list.
     */
     public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode cur;
        ListNode head;
        if (l1.val > l2 .val) {
            cur = new ListNode(l2.val);
            l2 = l2.next;
        } else {
            cur = new ListNode(l1.val);
            l1 = l1.next;
        }
        head = cur;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 == null) ? l2 : l1;
        return head;
        /*
        ------------------------------------------------
        WAY 2
        /-------------------------------------------------
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
         */
    }

    public static void main(String[] args) {
    }
}