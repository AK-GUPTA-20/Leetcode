class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = k+1;
        for(int num : nums){
            if(num == 1){
                if(count < k) return false;
                count = 0;
            }else{
                count++;
            }
        }

        return true;
    }
}
