class Solution {
    public int findFinalValue(int[] nums, int original) {
        int max = 0;
        for (int n : nums) max = Math.max(max, n);
        max++;

        boolean[] arr = new boolean[max];
        for(int i: nums) arr[i]=true;
        while(original < max && arr[original]){
            original = original * 2;
        };
        return original;
    }
}
