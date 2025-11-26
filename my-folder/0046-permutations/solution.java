class Solution {

    private void solve(int[] nums, List<Integer> arr, List<List<Integer>> ans, boolean[] isVisited) {
        // base condition
        if (arr.size() == nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (isVisited[i]) continue;

            //do
            arr.add(nums[i]);
            isVisited[i] = true;

            //recursion
            solve(nums, arr, ans, isVisited);

            // undo
            arr.remove(arr.size() - 1);
            isVisited[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] isVisited = new boolean[nums.length];

        solve(nums, new ArrayList<>(), result, isVisited);
        return result;
    }
}

