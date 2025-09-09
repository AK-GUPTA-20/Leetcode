class Solution {
    public int subsetXORSum(int[] nums) {
        return recurrsion(nums, 0, 0);
    }

    private int recurrsion(int[] nums, int ptr, int xor) {
        if(ptr==nums.length) {
            return xor;
        }
        return recurrsion(nums, ptr+1, xor^nums[ptr]) + recurrsion(nums, ptr+1, xor);
    }
}
