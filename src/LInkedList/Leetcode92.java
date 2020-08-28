package LInkedList;

public class Leetcode92 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }

        int loc = 1;

        ListNode pre = null;
        ListNode cur = head;
        while (loc != m) {
            pre = cur;
            cur = cur.next;
            loc++;
        }
        ListNode firstNode = pre;
        ListNode secondNode = cur;

        while (loc != n + 1) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
            loc++;
        }
        secondNode.next = cur;
        if (firstNode == null) { return pre; }
        firstNode.next = pre;

        return head;

    }
}
