package LinkedList;

public class Leetcode1290 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int getDecimalValue(ListNode head) {
        int count = 0;
        int[] arr = new int[30];
        while (head != null) {
            arr[count++] = head.val;
            head = head.next;
        }
        System.out.println(arr[20]);
        int multiplication = 1;
        int res = 0;
        for (int i = count - 1; i >= 0; i--) {
            res += arr[i] * multiplication;
            multiplication *= 2;
        }
        return res;
    }

    public static void main(String[] args) {
    }
}
