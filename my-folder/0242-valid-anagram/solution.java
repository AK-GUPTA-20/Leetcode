class Solution {
    static HashMap<Character,Integer> MakeHashMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = MakeHashMap(s);
        HashMap<Character,Integer> mp2 = MakeHashMap(t);
        return mp1.equals(mp2);
    }
}
