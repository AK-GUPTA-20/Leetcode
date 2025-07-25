import java.util.HashMap;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        
        for (int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
        }

        
        if (s1Map.equals(windowMap)) return true;

        
        for (int i = s1.length(); i < s2.length(); i++) {
            char newChar = s2.charAt(i);                     
            char oldChar = s2.charAt(i - s1.length());       

            
            windowMap.put(newChar, windowMap.getOrDefault(newChar, 0) + 1);

            
            if (windowMap.get(oldChar) == 1) {
                windowMap.remove(oldChar);
            } else {
                windowMap.put(oldChar, windowMap.get(oldChar) - 1);
            }

            
            if (s1Map.equals(windowMap)) return true;
        }

        return false;
    }
}
