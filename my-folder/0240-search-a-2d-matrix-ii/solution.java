class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lastCol = matrix[0].length - 1;
        return helper(matrix, target, 0, lastCol);
    }

    boolean helper(int[][] matrix, int target, int i, int j) {
        if (i >= matrix.length || j < 0) return false;
        if (matrix[i][j] == target) return true;
        if (matrix[i][j] > target) return helper(matrix, target, i, j - 1);
        return helper(matrix, target, i + 1, j);
    }
}

