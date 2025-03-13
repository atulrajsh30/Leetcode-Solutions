class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        double sum=0.0;
        for (int i=0; i<k; i++)
        {
            sum+=nums[i];
        }
        double max=sum;
        for(int i=1; i<=n-k; i++)
        {
            sum= sum-nums[i-1] + nums[i+k-1];
            if(sum>max)
            max=sum;
        }
        double avg= max/k;
        return avg;
    }
}