class Solution {
    public int maxVowels(String s, int k) {
        s=s.toUpperCase();
        int count=0;
        int maxC=0;
        for (int i=0; i<k; i++)
        {
            char ch= s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            count++;
        }
        maxC= count;
        for (int i=1; i<=s.length()-k; i++)
        {
            char t= s.charAt(i-1);
            if(t=='A'||t=='E'||t=='I'||t=='O'||t=='U')
            count--;
            char t2= s.charAt(i+k-1);
            if(t2=='A'||t2=='E'||t2=='I'||t2=='O'||t2=='U')
            count++;
            maxC= Math.max(maxC, count);
        }
        return maxC;
    }
}