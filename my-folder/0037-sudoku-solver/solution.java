class Solution {
    static int Check = 0;

    public void solve(char[][] board, int row, int col) {
        if (row == 9) {
            Check = 1;
            return;
        }
        
        if (board[row][col] != '.') {
            if (col != 8) {
                solve(board, row, col + 1);
            } else {
                solve(board, row + 1, 0);
            }
        } else {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(board, row, col, ch)) {
                    board[row][col] = ch;
                    if (col != 8) {
                        solve(board, row, col + 1);
                    } else {
                        solve(board, row + 1, 0);
                    }
                    if (Check == 1) return;
                    board[row][col] = '.';
                }
            }
        }
    }

    public boolean isValid(char[][] board, int row, int col, char num) {
        // Checking row and column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num || board[row][i] == num) return false;
        }

        // Checking in 3x3 Matrix
        int S_row = row / 3 * 3;
        int S_col = col / 3 * 3;

        for (int i = S_row; i < S_row + 3; i++) {
            for (int j = S_col; j < S_col + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        Check = 0; // Reset Check before solving
        solve(board, 0, 0);
    }
}

