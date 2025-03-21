class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] charArray = s.toCharArray(); 
        String vowels = \aeiouAEIOU\; 

        while (start < end) {
            while (start < end && vowels.indexOf(charArray[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(charArray[end]) == -1) {
                end--;
            }
            if (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }

        // Convert char array back to string
        return new String(charArray);
    }
}
