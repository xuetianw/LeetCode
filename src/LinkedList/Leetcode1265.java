package LinkedList;

public class Leetcode1265 {

      // This is the ImmutableListNode's API interface.
      // You should not implement it, or speculate about its implementation.
      interface ImmutableListNode {
          public void printValue(); // print the value of this node.
          public ImmutableListNode getNext(); // return the next node.
      };

    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head == null) {
            return;
        }
        printLinkedListInReverse(head.getNext());
        head.printValue();
    }
}
