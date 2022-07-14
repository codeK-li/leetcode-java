package leetcode.newbiew.n876;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ListNodeTest {

  @Test
  @DisplayName("链表长度不能为空")
  void test0() {
    Assertions.assertThatThrownBy(
            () -> {
              ListNode node = ListNode.valueOf(new int[] {});
            })
        .hasMessage("链表长度不能为空");
  }

  @Test
  void test1() {
    ListNode node = ListNode.valueOf(new int[] {1});
    assertThat(node.val).isEqualTo(1);
    assertThat(node.next).isNull();
  }

  @Test
  void test2() {
    ListNode node = ListNode.valueOf(new int[] {1, 2});
    assertThat(node.val).isEqualTo(1);
    assertThat(node.next.val).isEqualTo(2);
    assertThat(node.next.next).isNull();
  }

  @Test
  void test3() {
    ListNode node = ListNode.valueOf(new int[] {1, 2, 3});
    assertThat(node.val).isEqualTo(1);
    assertThat(node.next.val).isEqualTo(2);
    assertThat(node.next.next.val).isEqualTo(3);
    assertThat(node.next.next.next).isNull();
  }
}
