class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sumL = 0;
        int sumS = 0;
        int j=nums.length-1;
        for(int i=0 ; i<k ; i++){
            sumL+=nums[i];
            sumS+=nums[j--];
        }
        return Math.abs(sumL-sumS);
    }
}
