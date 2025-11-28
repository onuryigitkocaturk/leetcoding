public class LC004_BestTimeToBuyAndSellStock {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
