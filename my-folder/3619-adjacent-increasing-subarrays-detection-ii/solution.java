class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int inc = 1 , prevInc = 0 , maxLen = 0;

        for(int i=1 ; i<nums.size() ; i++){
            if(nums.get(i-1) < nums.get(i)){
                inc++;
            }else{
                prevInc = inc;
                inc = 1;
            }
            maxLen = Math.max(maxLen, Math.max(inc / 2, Math.min(prevInc, inc)));
        }
        return maxLen;
    }
}
