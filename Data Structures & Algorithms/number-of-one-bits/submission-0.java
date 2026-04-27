class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            int c = n &1;
            if(c==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
