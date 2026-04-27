class Solution {
    public int findDuplicate(int[] nums) {
        
        int result = nums[0];
        while(nums[result]!=-1){
            int temp = nums[result];
            nums[result] = -1;
            result = temp;
        }
        return result;
    }
}
