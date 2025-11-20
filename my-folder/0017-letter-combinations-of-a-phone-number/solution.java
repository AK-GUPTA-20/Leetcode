class Solution {
    String[] map = {" "," ","abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        helper(digits , 0 , "" , ans);
        return ans;
    }

    public void helper(String digits , int idx , String curr , List<String> ans){
        if(idx == digits.length()) {
            ans.add(curr);
            return ;
        }
        for(char c : map[digits.charAt(idx)-'0'].toCharArray()){
            helper(digits, idx+1 , curr+c , ans);
        }
    }
}
