class Solution {
    public void solve(String s, int pos,  List<String> ans, String str){
        if(pos==s.length()){
            ans.add(str);
            return;
        }
        char ch = s.charAt(pos);
        if(Character.isDigit(ch)){
            solve(s, pos+1, ans, str+ch);
        }
        else{
            solve(s, pos+1, ans, str+Character.toLowerCase(ch));
            solve(s, pos+1, ans, str+Character.toUpperCase(ch));
        }

    }
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        solve(s, 0, result,"");
        return result;
    }
}
