class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int index = 0;   
        
        for (int num = 1; num <= n && index < target.length; num++) {

            res.add("Push");

            if (num == target[index]) {
                index++;   
            } else {
                res.add("Pop");  
            }
        }

        return res;
    }
}

