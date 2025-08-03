class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length())
        return false;
        char sar[] = s.toCharArray();
        char tar[] = t.toCharArray();
        Arrays.sort(sar);
        Arrays.sort(tar);
        return Arrays.equals(sar,tar);
    }
}