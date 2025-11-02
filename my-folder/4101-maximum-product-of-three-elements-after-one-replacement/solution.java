class Solution {
    public long maxProduct(int[] nums) {
        int[] arr = nums;
        int n = arr.length;
        Arrays.sort(arr);

        long k_pos = 100000L;
        long k_neg = -100000L;

        long min1 = arr[0];
        long min2 = arr[1];
        long max1 = arr[n-1];
        long max2 = arr[n-2];
        long max3 = arr[n-3];

        long prod1 = k_pos * min1 * min2;
        long prod2 = k_pos * max1 * max2;
        long prod3 = k_neg * min1 * max1;
        long prod4 = max1 * max2 * max3;
        long prod5 = min1 * min2 * max1;

        long maxProd = Math.max(prod1 , prod2);
        maxProd = Math.max(maxProd , prod3);
        maxProd = Math.max(maxProd , prod4);
        maxProd = Math.max(maxProd , prod5);

        return maxProd;
    }
}
