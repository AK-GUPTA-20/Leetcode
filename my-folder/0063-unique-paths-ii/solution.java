class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp) Arrays.fill(row,-1);
        return rec(0, 0, grid, dp);
    }
    private int rec(int i, int j, int[][] grid, int[][] dp){
        if(i>= grid.length || j>=grid[0].length) return 0;
        if(grid[i][j] == 1) return 0;
        
        if(i==grid.length-1 && j==grid[0].length-1) return 1;

        if(dp[i][j] != -1) return dp[i][j];

        int right = rec(i, j+1, grid, dp);
        int down = rec(i+1, j, grid, dp);

        return dp[i][j] = right+down;
    }
}
