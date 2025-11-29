class Solution {
    public void getCandidate(int[] arr, int target, int idx, List<List<Integer>> ans, List<Integer> temp ){
        // base Case
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;        
        }
        if(target < 0 || arr.length<=idx){    
            return;        
        }

        // Single Include
        temp.add(arr[idx]);
 
        getCandidate(arr, target-arr[idx], idx, ans, temp);
        temp.remove(temp.size()-1);
        getCandidate(arr, target, idx+1, ans, temp);
        

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        getCandidate(candidates, target, 0, result, new ArrayList<>() );
        return result;
    }
}
