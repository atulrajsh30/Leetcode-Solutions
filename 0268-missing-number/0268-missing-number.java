class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        int num = nums.length; 

        for (int i = 0; i < nums.length; i++) {
            if (c != nums[i]) {
                num = c;
                break;
            }
            c++;
        }

        return num;
    }
}
