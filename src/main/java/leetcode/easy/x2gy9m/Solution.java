package leetcode.easy.x2gy9m;

class Solution {
  public int removeDuplicates(int[] nums) {
    int currentResultIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      int currentResultValue = nums[currentResultIndex];
      int currentValue = nums[i];
      if (currentResultValue < currentValue) {
        nums[++currentResultIndex] = currentValue;
      }
    }

    return currentResultIndex + 1;
  }
}
