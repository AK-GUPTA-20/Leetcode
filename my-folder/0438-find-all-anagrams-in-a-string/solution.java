class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> List = new ArrayList<>();

        if (s.length() < p.length()) return new ArrayList<>();

        HashMap<Character,Integer> Smap = new HashMap<>();
        HashMap<Character,Integer> Pmap = new HashMap<>();

        for(int i=0 ; i<p.length() ; i++){
            char Schar = s.charAt(i);
            char Pchar = p.charAt(i);
            Smap.put(Schar , Smap.getOrDefault(Schar,0)+1); 
            Pmap.put(Pchar , Pmap.getOrDefault(Pchar,0)+1); 
        }

        if(Smap.equals(Pmap)){
            List.add(0);
        }


        int left = 0;
        int right = p.length();
        while(right<s.length()){
            char newChar = s.charAt(right);
            char oldChar = s.charAt(left);
            Smap.put(newChar , Smap.getOrDefault(newChar,0)+1);
            right++;
            if(Smap.get(oldChar)>1){
                Smap.put(oldChar,Smap.get(oldChar)-1);
            }else{
                Smap.remove(oldChar);
            }
            left++;

            // check both hashmap
            if(Smap.equals(Pmap)){
                List.add(left);
            }
        }
        return List;
    }
}
