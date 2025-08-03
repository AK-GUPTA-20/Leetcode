class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int num : nums){
            map.put(num , map.get(num)+1);
        }

        int start = 0;
        for(int i=0 ; i<3 ; i++){
            int freq = map.get(i);
            for(int j=start ; j<freq+start ; j++){
                nums[j] = i;
            }
            start += freq ;
        }
    }
}
