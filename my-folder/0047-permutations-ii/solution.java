import java.util.*;

class Solution {
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void solve(int[] nums, List<List<Integer>> ans, int idx) {
        if (idx == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

        HashSet<Integer> used = new HashSet<>();

        for (int i = idx; i < nums.length; i++) {
            if (used.contains(nums[i])) continue; 
            used.add(nums[i]);

            swap(nums, idx, i);             
            solve(nums, ans, idx + 1);       
            swap(nums, idx, i); 
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, ans, 0); 
        return ans;
    }
}

