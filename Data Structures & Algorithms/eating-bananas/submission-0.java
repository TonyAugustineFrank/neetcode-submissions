class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int mid=1;
        int best=mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            int time = 0;
            for(int i=0;i<piles.length;i++)
            {
               time += Math.ceil(piles[i]/(double)mid);
            }
            System.out.println("time:"+time+" banana rate k "+mid);
            if(time>h)
            {
                low = mid+1;
            }
            else
            {
                best = mid;
                high = mid -1;
            }
        }
        return best;
    }
}
