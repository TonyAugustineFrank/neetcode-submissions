class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l,r;
        int len = nums.length;
        int resultSize = len-k+1;
        int result[] = new int [resultSize];
        int index=0;
        Queue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(r=0;r<k;r++)
        {
            pq.add(nums[r]);
        }
        result[index++]=pq.peek();
        l=0;
        while(r<len)
        {
            int incoming;
            int leaving;
            incoming = nums[r];
            pq.add(incoming);
            leaving = nums[l];
            pq.remove(leaving);
            result[index++]=pq.peek();
            l++;
            r++;
        }
        return result;
    }
}
