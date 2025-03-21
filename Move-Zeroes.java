class Solution {
    public void moveZeroes(int[] nums) {
        int l= nums.length;
        int end = l-1;
        int c=0;
        int i=0;
        int result[]= new int [l];
        while(i<l)
        {
            if(nums[i]!=0)
            {
                result[c] = nums[i];
                c++;
                i++;
            }
            else if(nums[i]==0)
            {
                result[end] = nums[i];
                end--;
                i++;
            }

        }
        for(int j=0; j<l; j++)
        {
            nums[j]=result[j];
        }

    }
}