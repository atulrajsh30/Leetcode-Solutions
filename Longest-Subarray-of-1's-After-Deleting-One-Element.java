class Solution {
    public int longestSubarray(int[] nums) {
        int start=0;
        int flipped=0;
        int max=0;
        for (int i=0; i< nums.length; i++)
        {
            if(nums[i]==0)
            flipped++;
            while (flipped>1)
            {
                if(nums[start]==0)
                {
                    flipped--;
                }
                 start++;
            }
            max= Math.max(max, i-start+1);
        }
        return max-1;
    }
}
