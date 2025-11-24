class Solution {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer = new ArrayList<Boolean>();
        int n = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            n = ((n << 1) + nums[i]) % 5;
            answer.add(n == 0);
        }
        return answer;
    }
}
