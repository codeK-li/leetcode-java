package leetcode.easy.x2zsx1;

/**
 * see <a href="https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2zsx1/">买卖股票的最佳时机
 * II</a>
 */
class Solution {
  public int maxProfit(int[] prices) {
    if (prices.length == 0 || prices.length == 1) {
      return 0;
    }

    if (prices.length == 2) {
      if (prices[0] < prices[1]) {
        return prices[1] - prices[0];
      }

      return 0;
    }

    int max = 0;
    for (int i = 0; i < prices.length; i++) {
      int price = prices[i];
      int[] lastPrices = new int[prices.length - i - 1];
      System.arraycopy(prices, i + 1, lastPrices, 0, lastPrices.length);
      max = Math.max(max, maxProfit(max, price, lastPrices));
    }

    //    System.out.print(Arrays.toString(prices));
    //    System.out.print(" -> ");
    //    System.out.println(max);
    return max;
  }

  private int maxProfit(int max, int price, int[] lastPrices) {
    for (int i = 0; i < lastPrices.length; i++) {
      int lastPrice = lastPrices[i];
      if (price < lastPrice) {
        int[] copyOfLastPrices = new int[lastPrices.length - i - 1];
        System.arraycopy(lastPrices, i + 1, copyOfLastPrices, 0, copyOfLastPrices.length);
        max = Math.max(max, lastPrice - price + maxProfit(copyOfLastPrices));
      }
    }
    return max;
  }
}
