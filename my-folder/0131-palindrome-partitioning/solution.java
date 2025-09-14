class Solution {

    void solve(String s ,List<List<String>> ans ,List<String> temp ,int idx){
        if(idx == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx ; i<s.length() ; i++){
            if(checkPalindrome(s , idx, i)){
                String str = s.substring(idx,i+1);
                temp.add(str);
                solve(s ,ans ,temp ,i+1);
                temp.remove(temp.size()-1);

            } 
        }
    }

    boolean checkPalindrome(String s , int l , int r){
        while(l<r){
            if(s.charAt(l++)!= s.charAt(r--)) return false;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        solve(s ,ans ,temp ,0);

        return ans;
    }
}
