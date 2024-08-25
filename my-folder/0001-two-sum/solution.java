class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            mp.put(nums[i],i);
        }


        for(int i=0 ; i<n ; i++){
            int number = target-nums[i];
            if(mp.containsKey(number) && mp.get(number)!=i){
                return new int[] {i,mp.get(number)};
            }
        }
        return new int[]{};
    }
}
