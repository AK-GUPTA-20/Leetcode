class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % k == 0){
                count += entry.getKey() * entry.getValue();
            }
        }
        return count;
    }
}
