class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            char first = s.charAt(i);
            char last  = s.charAt(j);

            if (!Character.isLetterOrDigit(first)){
                i++;
                continue;
            }   

            if (!Character.isLetterOrDigit(last)){
                j--;
                continue;
            }

            if(Character.toLowerCase(first)!= Character.toLowerCase(last))    return false;
            i++;
            j--;
        }

        return true;
    }
}
