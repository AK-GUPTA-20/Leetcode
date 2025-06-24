class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> newArray = new ArrayList<>();
        Arrays.sort(nums1); 
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int n1 = nums1.length, n2 = nums2.length;

        while (i < n1 && j < n2) {
            if(nums1[i]<nums2[j]){
                i++;
            }

            else if(nums1[i]>nums2[j]){
                j++;
            }
            
            else{
                if(newArray.size()==0 || newArray.get(newArray.size()-1)!=nums1[i]){
                    newArray.add(nums1[i]);
                }
                i++;
                j++;
            }
            
        }


        // Convert List to int[]
        int[] result = new int[newArray.size()];
        for (int k = 0; k < newArray.size(); k++) {
            result[k] = newArray.get(k);
        }

 
        return result;
    }
}

