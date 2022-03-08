package LinkedList;

public class Leetcode2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode list = new ListNode(0);
        ListNode head = list;

        int carry = 0;
        while (cur1 != null || cur2 != null) {

            int val1 = (cur1 == null) ? 0 : cur1.val;
            int val2 = (cur2 == null) ? 0 : cur2.val;

            int sum = val1 + val2 + carry;
            list.next = new ListNode(sum % 10);

            carry = sum / 10;
            if (cur1 != null) cur1 = cur1.next;
            if (cur2 != null) cur2 = cur2.next;
            list = list.next;
        }

        if (carry == 1) list.next = new ListNode(1);

        return head.next;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int product_of_all = 1;
        for (int element : arr) {
            product_of_all *= element;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = product_of_all / arr[i];
        }
        for (int element : result) {
            System.out.printf("element %d \t", element);
        }
    }
}
