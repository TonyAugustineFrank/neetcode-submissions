class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int water=0;
        while(left<right)
        {
            int temp = Math.min(heights[left],heights[right])*(right-left);
            if(temp>water)
                water=temp;

            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }            
        }
        
        return water;
    }
}
