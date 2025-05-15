class Solution {
    public int lengthOfLongestSubstring(String s) {  
        int[] lastSeen = new int[128]; // ASCII size
        for (int i = 0; i < 128; i++) lastSeen[i] = -1;

        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastSeen[c] >= start) {
                start = lastSeen[c] + 1;
            }
            lastSeen[c] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }

    

}