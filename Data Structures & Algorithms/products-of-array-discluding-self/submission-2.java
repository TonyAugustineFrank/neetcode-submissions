class Solution {
    public int[] productExceptSelf(int[] nums) {
    
        int result[] = new int[nums.length];
        int product =1;
        int zeroc=0;
        for(int i: nums)
        {
            if(i==0){
                zeroc++;
                continue;
            }
            product*=i;
        }
        if(zeroc>=2)
        {
            return result;
        }else if(zeroc==1)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    result[i]=product;
                    return result;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            result[i]=product/nums[i];
        }
        return result;
    }
}  
