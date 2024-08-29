class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char first = s.charAt(i);
            char last = s.charAt(j);

            // Skip non-alphanumeric characters from the start
            if (!Character.isLetterOrDigit(first)) {
                i++;
                continue;
            }

            // Skip non-alphanumeric characters from the end
            if (!Character.isLetterOrDigit(last)) {
                j--;
                continue;
            }

            // Compare the characters, ignoring case
            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                return false;
            }

            // Move pointers inward
            i++;
            j--;
        }

        return true;
    }
}

