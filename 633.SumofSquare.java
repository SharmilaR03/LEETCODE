class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 2; i * i <= c; i++) {
            int count = 0;

            while (c % i == 0) {
                count++;
                c /= i;
            }

            // If prime is of form (4k + 3) and appears odd times
            if (i % 4 == 3 && count % 2 != 0) {
                return false;
            }
        }

        // Final remaining prime check
        return c % 4 != 3;
    }
}
