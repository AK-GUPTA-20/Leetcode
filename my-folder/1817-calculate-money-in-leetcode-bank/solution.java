class Solution {
    int triSum(int n) {
        return (n * (n + 1)) >> 1;
    }

    public int totalMoney(int days) {
       

        return triSum(days) - 42 * triSum((days / 7) - 1) - 6 * (days / 7) * (days % 7);
    }
}

