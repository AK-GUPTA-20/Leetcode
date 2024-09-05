import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array to use two-pointer technique
        int closest = nums[0] + nums[1] + nums[2]; // Initialize with a valid triplet sum
        
        for (int i = 0; i < nums.length - 2; i++) { // Loop through each number
            int j = i + 1; // The second pointer
            int k = nums.length - 1; // The third pointer

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                // If the sum exactly matches the target, return it
                if (sum == target) {
                    return sum; // This is the closest possible sum (no gap)
                }

                // Update closest if this sum is closer to the target than the previous one
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers based on the sum comparison
                if (sum > target) {
                    k--; // We need a smaller sum, move the right pointer left
                } else {
                    j++; // We need a larger sum, move the left pointer right
                }
            }
        }

        return closest; // Return the closest sum found
    }
}
