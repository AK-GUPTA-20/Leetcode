class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        int resLen = 0;
        for(int right=0 ; right<s.length() ; right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                int index  = map.get(ch);
                if(index>=left){
                    left = index + 1;
                }  
            }
            map.put(ch,right);
            resLen = Math.max(resLen , right-left+1);
        }

        return resLen;
    }
}
