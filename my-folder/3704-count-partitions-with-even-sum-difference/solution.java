class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int sum =0;
        for(int num:nums) sum+=num;

        int leftSum = 0;
        for(int i=0 ; i<nums.length-1 ; i++){
            leftSum += nums[i];
            int rightsum = sum - leftSum;
            if((rightsum-leftSum) % 2 == 0) count++;
        }
        return count;
    }
}
