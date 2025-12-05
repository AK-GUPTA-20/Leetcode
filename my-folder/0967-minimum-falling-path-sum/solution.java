// using tabulation always start form last
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int down   = matrix[i+1][j];
                int leftD  = (j > 0) ? matrix[i+1][j-1] : Integer.MAX_VALUE;
                int rightD = (j < n-1) ? matrix[i+1][j+1] : Integer.MAX_VALUE;

                matrix[i][j] += Math.min(down, Math.min(leftD, rightD));
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int val : matrix[0]) ans = Math.min(ans, val);
        return ans;
    }

}



// using DP
/*
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int sum=Integer.MAX_VALUE;
        int[][] dp = new int[m][n];
        for(int[] row:dp) Arrays.fill(row , Integer.MIN_VALUE);
        for(int j=0 ; j<n ; j++){
            sum = Math.min(solve(0, j, matrix, dp) , sum);
        }
        return sum;
    }

    public int solve(int i, int j, int[][] mat, int[][] dp){
        if(i>=mat.length || j>=mat[0].length || j<0) return Integer.MAX_VALUE;
        if(i==mat.length-1) return mat[i][j];

        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        
        int down =  solve(i+1, j, mat, dp);
        int leftD =  solve(i+1, j-1, mat, dp);
        int rightD = solve(i+1, j+1, mat, dp);

        return dp[i][j] =  mat[i][j] + Math.min(down , Math.min(leftD , rightD)); 
    }
}

*/
