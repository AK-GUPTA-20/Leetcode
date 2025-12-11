class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int fSum = 0;
        int fDiff = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length-2 ; i++){
            int j = i+1;
            int k=nums.length-1;
            while(k>j){
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum-target);
                if(diff<fDiff){
                    fDiff = diff;
                    fSum = sum;
                }
                if(sum<target) j++;
                else k--;
            }
        }
        return fSum;
    }
}
