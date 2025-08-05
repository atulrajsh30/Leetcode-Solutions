class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0;
        while(Math.pow(2,x)<=n)
        {
            if(Math.pow(2,x)==n)
            return true;
            else 
            x++;
        }
        return false;
        
    }
}