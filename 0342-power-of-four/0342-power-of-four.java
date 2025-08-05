class Solution {
    public boolean isPowerOfFour(int n) {
        int i=0;
        while(Math.pow(4,i)<=n)
        {
            if (Math.pow(4,i)==n)
            return true;
            else
            i++;
        }
        return false;
        
    }
}