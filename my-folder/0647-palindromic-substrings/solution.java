class Solution {
    private static int expandAndCollect(String s, int left, int right) {
        int localCount = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            localCount++;
            left--;
            right++;
        }
        return localCount;
    }

    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes (center at i)
            count += expandAndCollect(s, i, i);

            // Even length palindromes (center between i and i+1)
            count += expandAndCollect(s, i, i + 1);
        }
        return count;
    }
}
