class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int count = 0;

        int prev1 = 3;
        int prev2 = 2;

        for (int i = 3; i < n; i++) {
            count = prev1 + prev2;
            prev2 = prev1;
            prev1 = count;
        }
        return count;
    }
}
