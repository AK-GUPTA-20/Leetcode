class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int ind = -1;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] > max){
                max= arr[i];
                ind = i;
            }
        }
        return ind;
        
    }
}
