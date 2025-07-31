class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }

        int longestStreak = 0;
        for(int num : st){
            if(!st.contains(num-1)){
                int streak = 1;
                int currNum = num;
                while(st.contains(currNum+1)){
                    streak++;
                    currNum++;
                }
                longestStreak = Math.max(longestStreak , streak );
            }
        }
        return longestStreak;
    }
}
