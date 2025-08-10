class Solution:
    # time complexity:o(n), space complexity:o(1)
    def maxProfit(self, prices: List[int]) -> int:
        left_ptr = 0
        right_ptr = 1
        max_profit = 0

        while right_ptr < len(prices):
            if prices[right_ptr] > prices[left_ptr]:
                profit = prices[right_ptr] - prices[left_ptr]
                max_profit = max(profit, max_profit)
            else:
                left_ptr = right_ptr
            right_ptr += 1
        return max_profit
