class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];  //  make a bucket
        HashMap<Integer,Integer> map = new HashMap<>();    // make a map

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] ans = new int[k];
        int pos = 0;
        for(int i = bucket.length-1 ; i>=0 ; i--){
            if(bucket[i]!=null){
                for(int j = 0 ; j<bucket[i].size() && pos<k ; j++){
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return ans;
    }
}
