class Solution {
    public int search(int[] nums, int target) {
        
        int l,h,m;
        l = 0;
        h = nums.length-1;
        while(l<=h)
        {
            m = (l+h)/2;
            if(nums[m]==target)
            {
                return m;
            }
            else if(nums[m]>target)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return -1;
    }
}
