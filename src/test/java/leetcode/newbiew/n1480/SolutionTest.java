package leetcode.newbiew.n1480;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {
  static Stream<Arguments> args() {
    return Stream.of(
        arguments(new int[] {1, 2, 3, 4}, new int[] {1, 3, 6, 10}),
        arguments(new int[] {1, 1, 1, 1, 1}, new int[] {1, 2, 3, 4, 5}),
        arguments(new int[] {3, 1, 2, 10, 1}, new int[] {3, 4, 6, 16, 17}));
  }

  @ParameterizedTest
  @MethodSource("args")
  void runningSum() {
    Solution solution = new Solution();
    int[] nums = new int[] {1, 2, 3, 4};
    int[] result = solution.runningSum(nums);
    assertThat(result).isEqualTo(new int[] {1, 3, 6, 10});
  }
}
