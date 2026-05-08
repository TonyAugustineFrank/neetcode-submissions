class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int a=1;
        int b=2;
        int result=a;
        for(int i=2;i<n;i++){
            result = a+b;
            a = b;
            b = result;
        }

        return result;
        
    }
}
