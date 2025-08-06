/*class Solution {
    public boolean detectCapitalUse(String word) {
        int l= word.length();
        for (int i=0; i<l; i++)
        {
            char ch=word.charAt(i);
            if(ch>='A'&& ch<='Z')
            continue;
            else 
            return false;
        }
        return true;
    }
}*/
class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();

        // Case 1: All uppercase
        if (word.equals(word.toUpperCase())) return true;

        // Case 2: All lowercase
        if (word.equals(word.toLowerCase())) return true;

        // Case 3: First letter uppercase, rest lowercase
        if (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }
}


