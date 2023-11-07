class Solution {

    private void reverse(int[] nums, int l, int r)
    {
        while(l<=r)
        {
            int temp = nums[l];
            nums[l]=nums[r];
            nums[r]=temp;

            l++;
            r--;

        }
    }

    private void rotate(int[] nums, int r, int n)
    {
        reverse(nums,0,r);
        reverse(nums,r+1,n-1);
        reverse(nums,0,n-1);
    }
    public boolean check(int[] nums) {
        
        int r =-1;
        int n = nums.length;

        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                r=i;
                break;
            }
        }

        if(r!=-1)
            rotate(nums,r,n);
        
        

        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
                return false;
        }

        return true;

    }

}