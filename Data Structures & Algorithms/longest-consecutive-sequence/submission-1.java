class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)return 0;
        HashSet<Integer> numset = new HashSet<>();
        for(int i:nums) numset.add(i);
        int result=1;
        for(int i :nums)
        {
            if(numset.contains(i-1))continue;
            int length = 1;
            while(numset.contains(++i))
            {
                length++;
                
            }
            if(length>result)
                result=length;
        }


        return result;
    }
}
