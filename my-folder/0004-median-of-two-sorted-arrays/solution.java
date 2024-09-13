class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int[] arr = new int[n];
        int i=0 , j=0 , k=0;

        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }

        }

        while(i<n1){
            arr[k++] = nums1[i++];
        }

        while(j<n2){
            arr[k++] = nums2[j++];
        }

        double median;
        int m =n/2;
        if(n%2!=0){
            median=arr[m];
        }
        else{
            median=(arr[m-1]+arr[m])/2.0;
        }
        return median;
    }
}
