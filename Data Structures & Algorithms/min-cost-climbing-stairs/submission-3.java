class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1) return 0;
        int[] min = new int[cost.length+1];
        min[0] = 0;
        min[1]= 0;
        for(int i=2;i<=cost.length;i++){
            min[i] = Math.min(min[i-2]+cost[i-2],min[i-1]+cost[i-1]);
        }
        return min[min.length-1];
    }
}
