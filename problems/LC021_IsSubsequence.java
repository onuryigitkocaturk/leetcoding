public class LC021_IsSubsequence {

    // My initial solution, bad approach, relies on defensive checks inside the loop
    // Time complexity: O(n)
    // Space complexity: O(1)
    public boolean isSubsequenceFirstApproach(String s, String t) {
        int i = 0;
        int j = 0;

        if (s.isEmpty()) {
            return true;
        }

        if (t.isEmpty()) {
            return false;
        }

        while (i <= s.length() && j <= t.length()) {

            if (i == s.length()) {
                return true;
            }

            if (j == t.length()) {
                return false;
            }

            if (s.charAt(i) != t.charAt(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        return false;
    }

    // It should be as follows
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
