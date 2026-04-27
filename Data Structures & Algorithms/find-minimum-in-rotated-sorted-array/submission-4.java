class Solution {
    public int findMin(int[] nums) {
        int low,high,mid;
        low = 0;
        high = nums.length - 1;
        int res = nums[0];
        while(low<=high)
        {
            if(nums[low]<nums[high])
            {
                res = Math.min(nums[low],res);
            }
            mid = (low+high)/2;
            res = Math.min(nums[mid],res);
            if(nums[mid]>=nums[low])
            {
                low = mid +1;
            }
            else
            {
                high = mid-1 ;
            }
        }
        return res;
    }
}
