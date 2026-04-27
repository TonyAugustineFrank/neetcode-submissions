class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            int target  = -nums[i];
            int left = i+1;
            int right = nums.length-1;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            
            while(left<right)
            {
                int sum = nums[left]+nums[right];
                if(sum==target)
                {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    result.add(subList);
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1])
                    {
                        left++;
                        continue;
                    }
                    while(left<right&&nums[right]==nums[right+1])
                    {
                        right--;
                        continue;
                    }

                }
                if(sum<target)
                {
                    left++;
                    continue;
                }
                if(sum>target)
                {
                    right--;
                    continue;
                }
            }
        }
        return result;
        
    }
}