class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0;
        int n=nums.length;

        for(int start=0 ; start<n ; start++){
            Set<Integer> even = new HashSet<>();
            Set<Integer> odds = new HashSet<>();

            for(int end=start ; end<n ; end++){
                int t = nums[end];
                if(t%2 ==0){
                    even.add(t);
                }else{
                    odds.add(t);
                }
                if(even.size() == odds.size() && even.size() > 0){
                    maxLen = Math.max(maxLen , end-start+1);
                }
            }
        }
        return maxLen;
    }
}
