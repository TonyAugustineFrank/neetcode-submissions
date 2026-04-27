class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int min;
        min=prices[0];
        for(int i : prices){
            if(i<min)
            {
                min=i;
            }
            if(maxProfit<i-min)
            {
                maxProfit= i-min;
            }
        }
        return maxProfit;
    }
}
