class Solution {
    static int check = 0;

    void solve(char[][] board, int row, int col) {
        if (row == 9) {
            check = 1;
            return;
        }

        if (board[row][col] != '.') {
            if (col != 8) {
                solve(board, row, col + 1);
            } else {
                solve(board, row + 1, 0);
            }
        } else {
            for (char num = '1'; num <= '9'; num++) {
                if (isValid(board, row, col, num)) {
                    board[row][col] = num;

                    if (col != 8) {
                        solve(board, row, col + 1);
                    } else {
                        solve(board, row + 1, 0);
                    }

                    if (check == 1) return;
                    
                    board[row][col] = '.';
                }
            }
        }

    }

    boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int new_row = row / 3 * 3;
        int new_col = col / 3 * 3;

        for (int i = new_row; i < new_row + 3; i++) {
            for (int j = new_col; j < new_col + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public void solveSudoku(char[][] board) {
        check = 0;
        solve(board, 0, 0);
    }
}
