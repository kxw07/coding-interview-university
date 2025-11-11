package leetcode.easy.best_time_to_buy_and_sell_stock_121;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        //O(N)
        for (int i = 0; i < prices.length; i++) {
            //O(N)
            for (int j = i + 1; j < prices.length; j++) {
                // O(1)
                if ((prices[j] - prices[i]) > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }

        // total O(N^2)

        return maxProfit;
    }
}
