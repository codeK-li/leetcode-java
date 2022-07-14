package leetcode.newbiew.n1672;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {
  static Stream<Arguments> args() {
    return Stream.of(
        arguments(new int[][] {new int[] {1, 2, 3}, new int[] {3, 2, 1}}, 6),
        arguments(new int[][] {new int[] {1, 5}, new int[] {7, 3}, new int[] {3, 5}}, 10),
        arguments(new int[][] {new int[] {2, 8, 7}, new int[] {7, 1, 3}, new int[] {1, 9, 5}}, 17));
  }

  @ParameterizedTest
  @MethodSource("args")
  void test(int[][] accounts, int expected) {
    int actual = new Solution().maximumWealth(accounts);
    Assertions.assertThat(actual).isEqualTo(expected);
  }
}
