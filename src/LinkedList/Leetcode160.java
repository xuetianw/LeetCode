package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Leetcode160 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while (cur1 != null) {
            set.add(cur1);
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            if (set.contains(cur2)) return cur2;
            cur2 = cur2.next;
        }
        return null;
    }
}
