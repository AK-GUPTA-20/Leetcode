class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > majorityCount) {
                return num;
            }
        }
        return -1; 
    }
}
