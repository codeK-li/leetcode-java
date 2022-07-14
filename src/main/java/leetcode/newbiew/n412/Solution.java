package leetcode.newbiew.n412;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>(n);
    for (int i = 1; i <= n; i++) {
      result.add(number(i));
    }

    return result;
  }

  private String number(int i) {
    if (i % 15 == 0) return "FizzBuzz";
    if (i % 3 == 0) return "Fizz";
    if (i % 5 == 0) return "Buzz";
    return String.valueOf(i);
  }
}
