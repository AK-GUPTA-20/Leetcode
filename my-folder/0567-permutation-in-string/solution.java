class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()){
            return false;
        }

        HashMap<Character,Integer> s1count = new HashMap<>();
        HashMap<Character,Integer> s2count = new HashMap<>();

        for(int i=0 ; i<s1.length() ; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            s1count.put(ch1 , s1count.getOrDefault(ch1 ,0)+1);
            s2count.put(ch2 , s2count.getOrDefault(ch2 ,0)+1);
        }

        if(s1count.equals(s2count)){
            return true;
        }


        int left = 0 ;
        int right = s1.length();

        while(right<s2.length()){
            char oldchar = s2.charAt(left);
            if(s2count.get(oldchar)==1){
                s2count.remove(oldchar);
            }
            else{
                s2count.put(oldchar , s2count.get(oldchar)-1);
            }
            left++;

            char newchar = s2.charAt(right);
            s2count.put(newchar , s2count.getOrDefault(newchar ,0)+1);
            right++;

            if(s1count.equals(s2count)){
            return true;
            }
        }

        return false;
    }
}
