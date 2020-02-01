public class Leetcode206 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null) {
            ListNode next_node = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next_node;
        }
        return prev;
    }

    public static void main (String[] args) {

        Leetcode206 leetcode206 = new Leetcode206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head = leetcode206.reverseList(head);

    }

}
