class Solution {
    public int reverse(int x) {
        int rev_num = 0;
        int last_digit = 0;
        while(x!=0){
             if (rev_num > Integer.MAX_VALUE / 10 || rev_num < Integer.MIN_VALUE / 10) {
                return 0;
            }
            last_digit = x%10;
            rev_num = (rev_num * 10)+last_digit;
            x=x/10;
        }
        return rev_num;
        
    }
}
