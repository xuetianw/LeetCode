import java.util.HashSet;
import java.util.Set;

public class Leetcode141 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode cur = head;
        Set<ListNode> set = new HashSet<>();
        while (cur != null) {
            if (set.contains(cur)) return true;
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode141 leetcode141 = new Leetcode141();
        ListNode head = new ListNode(5);
        ListNode temp = head;
        temp.next = new ListNode(6);
        temp = temp.next;
        temp.next = new ListNode(7);
        temp = temp.next;
        temp.next = new ListNode(5);

        leetcode141.hasCycle(head);
    }
}
