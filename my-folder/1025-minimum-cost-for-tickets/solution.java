class Solution {
    private int helper(int[] days, int[] costs, int idx, int[] dp) {
        int n = days.length;
        if(idx >= n) return 0;

        if(dp[idx] != -1) return dp[idx];

        // Choice 1: 1-day pass
        int choice1 = costs[0] + helper(days, costs, idx + 1, dp);

        // Choice 2: 7-day pass
        int j = idx;
        int limit7 = days[idx] + 7;
        while(j < n && days[j] < limit7) j++;
        int choice2 = costs[1] + helper(days, costs, j, dp);

        // Choice 3: 30-day pass
        int k = idx;
        int limit30 = days[idx] + 30;
        while(k < n && days[k] < limit30) k++;
        int choice3 = costs[2] + helper(days, costs, k, dp);

        return dp[idx] = Math.min(choice1, Math.min(choice2, choice3));
    }

    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(days, costs, 0, dp);
    }
}

