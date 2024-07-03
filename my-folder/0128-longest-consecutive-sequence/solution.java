class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int i : nums)  st.add(i);

        int max_len =0;
        for (int num : nums){
            if(!st.contains(num-1)){
                int curr_val = num;
                int curr_len = 1;

                while(st.contains(curr_val+1)){
                    curr_val++;
                    curr_len++;
                }
            max_len = Math.max(curr_len , max_len);
            }
        }
        return max_len;
    }
}
