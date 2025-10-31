class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) max = num;
        }

        boolean[] seen = new boolean[max + 1];
        int[] result = new int[2];
        int index = 0;

        for (int num : nums) {
            if (!seen[num]) {
                seen[num] = true;
            } else {
                result[index++] = num;
                if (index == 2) break;
            }
        }

        return result;
    }
}
