class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int alt [] = new int [n+1];
        int c=0;
        alt[c]=0;
        c++;
        int max=0;
        for (int i=0; i<n; i++ )
        {
            alt[c] = alt[c-1] + gain[i];
            c++;
        }
        for(int i=0; i<n+1; i++)
        {
            max= Math.max(max, alt[i]);
        }
        return max;
    }
}