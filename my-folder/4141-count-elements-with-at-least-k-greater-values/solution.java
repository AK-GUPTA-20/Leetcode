class Solution {
    private int helper(int[] arr, int target){
        int l=0 , r=arr.length;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid] <= target) l=mid+1;
            else r= mid;
        }
        return l;
    }
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length ;
        int count =0 ;
        for(int i = 0 ; i<n; i++){
            int j = helper(nums,nums[i]);
            int greater = n-j;
            if(greater>=k) count++;
        }
        return count;
    }
}
