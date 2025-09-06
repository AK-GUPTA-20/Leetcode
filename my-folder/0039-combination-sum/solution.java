class Solution {
    void getCombination(int[] arr, int target ,  List<List<Integer>> ans , List<Integer> lst , int idx){
        //base case
        
        if(target == 0){
            ans.add(new ArrayList<>(lst));
            return;
        }

        if(idx == arr.length || target < 0){
            return ;
        }

        

        // single include
        lst.add(arr[idx]);
       
        //multiple include 
        getCombination(arr , target-arr[idx] , ans , lst , idx);

        //exclude {before exclude remove/clear}

        lst.remove(lst.size()-1);
        getCombination(arr , target , ans , lst , idx+1);

    }


    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();

        getCombination(arr,target , ans , lst , 0);
        return ans;
    }
}
