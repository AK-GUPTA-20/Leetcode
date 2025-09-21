class Solution {
    void backtrack(List<List<String>> res , char[][] board , int i){
        // base case
        if(i == board.length){
            List<String> temp = new ArrayList<>();
            for(char[] ch : board){
                temp.add(new String(ch));
            }
            res.add(temp);
            return;
        }
        for(int j=0 ; j<board.length ; j++){
            if(isSafe(board , i , j)){
                board[i][j] = 'Q';
                backtrack(res , board , i+1);
                board[i][j] = '.';
            }
        }
        
    }

    private boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        
        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
        
        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        
        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        
        return true;
    }


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(res , board , 0);

        return res;
    }
}
