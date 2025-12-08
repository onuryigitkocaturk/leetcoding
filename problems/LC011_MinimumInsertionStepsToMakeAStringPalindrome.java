public class LC011_MinimumInsertionStepsToMakeAStringPalindrome {
        public int minInsertions(String s) {

            // Subproblem: dp[i][j] = minimum number of insertions required to make string palindrome.
            // Recurrence relation: if x[i] == x[j]  then -> dp[i][j] = dp[i+1][j-1]
            // ------------------------------------- else -> dp[i][j] = 1 + min(dp[i+1][j], dp[i][j-1])
            // Base case: dp[i][i] = 0
            // Base case: i > j then -> dp[i][j] = 0

            int n = s.length();
            int[][] dp = new int[n][n];

            for (int i = 0; i < n; i++) {
                dp[i][i] = 0;
            }

            for (int len = 2; len <= n; len ++) {
                for (int i = 0; i + len - 1 < n; i++) {
                    int j = i + len - 1;

                    if(s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j-1]);
                    }
                }
            }
            return dp[0][n-1];
        }
}
