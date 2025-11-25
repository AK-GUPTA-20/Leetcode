class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        return helper(k, 0, 1);  
    }

    int helper(int k, int remainder, int length) {
        remainder = (remainder * 10 + 1) % k;
        if (remainder == 0) return length;
        if (length > k) return -1; 
        return helper(k, remainder, length + 1);
    }
}
