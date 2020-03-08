public class Leetcode203 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy_head = new ListNode(val + 1);
        dummy_head.next = head;
        ListNode cur = head;
        ListNode prev = dummy_head;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = prev.next.next;
                cur = cur.next;
            } else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        return dummy_head.next;
    }
    public static void main(String[] args) {

    }

}
