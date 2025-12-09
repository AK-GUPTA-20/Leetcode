// tabuation

class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for(int i=0 ; i<n ; i++){
            dp[i][0] = 1;
        }
        for(int j=1 ; j<amount+1 ; j++){
            dp[0][j] = (j % coins[0] == 0) ? 1 : 0;
        }

        for(int i=1 ; i<n ; i++){
            for(int j=1 ; j<amount+1 ; j++){
                int notTake = dp[i-1][j];
                int take = 0;
                if(j>=coins[i]) take =  dp[i][j - coins[i]];
                dp[i][j] = take + notTake;
            }
        }
        return dp[n-1][amount];
    }
}



/*
// memorisation
class Solution {
    public int findCoinREC(int[] coins, int amount, int idx , int dp[][] ) {
        if (amount == 0) return 1;
        if (amount < 0) return 0;
        if (idx == coins.length) return 0;

        if(dp[idx][amount] != -1) return dp[idx][amount];

        int take = findCoinREC(coins , amount-coins[idx] , idx , dp);
        int notTake = findCoinREC(coins , amount , idx+1 , dp);

        return dp[idx][amount] =  take+notTake;
    }


    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        int ans = findCoinREC(coins, amount, 0 , dp);
        return ans;
    }
}
*/
