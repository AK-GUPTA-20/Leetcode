class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //  create a hashmap
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }

        // creating a space 
        List<Integer>[] lst = new ArrayList[nums.length+1];
        for(int i=0 ; i<lst.length ; i++){
            lst[i] = new ArrayList<>();
        }

        //putting the values
        for(int key : mp.keySet() ){
            int idx = mp.get(key);
            lst[idx].add(key);
        }


        //  adding top k element in new list
        int[] res = new int[k];
        int ind = 0;
        for(int i=lst.length-1 ; i>=0 ; i--){
            for(int num : lst[i]){
                res[ind++] = num;
            }
            if(ind == k) return res;
        }

    return res;

    }
}
