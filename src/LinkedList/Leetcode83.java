package LinkedList;

public class Leetcode83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null) {
            if (cur.val == prev.val) {
                prev.next = prev.next.next;//prev pointer stays
                cur = cur.next;
            } else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        return head;
    }
}
