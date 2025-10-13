class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (!result.isEmpty() && isAnagram(result.get(result.size() - 1), word)) {
                // If current word is an anagram of previous, skip it
                continue;
            }
            result.add(word);
        }
        
        return result;
    }

    // Helper function to check if two words are anagrams
    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a, b);
    }
}

