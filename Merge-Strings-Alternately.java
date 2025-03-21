class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int t = 0;
        String merged = "";  // Keep using String for concatenation

        // Merge characters alternately
        while (t < l1 || t < l2) {
            if (t < l1) merged += word1.charAt(t);
            if (t < l2) merged += word2.charAt(t);
            t++;
        }

        return merged;
    }
}
