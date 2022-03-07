package LinkedList;



 // Definition for singly-linked list.


public class Leetcode1474 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(1);
        dummyHead.next = head;

        while (dummyHead != null) {
            for (int i = 0; i < m; i++) {
                dummyHead = dummyHead.next;
                if(dummyHead == null) {
                    return head;
                };
            }

            ListNode temp = dummyHead;
            for (int i = 0; i < n; i++) {
                temp = temp.next;
                if(temp == null) {
                    dummyHead.next = null;
                    return head;
                }
            }
            dummyHead.next = temp.next;
        }

        return head;
    }
}
