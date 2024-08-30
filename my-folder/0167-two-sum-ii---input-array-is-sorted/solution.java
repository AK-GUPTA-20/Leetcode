class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        for(int i=0 ; i<numbers.length-1 ; i++){
            if((numbers[left] + numbers[right]) == target)   return new int[] {left+1 , right+1};
            else if ((numbers[left] + numbers[right]) > target) right--;
            else left++;
        }
        return new int[] {-1,-1};
    }
}
