class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int n = nums.length;
        int sum = 0;

        while (r < n) {
            sum += nums[r++];

            while (sum >= target) {
                minLen = Math.min(minLen, r - l);
                sum -= nums[l++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
