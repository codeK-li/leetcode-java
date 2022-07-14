package leetcode.easy.x2zsx1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

  static Stream<Arguments> args() {
    return Stream.of(
        arguments(new int[] {7, 1, 5, 3, 6, 4}, 7),
        arguments(new int[] {1, 2, 3, 4, 5}, 4),
        arguments(new int[] {7, 6, 4, 3, 1}, 0),
        arguments(new int[] {2, 1, 2, 0, 1}, 2),
        arguments(new int[] {3, 2, 6, 5, 0, 3}, 7));
  }

  @ParameterizedTest
  @MethodSource("args")
  void test(int[] prices, int expected) {
    Solution solution = new Solution();
    int actual = solution.maxProfit(prices);
    assertThat(actual).isEqualTo(expected);
  }
}
