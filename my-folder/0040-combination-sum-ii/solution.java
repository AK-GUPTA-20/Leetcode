import java.util.*;

class Solution {
    void createCombination(int[] arr, int target, int idx, List<List<Integer>> ans, List<Integer> lst) {
        if (target == 0) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            // skip duplicates
            if (i > idx && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            lst.add(arr[i]);
            createCombination(arr, target - arr[i], i + 1, ans, lst); 
            lst.remove(lst.size() - 1); // backtrack
        }
    }

    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr); 
        createCombination(arr, target, 0, ans, new ArrayList<>());
        return ans;
    }
}

