class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll(\\\\\s+\, \ \);
        s=' '+s;
        String result=\\;
        String word=\\;
        int l= s.length();
        for (int i=l-1; i>=0; i--)
        {
            if(s.charAt(i)!= ' ')
            {
                word=s.charAt(i) + word;
            }
            else if (s.charAt(i)== ' ')
            {
                result= result + word + ' ';
                word= \\;
            }

        }
        result = result.trim();
        return result;
            
    }
        
}
