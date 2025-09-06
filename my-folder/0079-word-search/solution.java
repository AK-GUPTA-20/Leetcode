class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] isVisited = new boolean[n][m];
        

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(foundOrNot(board ,word, i , j , 0 , isVisited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean foundOrNot(char[][] board ,String word, int i , int j , int idx , boolean[][] isVisited){
        //base case
        if(idx == word.length()){
            return true;
        }
        if(i>= board.length || j>= board[0].length || j<0 || i<0 || isVisited[i][j] || board[i][j] != word.charAt(idx)){
            return false;
        }


        isVisited[i][j] = true;
        // check conditions
        boolean check = foundOrNot(board ,word, i+1 , j , idx+1 , isVisited) ||
                        foundOrNot(board ,word, i-1 , j , idx+1 , isVisited) ||
                        foundOrNot(board ,word, i , j+1 , idx+1 , isVisited) ||
                        foundOrNot(board ,word, i , j-1 , idx+1 , isVisited) ;


        isVisited[i][j] = false;

        return check;
    }
}
