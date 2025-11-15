class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length+1];
        ArrayList<Integer> mis = new ArrayList<Integer>();
        for(int i = 1;i<=nums.length;i++){
            arr[nums[i-1]]+=1;
        }
        for(int i =1;i<=nums.length;i++){
            if(arr[i]==0){
                mis.add(i);
            }
        }
        return mis;
    }
}
