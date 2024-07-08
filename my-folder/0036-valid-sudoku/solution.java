class Solution {
    public boolean isValid(char[][] board , int row , int col , int num){
        // Checking row and column:-
        for(int i=0 ; i<9 ; i++){
            if(board[i][col] == num) return false;
        }

        for(int j=0 ; j<9 ; j++){
            if(board[row][j] == num ) return false;
        }


        // checking in 3X3 Mstrix: 

        int S_row = row/3*3;
        int S_col = col/3*3;

        for(int i=S_row ; i<S_row+3 ; i++){
            for(int j=S_col ; j<S_col+3 ; j++){
                if(board[i][j] == num) return false;
            }
        }
        return true;
    }


    public boolean isValidSudoku(char[][] board) {
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                if(board[i][j] == '.')  continue;
                char num = board[i][j];
                board[i][j] = '.';
                if(isValid(board,i,j,num)==false) return false;
                board[i][j] = num;
            }
        }
        return true;
    }
}
