class Solution {
    void createSubset(int[] nums , int i , List<List<Integer>> ans  , List<Integer>subSet){
        if (nums.length == i) {
            // print or add
            ans.add(new ArrayList<>(subSet));
            return;
        }

        // include 
        subSet.add(nums[i]);
        createSubset(nums , i+1 , ans , subSet);
        // backtrack
        subSet.remove(subSet.size()-1);
        createSubset(nums , i+1 , ans , subSet);


    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();

        createSubset(nums , 0 , ans , subSet);
        return ans;
    }
}
