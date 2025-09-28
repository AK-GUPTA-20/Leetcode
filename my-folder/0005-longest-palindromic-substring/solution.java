class Solution {
    private String check(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = check(s, i, i);     // odd-length palindrome
            String s2 = check(s, i, i + 1); // even-length palindrome
            if (s1.length() > str.length()) {
                str = s1;
            }
            if (s2.length() > str.length()) {
                str = s2;
            }
        }
        return str;
    }
}

