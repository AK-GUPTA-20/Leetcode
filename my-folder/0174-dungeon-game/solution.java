class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp) Arrays.fill(row,-1);
        return solve(0,0,dungeon, dp);
    }

    public int solve(int i, int j, int[][] arr, int[][] dp){
        int m = arr.length;
        int n = arr[0].length;

        if(i >= m || j >= n) return Integer.MAX_VALUE;
        
        if(i==m-1 && j==n-1){
            if((arr[i][j]) <= 0) return Math.abs(arr[i][j]) +1;
            else return 1;
        }

        if(dp[i][j] != -1) return dp[i][j];

        int right = solve(i ,j+1, arr, dp);
        int down = solve(i+1, j, arr, dp);

        int need = Math.min(right, down) - arr[i][j];
        return dp[i][j] =  need <= 0 ? 1 : need;

    }    
}
