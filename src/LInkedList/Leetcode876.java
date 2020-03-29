package LInkedList;

public class Leetcode876 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode double_loc_cur = head;
        while (double_loc_cur != null && double_loc_cur.next != null) {
            head = head.next;
            double_loc_cur = double_loc_cur.next.next;
        }
        return head;
    }
}
