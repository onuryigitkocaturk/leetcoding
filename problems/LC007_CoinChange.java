import java.util.Arrays;

public class LC007_CoinChange {

    // Time complexity: O(n x m) where n = amount and m = number of coins
    // Space complexity: O(n) where n = amount
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        if (dp[amount] > amount) {
            return -1;
        } else {
            return dp[amount];
        }
    }
}
