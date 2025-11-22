class Solution {
    public boolean predictTheWinner(int[] nums) {
        int diff = helper(nums, 0, nums.length - 1);
        return diff >= 0; 
    }

    int helper(int[] nums, int i, int j) {
        if (i == j) return nums[i];
        int pickLeft = nums[i] - helper(nums, i + 1, j);
        int pickRight = nums[j] - helper(nums, i, j - 1);

        return Math.max(pickLeft, pickRight);
    }
}
