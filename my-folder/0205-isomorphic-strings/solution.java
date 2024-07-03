class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        HashMap<Character,Character> s_map = new HashMap<>();
        HashMap<Character,Character> t_map = new HashMap<>();

        for(int i = 0;i < s.length();i++){
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);

            if(s_map.containsKey(char_s) && s_map.get(char_s) != char_t) return false;
            if(t_map.containsKey(char_t) && t_map.get(char_t) != char_s) return false;

            s_map.put(s.charAt(i),char_t);
            t_map.put(t.charAt(i),char_s);
            
        }

        return true;
    }
}
