class Solution {
    public int findMin(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            numbers.add(nums[i]);
        }
        Collections.sort(numbers);
        return numbers.get(0);
    }
}
