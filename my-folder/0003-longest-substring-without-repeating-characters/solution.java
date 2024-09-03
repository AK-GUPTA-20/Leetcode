class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> st = new HashSet<>();
        int l=0;
        int r=0;
        int maxlen = 0;

        while(r<s.length()){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
      
    return maxlen;
    }
}
