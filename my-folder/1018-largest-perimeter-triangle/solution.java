class Solution {
    public int largestPerimeter(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i=nums.length-1 ; i>=2 ; i--){
           if(nums[i]<nums[i-1]+nums[i-2]) {
                int cal =  nums[i] + nums[i-1] + nums[i-2];
                ans = Math.max(ans,cal);
           } 
        }
        return ans;
    }
}
