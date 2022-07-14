package leetcode.newbiew.n1342;

class Solution {
  public int numberOfSteps(int num) {
    if (num < 0) {
      throw new IllegalArgumentException("Number must be greater than zero");
    }

    if (num == 0) {
      return 0;
    }

    if ((num & 0x01) == 0) {
      return numberOfSteps(num >> 1) + 1;
    }

    return numberOfSteps(num - 1) + 1;
  }
}
