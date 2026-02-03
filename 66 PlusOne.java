class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, it becomes 0 and carry continues
            digits[i] = 0;
        }

        // If we reach here, all digits were 9 (e.g., [9,9,9])
        int[] result = new int[n + 1];
        result[0] = 1; // e.g., [1,0,0,0]
        return result;
    }
}
