class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int p=0;
        for(int i =0;i<n;i++)
        {
            if(nums[i]<target)
            {
                p=i+1;
            }
        }
        return p;
    }
}
