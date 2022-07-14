package leetcode.newbiew.n1342;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {
  static Stream<Arguments> args() {
    return Stream.of(arguments(14, 6), arguments(8, 4), arguments(123, 12));
  }

  @ParameterizedTest
  @MethodSource("args")
  void test(int num, int expected) {
    Solution solution = new Solution();
    int actual = solution.numberOfSteps(num);
    assertThat(actual).isEqualTo(expected);
  }
}
