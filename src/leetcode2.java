public class leetcode2 {


    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver = 0;
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carryOver;
            carryOver = sum / 10;
            listNode.next = new ListNode(sum % 10);

            listNode = listNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null) {
            while (l2 != null) {
                int sum = l2.val + carryOver;
                listNode.next = new ListNode(sum % 10);
                carryOver = sum / 10;
                l2 = l2.next;
                listNode = listNode.next;
            }
        } else {
            while (l1 != null) {
                int sum = l1.val + carryOver;
                listNode.next = new ListNode(sum % 10);
                carryOver = sum / 10;
                l1 = l1.next;
                listNode = listNode.next;
            }
        }
        if (carryOver == 1) {
            listNode.next = new ListNode(1);
        }
        return head.next;
    }
}
