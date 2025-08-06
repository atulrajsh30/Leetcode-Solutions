/*class Solution {
    public int countSegments(String s) {
        s=s.trim();
        s= s+ " ";
        if(s.charAt(0)==' ')
        return 0;
        int l= s.length();
        int c=0;
        for (int i=0; i<l; i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            continue;
            else 
            c+=1;
        }
        return c;
        
    }
}*/
class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }
}
