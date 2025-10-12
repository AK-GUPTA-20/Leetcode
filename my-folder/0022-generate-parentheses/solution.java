class Solution {
    void backtracking(List<String> res , int n , int left , int right , String s ){
        if(left == n && right == n){
            res.add(s);
        }

        if(left<n){
            backtracking(res , n , left+1 , right , s+"(");
        }
        if(right<left){
            backtracking(res , n , left , right+1 , s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking(res , n , 0 , 0 ,"");

        return res;
    }
}
