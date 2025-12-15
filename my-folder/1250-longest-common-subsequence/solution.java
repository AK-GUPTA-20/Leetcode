/*
// using recursion/memorisation
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1+1][n2+1];
        for(int[] row : dp) Arrays.fill(row,-1);

        return solveDP(n1, n2, s1, s2 , dp);
    }
    private int solveDP(int idx1 , int idx2, String s1, String s2 , int[][] dp){
        if(idx1 == 0 || idx2 == 0) return 0;
        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];
        if(s1.charAt(idx1-1) == s2.charAt(idx2-1)){
            dp[idx1][idx2] = 1+solveDP(idx1-1, idx2-1, s1, s2 , dp);
        }
        else dp[idx1][idx2] =  Math.max(solveDP(idx1-1, idx2, s1, s2 , dp) , solveDP(idx1, idx2-1, s1, s2 , dp));

        return dp[idx1][idx2];
    }
}
*/

// using tab
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }
}

