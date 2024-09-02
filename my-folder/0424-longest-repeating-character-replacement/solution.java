class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxf = 0;
        int maxlen = 0;
        int[] hash = new int[26];

        while (r < s.length()) {  

            // Counting the number of characters
            hash[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, hash[s.charAt(r) - 'A']);

            // Condition out of bound
            while ((r - l + 1) - maxf > k) {
                hash[s.charAt(l) - 'A']--;  
                l++;
            }

            // Updating the maxlen
            maxlen = Math.max(maxlen, r - l + 1);

            r++;
        }
        return maxlen;
    }
}

