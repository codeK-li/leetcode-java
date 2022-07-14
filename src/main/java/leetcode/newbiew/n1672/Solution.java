package leetcode.newbiew.n1672;

class Solution {
  public int maximumWealth(int[][] accounts) {
    int max = 0;
    for (int[] as : accounts) {
      max = Math.max(max, sum(as));
    }
    return max;
  }

  private int sum(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}
