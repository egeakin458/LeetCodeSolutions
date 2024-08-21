class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            // If characters match, move to the next character in `s`
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move to the next character in `t`
            j++;
        }

        // If all characters of `s` were found in `t` in order, `i` should be equal to `s.length()`
        return i == s.length();
    }
}