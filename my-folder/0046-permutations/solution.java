class Solution {
    void solve(int[] nums , List<List<Integer>> ans , List<Integer> subSet , boolean[] used){
        // base case
        if(subSet.size() == nums.length) {
            ans.add(new ArrayList<>(subSet));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!used[i]) {
                // include
                subSet.add(nums[i]);
                used[i] = true;

                solve(nums , ans , subSet , used);

                // backtrack
                used[i] = false;
                subSet.remove(subSet.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        solve(nums , ans , subSet , used);

        return ans;
    }
}

