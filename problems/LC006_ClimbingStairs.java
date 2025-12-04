public class LC006_ClimbingStairs {

    // Inefficient approach, recursion has exponential time complexity O(2^n)
    public int climbStairs_rec(int n) {
        if (n <= 1) {
            return 1;
        }
        return climbStairs_rec(n-1) + climbStairs_rec(n-2);
    }

    // Efficient bottom-up DP approach, time complexity O(n)
    public int climbStairs(int n) {
        if(n <= 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
