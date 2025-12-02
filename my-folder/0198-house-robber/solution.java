// optimal code 
class Solution {
    public int rob(int[] nums) {       
        int secLast=nums[0];
        if(nums.length<=1)return nums[0];
        int last = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            int curr = Math.max(last,nums[i]+secLast);
            secLast=last;
            last=curr;
        }
        return last;

    } 
}
