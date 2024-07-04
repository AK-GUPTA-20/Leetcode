class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int left = 0;
        int max_len = 0;
        for(int i=0 ; i<s.length() ; i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(i));
            max_len = Math.max(max_len , i-left+1);
        }
    return max_len;
    }
}
