class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = getMax(nums);

        // find divisior using binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (computeSum(nums, mid) > threshold) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int computeSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; // Equivalent to ceil(num / divisor)
        }
        return sum;
    }

    //  find max value in nums
    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max)
                max = num;
        }
        return max;
    }
}
