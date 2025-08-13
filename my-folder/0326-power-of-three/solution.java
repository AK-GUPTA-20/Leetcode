class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        
        int maxPowerOf3 = 1162261467 ; 
        return maxPowerOf3 % n == 0;
    }
}
