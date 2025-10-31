class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = max(weights); 
        int high = sum(weights);
        int res = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(weights, days, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }

    int sum(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        return s;
    }

    int max(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    boolean isPossible(int[] weights, int days, int maxCap) {
        int count = 1;
        int load = 0;

        for (int weight : weights) {
            if (load + weight > maxCap) {
                count++;
                load = 0;
            }
            load += weight;
        }

        return count <= days;
    }
}
