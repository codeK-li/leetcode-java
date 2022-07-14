package leetcode.newbiew.n876;

class Solution {
  public ListNode middleNode(ListNode head) {
    ListNode slowNode = head;
    ListNode fastNode = head;

    while (fastNode != null && fastNode.next != null) {
      fastNode = fastNode.next.next;
      slowNode = slowNode.next;
    }

    return slowNode;
  }
}
