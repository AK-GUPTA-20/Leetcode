class Solution {

    public int greaterElement(int[] arr, int num) {
        if(arr[arr.length-1] == num) return -1;

        // Find index of num in arr
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

      
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > num) {
                return arr[i];
            }
        }

        

        return -1;  
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = greaterElement(nums2, nums1[i]);
        }

        return nums1;
    }
}

