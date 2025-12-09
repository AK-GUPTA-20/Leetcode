// using memoriation
class Solution {
    public boolean findTargetMEM(int[] arr , int target , int idx , Boolean[][] dp){
        if(target == 0) return true;
        if(target < 0) return false;
        if(idx == arr.length) return false;

        if(dp[idx][target] != null) return dp[idx][target];

        boolean take = findTargetMEM(arr , target - arr[idx] , idx + 1 , dp);
        boolean notTake = findTargetMEM(arr , target , idx + 1 , dp);

        dp[idx][target] = take || notTake;
        return dp[idx][target];
    }


    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums) sum+=n;

        if(sum % 2 != 0) return false;

        Boolean[][] dp = new Boolean[nums.length][(sum/2) + 1];

        return findTargetMEM(nums , sum/2 , 0 , dp);
    }
}



/*
// using recursion 
class Solution {
    public boolean findTargetRec(int[] arr , int target , int idx){
        if(target == 0) return true;
        if(target<0) return false;
        if(idx == arr.length) return false;

        boolean take = findTarget(arr , target-arr[idx] , idx+1);
        boolean notTake = findTarget(arr , target , idx+1);

        return take || notTake;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums) sum+=n;

        if(sum % 2 != 0) return false;
        return findTargetRec(nums , sum/2 , 0);
    }
}
*/
