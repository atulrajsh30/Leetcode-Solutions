class Solution {
    public int pivotIndex(int[] nums) {
        int left =0;
        int piv []= new int [nums.length+1];
        piv[0]=0;
        int ind=0;
        int sum=0;
        int p=-1;
        int right=0;
        for (int i=1; i<nums.length + 1; i++)
        {
            piv[i] = nums[ind];
            sum=sum+nums[ind];
            ind++;

        }
        for (int i=1; i<nums.length+1; i++)
        {
            left = left +piv[i-1];
            right = sum - piv[i]-left;
            if(left == right)
            {
                p=i;
                break;
            }
        }
        if (p>-1)
        return p-1;
        else
        return p;
    }
}