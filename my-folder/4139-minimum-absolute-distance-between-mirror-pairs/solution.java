class Solution {
    private int reverse(int x){
        int res = 0;
        while(x>0){
            res = res * 10 + (x%10);
            x /= 10;
        }
        return res;
    }
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++) {
            map.put(nums[i],i);
        }

        int minDist = Integer.MAX_VALUE;

        for(int i=0 ; i<nums.length ; i++){
            int myNum = reverse(nums[i]);
            if(map.containsKey(myNum) && map.get(myNum) > i){
                minDist = Math.min(minDist , map.get(myNum) - i );
            }
            
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
