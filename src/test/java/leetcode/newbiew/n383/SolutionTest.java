package leetcode.newbiew.n383;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {
  static Stream<Arguments> args() {
    return Stream.of(
        arguments("a", "b", false), arguments("aa", "ab", false), arguments("aa", "aab", true));
  }

  @ParameterizedTest
  @MethodSource("args")
  void canConstruct(String ransomNote, String magazine, boolean expected) {
    Solution solution = new Solution();
    boolean result = solution.canConstruct(ransomNote, magazine);
    assertThat(result).isEqualTo(expected);
  }
}
