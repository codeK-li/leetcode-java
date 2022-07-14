package leetcode.newbiew.n412;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {
  static Stream<Arguments> args() {
    return Stream.of(
        arguments(3, Arrays.asList("1", "2", "Fizz")),
        arguments(5, Arrays.asList("1", "2", "Fizz", "4", "Buzz")),
        arguments(
            15,
            Arrays.asList(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz")));
  }

  @ParameterizedTest
  @MethodSource("args")
  void fizzbuzz(int n, List<String> expected) {
    Solution solution = new Solution();
    List<String> result = solution.fizzBuzz(n);

    assertThat(result).isEqualTo(expected);
  }
}
