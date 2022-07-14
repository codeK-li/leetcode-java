package leetcode.newbiew.n876;

class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode valueOf(int[] ints) {
    if (ints.length == 0) throw new IllegalArgumentException("链表长度不能为空");
    ListNode currentNode = new ListNode(ints[ints.length - 1]);
    for (int i = ints.length - 2; i >= 0; i--) {
      currentNode = new ListNode(ints[i], currentNode);
    }
    return currentNode;
  }
}
