class Solution {
    public int search(int[] nums, int target) {
        int piv = piviot(nums);
        int left = Binary_Searching(nums,target,0,piv);
        int right = Binary_Searching(nums,target,piv+1,nums.length-1);
        if(left != -1) return left;
        else if(right != -1)  return right ;
        else return -1;
        
    }


    static int piviot(int[] arr ){
        int max = Integer.MIN_VALUE;
        int ind = 0;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] > max){
                max = arr[i];
                ind = i;
            }
        }
        return ind;

    }    

    static int Binary_Searching(int[] arr , int x , int l , int r) {
        while(l<=r){
            int mid = (l+r)/2;
            if (arr[mid] == x){
                return mid;
            }
            else if (x<arr[mid]) {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}
