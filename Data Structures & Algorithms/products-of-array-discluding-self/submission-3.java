class Solution {
    static {
        int[] nums = {1, 2, 0};
        for (int i = 0; i < 300; i++) {
            productExceptSelf(nums);
        }
    }
    public static  int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int suff = 1;
        ans[0] = 1;
     
        for(int i =1; i < nums.length; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }

        for(int i =nums.length-1; i >=0;i--){
            ans[i]*=suff;
            suff*=nums[i];
        }
        return ans;
    }
}