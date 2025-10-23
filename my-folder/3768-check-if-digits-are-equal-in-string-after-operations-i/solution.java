class Solution {
    public boolean hasSameDigits(String s) {
        // Convert the string to a list of digits
        List<Integer> digits = new ArrayList<>();
        for (char c : s.toCharArray()) {
            digits.add(c - '0');
        }

        // Repeat the operation until only two digits remain
        while (digits.size() > 2) {
            List<Integer> next = new ArrayList<>();
            for (int i = 0; i < digits.size() - 1; i++) {
                int sum = (digits.get(i) + digits.get(i + 1)) % 10;
                next.add(sum);
            }
            digits = next;
        }

        // Check if the final two digits are equal
        return digits.get(0).equals(digits.get(1));
    }
}
