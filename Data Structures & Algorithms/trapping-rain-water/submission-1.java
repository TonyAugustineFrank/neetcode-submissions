class Solution {
    public int trap(int[] height) {
        int[] forward = new int[height.length];
        int[] backward = new int[height.length];
        int max=0;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>max)
                max = height[i];
            forward[i] = max;
        }
        max=0;
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>max)
                max = height[i];
            backward[i] = max;
        }
        int water=0;
        for(int i=0;i<height.length;i++)
        {
            water+= (Math.min(forward[i],backward[i])-height[i]);
        }
        return water;
    }
}
