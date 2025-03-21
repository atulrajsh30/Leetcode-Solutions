class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = t.length();
        int len2 = s.length();
        int c = 0;
        int z = 0;
        
        for (int i = 0; i < len; i++) {
            // Ensure c does not exceed the length of s
            if (c < len2 && s.charAt(c) == t.charAt(i)) {
                c++;
                z++;
            }
        }
        
        // Check if all characters in s were matched
        return z == len2;
    }
}
