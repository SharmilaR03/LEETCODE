class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            long number = 1;   // use long to prevent overflow during calculation

            for (int j = 0; j <= i; j++) {
                row.add((int) number);
                number = number * (i - j) / (j + 1);
            }

            result.add(row);
        }

        return result;
    }
}
