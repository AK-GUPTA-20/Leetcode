class Solution {
    private int helper(int[] nums) {
        int secLast = nums[0];
        if (nums.length <= 1) return nums[0];
        int last = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int curr = Math.max(last, nums[i] + secLast);
            secLast = last;
            last = curr;
        }
        return last;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] dp1 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            dp1[i] = nums[i];
        }

        int[] dp2 = new int[n - 1];
        for (int i = 1; i < n; i++) {
            dp2[i - 1] = nums[i];
        }
        return Math.max(helper(dp1), helper(dp2));
    }
}
