class Solution {
    int[] Merge(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1 + n2;
        int mid = total / 2 + 1; 
        int[] merged = new int[mid];

        int i = 0, j = 0, k = 0;
        while (k < mid) {
            if (i < n1 && (j >= n2 || nums1[i] <= nums2[j])) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        return merged;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int[] arr = Merge(nums1, nums2);
        int total = nums1.length + nums2.length;

        if (total % 2 == 0) {
            median = (arr[arr.length - 1] + arr[arr.length - 2]) / 2.0;
        } else {
            median = arr[arr.length - 1];
        }

        return median;
    }
}
