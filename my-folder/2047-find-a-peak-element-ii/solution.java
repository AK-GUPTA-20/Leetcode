class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m - 1;

        while (low <= high) {
            int midCol = low + (high - low) / 2;
            int maxRow = 0;

            for (int i = 0; i < n; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            boolean leftIsSmaller = (midCol == 0) || (mat[maxRow][midCol] > mat[maxRow][midCol - 1]);
            boolean rightIsSmaller = (midCol == m - 1) || (mat[maxRow][midCol] > mat[maxRow][midCol + 1]);

            if (leftIsSmaller && rightIsSmaller) {
                return new int[]{maxRow, midCol};
            } else if (midCol > 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol]) {
                high = midCol - 1;
            } else {
                low = midCol + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
