package leetcode.easy.x2gy9m;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

  static Stream<Arguments> args() {
    return Stream.of(
        arguments(new int[] {1, 1, 2}, 2), arguments(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5));
  }

  @ParameterizedTest
  @MethodSource("args")
  void test(int[] nums, int expected) {
    Solution solution = new Solution();
    assertThat(solution.removeDuplicates(nums)).isEqualTo(expected);
  }
}
