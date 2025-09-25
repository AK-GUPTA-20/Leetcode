class Solution {
    boolean checkValid(int[][] grid , int row , int col , int val){
        int n = grid[0].length;
        // base value check
        if(row<0 || col<0 || row>=n || col>=n || grid[row][col] != val) return false;

        if(grid[row][col] == n*n-1) return true;

        // check all the 8 configuration
        boolean ans1 = checkValid(grid , row-1 , col+2 , val+1);
        boolean ans2 = checkValid(grid , row-2 , col+1 , val+1);
        boolean ans3 = checkValid(grid , row+1 , col+2 , val+1);
        boolean ans4 = checkValid(grid , row+2 , col+1 , val+1);
        boolean ans5 = checkValid(grid , row+2 , col-1 , val+1);
        boolean ans6 = checkValid(grid , row+1 , col-2 , val+1);
        boolean ans7 = checkValid(grid , row-1 , col-2 , val+1);
        boolean ans8 = checkValid(grid , row-2 , col-1 , val+1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
    public boolean checkValidGrid(int[][] grid) {
        return checkValid(grid , 0 , 0 , 0 );
    }
}
