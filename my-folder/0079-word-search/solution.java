class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] isVisited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (backtrack(board, word, isVisited, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean backtrack(char[][] board, String word, boolean[][] isVisited, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
            board[i][j] != word.charAt(index) || isVisited[i][j]) {
            return false;
        }

        isVisited[i][j] = true;

        boolean found = backtrack(board, word, isVisited, i + 1, j, index + 1) ||
                        backtrack(board, word, isVisited, i - 1, j, index + 1) ||
                        backtrack(board, word, isVisited, i, j + 1, index + 1) ||
                        backtrack(board, word, isVisited, i, j - 1, index + 1);

        isVisited[i][j] = false; // backtrack
        return found;
    }
}

