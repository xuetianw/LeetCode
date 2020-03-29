package LInkedList;

public class Leetcode234 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode prev = head;
        ListNode cur = head.next;
        head.next = null;

        while (cur != null) {
            ListNode next_node = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next_node;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        slow = reverse(slow);
        while (fast != null && slow != null) {
            if (fast.val != slow.val) return false;
            else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return true;
    }
}
