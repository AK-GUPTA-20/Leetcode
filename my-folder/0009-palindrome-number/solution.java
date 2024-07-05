class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int new_num = x;
        int rev_num = 0;

        while(x>0){
            int last_dig = (x%10);

            rev_num = (rev_num *10)+last_dig;
            x /=10;
        }
    return(rev_num == new_num);
    }
}
