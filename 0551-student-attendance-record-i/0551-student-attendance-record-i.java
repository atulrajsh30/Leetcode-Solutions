class Solution {
    public boolean checkRecord(String s) {
        int absents = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                absents++;
                if (absents >= 2) return false;
            }

            // Check for 3 consecutive 'L's
            if (i >= 2 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
                return false;
            }
        }

        return true;
    }
}
