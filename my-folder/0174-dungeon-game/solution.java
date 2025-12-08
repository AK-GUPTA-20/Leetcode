// tabulation
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    dp[i][j] = dungeon[i][j] <= 0 ? 1 - dungeon[i][j] : 1;
                } else {
                    int right = (j + 1 < n) ? dp[i][j + 1] : Integer.MAX_VALUE;
                    int down  = (i + 1 < m) ? dp[i + 1][j] : Integer.MAX_VALUE;
                    int min = Math.min(right, down) - dungeon[i][j];
                    dp[i][j] = min <= 0 ? 1 : min;
                }
            }
        }
        return dp[0][0];
    }
}


/*
// dp/recursion
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return solve(0, 0, dungeon, dp);
    }
    

    public int solve(int i, int j, int[][] arr, int[][] dp) {
        int m = arr.length;
        int n = arr[0].length;

        if (i >= m || j >= n)
            return Integer.MAX_VALUE;

        if (i == m - 1 && j == n - 1) {
            if ((arr[i][j]) <= 0)
                return Math.abs(arr[i][j]) + 1;
            else
                return 1;
        }

        if (dp[i][j] != -1)
            return dp[i][j];

        int right = solve(i, j + 1, arr, dp);
        int down = solve(i + 1, j, arr, dp);

        int need = Math.min(right, down) - arr[i][j];
        return dp[i][j] = need <= 0 ? 1 : need;

    }
}
*/
