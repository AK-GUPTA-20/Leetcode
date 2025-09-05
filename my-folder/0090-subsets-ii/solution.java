class Solution {
    void createSubset(int[] nums , int i , List<List<Integer>> ans , List<Integer> subSet){
        if(nums.length == i){
            //print or add
            ans.add(new ArrayList<>(subSet));
            return;
        }

        // include
        subSet.add(nums[i]);
        // backtrack
        createSubset(nums , i+1 , ans , subSet);
        // exclude
        subSet.remove(subSet.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        createSubset(nums , i+1 , ans , subSet);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();
        Arrays.sort(nums);
        createSubset(nums , 0 , ans , subSet);
        return ans;
    }
}
