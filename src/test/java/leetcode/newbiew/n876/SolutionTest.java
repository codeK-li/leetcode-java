package leetcode.newbiew.n876;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
  @Test
  void test1() {
    ListNode head = ListNode.valueOf(new int[] {1, 2, 3, 4, 5});

    Solution solution = new Solution();
    ListNode middleNode = solution.middleNode(head);

    assertThat(middleNode.val).isEqualTo(3);
    assertThat(middleNode.next.val).isEqualTo(4);
    assertThat(middleNode.next.next.val).isEqualTo(5);
    assertThat(middleNode.next.next.next).isNull();
  }

  @Test
  void test2() {
    ListNode head = ListNode.valueOf(new int[] {1, 2, 3, 4, 5, 6});

    Solution solution = new Solution();
    ListNode middleNode = solution.middleNode(head);

    assertThat(middleNode.val).isEqualTo(4);
    assertThat(middleNode.next.val).isEqualTo(5);
    assertThat(middleNode.next.next.val).isEqualTo(6);
    assertThat(middleNode.next.next.next).isNull();
  }
}
