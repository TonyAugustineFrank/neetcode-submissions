class Solution {
    public int maxArea(int[] heights) {

        int forward[] = new int[heights.length];
        int backward[] = new int[heights.length];
        int max=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]>max)
                max=heights[i];
            forward[i]=max;  
        }
        max=0;
        for(int i=heights.length-1;i>0;i--)
        {
            if(heights[i]>max)
                max=heights[i];
            backward[i]=max;  
        }

        int left = 0;
        int right = heights.length-1;

        int water=0;
        while(left<right)
        {
            int temp = Math.min(forward[left],backward[right])*(right-left);
            if(temp>water)
                water=temp;

            if(forward[left]<backward[right])
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
