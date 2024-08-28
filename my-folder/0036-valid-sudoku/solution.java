class Solution {
    private boolean check_isValid(int row , int col , char[][] board , int num){
        // check the row
        for(int j=0 ; j<9 ; j++){
            if(board[row][j]==num) return false;
        }

        // check column
        for(int i=0 ; i<9 ; i++){
            if(board[i][col]==num) return false;
        }

        // check the 3X3 Matrix
        int new_row = row/3*3;
        int new_col = col/3*3;
        for(int i=new_row ; i<new_row+3  ; i++){
            for(int j=new_col ; j<new_col+3 ; j++){
                if(board[i][j] == num ) return  false;
            }
        }


        return true;
    }


    public boolean isValidSudoku(char[][] board) {
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                if(board[i][j] == '.')    continue;
                char num = board[i][j];
                board[i][j] = '.';
                if(check_isValid(i,j,board,num)==false) return false;
                board[i][j] = num;
            }
        }

        return true;
    }
}
