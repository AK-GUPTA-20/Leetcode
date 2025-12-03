class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return solve(0,0,m,n,dp);
    }
    public int solve(int k, int l, int m, int n, int[][] dp){
        // traversal end to start
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(i == m-1 || j== n-1){
                    dp[i][j] = 1;
                }else{
                    int right = dp[i][j+1];
                    int down = dp[i+1][j];

                    dp[i][j] = right + down;
                }
            }
        }
        return dp[0][0];
    }
}
