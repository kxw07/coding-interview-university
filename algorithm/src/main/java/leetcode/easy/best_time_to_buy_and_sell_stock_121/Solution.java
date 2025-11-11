package leetcode.easy.best_time_to_buy_and_sell_stock_121;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        // O(N)
        for(int i = 1; i < prices.length; i++) {

            // O(1)
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // O(1)
            if ((prices[i] - minPrice) > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
