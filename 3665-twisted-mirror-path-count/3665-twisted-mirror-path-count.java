
class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1_000_000_007;
        int[][][] dp = new int[m + 1][n + 1][2];
        dp[0][0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int right = dp[i][j][0];
                int down = dp[i][j][1];
                if (grid[i][j] == 0) {
                    dp[i][j + 1][0] =
                        (int) ((dp[i][j + 1][0] + (long) right + down) % MOD);

                    dp[i + 1][j][1] =
                        (int) ((dp[i + 1][j][1] + (long) right + down) % MOD);
                } else {
                
                    dp[i + 1][j][1] =
                        (int) ((dp[i + 1][j][1] + (long) right) % MOD);
                    dp[i][j + 1][0] =
                        (int) ((dp[i][j + 1][0] + (long) down) % MOD);
                }
            }
        }

        return (int) (
            ((long) dp[m - 1][n - 1][0]
            + dp[m - 1][n - 1][1]) % MOD
        );
    }
}
