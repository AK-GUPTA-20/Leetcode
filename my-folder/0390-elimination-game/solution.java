class Solution {
    public int lastRemaining(int n) {
        return helper(n);
    }

    private int helper(int n) {
        if (n == 1) return 1;

        return 2 * (1 + n/2 - helper(n/2));
    }
}

