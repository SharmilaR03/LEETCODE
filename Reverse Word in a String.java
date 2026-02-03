class Solution {
    public String reverseWords(String s) {
        int i = s.length() - 1;
        StringBuilder result = new StringBuilder();

        while (i >= 0) {
            // skip spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            int j = i;

            // find the start of the word
            while (i >= 0 && s.charAt(i) != ' ') i--;

            if (j >= 0) {
                result.append(s.substring(i + 1, j + 1)).append(" ");
            }
        }

        return result.toString().trim();
    }
}
