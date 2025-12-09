// tabulation
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int j = 0; j <= amount; j++) {
            if (j % coins[0] == 0)
                dp[0][j] = j / coins[0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= amount; j++) {
                int take = Integer.MAX_VALUE;
                if (j >= coins[i] && dp[i][j - coins[i]] != Integer.MAX_VALUE)
                    take = dp[i][j - coins[i]] + 1;

                int notTake = dp[i - 1][j];

                dp[i][j] = Math.min(take, notTake);
            }
        }

        int ans = dp[n - 1][amount];
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}


/*
// memo
class Solution {
    public int findCoinREC(int[] coins, int amount, int idx , int[][] dp) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;
        if (idx == coins.length) return Integer.MAX_VALUE;

        if(dp[idx][amount] != -1) return dp[idx][amount];

        int take = findCoinREC(coins, amount - coins[idx], idx , dp);
        if (take != Integer.MAX_VALUE) take += 1;

        int notTake = findCoinREC(coins, amount, idx + 1 , dp);

        return dp[idx][amount] = Math.min(take, notTake);
    }

    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp) Arrays.fill(row , -1);

        int ans = findCoinREC(coins, amount, 0 , dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
*/

